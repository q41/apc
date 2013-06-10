/**
 * <copyright>
 * </copyright>
 *
 *
 */
package org.alia4j.language.textadventure.resource.textadventure.mopp;

import java.io.IOException;
import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class TextadventureBuilder implements org.alia4j.language.textadventure.resource.textadventure.ITextadventureBuilder {

	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri) {
		return true;
	}

	public org.eclipse.core.runtime.IStatus build(org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureResource resource, org.eclipse.core.runtime.IProgressMonitor monitor) {
		// get contents and create copy
		EList<EObject> contents = resource.getContents();
		Collection<EObject> contentsCopy = EcoreUtil.copyAll(contents);
		// create new resource with different name
		String fileName = resource.getURI().path().substring(resource.getURI().path().lastIndexOf(java.io.File.separatorChar) + 1);
		String simpleFileName = fileName.substring(0, fileName.length() - ".textadventure".length());
		URI newUri = URI.createURI(simpleFileName + ".xmi").resolve(resource.getURI());
		System.out.println(newUri);
		resource.getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap().put(
			    "*", new  XMIResourceFactoryImpl());

		Resource newResource = resource.getResourceSet().createResource(newUri);
		// add copy of original content to new resource
		newResource.getContents().addAll(contentsCopy);
		// save new resource

		try {
			newResource.save(null);
		} catch (IOException e) {
			// handle exception
		}
		return Status.OK_STATUS;
	}

	@Override
	public IStatus handleDeletion(URI uri, IProgressMonitor monitor) {
		return Status.OK_STATUS;
	}

}
