/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.mopp;

public class TextadventureTokenStyleInformationProvider {
	
	public static String TASK_ITEM_TOKEN_NAME = "TASK_ITEM";
	
	public org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("tile".equals(tokenName)) {
			return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("item".equals(tokenName)) {
			return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("while".equals(tokenName)) {
			return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("remove".equals(tokenName)) {
			return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("person".equals(tokenName)) {
			return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("used".equals(tokenName)) {
			return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Persons".equals(tokenName)) {
			return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Items".equals(tokenName)) {
			return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ignore".equals(tokenName)) {
			return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Tile".equals(tokenName)) {
			return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("x".equals(tokenName)) {
			return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("y".equals(tokenName)) {
			return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("description".equals(tokenName)) {
			return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("from".equals(tokenName)) {
			return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("on".equals(tokenName)) {
			return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("result".equals(tokenName)) {
			return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("QUOTED_34_34".equals(tokenName)) {
			return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		if ("TASK_ITEM".equals(tokenName)) {
			return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTokenStyle(new int[] {0x7F, 0x9F, 0xBF}, null, true, false, false, false);
		}
		return null;
	}
	
}
