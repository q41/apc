package org.alia4j.languages.bp.importer;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.alia4j.hierarchy.TypeHierarchyProvider;
import org.alia4j.language.bp.*;
import org.alia4j.languages.bp.action.*;
import org.alia4j.languages.bp.context.*;
import org.alia4j.liam.*;
import org.alia4j.liam.pattern.*;
import org.alia4j.liam.signature.ResolutionStrategy;
import org.alia4j.patterns.*;
import org.alia4j.patterns.names.ExactNamePattern;
import org.alia4j.patterns.parameters.ExactParametersPattern;
import org.alia4j.patterns.types.*;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class Importer implements org.alia4j.fial.Importer {

	private boolean initialized = false;
	private List<Attachment> initialAttachments = new ArrayList<Attachment>();
	private List<CompositionRule> initialCompositionRules = new ArrayList<CompositionRule>();
	private final ClassLoader systemClassLoader;

	public Importer(ClassLoader systemClassLoader) {
		this.systemClassLoader = systemClassLoader;		
	}

	@Override
	public void performImport() {
		if (initialized) throw new Error("Importer has already been executed.");
		initialized = true;

		URL mainFile = systemClassLoader.getResource(System.getProperty("bp.main") + ".xmi");
		if (mainFile == null) {
			System.out.println("No BAP level file specified (use VM argument -Dbp.main=<class-path-relative-file-name>");
		}

		// Initialize the model
		BpPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(URI.createURI(mainFile.toExternalForm()), true);
		// Get the first model element and cast it to the right type, everything is hierarchical included in this first node
		Root root = (Root) resource.getContents().get(0);
		// Process the AST by traversing the syntax tree and visiting each model element
		visit(root);
		
		//creates attachments for collision detection and handling
		createCollisionDetection();
		createCollisionHandling();
		//creates attachments that prevent values from going out of their bounds
		createSpeedBoundAssurance();
		createSizeBoundAssurance();
		createXYBoundAssurance();
		createDamageBoundAssurance();
		//createEffect(Ball.class, "direction", AttributeType.INT);
		
		//-----------------------
		// Deploy all definitions
		//-----------------------
		
		//initialAttachments.addAll(new ArrayList<Attachment>(effects.values()));
		
		CompositionRule[] toDeployRules = new CompositionRule[initialCompositionRules.size()];
		org.alia4j.fial.System.deploy(initialCompositionRules.toArray(toDeployRules));
		Attachment[] toDeploy = new Attachment[initialAttachments.size()];
		org.alia4j.fial.System.deploy(initialAttachments.toArray(toDeploy));
	}
	
	//------------------------- Model visitor methods ------------------------------
	//These methods traverse the model and initialize the corresponding game objects
	
	//Main game objects
	private Map<String, bp.base.Paddle> paddles = new HashMap<String, bp.base.Paddle>();
	private Map<String, bp.base.Ball> balls = new HashMap<String, bp.base.Ball>();
	private Map<String, bp.base.Block> blocks = new HashMap<String, bp.base.Block>();
	private Map<String, bp.base.Effect> effects = new HashMap<String, bp.base.Effect>();
	private Map<String, bp.base.Power> powers = new HashMap<String, bp.base.Power>();
	
	private void visit(Root root) {
		
		for(Paddle paddle: root.getPaddles()) {
			paddles.put(paddle.getId(), visit(paddle));
		}
		for(Ball ball: root.getBalls()) {
			balls.put(ball.getId(), visit(ball));
		}		
		for(Effect effect: root.getEffects()) {
			effects.put(effect.getId(), visit(effect));
		}
		for(Power power: root.getPowers()) {
			powers.put(power.getId(), visit(power));
		}
		for(Block block: root.getBlocks()) {
			blocks.put(block.getId(), visit(block));
		}
		visit(root.getLevel());
	}

	private bp.base.Paddle visit(Paddle paddle) {
		return new bp.base.Paddle(paddle.getId(), paddle.getX(), paddle.getY(), paddle.getSize());
	}

	private bp.base.Ball visit(Ball ball) {
		return new bp.base.Ball(ball.getId(), ball.getX(), ball.getY(), ball.getSize(), ball.getOrientation(), ball.getSpeed(), ball.getDamage());
	}
	
	private bp.base.Power visit(Power power) {
		List<bp.base.Effect> powerEffects = new ArrayList<bp.base.Effect>();
		for(Effect effect: power.getEffects()) {
			powerEffects.add(effects.get(effect.getId()));
		}
		return new bp.base.Power(power.getId(), powerEffects, power.getPowerSpawnChance());
	}
	
	private bp.base.Block visit(Block block) {
		Power power = block.getPower();
		return new bp.base.Block(block.getId(), block.getHardness(), block.getResistance(), (power!=null)?powers.get(power.getId()):null);
	}

	private bp.base.Level visit(Level level) {
		bp.base.Level gameLevel = bp.base.Level.getInstance();
		gameLevel.setID(level.getId());
		gameLevel.setPaddles(new ArrayList<bp.base.Paddle>(paddles.values()));
		gameLevel.setBalls(new ArrayList<bp.base.Ball>(balls.values()));
		gameLevel.setDeclaredPowers(new ArrayList<bp.base.Power>(powers.values()));
		gameLevel.setImportedBlocks(level.getBlocks());
		gameLevel.generateBlocks(new ArrayList<bp.base.Block>(blocks.values()));
		gameLevel.setPowerSpawnChance(level.getPowerSpawnChance());
		return gameLevel;
	}
	
	private bp.base.Effect visit(Effect effect) {
		if(effect instanceof GeneralEffect) return visit((GeneralEffect) effect);
		else return visit((CollisionEffect) effect);
	}
	
	private bp.base.Effect visit(GeneralEffect effect) {
		GeneralEffectBody body = effect.getBody();
		Target target = effect.getTarget();
		
		//create pattern
		Class<?> bpObjectClass = targetToClass(target);
		MethodPattern pattern = createPattern(bpObjectClass, body.getName().toString());
		
		//create predicate
		Context effectApplies = null;		
		Context filter = (effect.getFilter()!=null) ? visit(effect.getFilter()) : null;
		Context isTargetInstance = (target instanceof ObjectTarget) ? generateIsTargetInstanceContext(ContextFactory.findOrCreateCalleeContext(), (ObjectTarget) target) : null;
		
		if(filter!=null && isTargetInstance!=null) effectApplies = ContextFactory.findOrCreateAndContext(isTargetInstance, filter);
		else if(filter!=null) effectApplies = filter;
		else if(isTargetInstance!=null) effectApplies = isTargetInstance;
		
		Predicate<AtomicPredicate> predicate = (effectApplies!=null) ? new BasicPredicate<AtomicPredicate>(AtomicPredicateFactory.findOrCreateContextValuePredicate(filter), true) : null;
		
		//create context
		Context context = visit(body.getExpression());
				
		//create action
		Action action = visit(body);
		
		//create effect
		Specialization specialization = new Specialization(pattern, predicate, Collections.singletonList(context));
		Attachment attachment = new Attachment(Collections.singleton(specialization), action, ScheduleInfo.AROUND);
		return new bp.base.Effect(effect.getDuration(), attachment);
	}
	
	private Action visit(GeneralEffectBody effectBody) {
		AdjustmentOperator op = effectBody.getOp();
		AttributeType attrType = getAttributeType(effectBody.getName());
		switch(attrType) {
		case DOUBLE:
			if(op==AdjustmentOperator.SET) return DoubleAttributeAssignAction.methodCallAction;
			else return DoubleAttributeIncAction.methodCallAction;
		case INT:
			if(op==AdjustmentOperator.SET) return IntAttributeAssignAction.methodCallAction;
			else return IntAttributeIncAction.methodCallAction;
		case BOOL:
			return BooleanAttributeAssignAction.methodCallAction;
		default:
			handleError();
			return null;
		}
	}

	private bp.base.Effect visit(CollisionEffect effect) {
		CollisionEffectBody body = effect.getBody();

		//pattern
		MethodPattern pattern = new MethodPattern(	
				ModifiersPattern.ANY,
				TypePattern.ANY,
				new SubTypePattern(new ExactClassTypePattern(TypeHierarchyProvider.findOrCreateFromClass(bp.base.collision.Collision.class))),
				new ExactNamePattern("haveCollided"),
				ParametersPattern.ANY,
				ExceptionsPattern.ANY
		);
		
		//create predicate
		Target[] targets = new Target[] {effect.getLeftTarget(), effect.getRightTarget()};
		Expression[] filters = new Expression[] {effect.getLeftFilter(), effect.getRightFilter()};
		Context[] targetMatches = new Context[2];
		Context[] targetIsValid = new Context[2];
		for(int i = 0; i<targets.length; i++) {
			Context filter = (filters[i]!=null) ? visit(filters[i]) : null;
			Context bpObject = ContextFactory.findOrCreateArgumentContext(i);	
			if(targets[i] instanceof ObjectTarget)
				targetMatches[i] = generateIsTargetInstanceContext(bpObject, (ObjectTarget) targets[i]);
			else {
				Context targetClass = ContextFactory.findOrCreateObjectConstantContext(targetToClass((ClassTarget) targets[i]));
				targetMatches[i] = new InstanceOfContext(bpObject, targetClass);
			}
			targetIsValid[i] = (filters[i]!=null)? ContextFactory.findOrCreateAndContext(filter, targetMatches[i]): targetMatches[i];
		}
		Context effectApplies = ContextFactory.findOrCreateAndContext(targetIsValid[0], targetIsValid[1]);
		Predicate<AtomicPredicate> predicate = new BasicPredicate<AtomicPredicate>(AtomicPredicateFactory.findOrCreateContextValuePredicate(effectApplies), true);
		
		//create context
		Context context = visit(body.getExpression());
						
		//create action
		//TODO
		Action action = null;
				
		//create effect
		Specialization specialization = new Specialization(pattern, predicate, Collections.singletonList(context));
		Attachment attachment = new Attachment(Collections.singleton(specialization), action, ScheduleInfo.BEFORE);
		return new bp.base.Effect(0, attachment); //deploy collision trigger permenently
	}
	
	//TODO
	private bp.base.Effect createCollisionEffect(CollisionEffect effect) {
		CollisionEffectBody body = effect.getBody();
				
		//create pattern
		MethodPattern pattern = createPattern(targetToClass(body.getTarget()), body.getName().toString());
		
		//create predicate
		//Context effectApplies = (body.getTarget() instanceof ObjectTarget) ? generateIsTargetInstanceContext(ContextFactory.findOrCreateCalleeContext(), (ObjectTarget) body.getTarget()) : null;
		//Predicate<AtomicPredicate> predicate = (effectApplies!=null) ? new BasicPredicate<AtomicPredicate>(AtomicPredicateFactory.findOrCreateContextValuePredicate(effectApplies), true) : null;
		
		//create context
		Context context = visit(body.getExpression());
				
		//create action
		Action action = null; //createAction(body);
		
		//create effect
		Specialization specialization = new Specialization(pattern, null, Collections.singletonList(context));
		Attachment attachment = new Attachment(Collections.singleton(specialization), action, ScheduleInfo.AROUND);
		return new bp.base.Effect(effect.getDuration(), attachment);
	}
	
	private Context visit(Expression e) {
		
		if(e instanceof BinaryExpression) {
			return visit((BinaryExpression) e);
		}
		else if(e instanceof UnaryExpression) {
			return visit((UnaryExpression) e);
		}
		else if(e instanceof DoubleOperand) {
			return ContextFactory.findOrCreateDoubleConstantContext(((DoubleOperand) e).getValue());
		}
		else if(e instanceof IntOperand) {
			return ContextFactory.findOrCreateIntegerConstantContext(((IntOperand) e).getValue());
		}
		else if(e instanceof BooleanOperand) {
			return ContextFactory.findOrCreateBooleanConstantContext(((BooleanOperand) e).isValue());
		}
		else if(e instanceof AttOperand) {
			return visit(((AttOperand) e).getAtt());
		}
		else {
			handleError();
			return null;
		}
	}
	
private Context visit(CollisionExpression e) {
		
		if(e instanceof BinaryCollisionExpression) {
			return visit((BinaryCollisionExpression) e);
		}
		else if(e instanceof UnaryCollisionExpression) {
			return visit((UnaryCollisionExpression) e);
		}
		else if(e instanceof DoubleCollisionOperand) {
			return ContextFactory.findOrCreateDoubleConstantContext(((DoubleCollisionOperand) e).getValue());
		}
		else if(e instanceof IntCollisionOperand) {
			return ContextFactory.findOrCreateIntegerConstantContext(((IntCollisionOperand) e).getValue());
		}
		else if(e instanceof BoolCollisionOperand) {
			return ContextFactory.findOrCreateBooleanConstantContext(((BoolCollisionOperand) e).isValue());
		}
		else if(e instanceof AttCollisionOperand) {
			return visit(((AttCollisionOperand) e).getAtt());
		}
		else {
			handleError();
			return null;
		}
	}
	
	private Context visit(Attribute attr) {
		Context calleeContext = ContextFactory.findOrCreateCalleeContext();
		switch(getAttributeType(attr)) {
		case DOUBLE: return new LocalDoubleVariableContext(calleeContext, attr.toString());
		case INT: return new LocalIntegerVariableContext(calleeContext, attr.toString());
		case BOOL: return new LocalBooleanVariableContext(calleeContext, attr.toString());
		default: handleError(); return null;
		}
	}
	
	private Context visit(BinaryExpression e) {
		Context left = visit(e.getLeft());
		Context right = visit(e.getRight());
		
		if(e instanceof EqExpression) {
			return ContextFactory.findOrCreateEqualContext(left, right);
		}
		else if(e instanceof SmthExpression) {
			return ContextFactory.findOrCreateLessContext(left, right);
		}
		else if(e instanceof SeqExpression) {
			return ContextFactory.findOrCreateLessEqualContext(left, right);
		}
		else if(e instanceof LthExpression) {
			return ContextFactory.findOrCreateGreaterContext(left, right);
		}
		else if(e instanceof LeqExpression) {
			return ContextFactory.findOrCreateGreaterEqualContext(left, right);
		}
		else if(e instanceof NeqExpression) {
			return ContextFactory.findOrCreateNotEqualContext(left, right);
		}
		else if(e instanceof AndExpression) {
			return ContextFactory.findOrCreateAndContext(left, right);
		}
		else if(e instanceof OrExpression) {
			return ContextFactory.findOrCreateEqualContext(left, right);
		}
		else if(e instanceof MultExpression) {
			return ContextFactory.findOrCreateMultiplyContext(left, right);
		}
		else if(e instanceof DivExpression) {
			return ContextFactory.findOrCreateDivideContext(left, right);
		}
		else if(e instanceof PlusExpression) {
			return ContextFactory.findOrCreateAddContext(left, right);
		}
		else if(e instanceof MinusExpression) {
			return ContextFactory.findOrCreateSubtractContext(left, right);
		}
		else {
			handleError();
			return null;
		}
	}
	
	private Context visit(BinaryCollisionExpression e) {
		Context left = visit(e.getLeft());
		Context right = visit(e.getRight());
		
		if(e instanceof EqCollisionExpression) {
			return ContextFactory.findOrCreateEqualContext(left, right);
		}
		else if(e instanceof SmthCollisionExpression) {
			return ContextFactory.findOrCreateLessContext(left, right);
		}
		else if(e instanceof SeqCollisionExpression) {
			return ContextFactory.findOrCreateLessEqualContext(left, right);
		}
		else if(e instanceof LthCollisionExpression) {
			return ContextFactory.findOrCreateGreaterContext(left, right);
		}
		else if(e instanceof LeqCollisionExpression) {
			return ContextFactory.findOrCreateGreaterEqualContext(left, right);
		}
		else if(e instanceof NeqCollisionExpression) {
			return ContextFactory.findOrCreateNotEqualContext(left, right);
		}
		else if(e instanceof AndCollisionExpression) {
			return ContextFactory.findOrCreateAndContext(left, right);
		}
		else if(e instanceof OrCollisionExpression) {
			return ContextFactory.findOrCreateEqualContext(left, right);
		}
		else if(e instanceof MultCollisionExpression) {
			return ContextFactory.findOrCreateMultiplyContext(left, right);
		}
		else if(e instanceof DivCollisionExpression) {
			return ContextFactory.findOrCreateDivideContext(left, right);
		}
		else if(e instanceof PlusCollisionExpression) {
			return ContextFactory.findOrCreateAddContext(left, right);
		}
		else if(e instanceof MinusCollisionExpression) {
			return ContextFactory.findOrCreateSubtractContext(left, right);
		}
		else {
			handleError();
			return null;
		}
	}
	
	private Context visit(UnaryExpression e) {
		Context body = visit(e.getBody());
		
		if(e instanceof NotExpression) {
			return ContextFactory.findOrCreateNotContext(body);
		}
		else if(e instanceof NegExpression) {
			return ContextFactory.findOrCreateNegationContext(body);
		}
		else if(e instanceof BracketExpression) {
			return body;
		}
		else {
			handleError();
			return null;
		}
	}
	
	private Context visit(UnaryCollisionExpression e) {
		Context body = visit(e.getBody());
		
		if(e instanceof NotCollisionExpression) {
			return ContextFactory.findOrCreateNotContext(body);
		}
		else if(e instanceof NegCollisionExpression) {
			return ContextFactory.findOrCreateNegationContext(body);
		}
		else if(e instanceof BracketCollisionExpression) {
			return body;
		}
		else {
			handleError();
			return null;
		}
	}
	
	//------------ Helper funtions ------------
	
	private Object handleError() {
		System.err.println("ERROR: Something that should never happen happended. Program will crash now. Have a nice day!");
		throw new NullPointerException(); //so we don't have to add a throws declaration everywhere :P
	}
	
	//Convert target to corresponding Class<? extends BPObject>
	private Class<?> targetToClass(Target target) {
		Class<?> targetClass = null;
		if(target instanceof ClassTarget) {
			targetClass = getBPObjectClass((ClassTarget) target);
		}
		else {
			ObjectTarget otarget = (ObjectTarget) target;
			BPObject bpObject = otarget.getObject();
			if(bpObject instanceof Ball) {
				targetClass = bp.base.Ball.class;
			}
			else if(bpObject instanceof Block) {
				targetClass = bp.base.Block.class;
			}
			else if(bpObject instanceof Paddle) {
				targetClass = bp.base.Paddle.class;
			}
		}
		return targetClass;
	}
	
	//Convert classTarget to the corresponding Class<? extends BPObject>
	private Class<?> getBPObjectClass(ClassTarget classTarget) {
		switch(classTarget.getClassType()) {
		case BALL: return bp.base.Ball.class;
		case BLOCK: return bp.base.Block.class;
		case PADDLE: return bp.base.Block.class;
		default: handleError(); return null;
		}
	}
	
	//method pattern that matches the getter for attribute attrName of BPObject bpObjectClass
	private MethodPattern createPattern(Class<?> bpObjectClass, String attrName) {
		return new MethodPattern(	
			ModifiersPattern.ANY,
			TypePattern.ANY,
			new SubTypePattern(new ExactClassTypePattern(TypeHierarchyProvider.findOrCreateFromClass(bpObjectClass))),
			new ExactNamePattern("get"+Character.toUpperCase(attrName.charAt(0))+attrName.substring(1).toLowerCase()),
			ParametersPattern.ANY,
			ExceptionsPattern.ANY
		);
	}
	
	//create context determining whether target refers to instance
	private Context generateIsTargetInstanceContext(Context instance, ObjectTarget target) {
		String id = target.getObject().getId();
		Context targetId = ContextFactory.findOrCreateObjectConstantContext(id);
		Context actualId = new LocalObjectVariableContext(instance, "id");
		return new ObjectEqualContext(actualId,targetId);
	}

	//all possible types an attribute can have
	private enum AttributeType {
		DOUBLE, INT, BOOL
	}
	
	private AttributeType getAttributeType(Attribute attr) {
		switch(attr) {
		case SPEED:
		case SIZE:
		case X:
		case Y:
			return AttributeType.DOUBLE;
		case HARDNESS:
		case RESISTANCE:
		case ORIENTATION:
		case DAMAGE:
			return AttributeType.INT;
		case IMMATERIAL:
			return AttributeType.BOOL;
		default:
			handleError();
			return null;
		}
	}

	//private static final Action testAction = ActionFactory.findOrCreateMethodCallAction(TypeHierarchyProvider.findOrCreateFromNormalTypeName("ballandpaddle.base.Main"),"print",TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[]{}),TypeHierarchyProvider.findOrCreateFromNormalTypeName("void"),ResolutionStrategy.STATIC);
	//private static final BasicPredicate<AtomicPredicate> testPred = new BasicPredicate<AtomicPredicate>(AtomicPredicateFactory.findOrCreateContextValuePredicate(ContextFactory.findOrCreateBooleanConstantContext(true)),true);
	
	/*
	private void createEffect(Class<? extends BPObject> bapobject, String attribute, AttributeType attributeType) {
		//create attribute getter pattern 
		MethodPattern attributeGetter = new MethodPattern(
			ModifiersPattern.ANY,
			TypePattern.ANY,
			new ExactClassTypePattern(TypeHierarchyProvider.findOrCreateFromClass(bapobject)),
			new ExactNamePattern("get"+Character.toUpperCase(attribute.charAt(0))+attribute.substring(1).toLowerCase()),
			ParametersPattern.ANY,
			ExceptionsPattern.ANY
		);
		
		//create pattern matching predicate
		BasicPredicate<AtomicPredicate> predicate = createEffectPredicate();

		//create attribute assign action
		Action attributeAssignAction = null;
		switch(attributeType) {
		case DOUBLE: attributeAssignAction = DoubleAttributeAssignAction.methodCallAction; break;
		case INT: attributeAssignAction = DoubleAttributeAssignAction.methodCallAction; break;
		case BOOLEAN: attributeAssignAction = DoubleAttributeAssignAction.methodCallAction; break;
		}
		
		Action attributeIncAction = null;
		switch(attributeType) {
		case DOUBLE: attributeIncAction = DoubleAttributeIncAction.methodCallAction; break;
		case INT: attributeIncAction = IntAttributeIncAction.methodCallAction; break;
		case BOOLEAN: assert(false);
		}
		
		Context newSize = ContextFactory.findOrCreateIntegerConstantContext(90);
		
		//contruct specialization
		//Predicate<AtomicPredicate> andPredicate = new AndPredicate<AtomicPredicate>(testPred, isFinalPred);
		Specialization specialization = new Specialization(attributeGetter, predicate, Collections.singletonList(newSize));
		
		Attachment attachement = new Attachment(Collections.singleton(specialization), attributeIncAction, ScheduleInfo.AROUND);
		initialAttachments.add(attachement);
	}
	
	private BasicPredicate<AtomicPredicate> createEffectPredicate() {
		Context calleeContext = ContextFactory.findOrCreateCalleeContext();
		Context speedContext = new LocalDoubleVariableContext(calleeContext, "speed");
		Context thresholdContext = ContextFactory.findOrCreateDoubleConstantContext(1.5);
		Context exceedsContext = ContextFactory.findOrCreateGreaterContext(speedContext, thresholdContext);
		return new BasicPredicate<AtomicPredicate>(AtomicPredicateFactory.findOrCreateContextValuePredicate(exceedsContext), true);
	}*/
	
	//--------------------General Bounds assurance------------------------
	
	/**
	 * Deploys an attachment that makes certain that values from the getter that the
	 * pattern looks at are never increased/decreased to such a level where they
	 * are outside the given bounds. These bounds are read in from the given field
	 * in the class that the getter method belongs to
	 * @param pattern The pattern
	 * @param action The action that enforces the bounds
	 * @param field The field name
	 */
	private void createBoundsAssurance(MethodPattern pattern, Action action, String field){
		Context callee = ContextFactory.findOrCreateCalleeContext();
		Context max = new LocalDoubleVariableContext(callee, "upper"+field+"Limit");
		Context min= new LocalDoubleVariableContext(callee, "lower"+field+"Limit");
		List<Context> con = new ArrayList<Context>(); con.add(max); con.add(min);
		Specialization specialization = new Specialization(pattern, null, con);		
		Attachment attachement = new Attachment(Collections.singleton(specialization), action, ScheduleInfo.AROUND);
		initialAttachments.add(attachement);	
	}
	
	/**
	 * Deploys an attachment that makes certain that values from the getter that the
	 * pattern looks at are never increased/decreased to such a level where they
	 * are outside the given bounds. These bounds are given by minValue and maxValue.
	 * @param pattern The pattern
	 * @param action The action that enforces the bounds
	 * @param minValue The minimum allowed value
	 * @param maxValue The maximum allowed value
	 */
	private void createBoundsAssurance(MethodPattern pattern, Action action, double minValue, double maxValue){
		Context max = ContextFactory.findOrCreateDoubleConstantContext(maxValue);
		Context min = ContextFactory.findOrCreateDoubleConstantContext(minValue);
		List<Context> con = new ArrayList<Context>(); con.add(max); con.add(min);
		Specialization specialization = new Specialization(pattern, null, con);		
		Attachment attachement = new Attachment(Collections.singleton(specialization), action, ScheduleInfo.AROUND);
		initialAttachments.add(attachement);
	}
	
	/**
	 * Deploys an attachment that makes certain that values from the getter that the
	 * pattern looks at are never increased/decreased to such a level where they
	 * are outside the given bounds. These bounds are given by minValue and maxValue.
	 * @param pattern The pattern
	 * @param action The action that enforces the bounds
	 * @param minValue The minimum allowed value
	 * @param maxValue The maximum allowed value
	 */
	private void createBoundsAssurance(MethodPattern pattern, Action action, int minValue, int maxValue){
		Context max = ContextFactory.findOrCreateIntegerConstantContext(maxValue);
		Context min = ContextFactory.findOrCreateIntegerConstantContext(minValue);
		List<Context> con = new ArrayList<Context>(); con.add(max); con.add(min);
		Specialization specialization = new Specialization(pattern, null, con);		
		Attachment attachement = new Attachment(Collections.singleton(specialization), action, ScheduleInfo.AROUND);
		initialAttachments.add(attachement);
	}	
	
	//--------------------Speed Bounds assurance------------------------
	
	/**
	 * The MethodPattern for the getSpeed getter
	 */
	private static final MethodPattern getSpeed = new MethodPattern(
			ModifiersPattern.ANY,
			TypePattern.ANY, 
			ClassTypePattern.ANY,
			new ExactNamePattern("getSpeed"),
			ParametersPattern.ANY,
			ExceptionsPattern.ANY
	);
	
	/**
	 * Deploys an attachment that makes certain that the result of getSpeed never goes out of bounds.
	 */
	private void createSpeedBoundAssurance(){	
		createBoundsAssurance(getSpeed, DoubleAttributeBoundsAssuranceAction.methodCallAction, "Speed");
	}
	
	//--------------------Size Bounds assurance------------------------
	
	/**
	 * The MethodPattern for the getSize getter
	 */
	private static final MethodPattern getSize = new MethodPattern(
			ModifiersPattern.ANY,
			TypePattern.ANY, 
			ClassTypePattern.ANY,
			new ExactNamePattern("getSize"),
			ParametersPattern.ANY,
			ExceptionsPattern.ANY
	);	
	
	/**
	 * Deploys an attachment that makes certain that the result of getSize never goes out of bounds.
	 */
	private void createSizeBoundAssurance(){
		createBoundsAssurance(getSize, DoubleAttributeBoundsAssuranceAction.methodCallAction, "Size");
	}
	
	//--------------------XY Bounds assurance------------------------
	
	/**
	 * The MethodPattern for the getX getter
	 */
	private static final MethodPattern getX = new MethodPattern(
			ModifiersPattern.ANY,
			TypePattern.ANY, 
			ClassTypePattern.ANY,
			new ExactNamePattern("getX"),
			ParametersPattern.ANY,
			ExceptionsPattern.ANY
	);
	
	/**
	 * The MethodPattern for the getY getter
	 */
	private static final MethodPattern getY = new MethodPattern(
			ModifiersPattern.ANY,
			TypePattern.ANY, 
			ClassTypePattern.ANY,
			new ExactNamePattern("getY"),
			ParametersPattern.ANY,
			ExceptionsPattern.ANY
	);
	
	/**
	 * Deploys attachments that make certain that the results of getX and getY never go out of bounds.
	 */
	private void createXYBoundAssurance(){		
		createBoundsAssurance(getX, DoubleAttributeBoundsAssuranceAction.methodCallAction, 0.0, (double)bp.base.Level.getInstance().getWidth());
		createBoundsAssurance(getY, DoubleAttributeBoundsAssuranceAction.methodCallAction, 0.0, (double)bp.base.Level.getInstance().getHeight());
	}		
	
	//--------------------Damage Bounds assurance------------------------
	
	/**
	 * The MethodPattern for the getDamage getter
	 */
	private static final MethodPattern getDamage = new MethodPattern(
			ModifiersPattern.ANY,
			TypePattern.ANY, 
			ClassTypePattern.ANY,
			new ExactNamePattern("getDamage"),
			ParametersPattern.ANY,
			ExceptionsPattern.ANY
	);
	
	/**
	 * Deploys attachments that makes certain that the result of getDamage never goes out of bounds.
	 */
	private void createDamageBoundAssurance(){
		createBoundsAssurance(getDamage, IntAttributeBoundsAssuranceAction.methodCallAction, 0, Integer.MAX_VALUE);
	}
		
	//--------------------Collision detection------------------------
	
	/**
	 * Creates an action that calls checkForCollision from Collision,
	 * using the given argument type
	 * @param type The TypeName of the argument
	 * @return The action
	 */
	private Action createCheckForCollisionAction(String type){
		return ActionFactory.findOrCreateMethodCallAction(
				TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.collision.Collision"),
				"checkForCollision",
				TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[]{type, "bp.base.Level"}),
				TypeHierarchyProvider.findOrCreateFromNormalTypeName("void"),
				ResolutionStrategy.STATIC			
				);
	}	
	
	/**
	 * The methodpattern for the collision detection, which listens to the
	 * handleBPObjectUpdate method
	 */
	private static final MethodPattern LevelHandleBPObjectUpdateMethodPattern = new MethodPattern(
			ModifiersPattern.ANY,
			TypePattern.ANY, 
			ClassTypePattern.ANY,
			new ExactNamePattern("handleBPObjectUpdate"),
			ParametersPattern.ANY,
			ExceptionsPattern.ANY
	);
	
	/**
	 * Creates and deploys attachments for the collision detection of balls, paddles and powers
	 */
	private void createCollisionDetection(){
		createCollisionDetection("bp.base.Ball",createCheckForCollisionAction("bp.base.Ball"));
		createCollisionDetection("bp.base.Paddle",createCheckForCollisionAction("bp.base.Paddle"));
		createCollisionDetection("bp.base.SpawnedPower",createCheckForCollisionAction("bp.base.SpawnedPower"));
	}
	
	/**
	 * Creates and deploys an attachment for the collision detection of
	 * a BPObject item of the given type, with the given detection action
	 * @param type The type of the object
	 * @param action The action to detect the collision with
	 */
	private void createCollisionDetection(String type, Action action){
		Context argumentContext = ContextFactory.findOrCreateArgumentContext(0);
		Context calleeContext = ContextFactory.findOrCreateCalleeContext();
		AtomicPredicate aPred = AtomicPredicateFactory.findOrCreateExactTypePredicate(argumentContext, TypeHierarchyProvider.findOrCreateFromNormalTypeName(type));
		List<Context> con = new ArrayList<Context>(); con.add(argumentContext); con.add(calleeContext);
		BasicPredicate<AtomicPredicate> pred = new BasicPredicate<AtomicPredicate>(aPred, true);
		Specialization specialization = new Specialization(LevelHandleBPObjectUpdateMethodPattern, pred, con);
		Attachment attachement = new Attachment(Collections.singleton(specialization), action, ScheduleInfo.AFTER);
		initialAttachments.add(attachement);
	}
	
	//------------------Collision handling--------------------
	
	/**
	 * Creates an action that resolves the collision between an item of the type
	 * supplied by leftType and an item of the type supplied by rightType
	 * @param leftType the typename of the left object
	 * @param rightType the typename of the right object
	 * @return the collision resolving action
	 */
	private Action createCollisionHandlingAction(String leftType, String rightType){
		return ActionFactory.findOrCreateMethodCallAction(
				TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.collision.CollisionResolver"),
				"resolveCollision",
				TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[]{leftType,rightType}),
				TypeHierarchyProvider.findOrCreateFromNormalTypeName("void"),
				ResolutionStrategy.STATIC			
				);
	}
	
	/**
	 * Listens to the haveCollided method in order to detect collisions that have happened
	 */
	private static final MethodPattern HasCollidedMethodPattern = new MethodPattern(
			ModifiersPattern.ANY,
			TypePattern.ANY, 
			ClassTypePattern.ANY,
			new ExactNamePattern("haveCollided"),
			ParametersPattern.ANY,
			ExceptionsPattern.ANY
	);
	
	/**
	 * Creates and deploys 8 attachments for collision resolving. 
	 * An attachment is deployed for each of the following eight: 
	 * ball with a paddle, block or border
	 * paddle with a ball, border or power
	 * power with a paddle or border
	 */
	private void createCollisionHandling(){
		createCollisionHandling("bp.base.Ball","bp.base.Paddle",createCollisionHandlingAction("bp.base.Ball", "bp.base.Paddle"));
		createCollisionHandling("bp.base.Ball","bp.base.Block",createCollisionHandlingAction("bp.base.Ball", "bp.base.Block"));
		createCollisionHandling("bp.base.Ball","bp.base.Border",createCollisionHandlingAction("bp.base.Ball", "bp.base.Border"));
		createCollisionHandling("bp.base.Paddle","bp.base.Ball",createCollisionHandlingAction("bp.base.Paddle","bp.base.Ball"));
		createCollisionHandling("bp.base.Paddle","bp.base.Border",createCollisionHandlingAction("bp.base.Paddle","bp.base.Border"));
		createCollisionHandling("bp.base.Paddle","bp.base.SpawnedPower",createCollisionHandlingAction("bp.base.Paddle","bp.base.SpawnedPower"));
		createCollisionHandling("bp.base.SpawnedPower","bp.base.Paddle",createCollisionHandlingAction("bp.base.SpawnedPower","bp.base.Paddle"));
		createCollisionHandling("bp.base.SpawnedPower","bp.base.Border",createCollisionHandlingAction("bp.base.SpawnedPower","bp.base.Border"));
	}
	
	/**
	 * Creates and deploys an attachment that resolves the collision between an item of the type
	 * supplied by leftType and an item of the type supplied by rightType, 
	 * using the given action to resolve it
	 * @param leftType the typename of the left object
	 * @param rightType the typename of the right object
	 * @param action the collision resolving action
	 */
	private void createCollisionHandling(String leftType, String rightType, Action action){
		Context firstArgument = ContextFactory.findOrCreateArgumentContext(0);
		Context secondArgument = ContextFactory.findOrCreateArgumentContext(1);
		AtomicPredicate left = AtomicPredicateFactory.findOrCreateExactTypePredicate(firstArgument, TypeHierarchyProvider.findOrCreateFromNormalTypeName(leftType));
		AtomicPredicate right = AtomicPredicateFactory.findOrCreateExactTypePredicate(secondArgument, TypeHierarchyProvider.findOrCreateFromNormalTypeName(rightType));
		AndPredicate<AtomicPredicate> pred = new AndPredicate<AtomicPredicate>(new BasicPredicate<AtomicPredicate>(left, true), new BasicPredicate<AtomicPredicate>(right, true));
		List<Context> con = new ArrayList<Context>(); con.add(firstArgument); con.add(secondArgument);
		Specialization specialization = new Specialization(HasCollidedMethodPattern, pred, con);
		Attachment attachement = new Attachment(Collections.singleton(specialization),action, ScheduleInfo.AFTER);
		initialAttachments.add(attachement);
	}
}