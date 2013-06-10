/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.mopp;

public class TextadventureResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public TextadventureResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureResource(uri);
	}
	
}
