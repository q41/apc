package org.alia4j.languages.ballandpaddle.importer;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.alia4j.hierarchy.TypeHierarchyProvider;
import org.alia4j.language.ballandpaddle.AndParameter;
import org.alia4j.language.ballandpaddle.AttParameter;
import org.alia4j.language.ballandpaddle.BallandpaddlePackage;
import org.alia4j.language.ballandpaddle.BooleanExpression;
import org.alia4j.language.ballandpaddle.BracketParameter;
import org.alia4j.language.ballandpaddle.DoubleValueParameter;
import org.alia4j.language.ballandpaddle.EqParameter;
import org.alia4j.language.ballandpaddle.IntValueParameter;
import org.alia4j.language.ballandpaddle.LeqParameter;
import org.alia4j.language.ballandpaddle.LthParameter;
import org.alia4j.language.ballandpaddle.NegParameter;
import org.alia4j.language.ballandpaddle.NeqParameter;
import org.alia4j.language.ballandpaddle.OrParameter;
import org.alia4j.language.ballandpaddle.SeqParameter;
import org.alia4j.language.ballandpaddle.SmthParameter;
import org.alia4j.language.ballandpaddle.TargetType;
import org.alia4j.languages.ballandpaddle.context.LocalDoubleVariableContext;
import org.alia4j.languages.ballandpaddle.predicate.isMethodFinalPredicate;
import org.alia4j.liam.Action;
import org.alia4j.liam.ActionFactory;
import org.alia4j.liam.AndPredicate;
import org.alia4j.liam.AtomicPredicate;
import org.alia4j.liam.AtomicPredicateFactory;
import org.alia4j.liam.Attachment;
import org.alia4j.liam.BasicPredicate;
import org.alia4j.liam.CompositionRule;
import org.alia4j.liam.Context;
import org.alia4j.liam.ContextFactory;
import org.alia4j.liam.OrPredicate;
import org.alia4j.liam.Predicate;
import org.alia4j.liam.ScheduleInfo;
import org.alia4j.liam.Specialization;
import org.alia4j.liam.pattern.MethodPattern;
import org.alia4j.liam.signature.ResolutionStrategy;
import org.alia4j.patterns.ClassTypePattern;
import org.alia4j.patterns.ExceptionsPattern;
import org.alia4j.patterns.ModifiersPattern;
import org.alia4j.patterns.ParametersPattern;
import org.alia4j.patterns.TypePattern;
import org.alia4j.patterns.names.ExactNamePattern;
import org.alia4j.patterns.types.ExactClassTypePattern;
import org.alia4j.patterns.types.SubTypePattern;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ballandpaddle.base.BAPObject;
import ballandpaddle.base.Ball;
import ballandpaddle.base.Block;
import ballandpaddle.base.Paddle;
import ballandpaddle.base.Power;

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

		URL mainFile = systemClassLoader.getResource(System.getProperty("ballandpaddle.main") + ".xmi");
		if (mainFile == null) {
			System.out.println("No BAP level file specified (use VM argument -Dballandpaddle.main=<class-path-relative-file-name>");
		}

		//-----------------------
		// Read AST
		//-----------------------

		// Initialize the model
		BallandpaddlePackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(URI
				.createURI(mainFile.toExternalForm()), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		org.alia4j.language.ballandpaddle.Root root = (org.alia4j.language.ballandpaddle.Root) resource.getContents().get(0);

		//-----------------------
		// Process AST
		//-----------------------

		ballandpaddle.base.Level level = ballandpaddle.base.Level.getInstance();
		//create powers before creating blocks since some blocks can have powers!
		//create unique blocks
		List<Block> blocks = new ArrayList<Block>();
		EList<org.alia4j.language.ballandpaddle.Block> tempBlocks = root.getBlocks();
		
		//create powers
		
		
		//create effects
//		Map<Effect, Predicate> effectPredicates = new HashMap<Effect, Predicate>();
//		List<Effect> effects = new ArrayList<Effect>();
//		for(org.alia4j.language.ballandpaddle.Effect e : root.getEffects()){
//			//name of the effect
//			e.getId();
//			
//			
//			//target of the effect -> for predicate
//			EffectType type = e.getTypes();
//			//the attribute that it is affecting, if any
//			TargetType t = type.getTarget();
//			t.get
//			Effect.TargetType type;
//			Predicate pred = null;
//			String target = "";
//			if(t instanceof TypeTarget){
//				//target is an object of the given type
//				type = Effect.TargetType.TYPE;
//				TypeTarget tar = (TypeTarget)t;
//				tar.getType();				
//				target = getBAPObjectType(tar.getType());
//				pred = getTargetPredicate(tar.getParams());
//			}
//			else{
//				//object is an actual item, match on object id.
//				type = Effect.TargetType.OBJECT;
//				ObjectTarget tar = (ObjectTarget)t;
//				target = tar.getItem().getId();
//			}
//			
//			
//			//keyword of what aspect it wants to change
//			e.getType();
//			//expression of how it is changed
//			e.getExpression();
//			
//			
//			
//			
//			
//			
//			
//			Effect effect = new Effect(e.getId(), type, target);
//			effects.add(effect);
//			effectPredicates.put(effect, pred);			
//		}
		
		for(org.alia4j.language.ballandpaddle.Block b : tempBlocks){
//			if(b.getPower()!= null){
//				//create power
//				org.alia4j.language.ballandpaddle.Power p = b.getPower();
//				Target t = p.getTarget();
////				if(t instanceof ThisTarget)
//					//not allowed!
//				if(t instanceof TypeTarget){					
//					TypeTarget tar = (TypeTarget)t;
//					tar.getType();
//					tar.getParams();
//				}
//				else if(t instanceof ObjectTarget){
//					ObjectTarget tar = (ObjectTarget)t;
//					tar.getItem().getId();
//				}
//				
//				Power power = new Power(p.getId(), null/*effects*/, p.getDuration(), p.getPowerSpawnChance());
//			}
			Block block = new Block(b.getId(), b.getHardness(), b.getResistance(), null);
			blocks.add(block);
		}		
		
		//create paddle
		List<Paddle> paddles = new ArrayList<Paddle>();		
		EList<org.alia4j.language.ballandpaddle.Paddle> tempPaddles = root.getPaddles();
		for(org.alia4j.language.ballandpaddle.Paddle p : tempPaddles){
			Paddle paddle = new Paddle(p.getId(), p.getX(), p.getY(), p.getOrientation(), p.getSize());
			paddles.add(paddle);
		}		
		
		//create ball
		List<Ball> balls = new ArrayList<Ball>();
		EList<org.alia4j.language.ballandpaddle.Ball> tempBalls = root.getBalls();
		for(org.alia4j.language.ballandpaddle.Ball b : tempBalls){
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
		level.setDeclaredPowers(new ArrayList<Power>());
		
		
		//-----------------------
		// Creating attachments
		//-----------------------
		
		createBaseCollisionDetection();
		createStandardBallCollisionHandling();
		createStandardOthersCollisionHandling();
		createEffect();
		
		//-----------------------
		// Deploy all definitions
		//-----------------------

		CompositionRule[] toDeployRules = new CompositionRule[initialCompositionRules.size()];
		org.alia4j.fial.System.deploy(initialCompositionRules.toArray(toDeployRules));
		Attachment[] toDeploy = new Attachment[initialAttachments.size()];
		org.alia4j.fial.System.deploy(initialAttachments.toArray(toDeploy));
		
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

	private static final Predicate<AtomicPredicate> getTargetPredicate(BooleanExpression param){
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
//			return new LocalVariableContext(attPar.getAtt().getName());
			return null;
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
	private static final MethodPattern BAPObjectUpdateMethodPattern = new MethodPattern(
		ModifiersPattern.ANY,
		TypePattern.ANY,
		new SubTypePattern(new ExactClassTypePattern(TypeHierarchyProvider.findOrCreateFromClass(BAPObject.class))),
		new ExactNamePattern("update"),
		ParametersPattern.ANY,
		ExceptionsPattern.ANY
	);

	private void createEffect() {
		//match on speed member 
		
		
		//check for speed threshold
		Context calleeContext = ContextFactory.findOrCreateCalleeContext();
		Context speedContext = new LocalDoubleVariableContext(calleeContext, "speed");
		Context thresholdContext = ContextFactory.findOrCreateDoubleConstantContext(0.5);
		Context exceedsContext = ContextFactory.findOrCreateGreaterContext(speedContext, thresholdContext);
		BasicPredicate<AtomicPredicate> speedPred = new BasicPredicate<AtomicPredicate>(AtomicPredicateFactory.findOrCreateContextValuePredicate(exceedsContext), true);
		
		//check for final
		Context resolvedMethodContext = ContextFactory.findOrCreateActualMemberContext();
		BasicPredicate<AtomicPredicate> isFinalPred = new BasicPredicate<AtomicPredicate>(new isMethodFinalPredicate(resolvedMethodContext), true);
		
		//contruct specialization
		BasicPredicate<AtomicPredicate> testPred = new BasicPredicate<AtomicPredicate>(AtomicPredicateFactory.findOrCreateContextValuePredicate(ContextFactory.findOrCreateBooleanConstantContext(true)),true);
		
		Predicate<AtomicPredicate> andPredicate = new AndPredicate<AtomicPredicate>(testPred, isFinalPred);
		
		Specialization specialization = new Specialization(BAPObjectUpdateMethodPattern, isFinalPred, Collections.<Context>emptyList());
		
		Attachment attachement = new Attachment(Collections.singleton(specialization), testAction, ScheduleInfo.AFTER);
		initialAttachments.add(attachement);
	}	
	
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