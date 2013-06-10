/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.ui;

public class TextadventureHoverTextProvider implements org.alia4j.language.textadventure.resource.textadventure.ITextadventureHoverTextProvider {
	
	private org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureDefaultHoverTextProvider defaultProvider = new org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureDefaultHoverTextProvider();
	
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
