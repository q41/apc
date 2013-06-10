/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.grammar;

public class TextadventureChoice extends org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureSyntaxElement {
	
	public TextadventureChoice(org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureCardinality cardinality, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return org.alia4j.language.textadventure.resource.textadventure.util.TextadventureStringUtil.explode(getChildren(), "|");
	}
	
}
