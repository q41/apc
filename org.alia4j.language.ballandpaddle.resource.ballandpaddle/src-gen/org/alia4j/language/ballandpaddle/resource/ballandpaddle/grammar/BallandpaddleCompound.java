/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar;

public class BallandpaddleCompound extends org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleSyntaxElement {
	
	public BallandpaddleCompound(org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleChoice choice, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleCardinality cardinality) {
		super(cardinality, new org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
