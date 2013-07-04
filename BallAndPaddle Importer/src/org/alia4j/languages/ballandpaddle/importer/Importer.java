package org.alia4j.languages.ballandpaddle.importer;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.alia4j.hierarchy.TypeHierarchyProvider;
import org.alia4j.language.ballandpaddle.BallandpaddlePackage;
import org.alia4j.languages.ballandpaddle.context.LocalDoubleVariableContext;
import org.alia4j.languages.ballandpaddle.predicate.isMethodFinalPredicate;
import org.alia4j.liam.*;
import org.alia4j.liam.pattern.MethodPattern;
import org.alia4j.liam.signature.ResolutionStrategy;
import org.alia4j.patterns.*;
import org.alia4j.patterns.names.ExactNamePattern;
import org.alia4j.patterns.types.ExactClassTypePattern;
import org.alia4j.patterns.types.SubTypePattern;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import ballandpaddle.base.*;

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
		
		for(org.alia4j.language.ballandpaddle.Block b : tempBlocks){
			Block block = new Block(b.getId(), b.getHardness(), b.getNormalRes(), b.getFireRes(), b.getColdRes(), b.getShockRes(), null);
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
		Predicate<AtomicPredicate> predicate = new AndPredicate<AtomicPredicate>(speedPred, isFinalPred);
		Specialization specialization = new Specialization(BAPObjectUpdateMethodPattern, predicate, Collections.<Context>emptyList());
		
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