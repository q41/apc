/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp;

public class BallandpaddleResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public BallandpaddleResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleResource(uri);
	}
	
}
