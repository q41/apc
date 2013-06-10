/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.ui;

/**
 * A class used to initialize default preference values.
 */
public class TextadventurePreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(org.alia4j.language.textadventure.resource.textadventure.ui.TextadventurePreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(org.alia4j.language.textadventure.resource.textadventure.ui.TextadventurePreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, org.alia4j.language.textadventure.resource.textadventure.ITextadventureMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureBracketSet bracketSet = new org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureBracketSet(null, null);
		final java.util.Collection<org.alia4j.language.textadventure.resource.textadventure.ITextadventureBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (org.alia4j.language.textadventure.resource.textadventure.ITextadventureBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + org.alia4j.language.textadventure.resource.textadventure.ui.TextadventurePreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getSyntaxHighlightableTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			String tokenName = tokenNames[i];
			org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
	}
	
	private String getColorString(int[] colorAsRGB) {
		if (colorAsRGB == null) {
			return "0,0,0";
		}
		if (colorAsRGB.length != 3) {
			return "0,0,0";
		}
		return colorAsRGB[0] + "," +colorAsRGB[1] + ","+ colorAsRGB[2];
	}
}
