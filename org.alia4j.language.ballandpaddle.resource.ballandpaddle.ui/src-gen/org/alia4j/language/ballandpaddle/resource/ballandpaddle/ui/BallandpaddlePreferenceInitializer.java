/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui;

/**
 * A class used to initialize default preference values.
 */
public class BallandpaddlePreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddlePreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddlePreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleBracketSet bracketSet = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleBracketSet(null, null);
		final java.util.Collection<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddlePreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getSyntaxHighlightableTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			String tokenName = tokenNames[i];
			org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
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
