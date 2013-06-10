/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar;

public class BallandpaddleSequence extends org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleSyntaxElement {
	
	public BallandpaddleSequence(org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleCardinality cardinality, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddleStringUtil.explode(getChildren(), " ");
	}
	
}
