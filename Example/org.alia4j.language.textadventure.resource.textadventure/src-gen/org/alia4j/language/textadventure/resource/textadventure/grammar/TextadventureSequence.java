/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.grammar;

public class TextadventureSequence extends org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureSyntaxElement {
	
	public TextadventureSequence(org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureCardinality cardinality, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return org.alia4j.language.textadventure.resource.textadventure.util.TextadventureStringUtil.explode(getChildren(), " ");
	}
	
}
