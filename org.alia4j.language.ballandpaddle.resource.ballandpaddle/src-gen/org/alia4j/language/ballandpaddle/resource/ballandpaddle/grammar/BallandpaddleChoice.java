/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar;

public class BallandpaddleChoice extends org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleSyntaxElement {
	
	public BallandpaddleChoice(org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleCardinality cardinality, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddleStringUtil.explode(getChildren(), "|");
	}
	
}
