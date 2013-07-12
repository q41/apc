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
		
		createBaseCollisionDetection();
		createCollisionHandling();
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
		return new bp.base.Ball(ball.getId(), ball.getX(), ball.getY(), ball.getSize(), ball.getDirection(), ball.getSpeed());
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
		Context isTargetInstance = (target instanceof ObjectTarget) ? generateIsTargetInstanceContext(target) : null;
		
		if(filter!=null && isTargetInstance!=null) effectApplies = ContextFactory.findOrCreateAndContext(isTargetInstance, filter);
		else if(filter!=null) effectApplies = filter;
		else if(isTargetInstance!=null) effectApplies = isTargetInstance;
		
		Predicate<AtomicPredicate> predicate = (effectApplies!=null) ? new BasicPredicate<AtomicPredicate>(AtomicPredicateFactory.findOrCreateContextValuePredicate(filter), true) : null;
		
		//create context
		Context context = visit(body.getExpression());
				
		//create action
		Action action = createAction(body);
		
		//create effect
		Specialization specialization = new Specialization(pattern, predicate, Collections.singletonList(context));
		Attachment attachment = new Attachment(Collections.singleton(specialization), action, ScheduleInfo.AROUND);
		return new bp.base.Effect(effect.getDuration(), attachment);
	}
	
	private bp.base.Effect visit(CollisionEffect effect) {
		CollisionEffectBody body = effect.getBody();
//		Target[] targets = new Target[] {effect.getLeftTarget(), effect.getRightTarget()};
//		Class<?>[] targetClasses = new Class<?>[2];
//		for(int i = 0; i<targets.length; i++) {
//			targetClasses[i] = targetToClass(targets[i]);
//		}
				
		//create pattern
		MethodPattern pattern = createPattern(targetToClass(body.getTarget()), body.getName().toString());
		
		//create predicate
		Context effectApplies = (body.getTarget() instanceof ObjectTarget) ? generateIsTargetInstanceContext(body.getTarget()) : null;
		Predicate<AtomicPredicate> predicate = (effectApplies!=null) ? new BasicPredicate<AtomicPredicate>(AtomicPredicateFactory.findOrCreateContextValuePredicate(effectApplies), true) : null;
		
		//create context
		Context context = visit(body.getExpression());
				
		//create action
		Action action = createAction(body);
		
		//create effect
		Specialization specialization = new Specialization(pattern, predicate, Collections.singletonList(context));
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
		throw new NullPointerException();
	}
	
	private Class<?> getBPObjectClass(ClassTarget classTarget) {
		switch(classTarget.getClassType()) {
		case BALL: return bp.base.Ball.class;
		case BLOCK: return bp.base.Block.class;
		case PADDLE: return bp.base.Block.class;
		default: handleError(); return null;
		}
	}

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
	
	private Context generateIsTargetInstanceContext(Target target) {
		String id = ((ObjectTarget) target).getObject().getId();
		Context targetId = ContextFactory.findOrCreateObjectConstantContext(id);
		Context calleeContext = ContextFactory.findOrCreateCalleeContext();
		Context actualId = new LocalObjectVariableContext(calleeContext, "id");
		return new ObjectEqualContext(actualId,targetId);
	}

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

	private enum AttributeType {
		DOUBLE, INT, BOOL
	}
	
	private Action createAction(EffectBody effectBody) {
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
	
	//--------------------Speed Bounds assurance------------------------
	private static final MethodPattern getSpeed = new MethodPattern(
			ModifiersPattern.ANY,
			TypePattern.ANY, 
			ClassTypePattern.ANY,
			new ExactNamePattern("getSpeed"),
			ParametersPattern.ANY,
			ExceptionsPattern.ANY
	);
	
	private void createSpeedBoundAssurance(){		
		Context callee = ContextFactory.findOrCreateCalleeContext();
		Context max = new LocalDoubleVariableContext(callee, "upperSpeedLimit");
		Context min= new LocalDoubleVariableContext(callee, "lowerSpeedLimit");
		List<Context> con = new ArrayList<Context>(); con.add(max); con.add(min);
		Specialization specialization = new Specialization(getSpeed, null, con);		
		Attachment attachement = new Attachment(Collections.singleton(specialization), DoubleAttributeBoundsAssuranceAction.methodCallAction, ScheduleInfo.AROUND);
		initialAttachments.add(attachement);
	}
	
	//--------------------Size Bounds assurance------------------------
	
	private static final MethodPattern getSize = new MethodPattern(
			ModifiersPattern.ANY,
			TypePattern.ANY, 
			ClassTypePattern.ANY,
			new ExactNamePattern("getSize"),
			ParametersPattern.ANY,
			ExceptionsPattern.ANY
	);
	
	private void createSizeBoundAssurance(){		
		Context callee = ContextFactory.findOrCreateCalleeContext();
		Context max = new LocalDoubleVariableContext(callee, "upperSizeLimit");
		Context min= new LocalDoubleVariableContext(callee, "lowerSizeLimit");
		List<Context> con = new ArrayList<Context>(); con.add(max); con.add(min);
		Specialization specialization = new Specialization(getSize, null, con);		
		Attachment attachement = new Attachment(Collections.singleton(specialization), DoubleAttributeBoundsAssuranceAction.methodCallAction, ScheduleInfo.AROUND);
		initialAttachments.add(attachement);
	}
	
	//--------------------XY Bounds assurance------------------------
	
	private static final MethodPattern getX = new MethodPattern(
			ModifiersPattern.ANY,
			TypePattern.ANY, 
			ClassTypePattern.ANY,
			new ExactNamePattern("getX"),
			ParametersPattern.ANY,
			ExceptionsPattern.ANY
	);
	
	private static final MethodPattern getY = new MethodPattern(
			ModifiersPattern.ANY,
			TypePattern.ANY, 
			ClassTypePattern.ANY,
			new ExactNamePattern("getY"),
			ParametersPattern.ANY,
			ExceptionsPattern.ANY
	);
	
	private void createXYBoundAssurance(){		
		createXBoundAssurance();
		createYBoundAssurance();
	}
	
	private void createXBoundAssurance(){
		Context max = ContextFactory.findOrCreateDoubleConstantContext(bp.base.Level.getInstance().getWidth());
		Context min = ContextFactory.findOrCreateDoubleConstantContext(0.0);
		List<Context> con = new ArrayList<Context>(); con.add(max); con.add(min);
		Specialization specialization = new Specialization(getX, null, con);		
		Attachment attachement = new Attachment(Collections.singleton(specialization), DoubleAttributeBoundsAssuranceAction.methodCallAction, ScheduleInfo.AROUND);
		initialAttachments.add(attachement);
	}
	
	private void createYBoundAssurance(){
		Context max = ContextFactory.findOrCreateDoubleConstantContext(bp.base.Level.getInstance().getHeight());
		Context min = ContextFactory.findOrCreateDoubleConstantContext(0.0);
		List<Context> con = new ArrayList<Context>(); con.add(max); con.add(min);
		Specialization specialization = new Specialization(getY, null, con);		
		Attachment attachement = new Attachment(Collections.singleton(specialization), DoubleAttributeBoundsAssuranceAction.methodCallAction, ScheduleInfo.AROUND);
		initialAttachments.add(attachement);
	}
	
	//--------------------Damage Bounds assurance------------------------
	private static final MethodPattern getDamage = new MethodPattern(
			ModifiersPattern.ANY,
			TypePattern.ANY, 
			ClassTypePattern.ANY,
			new ExactNamePattern("getDamage"),
			ParametersPattern.ANY,
			ExceptionsPattern.ANY
	);
	
	private void createDamageBoundAssurance(){
		Context max = ContextFactory.findOrCreateIntegerConstantContext(Integer.MAX_VALUE);
		Context min = ContextFactory.findOrCreateIntegerConstantContext(0);
		List<Context> con = new ArrayList<Context>(); con.add(max); con.add(min);
		Specialization specialization = new Specialization(getDamage, null, con);		
		Attachment attachement = new Attachment(Collections.singleton(specialization), IntAttributeBoundsAssuranceAction.methodCallAction, ScheduleInfo.AROUND);
		initialAttachments.add(attachement);
	}
	
	
	//--------------------Collision detection------------------------
	
	private static final Action checkForCollision = ActionFactory.findOrCreateMethodCallAction(
			TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.collision.Collision"),
			"checkForCollision",
			TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[]{"bp.base.BPObject", "bp.base.Level"}),
			TypeHierarchyProvider.findOrCreateFromNormalTypeName("void"),
			ResolutionStrategy.STATIC			
			);
	
	private static final MethodPattern LevelHandleBPObjectUpdateMethodPattern = new MethodPattern(
			ModifiersPattern.ANY,
			TypePattern.ANY, 
			ClassTypePattern.ANY,
			new ExactNamePattern("handleBPObjectUpdate"),
			ParametersPattern.ANY,
			ExceptionsPattern.ANY
	);
	
	private void createBaseCollisionDetection(){		
		Context argumentContext = ContextFactory.findOrCreateArgumentContext(0);
		Context calleeContext = ContextFactory.findOrCreateCalleeContext();
		List<Context> con = new ArrayList<Context>(); con.add(argumentContext); con.add(calleeContext);
		Specialization specialization = new Specialization(LevelHandleBPObjectUpdateMethodPattern, null, con);//Collections.singletonList(argumentContext));
		
		Attachment attachement = new Attachment(Collections.singleton(specialization), checkForCollision, ScheduleInfo.AFTER);
		initialAttachments.add(attachement);
	}
	
	//------------------Collision handling--------------------
	
	private static final Action handleBallBlockCollision = ActionFactory.findOrCreateMethodCallAction(
			TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.collision.CollisionResolver"),
			"resolveCollision",
			TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[]{"bp.base.Ball","bp.base.Block"}),
			TypeHierarchyProvider.findOrCreateFromNormalTypeName("void"),
			ResolutionStrategy.STATIC			
			);
	
	private static final Action handleBallPaddleCollision = ActionFactory.findOrCreateMethodCallAction(
			TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.collision.CollisionResolver"),
			"resolveCollision",
			TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[]{"bp.base.Ball","bp.base.Paddle"}),
			TypeHierarchyProvider.findOrCreateFromNormalTypeName("void"),
			ResolutionStrategy.STATIC			
			);
	
	private static final Action handleBallBorderCollision = ActionFactory.findOrCreateMethodCallAction(
			TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.collision.CollisionResolver"),
			"resolveCollision",
			TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[]{"bp.base.Ball","bp.base.Border"}),
			TypeHierarchyProvider.findOrCreateFromNormalTypeName("void"),
			ResolutionStrategy.STATIC			
			);
	
	private static final Action handlePaddleBallCollision = ActionFactory.findOrCreateMethodCallAction(
			TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.collision.CollisionResolver"),
			"resolveCollision",
			TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[]{"bp.base.Paddle","bp.base.Ball"}),
			TypeHierarchyProvider.findOrCreateFromNormalTypeName("void"),
			ResolutionStrategy.STATIC			
			);
	
	private static final Action handlePaddleBorderCollision = ActionFactory.findOrCreateMethodCallAction(
			TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.collision.CollisionResolver"),
			"resolveCollision",
			TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[]{"bp.base.Paddle","bp.base.Border"}),
			TypeHierarchyProvider.findOrCreateFromNormalTypeName("void"),
			ResolutionStrategy.STATIC			
			);
	
	private static final Action handlePaddlePowerCollision = ActionFactory.findOrCreateMethodCallAction(
			TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.collision.CollisionResolver"),
			"resolveCollision",
			TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[]{"bp.base.Paddle","bp.base.SpawnedPower"}),
			TypeHierarchyProvider.findOrCreateFromNormalTypeName("void"),
			ResolutionStrategy.STATIC			
			);
	
	private static final Action handlePowerPaddleCollision = ActionFactory.findOrCreateMethodCallAction(
			TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.collision.CollisionResolver"),
			"resolveCollision",
			TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[]{"bp.base.SpawnedPower","bp.base.Paddle"}),
			TypeHierarchyProvider.findOrCreateFromNormalTypeName("void"),
			ResolutionStrategy.STATIC			
			);
	
	private static final Action handlePowerBorderCollision = ActionFactory.findOrCreateMethodCallAction(
			TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.collision.CollisionResolver"),
			"resolveCollision",
			TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[]{"bp.base.SpawnedPower","bp.base.Border"}),
			TypeHierarchyProvider.findOrCreateFromNormalTypeName("void"),
			ResolutionStrategy.STATIC			
			);
	
	private static final MethodPattern HasCollidedMethodPattern = new MethodPattern(
			ModifiersPattern.ANY,
			TypePattern.ANY, 
			ClassTypePattern.ANY,
			new ExactNamePattern("haveCollided"),
			ParametersPattern.ANY,
			ExceptionsPattern.ANY
	);
	
	private void createCollisionHandling(){
		createBallPaddleCollisionHandling();
		createBallBlockCollisionHandling();
		createBallBorderCollisionHandling();
		createPaddleBallCollisionHandling();
		createPaddleBorderCollisionHandling();		
		createPaddlePowerCollisionHandling();		
		createPowerPaddleCollisionHandling();
		createPowerBorderCollisionHandling();
	}
	
	private void createBallPaddleCollisionHandling(){
		Context firstArgument = ContextFactory.findOrCreateArgumentContext(0);
		Context secondArgument = ContextFactory.findOrCreateArgumentContext(1);
		AtomicPredicate ball = AtomicPredicateFactory.findOrCreateExactTypePredicate(firstArgument, TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.Ball"));
		AtomicPredicate paddle = AtomicPredicateFactory.findOrCreateExactTypePredicate(secondArgument, TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.Paddle"));
		AndPredicate<AtomicPredicate> pred = new AndPredicate<AtomicPredicate>(new BasicPredicate<AtomicPredicate>(ball, true), new BasicPredicate<AtomicPredicate>(paddle, true));
		List<Context> con = new ArrayList<Context>(); con.add(firstArgument); con.add(secondArgument);
		Specialization specialization = new Specialization(HasCollidedMethodPattern, pred, con);
		Attachment attachement = new Attachment(Collections.singleton(specialization),handleBallPaddleCollision, ScheduleInfo.AFTER);
		initialAttachments.add(attachement);
	}
	
	private void createBallBlockCollisionHandling(){
		Context firstArgument = ContextFactory.findOrCreateArgumentContext(0);
		Context secondArgument = ContextFactory.findOrCreateArgumentContext(1);
		AtomicPredicate ball = AtomicPredicateFactory.findOrCreateExactTypePredicate(firstArgument, TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.Ball"));
		AtomicPredicate block = AtomicPredicateFactory.findOrCreateExactTypePredicate(secondArgument, TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.Block"));
		AndPredicate<AtomicPredicate> pred = new AndPredicate<AtomicPredicate>(new BasicPredicate<AtomicPredicate>(ball, true), new BasicPredicate<AtomicPredicate>(block, true));
		List<Context> con = new ArrayList<Context>(); con.add(firstArgument); con.add(secondArgument);
		Specialization specialization = new Specialization(HasCollidedMethodPattern, pred, con);
		Attachment attachement = new Attachment(Collections.singleton(specialization),handleBallBlockCollision, ScheduleInfo.AFTER);
		initialAttachments.add(attachement);
	}
	
	private void createBallBorderCollisionHandling(){
		Context firstArgument = ContextFactory.findOrCreateArgumentContext(0);
		Context secondArgument = ContextFactory.findOrCreateArgumentContext(1);
		AtomicPredicate ball = AtomicPredicateFactory.findOrCreateExactTypePredicate(firstArgument, TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.Ball"));
		AtomicPredicate border = AtomicPredicateFactory.findOrCreateExactTypePredicate(secondArgument, TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.Border"));
		AndPredicate<AtomicPredicate> pred = new AndPredicate<AtomicPredicate>(new BasicPredicate<AtomicPredicate>(ball, true), new BasicPredicate<AtomicPredicate>(border, true));
		List<Context> con = new ArrayList<Context>(); con.add(firstArgument); con.add(secondArgument);
		Specialization specialization = new Specialization(HasCollidedMethodPattern, pred, con);
		Attachment attachement = new Attachment(Collections.singleton(specialization),handleBallBorderCollision, ScheduleInfo.AFTER);
		initialAttachments.add(attachement);
	}
	
	private void createPaddleBallCollisionHandling(){
		Context firstArgument = ContextFactory.findOrCreateArgumentContext(0);
		Context secondArgument = ContextFactory.findOrCreateArgumentContext(1);
		AtomicPredicate paddle = AtomicPredicateFactory.findOrCreateExactTypePredicate(firstArgument, TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.Paddle"));
		AtomicPredicate ball = AtomicPredicateFactory.findOrCreateExactTypePredicate(secondArgument, TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.Ball"));
		AndPredicate<AtomicPredicate> pred = new AndPredicate<AtomicPredicate>(new BasicPredicate<AtomicPredicate>(paddle, true), new BasicPredicate<AtomicPredicate>(ball, true));
		List<Context> con = new ArrayList<Context>(); con.add(firstArgument); con.add(secondArgument);
		Specialization specialization = new Specialization(HasCollidedMethodPattern, pred, con);
		Attachment attachement = new Attachment(Collections.singleton(specialization),handlePaddleBallCollision, ScheduleInfo.AFTER);
		initialAttachments.add(attachement);
	}
	
	private void createPaddleBorderCollisionHandling(){
		Context firstArgument = ContextFactory.findOrCreateArgumentContext(0);
		Context secondArgument = ContextFactory.findOrCreateArgumentContext(1);
		AtomicPredicate paddle = AtomicPredicateFactory.findOrCreateExactTypePredicate(firstArgument, TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.Paddle"));
		AtomicPredicate border = AtomicPredicateFactory.findOrCreateExactTypePredicate(secondArgument, TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.Border"));
		AndPredicate<AtomicPredicate> pred = new AndPredicate<AtomicPredicate>(new BasicPredicate<AtomicPredicate>(paddle, true), new BasicPredicate<AtomicPredicate>(border, true));
		List<Context> con = new ArrayList<Context>(); con.add(firstArgument); con.add(secondArgument);
		Specialization specialization = new Specialization(HasCollidedMethodPattern, pred, con);
		Attachment attachement = new Attachment(Collections.singleton(specialization),handlePaddleBorderCollision, ScheduleInfo.AFTER);
		initialAttachments.add(attachement);
	}
	
	private void createPaddlePowerCollisionHandling(){
		Context firstArgument = ContextFactory.findOrCreateArgumentContext(0);
		Context secondArgument = ContextFactory.findOrCreateArgumentContext(1);
		AtomicPredicate paddle = AtomicPredicateFactory.findOrCreateExactTypePredicate(firstArgument, TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.Paddle"));
		AtomicPredicate power = AtomicPredicateFactory.findOrCreateExactTypePredicate(secondArgument, TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.SpawnedPower"));
		AndPredicate<AtomicPredicate> pred = new AndPredicate<AtomicPredicate>(new BasicPredicate<AtomicPredicate>(paddle, true), new BasicPredicate<AtomicPredicate>(power, true));
		List<Context> con = new ArrayList<Context>(); con.add(firstArgument); con.add(secondArgument);
		Specialization specialization = new Specialization(HasCollidedMethodPattern, pred, con);
		Attachment attachement = new Attachment(Collections.singleton(specialization),handlePaddlePowerCollision, ScheduleInfo.AFTER);
		initialAttachments.add(attachement);
	}
	
	private void createPowerPaddleCollisionHandling(){
		Context firstArgument = ContextFactory.findOrCreateArgumentContext(0);
		Context secondArgument = ContextFactory.findOrCreateArgumentContext(1);
		AtomicPredicate power = AtomicPredicateFactory.findOrCreateExactTypePredicate(firstArgument, TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.SpawnedPower"));
		AtomicPredicate paddle = AtomicPredicateFactory.findOrCreateExactTypePredicate(secondArgument, TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.Paddle"));
		AndPredicate<AtomicPredicate> pred = new AndPredicate<AtomicPredicate>(new BasicPredicate<AtomicPredicate>(power, true), new BasicPredicate<AtomicPredicate>(paddle, true));
		List<Context> con = new ArrayList<Context>(); con.add(firstArgument); con.add(secondArgument);
		Specialization specialization = new Specialization(HasCollidedMethodPattern, pred, con);
		Attachment attachement = new Attachment(Collections.singleton(specialization),handlePowerPaddleCollision, ScheduleInfo.AFTER);
		initialAttachments.add(attachement);
	}
	
	private void createPowerBorderCollisionHandling(){
		Context firstArgument = ContextFactory.findOrCreateArgumentContext(0);
		Context secondArgument = ContextFactory.findOrCreateArgumentContext(1);
		AtomicPredicate power = AtomicPredicateFactory.findOrCreateExactTypePredicate(firstArgument, TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.SpawnedPower"));
		AtomicPredicate border = AtomicPredicateFactory.findOrCreateExactTypePredicate(secondArgument, TypeHierarchyProvider.findOrCreateFromNormalTypeName("bp.base.Border"));
		AndPredicate<AtomicPredicate> pred = new AndPredicate<AtomicPredicate>(new BasicPredicate<AtomicPredicate>(power, true), new BasicPredicate<AtomicPredicate>(border, true));
		List<Context> con = new ArrayList<Context>(); con.add(firstArgument); con.add(secondArgument);
		Specialization specialization = new Specialization(HasCollidedMethodPattern, pred, con);
		Attachment attachement = new Attachment(Collections.singleton(specialization),handlePowerBorderCollision, ScheduleInfo.AFTER);
		initialAttachments.add(attachement);
	}
}