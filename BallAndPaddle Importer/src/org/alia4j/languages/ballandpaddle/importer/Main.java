package org.alia4j.languages.ballandpaddle.importer;

import java.net.URL;
import java.util.Map;

import org.alia4j.language.ballandpaddle.BallandpaddlePackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class Main {

	public static void main(String[] args) {
		URL mainFile = Main.class.getClassLoader().getResource("LordOfTheRings.xmi");
		if (mainFile == null) {
			System.out.println("No text adventure file specified (use VM argument -Dtextadventure.main=<class-path-relative-file-name>");
		}
			

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
		
		//Module textAdventureMainModule = (Module) resource.getContents().get(0);
		//textAdventureMainModule.getItems();
				
	}
}
