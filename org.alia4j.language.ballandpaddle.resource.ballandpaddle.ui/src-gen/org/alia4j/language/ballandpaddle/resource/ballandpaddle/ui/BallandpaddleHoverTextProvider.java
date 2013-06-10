/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui;

public class BallandpaddleHoverTextProvider implements org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleHoverTextProvider {
	
	private org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleDefaultHoverTextProvider defaultProvider = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleDefaultHoverTextProvider();
	
	public String getHoverText(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject referencedObject) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(referencedObject);
	}
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
