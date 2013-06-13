package org.alia4j.languages.ballandpaddle.importer;

import java.net.URL;
import java.util.Map;

import org.alia4j.language.ballandpaddle.BallandpaddlePackage;
import org.alia4j.language.ballandpaddle.Block;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class Importer implements org.alia4j.fial.Importer {

	private boolean initialized = false;
	
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

		Block block = ballandpaddle.base.Block.getInstance();

		//-----------------------
		// Deploy all definitions
		//-----------------------

		//CompositionRule[] toDeployRules = new CompositionRule[initialCompositionRules.size()];
		//org.alia4j.fial.System.deploy(initialCompositionRules.toArray(toDeployRules));
		//Attachment[] toDeploy = new Attachment[initialAttachments.size()];
		//org.alia4j.fial.System.deploy(initialAttachments.toArray(toDeploy));
	}
	
	
}


