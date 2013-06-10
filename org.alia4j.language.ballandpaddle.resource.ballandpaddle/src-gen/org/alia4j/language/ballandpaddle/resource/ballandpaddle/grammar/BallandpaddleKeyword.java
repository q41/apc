/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class BallandpaddleKeyword extends org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleSyntaxElement {
	
	private final String value;
	
	public BallandpaddleKeyword(String value, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleCardinality cardinality) {
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
