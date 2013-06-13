package org.alia4j.languages.ballandpaddle.importer;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.alia4j.language.ballandpaddle.BallandpaddlePackage;
import org.alia4j.language.ballandpaddle.Block;
import org.alia4j.language.textadventure.Ability;
import org.alia4j.language.textadventure.IgnoreItemAbility;
import org.alia4j.languages.textadventure.context.TAContextFactory;
import org.alia4j.languages.textadventure.predicate.TAAtomicPredicateFactory;
import org.alia4j.liam.ActionFactory;
import org.alia4j.liam.AtomicPredicate;
import org.alia4j.liam.Attachment;
import org.alia4j.liam.AttachmentReference;
import org.alia4j.liam.BasicPredicate;
import org.alia4j.liam.CompositionRule;
import org.alia4j.liam.Context;
import org.alia4j.liam.ContextFactory;
import org.alia4j.liam.ScheduleInfo;
import org.alia4j.liam.Specialization;
import org.alia4j.liam.pattern.MethodPattern;
import org.alia4j.patterns.ClassTypePattern;
import org.alia4j.patterns.ExceptionsPattern;
import org.alia4j.patterns.ModifiersPattern;
import org.alia4j.patterns.NamePattern;
import org.alia4j.patterns.ParametersPattern;
import org.alia4j.patterns.TypePattern;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import textadventure.base.Person;

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

		URL mainFile = systemClassLoader.getResource(System
				.getProperty("ballandpaddle.main") + ".xmi");
		if (mainFile == null) {
			System.out.println("No text adventure file specified (use VM argument -Dtextadventure.main=<class-path-relative-file-name>");
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

		ballandpaddle.base.Level block = ballandpaddle.base.Block.getInstance();

		//-----------------------
		// Deploy all definitions
		//-----------------------

		CompositionRule[] toDeployRules = new CompositionRule[initialCompositionRules.size()];
		org.alia4j.fial.System.deploy(initialCompositionRules.toArray(toDeployRules));
		Attachment[] toDeploy = new Attachment[initialAttachments.size()];
		org.alia4j.fial.System.deploy(initialAttachments.toArray(toDeploy));
		
	}
	
	private void setupIgnoreAbility(
			org.alia4j.language.textadventure.Person person, Ability ability) {
		MethodPattern pattern = new MethodPattern(ModifiersPattern.ANY,
				TypePattern.ANY, ClassTypePattern.ANY,
				NamePattern.ANY, ParametersPattern.ANY,
				ExceptionsPattern.ANY);

		Specialization specialization = new Specialization(pattern,
				new BasicPredicate<AtomicPredicate>(
						TAAtomicPredicateFactory.findOrCreateIsSamePredicate(
								ContextFactory.findOrCreateObjectConstantContext(Person.getPerson(person.getName())),
								TAContextFactory.findOrCreateLocalVariableContext("ego")),
								true),
				Collections.<Context>emptyList());

		Set<AttachmentReference> toIgnore = new HashSet<AttachmentReference>();
		toIgnore.addAll(item2behavior.get(((IgnoreItemAbility) ability).getIgnoredItem()));
		Attachment ignoreAttachment = new Attachment(
				Collections.singleton(specialization),
				ActionFactory.findOrCreateNoOpAction(), ScheduleInfo.BEFORE);
		initialCompositionRules.add(new CompositionRule(
				Collections.singleton(ignoreAttachment),
				Collections.<AttachmentReference>emptySet(),
				Collections.<AttachmentReference>emptySet(),
				toIgnore,
				true));
		initialAttachments.add(ignoreAttachment);
	}

	
}


