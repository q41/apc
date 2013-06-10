/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.grammar;

public class TextadventureLineBreak extends org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureFormattingElement {
	
	private final int tabs;
	
	public TextadventureLineBreak(org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
