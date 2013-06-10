/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.mopp;

public class TextadventureDynamicTokenStyler {
	
	/**
	 * This method is called to dynamically style tokens.
	 * 
	 * @param resource the TextResource that contains the token
	 * @param token the token to obtain a style for
	 * @param staticStyle the token style as set in the editor preferences (is
	 * <code>null</code> if syntax highlighting for the token is disabled)
	 */
	public org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenStyle getDynamicTokenStyle(org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextResource resource, org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextToken token, org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenStyle staticStyle) {
		// The default implementation returns the static style without any changes. To
		// implement dynamic token styling, set the overrideDynamicTokenStyler option to
		// <code>false</code> and customize this method.
		return staticStyle;
	}
	
}
