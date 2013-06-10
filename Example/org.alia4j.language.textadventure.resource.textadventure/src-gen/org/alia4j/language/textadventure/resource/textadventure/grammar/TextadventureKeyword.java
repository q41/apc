/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class TextadventureKeyword extends org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureSyntaxElement {
	
	private final String value;
	
	public TextadventureKeyword(String value, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
