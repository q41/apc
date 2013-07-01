package org.alia4j.languages.ballandpaddle.importer;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.alia4j.hierarchy.TypeDescriptor;
import org.alia4j.hierarchy.TypeHierarchyProvider;
import org.alia4j.language.ballandpaddle.BallandpaddlePackage;
import org.alia4j.liam.Action;
import org.alia4j.liam.ActionFactory;
import org.alia4j.liam.Attachment;
import org.alia4j.liam.CompositionRule;
import org.alia4j.liam.Context;
import org.alia4j.liam.ContextFactory;
import org.alia4j.liam.ScheduleInfo;
import org.alia4j.liam.Specialization;
import org.alia4j.liam.pattern.MethodPattern;
import org.alia4j.liam.signature.ResolutionStrategy;
import org.alia4j.patterns.ClassTypePattern;
import org.alia4j.patterns.ExceptionsPattern;
import org.alia4j.patterns.ModifiersPattern;
import org.alia4j.patterns.NamePattern;
import org.alia4j.patterns.ParametersPattern;
import org.alia4j.patterns.TypePattern;
import org.alia4j.patterns.modifiers.WildcardModifiersPattern;
import org.alia4j.patterns.types.ExactTypePattern;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ballandpaddle.base.Ball;
import ballandpaddle.base.Block;
import ballandpaddle.base.Paddle;
import ballandpaddle.base.Power;

public class Importer implements org.alia4j.fial.Importer {

	private boolean initialized = false;

	private List<Attachment> initialAttachments = new ArrayList<Attachment>();
	private List<CompositionRule> initialCompositionRules = new ArrayList<CompositionRule>();
	
//	private static void initializeFactory(final String property,
//			final String defaultValue) {
//		try {
//			final Class<?> factory = ClassLoader.getSystemClassLoader()
//					.loadClass(
//							java.lang.System
//									.getProperty(property, defaultValue));
//			factory.newInstance();
//		} catch (final Exception e) {
//			throw new Error("Cannot initialize factory", e);
//		}
//	}

	private final ClassLoader systemClassLoader;

	public Importer(ClassLoader systemClassLoader) {
		this.systemClassLoader = systemClassLoader;		
	}

	@Override
	public void performImport() {
		if (initialized)
			throw new Error("Importer has already been executed.");
		initialized = true;

		URL mainFile = systemClassLoader.getResource(System.getProperty("ballandpaddle.main") + ".xmi");
		//mainFile = systemClassLoader.getResource("SampleLevel.xmi");
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
		
		
		announcePrint();
		

		//-----------------------
		// Deploy all definitions
		//-----------------------

		CompositionRule[] toDeployRules = new CompositionRule[initialCompositionRules.size()];
		org.alia4j.fial.System.deploy(initialCompositionRules.toArray(toDeployRules));
		Attachment[] toDeploy = new Attachment[initialAttachments.size()];
		org.alia4j.fial.System.deploy(initialAttachments.toArray(toDeploy));
		
	}
	
	
	private void createEffect() {
		
		//modifiers
		ModifiersPattern mPublic = new WildcardModifiersPattern(WildcardModifiersPattern.PUBLIC);
		ModifiersPattern mFinal = new WildcardModifiersPattern(WildcardModifiersPattern.FINAL);
		
		//type patterns
		TypePattern typeVoid = new ExactTypePattern(TypeHierarchyProvider.findOrCreateFromNormalTypeName("void"));
		
		//class pattern for class that extends BAPOBject
		
				
		//MethodPattern afterBAPObjectUpdate = new MethodPattern(mPublic.or(mFinal), typeVoid
		
	}
	
	
	// testing code
	
	private void announcePrint() {
		MethodPattern pattern = new MethodPattern(ModifiersPattern.ANY,
				TypePattern.ANY, ClassTypePattern.ANY, PRINTNAMEPATTERN, ParametersPattern.ANY,
				ExceptionsPattern.ANY);
		
		//Context context = ContextFactory.findOrCreateCalleeContext();

//		public static final Action findOrCreateMethodCallAction(final TypeDescriptor declaringClass,
//                final CharSequence methodName, final TypeDescriptor[] parameterTypes, final TypeDescriptor resultType,
//                final ResolutionStrategy invocationType)
		
		Specialization specialization = new Specialization(pattern, null, Collections.<Context>emptyList());
//				new BasicPredicate<AtomicPredicate>(
//						TAAtomicPredicateFactory.findOrCreateIsSamePredicate(
//								ContextFactory.findOrCreateObjectConstantContext(Person.getPerson(person.getName())),
//								TAContextFactory.findOrCreateLocalVariableContext("ego")),
//								true)
		
		
		Action action = ActionFactory.findOrCreateMethodCallAction(
				TypeHierarchyProvider.findOrCreateFromNormalTypeName("ballandpaddle.base.Main"),
				(CharSequence)"print",
				TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[]{}),
				TypeHierarchyProvider.findOrCreateFromNormalTypeName("void"),
				ResolutionStrategy.STATIC);
		
		Attachment attachement = new Attachment(Collections.singleton(specialization), action, ScheduleInfo.BEFORE);
		initialAttachments.add(attachement);
	}

	public static final NamePattern PRINTNAMEPATTERN = new NamePattern() {

		@Override
		public boolean matches(CharSequence name) {
			return name.toString().equals("print");
		}

		@Override
		public int hashCode() {
			return System.identityHashCode(this);
		}

		@Override
		public boolean equals(Object obj) {
			return obj == this;
		}
		
	};
}