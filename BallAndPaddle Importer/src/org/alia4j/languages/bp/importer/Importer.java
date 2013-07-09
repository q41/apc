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
import org.alia4j.languages.bp.predicate.*;
import org.alia4j.liam.*;
import org.alia4j.liam.pattern.*;
import org.alia4j.liam.signature.ResolutionStrategy;
import org.alia4j.patterns.*;
import org.alia4j.patterns.names.ExactNamePattern;
import org.alia4j.patterns.types.*;
import org.eclipse.emf.common.util.EList;
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
	}
	
	//Main game objects
	private Map<String, bp.base.Paddle> paddles = new HashMap<String, bp.base.Paddle>();
	private Map<String, bp.base.Ball> balls = new HashMap<String, bp.base.Ball>();
	private Map<String, bp.base.Block> blocks = new HashMap<String, bp.base.Block>();
	private Map<String, Attachment> effects = new HashMap<String, Attachment>();
	private Map<String, bp.base.Power> powers = new HashMap<String, bp.base.Power>();
	private bp.base.Level level;

	private void visit(Root root) {
		
		for(Paddle paddle: root.getPaddles()) {
			paddles.put(paddle.getId(), visit(paddle));
		}
		for(Ball ball: root.getBalls()) {
			balls.put(ball.getId(), visit(ball));
		}
		for(Power power: root.getPowers()) {
			powers.put(power.getId(), visit(power));
		}
		for(Effect effect: root.getEffects()) {
			effects.put(effect.getId(), visit(effect));
		}
		for(Block block: root.getBlocks()) {
			blocks.put(block.getId(), visit(block));
		}
		level = visit(root.getLevel());
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
		return new bp.base.Block(block.getId(), block.getHardness(), block.getResistance(), powers.get(block.getPower().getId()));
	}

	private bp.base.Level visit(Level level) {
		//TODO instance
		bp.base.Level gameLevel = new bp.base.Level(level.getId(), new ArrayList<bp.base.Paddle>(paddles.values()), new ArrayList<bp.base.Ball>(balls.values()), level.getBlocks(), level.getPowerSpawnChance());
		gameLevel.generateBlocks(new ArrayList<bp.base.Block>(blocks.values()));
		return gameLevel;
	}
	
	private Attachment visit(Effect effect) {
		//bp.base.Effect gameEffect;
		if(effect instanceof GeneralEffect) return visit((GeneralEffect) effect);
		else return visit((CollisionEffect) effect);
	}
	
//	private void generateAttachment() {
//		//create attribute getter pattern 
//		MethodPattern attributeGetter = new MethodPattern(
//			ModifiersPattern.ANY,
//			TypePattern.ANY,
//			new ExactClassTypePattern(TypeHierarchyProvider.findOrCreateFromClass(bpObjectClass)),
//			new ExactNamePattern("get"+Character.toUpperCase(attribute.charAt(0))+attribute.substring(1).toLowerCase()),
//			ParametersPattern.ANY,
//			ExceptionsPattern.ANY
//		);
//		
//		//create pattern matching predicate
//		BasicPredicate<AtomicPredicate> predicate = generatePredicate();
//		
//		//contruct specialization
//		//Predicate<AtomicPredicate> andPredicate = new AndPredicate<AtomicPredicate>(testPred, isFinalPred);
//		Specialization specialization = new Specialization(attributeGetter, predicate, Collections.singletonList(valueContext));
//		
//		attachment = new Attachment(Collections.singleton(specialization), attributeIncAction, ScheduleInfo.AROUND);
//	}
	
	private Attachment visit(GeneralEffect effect) {
		AttributeAdjustment attrAdjustment = effect.getBody();
		
		Pattern pattern = createPattern(null, attrAdjustment.getEffectedAttribute());
		Action action = createAction(attrAdjustment);
		Context context = visit(attrAdjustment.getExpression());
		
		Target target = effect.getTarget();
		Context filter = visit(target.getFilter());
		
		
		Specialization specialization = new Specialization(pattern, predicate, Collections.singletonList(context));
		return new Attachment(Collections.singleton(specialization), action, ScheduleInfo.AROUND);
	}
	
	private MethodPattern createPattern(Class<? extends BAPObject> bpObjectClass, EffectedAttribute attribute) {
		String attrName = EffectedAttribute.toString();
		return new MethodPattern(	
			ModifiersPattern.ANY,
			TypePattern.ANY,
			new ExactClassTypePattern(TypeHierarchyProvider.findOrCreateFromClass(bpObjectClass)),
			new ExactNamePattern("get"+Character.toUpperCase(attrName.charAt(0))+attrName.substring(1).toLowerCase()),
			ParametersPattern.ANY,
			ExceptionsPattern.ANY
		);
	}
	
	private Attachment visit(CollisionEffect effect) {
		return null;
	}
	
	private Action createAction(AttributeAdjustment attributeAdjustment) {
		AdjustmentOperator op = attributeAdjustment.getAdjustmentOperator();
		EffectedAttribute attr = attributeAdjustment.getEffectedAttribute();
		switch(attr) {
		case SPEED:
		case SIZE:
			if(op==AdjustmentOperator.SET) return DoubleAttributeAssignAction.methodCallAction;
			else return DoubleAttributeIncAction.methodCallAction;
		case HARDNESS:
		case NORMAL_RES:
		case ORIENTATION:
		case X:
		case Y:
			if(op==AdjustmentOperator.SET) return IntAttributeAssignAction.methodCallAction;
			else return IntAttributeIncAction.methodCallAction;
		case IMMATERIAL:
			return BooleanAttributeAssignAction.methodCallAction;
		}
	}
	
	private Context visit(Expression expression) {
		//TODO
		//ContextFactory.findOrCreateIntegerConstantContext(90);
		Context calleeContext = ContextFactory.findOrCreateCalleeContext();
		Context speedContext = new LocalDoubleVariableContext(calleeContext, "speed");
		Context thresholdContext = ContextFactory.findOrCreateDoubleConstantContext(1.5);
		Context exceedsContext = ContextFactory.findOrCreateGreaterContext(speedContext, thresholdContext);
		return exceedsContext;
	}

	private void oldASTprocesser(Root root){
		String id = null;
		Predicate<AtomicPredicate> pred = null;
		bp.base.Level level = bp.base.Level.getInstance();
		//create powers before creating blocks since some blocks can have powers!
		//create unique blocks
		List<Block> blocks = new ArrayList<Block>();
		EList<org.alia4j.language.bp.Block> tempBlocks = null; //root.getBlocks();		
		
		//create effects
		Map<Effect, Predicate> effectPredicates = new HashMap<Effect, Predicate>();
		List<Effect> effects = new ArrayList<Effect>();
		for(org.alia4j.language.bp.Effect e : root.getEffects()){
			Effect effect;
			//name of the effect
			e.setId(e.getId());
			//go through target stuff
			if(e instanceof GeneralEffect){
				Effect.TargetType type;
				String target;
				GeneralEffect gE = (GeneralEffect) e;
				Target t = gE.getTarget();
				List<EffectedAttribute> targetAttributes = new ArrayList<EffectedAttribute>();
				if(t instanceof TypeTarget){
					//target is an object of the given type
					type = Effect.TargetType.TYPE;
					TypeTarget tar = (TypeTarget)t;
					tar.getType();				
					target = getBAPObjectType(tar.getType());
					if(tar.getParams()!=null){
						pred = getTargetPredicate(tar.getParams());
						targetAttributes.addAll(getTargetAttributes(tar.getParams()));
					}
				}
				else{
					//object is an actual item, match on object id.
					type = Effect.TargetType.OBJECT;
					ObjectTarget tar = (ObjectTarget)t;
					//id of the item, for later matching
					target = tar.getItem().getId();
				}
				effect = new bp.base.GeneralEffect(id, type, target);
				((bp.base.GeneralEffect)effect).setTargetAttributes(targetAttributes);
			}
			else{
				//e instanceof CollisionEffect
				Effect.TargetType leftType;
				String leftTarget = "";
				Effect.TargetType rightType;
				String rightTarget = "";
				CollisionEffect cE = (CollisionEffect) e;
				Target leftT = cE.getLeftTarget();
				Target rightT = cE.getRightTarget();
				List<EffectedAttribute> leftTargetAttributes = new ArrayList<EffectedAttribute>();
				List<EffectedAttribute> rightTargetAttributes = new ArrayList<EffectedAttribute>();
				if(leftT instanceof TypeTarget){
					//target is an object of the given type
					leftType = Effect.TargetType.TYPE;
					TypeTarget tar = (TypeTarget)leftT;
					tar.getType();				
					leftTarget = getBAPObjectType(tar.getType());
					if(tar.getParams()!=null){
						pred = getTargetPredicate(tar.getParams());
						rightTargetAttributes.addAll(getTargetAttributes(tar.getParams()));
					}
				}
				else{
					//object is an actual item, match on object id.
					leftType = Effect.TargetType.OBJECT;
					ObjectTarget tar = (ObjectTarget)leftT;
					//id of the item, for later matching
					leftTarget = tar.getItem().getId();
				}
				if(rightT instanceof TypeTarget){
					//target is an object of the given type
					rightType = Effect.TargetType.TYPE;
					TypeTarget tar = (TypeTarget)rightT;
					tar.getType();				
					rightTarget = getBAPObjectType(tar.getType());
					if(tar.getParams()!=null){
						pred = getTargetPredicate(tar.getParams());
						leftTargetAttributes.addAll(getTargetAttributes(tar.getParams()));
					}
				}
				else{
					//object is an actual item, match on object id.
					rightType = Effect.TargetType.OBJECT;
					ObjectTarget tar = (ObjectTarget)rightT;
					//id of the item, for later matching
					rightTarget = tar.getItem().getId();
				}
				effect = new bp.base.CollisionEffect(id, leftType, leftTarget, rightType, rightTarget);
				((bp.base.CollisionEffect)effect).setLeftTargetAttributes(leftTargetAttributes);
				((bp.base.CollisionEffect)effect).setRightTargetAttributes(rightTargetAttributes);
			}
			AttributeAdjustment effectType = e.getBody();

			//value change of the effect TODO
			Expression expr = effectType.getExpression();
//			if(expr instanceof IntOperand){
//				IntOperand intOp = (IntOperand)expr;
//				effect.setValue(intOp.getValue());
//			}
//			else if(expr instanceof DoubleOperand){
//				DoubleOperand doubleOp = (DoubleOperand)expr;
//				effect.setValue(doubleOp.getValue());
//			}
//			else{
//				BoolOperand boolOp = (BoolOperand)expr;
//				effect.setValue(boolOp.isValue());
//			}
				
			//owner of the affected attribute
			//and attribute that is modified
//			EffectingAttribute attr = effectType.getEffectingAttribute();
//			Attribute attribute;
//			if(attr instanceof EffectingBallAttribute){
//				EffectingBallAttribute ballAttr = (EffectingBallAttribute) attr;
//				effect.setEffectTarget(Effect.EffectTarget.BALL);
//				attribute = ballAttr.getType();
//			}
//			else if(attr instanceof EffectingBlockAttribute){
//				EffectingBlockAttribute blockAttr = (EffectingBlockAttribute) attr;
//				effect.setEffectTarget(Effect.EffectTarget.BLOCK);
//				attribute = blockAttr.getType();
//			}
//			else{
//				EffectingPaddleAttribute paddleAttr = (EffectingPaddleAttribute) attr;
//				effect.setEffectTarget(Effect.EffectTarget.PADDLE);
//				attribute = paddleAttr.getType();
//			}
//			if(attribute.getValue()==Attribute.HARDNESS_VALUE)
//				effect.setModifiedAttribute(Effect.EffectedAttribute.HARDNESS);
//			else if(attribute.getValue()==Attribute.IMMATERIAL_VALUE)
//				effect.setModifiedAttribute(Effect.EffectedAttribute.IMMATERIAL);
//			else if(attribute.getValue()==Attribute.NORMAL_RES_VALUE)
//				effect.setModifiedAttribute(Effect.EffectedAttribute.RESISTANCE);
//			else if(attribute.getValue()==Attribute.ORIENTATION_VALUE)
//				effect.setModifiedAttribute(Effect.EffectedAttribute.DIRECTION);
//			else if(attribute.getValue()==Attribute.SIZE_VALUE)
//				effect.setModifiedAttribute(Effect.EffectedAttribute.SIZE);
//			else if(attribute.getValue()==Attribute.SPEED_VALUE)
//				effect.setModifiedAttribute(Effect.EffectedAttribute.SPEED);
			
			//duration of the effect
			effect.setDuration(effectType.getDuration());
			//how the attribute is modified, += or -= or =
			AdjustmentOperator op = effectType.getAdjustmentOperator();
			if(op.getValue()==AdjustmentOperator.DEC_VALUE){
				effect.setOperator(Effect.OperatorType.DEC);
			}
			else if(op.getValue()==AdjustmentOperator.INC_VALUE){
				effect.setOperator(Effect.OperatorType.INC);
			}
			else if(op.getValue()==AdjustmentOperator.SET_VALUE){
				effect.setOperator(Effect.OperatorType.SET);
			}		
			effects.add(effect);
			if(pred != null)
				effectPredicates.put(effect, pred);				
		}		

		//import powers
		List<Power> powers = new ArrayList<Power>();
		for(org.alia4j.language.bp.Power p : root.getPowers()){			
			id = p.getId();
			double powerSpawnChance = p.getPowerSpawnChance();
			List<Effect> eff = new ArrayList<Effect>();
			for(org.alia4j.language.bp.Effect e : p.getEffects()){
				for(Effect effect : effects){
					if(effect.getId().equals(e.getId()))
						eff.add(effect);					
				}				
			}
				powers.add(new Power(id, eff, powerSpawnChance));	
		}
		
		
		for(org.alia4j.language.bp.Block b : tempBlocks){
			Power power = null;
			if(b.getPower()!= null){
				for(Power pow : powers){
					if(pow.getId().equals(b.getPower().getId()))
						power = pow;
				}
			}
			Block block = new Block(b.getId(), b.getHardness(), b.getResistance(), power);
			blocks.add(block);
		}		
		
		//create paddle
		List<Paddle> paddles = new ArrayList<Paddle>();		
		EList<org.alia4j.language.bp.Paddle> tempPaddles = root.getPaddles();
		for(org.alia4j.language.bp.Paddle p : tempPaddles){
			Paddle paddle = new Paddle(p.getId(), p.getX(), p.getY(), p.getOrientation(), p.getSize());
			paddles.add(paddle);
		}		
		
		//create ball
		List<Ball> balls = new ArrayList<Ball>();
		EList<org.alia4j.language.bp.Ball> tempBalls = root.getBalls();
		for(org.alia4j.language.bp.Ball b : tempBalls){
			Ball ball = new Ball(b.getId(), b.getX(), b.getY(), b.getSize(), b.getDirection(), b.getSpeed());
			balls.add(ball);
		}
		
		//set up the level
		level.setBalls(balls);
		level.setPaddles(paddles);
		level.setPowerSpawnChance(root.getLevel().getPowerSpawnChance());
		level.setImportedBlocks(root.getLevel().getBlocks());
		level.setID(root.getLevel().getId());
		level.generateBlocks(blocks);
		level.setDeclaredPowers(powers);
		//now check if all the effects were correctly declared
		//effects that were not should be removed, as should the powers that have them.
		level.removeIllegalEffects();
		
		//-----------------------
		// Creating attachments
		//-----------------------
		
		createBaseCollisionDetection();
		createStandardBallCollisionHandling();
		createStandardOthersCollisionHandling();
//		createEffect(Ball.class, "direction", AttributeType.INT);
		
		//-----------------------
		// Deploy all definitions
		//-----------------------

		CompositionRule[] toDeployRules = new CompositionRule[initialCompositionRules.size()];
		org.alia4j.fial.System.deploy(initialCompositionRules.toArray(toDeployRules));
		Attachment[] toDeploy = new Attachment[initialAttachments.size()];
		org.alia4j.fial.System.deploy(initialAttachments.toArray(toDeploy));
		
	}	
	
	private List<EffectedAttribute> getTargetAttributes(BooleanExpression param) {
		List<EffectedAttribute> result = new ArrayList<EffectedAttribute>();
		if(param instanceof BooleanBinaryExpression){
			BooleanBinaryExpression par = (BooleanBinaryExpression) param;
			result.addAll(getTargetAttributes(par.getLeft())); result.addAll(getTargetAttributes(par.getRight()));
		}
		if(param instanceof BooleanUnaryExpression){
			BooleanUnaryExpression par = (BooleanUnaryExpression) param;
			result.addAll(getTargetAttributes(par.getBody()));
		}
		if(param instanceof AttParameter){
			AttParameter attPar = (AttParameter)param;
			Attribute att = attPar.getAtt();
			if(att.getValue()==att.HARDNESS_VALUE)
				result.add(EffectedAttribute.HARDNESS);
			else if(att.getValue()==att.IMMATERIAL_VALUE)
				result.add(EffectedAttribute.IMMATERIAL);
			else if(att.getValue()==att.NORMAL_RES_VALUE)
				result.add(EffectedAttribute.RESISTANCE);
			else if(att.getValue()==att.ORIENTATION_VALUE)
				result.add(EffectedAttribute.DIRECTION);
			else if(att.getValue()==att.SIZE_VALUE)
				result.add(EffectedAttribute.SIZE);
			else if(att.getValue()==att.SPEED_VALUE)
				result.add(EffectedAttribute.SPEED);
		}		
		return result;
	}

	private String getBAPObjectType(TargetType type) {
		String result = "";
		if(type.getValue()==TargetType.BALL_VALUE)
			result = "ballandpaddle.base.Ball";
		else if(type.getValue()==TargetType.BLOCK_VALUE)
			result = "ballandpaddle.base.Block";
		else if(type.getValue()==TargetType.PADDLE_VALUE)
			result = "ballandpaddle.base.Paddle";
		return result;
	}

	private Predicate<AtomicPredicate> getTargetPredicate(BooleanExpression param){
		if(param instanceof AndParameter){
			AndParameter andPar = (AndParameter) param;
				return new AndPredicate<>(getTargetPredicate(andPar.getLeft()), getTargetPredicate(andPar.getRight()));
		}
		else if(param instanceof OrParameter){
			OrParameter orPar = (OrParameter) param;
			return new OrPredicate<>(getTargetPredicate(orPar.getLeft()), getTargetPredicate(orPar.getRight()));
		}
		else if(param instanceof EqParameter){
			EqParameter eqPar = (EqParameter) param;
			Context equalsContext = ContextFactory.findOrCreateEqualContext(getTargetContext(eqPar.getLeft()), getTargetContext(eqPar.getRight()));
			return new BasicPredicate<AtomicPredicate>(AtomicPredicateFactory.findOrCreateContextValuePredicate(equalsContext), true);
		}
		else if(param instanceof SmthParameter){
			SmthParameter smthPar = (SmthParameter) param;
			//switch right and left so that this is actually a SmallerContext
			Context smallerContext = ContextFactory.findOrCreateGreaterContext(getTargetContext(smthPar.getRight()), getTargetContext(smthPar.getLeft()));
			return new BasicPredicate<AtomicPredicate>(AtomicPredicateFactory.findOrCreateContextValuePredicate(smallerContext), true);
		}
		else if(param instanceof SeqParameter){
			SeqParameter seqPar = (SeqParameter) param;
			//switch right and left so that this is actually a SmallerEqualContext
			Context smallerOrEqualContext = ContextFactory.findOrCreateGreaterEqualContext(getTargetContext(seqPar.getRight()), getTargetContext(seqPar.getLeft()));
			return new BasicPredicate<AtomicPredicate>(AtomicPredicateFactory.findOrCreateContextValuePredicate(smallerOrEqualContext), true);
		}
		else if(param instanceof LthParameter){
			LthParameter lthPar = (LthParameter) param;
			Context largerContext = ContextFactory.findOrCreateGreaterContext(getTargetContext(lthPar.getLeft()), getTargetContext(lthPar.getRight()));
			return new BasicPredicate<AtomicPredicate>(AtomicPredicateFactory.findOrCreateContextValuePredicate(largerContext), true);
		}
		else if(param instanceof LeqParameter){
			LeqParameter leqPar = (LeqParameter) param;
			Context largerOrEqualContext = ContextFactory.findOrCreateGreaterEqualContext(getTargetContext(leqPar.getLeft()), getTargetContext(leqPar.getRight()));
			return new BasicPredicate<AtomicPredicate>(AtomicPredicateFactory.findOrCreateContextValuePredicate(largerOrEqualContext), true);
		}
		else if(param instanceof NeqParameter){
			NeqParameter neqPar = (NeqParameter) param;
			Context notEqualContext = ContextFactory.findOrCreateEqualContext(getTargetContext(neqPar.getLeft()), getTargetContext(neqPar.getRight()));
			return new BasicPredicate<AtomicPredicate>(AtomicPredicateFactory.findOrCreateContextValuePredicate(notEqualContext), false);
		}
		else if(param instanceof NegParameter){
			NegParameter negPar = (NegParameter) param;
			return getTargetPredicate(negPar.getBody()).negate();
		}
		else if(param instanceof BracketParameter){
			BracketParameter brackPar = (BracketParameter) param;
			//brackets, so just recursively continue for it's body
			return getTargetPredicate(brackPar.getBody());
		}
		return null;
	}
	
	private static Context getTargetContext(BooleanExpression param) {
		///TODO, far from finished
		if(param instanceof AttParameter){
			AttParameter attPar = (AttParameter)param;
			Attribute att = attPar.getAtt();
			Context con = null;
			Context calleeContext = ContextFactory.findOrCreateCalleeContext();
			if(att.getValue()==att.HARDNESS_VALUE)
				con = new LocalIntegerVariableContext(calleeContext, "hardness");
			else if(att.getValue()==att.IMMATERIAL_VALUE)
				con = new LocalBooleanVariableContext(calleeContext, "immaterial");
			else if(att.getValue()==att.NORMAL_RES_VALUE)
				con = new LocalIntegerVariableContext(calleeContext, "resistance");
			else if(att.getValue()==att.ORIENTATION_VALUE)
				con = new LocalIntegerVariableContext(calleeContext, "direction");
			else if(att.getValue()==att.SIZE_VALUE)
				con = new LocalIntegerVariableContext(calleeContext, "size");
			else if(att.getValue()==att.SPEED_VALUE)
				con = new LocalDoubleVariableContext(calleeContext, "speed");
			return con;
		}
		else if(param instanceof IntValueParameter){
			IntValueParameter intPar = (IntValueParameter)param;
			return ContextFactory.findOrCreateDoubleConstantContext(intPar.getValue());
		}
		else if(param instanceof DoubleValueParameter){
			DoubleValueParameter doubPar = (DoubleValueParameter)param;
			return ContextFactory.findOrCreateDoubleConstantContext(doubPar.getValue());
		}	
		return null;
	}

	private static final Action testAction = ActionFactory.findOrCreateMethodCallAction(
		TypeHierarchyProvider.findOrCreateFromNormalTypeName("ballandpaddle.base.Main"),
		"print",
		TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[]{}),
		TypeHierarchyProvider.findOrCreateFromNormalTypeName("void"),
		ResolutionStrategy.STATIC
	);
	private static final BasicPredicate<AtomicPredicate> testPred = new BasicPredicate<AtomicPredicate>(AtomicPredicateFactory.findOrCreateContextValuePredicate(ContextFactory.findOrCreateBooleanConstantContext(true)),true);
	
//	private void createEffect(Class<? extends BAPObject> bapobject, String attribute, AttributeType attributeType) {
//		//create attribute getter pattern 
//		MethodPattern attributeGetter = new MethodPattern(
//			ModifiersPattern.ANY,
//			TypePattern.ANY,
//			new ExactClassTypePattern(TypeHierarchyProvider.findOrCreateFromClass(bapobject)),
//			new ExactNamePattern("get"+Character.toUpperCase(attribute.charAt(0))+attribute.substring(1).toLowerCase()),
//			ParametersPattern.ANY,
//			ExceptionsPattern.ANY
//		);
//		
//		//create pattern matching predicate
//		BasicPredicate<AtomicPredicate> predicate = createEffectPredicate();
//
//		//create attribute assign action
//		Action attributeAssignAction = null;
//		switch(attributeType) {
//		case DOUBLE: attributeAssignAction = DoubleAttributeAssignAction.methodCallAction; break;
//		case INT: attributeAssignAction = DoubleAttributeAssignAction.methodCallAction; break;
//		case BOOLEAN: attributeAssignAction = DoubleAttributeAssignAction.methodCallAction; break;
//		}
//		
//		Action attributeIncAction = null;
//		switch(attributeType) {
//		case DOUBLE: attributeIncAction = DoubleAttributeIncAction.methodCallAction; break;
//		case INT: attributeIncAction = IntAttributeIncAction.methodCallAction; break;
//		case BOOLEAN: assert(false);
//		}
//		
//		Context newSize = ContextFactory.findOrCreateIntegerConstantContext(90);
//		
//		//contruct specialization
//		//Predicate<AtomicPredicate> andPredicate = new AndPredicate<AtomicPredicate>(testPred, isFinalPred);
//		Specialization specialization = new Specialization(attributeGetter, predicate, Collections.singletonList(newSize));
//		
//		Attachment attachement = new Attachment(Collections.singleton(specialization), attributeIncAction, ScheduleInfo.AROUND);
//		initialAttachments.add(attachement);
//	}
//	
//	private BasicPredicate<AtomicPredicate> createEffectPredicate() {
//		Context calleeContext = ContextFactory.findOrCreateCalleeContext();
//		Context speedContext = new LocalDoubleVariableContext(calleeContext, "speed");
//		Context thresholdContext = ContextFactory.findOrCreateDoubleConstantContext(1.5);
//		Context exceedsContext = ContextFactory.findOrCreateGreaterContext(speedContext, thresholdContext);
//		return new BasicPredicate<AtomicPredicate>(AtomicPredicateFactory.findOrCreateContextValuePredicate(exceedsContext), true);
//	}
	
	//Collision detection
	
	private static final Action checkForCollision = ActionFactory.findOrCreateMethodCallAction(
			TypeHierarchyProvider.findOrCreateFromNormalTypeName("ballandpaddle.base.collision.Collision"),
			"checkForCollision",
			TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[]{"ballandpaddle.base.BAPObject", "ballandpaddle.base.Level"}),
			TypeHierarchyProvider.findOrCreateFromNormalTypeName("void"),
			ResolutionStrategy.STATIC			
			);
	
	private static final MethodPattern LevelHandleBAPObjectUpdateMethodPattern = new MethodPattern(
			ModifiersPattern.ANY,
			TypePattern.ANY, 
			ClassTypePattern.ANY,
			new ExactNamePattern("handleBAPObjectUpdate"),
			ParametersPattern.ANY,
			ExceptionsPattern.ANY
	);
	
	private void createBaseCollisionDetection(){		
		Context argumentContext = ContextFactory.findOrCreateArgumentContext(0);
		Context calleeContext = ContextFactory.findOrCreateCalleeContext();
		List<Context> con = new ArrayList<Context>(); con.add(argumentContext); con.add(calleeContext);
		Specialization specialization = new Specialization(LevelHandleBAPObjectUpdateMethodPattern, null, con);//Collections.singletonList(argumentContext));
		
		Attachment attachement = new Attachment(Collections.singleton(specialization), checkForCollision, ScheduleInfo.AFTER);
		initialAttachments.add(attachement);
	}
	
	//Collision handling
	private static final Action handleStandardCollision = ActionFactory.findOrCreateMethodCallAction(
			TypeHierarchyProvider.findOrCreateFromNormalTypeName("ballandpaddle.base.collision.StandardCollisionResolver"),
			"resolveCollision",
			TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[]{"ballandpaddle.base.BAPObject","ballandpaddle.base.BAPObject"}),
			TypeHierarchyProvider.findOrCreateFromNormalTypeName("void"),
			ResolutionStrategy.STATIC			
			);
	private static final Action handleImmaterialCollision = ActionFactory.findOrCreateMethodCallAction(
			TypeHierarchyProvider.findOrCreateFromNormalTypeName("ballandpaddle.base.collision.ImmaterialCollisionResolver"),
			"resolveCollision",
			TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[]{"ballandpaddle.base.BAPObject","ballandpaddle.base.BAPObject"}),
			TypeHierarchyProvider.findOrCreateFromNormalTypeName("void"),
			ResolutionStrategy.STATIC			
			);
	
	private static final MethodPattern hasCollidedMethodPattern = new MethodPattern(
			ModifiersPattern.ANY,
			TypePattern.ANY, 
			ClassTypePattern.ANY,
			new ExactNamePattern("haveCollided"),
			ParametersPattern.ANY,
			ExceptionsPattern.ANY
	);
	
	private void createStandardBallCollisionHandling(){
		Context argumentContext = ContextFactory.findOrCreateArgumentContext(0);
		Context calleeContext = ContextFactory.findOrCreateArgumentContext(1);
		//TODO get context for return type, action should only happen if there was actually a collision	
		AtomicPredicate pred = AtomicPredicateFactory.findOrCreateExactTypePredicate(argumentContext, TypeHierarchyProvider.findOrCreateFromNormalTypeName("ballandpaddle.base.Ball"));
		List<Context> con = new ArrayList<Context>(); con.add(argumentContext); con.add(calleeContext);
		Specialization specialization = new Specialization(hasCollidedMethodPattern, new BasicPredicate<AtomicPredicate>(pred, true), con);
		Attachment attachement = new Attachment(Collections.singleton(specialization),handleStandardCollision, ScheduleInfo.AFTER);
		initialAttachments.add(attachement);
	}
	
	private void createStandardBallCollisionHandling(AtomicPredicate pred){
		Context argumentContext = ContextFactory.findOrCreateArgumentContext(0);
		Context calleeContext = ContextFactory.findOrCreateArgumentContext(1);
		//TODO get context for return type, action should only happen if there was actually a collision	
		List<Context> con = new ArrayList<Context>(); con.add(argumentContext); con.add(calleeContext);
		Specialization specialization = new Specialization(hasCollidedMethodPattern, new BasicPredicate<AtomicPredicate>(pred, true), con);
		Attachment attachement = new Attachment(Collections.singleton(specialization),handleStandardCollision, ScheduleInfo.AFTER);
		initialAttachments.add(attachement);
	}
	
	private void createStandardOthersCollisionHandling(){
		Context argumentContext = ContextFactory.findOrCreateArgumentContext(0);
		Context calleeContext = ContextFactory.findOrCreateArgumentContext(1);
		//TODO get context for return type, action should only happen if there was actually a collision	
		AtomicPredicate pred = AtomicPredicateFactory.findOrCreateExactTypePredicate(argumentContext, TypeHierarchyProvider.findOrCreateFromNormalTypeName("ballandpaddle.base.Ball"));
		List<Context> con = new ArrayList<Context>(); con.add(argumentContext); con.add(calleeContext);
		Specialization specialization = new Specialization(hasCollidedMethodPattern, new BasicPredicate<AtomicPredicate>(pred, false), con);
		Attachment attachement = new Attachment(Collections.singleton(specialization),handleStandardCollision, ScheduleInfo.AFTER);
		initialAttachments.add(attachement);
	}
	
	private void createImmaterialBallCollisionHandling(AtomicPredicate pred){
		Context argumentContext = ContextFactory.findOrCreateArgumentContext(0);
		Context calleeContext = ContextFactory.findOrCreateArgumentContext(1);
		//TODO get context for return type, action should only happen if there was actually a collision	
		List<Context> con = new ArrayList<Context>(); con.add(argumentContext); con.add(calleeContext);
		Specialization specialization = new Specialization(hasCollidedMethodPattern, new BasicPredicate<AtomicPredicate>(pred, true), con);
		Attachment attachement = new Attachment(Collections.singleton(specialization),handleImmaterialCollision, ScheduleInfo.AFTER);
		initialAttachments.add(attachement);
	}

}