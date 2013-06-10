/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.ui;

public class TextadventureUIMetaInformation extends org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureMetaInformation {
	
	public org.alia4j.language.textadventure.resource.textadventure.ITextadventureHoverTextProvider getHoverTextProvider() {
		return new org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureHoverTextProvider();
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureImageProvider getImageProvider() {
		return org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureImageProvider.INSTANCE;
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureColorManager createColorManager() {
		return new org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.alia4j.language.textadventure.resource.textadventure.ITex
	 * tadventureTextResource,
	 * org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureColorMa
	 * nager) instead.
	 */
	public org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureTokenScanner createTokenScanner(org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureTokenScanner createTokenScanner(org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextResource resource, org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureColorManager colorManager) {
		return new org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureTokenScanner(resource, colorManager);
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureCodeCompletionHelper createCodeCompletionHelper() {
		return new org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureCodeCompletionHelper();
	}
	
}
