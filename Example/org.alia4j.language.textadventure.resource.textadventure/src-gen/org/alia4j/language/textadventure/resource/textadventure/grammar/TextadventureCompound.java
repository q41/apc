/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.grammar;

public class TextadventureCompound extends org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureSyntaxElement {
	
	public TextadventureCompound(org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureChoice choice, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureCardinality cardinality) {
		super(cardinality, new org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
