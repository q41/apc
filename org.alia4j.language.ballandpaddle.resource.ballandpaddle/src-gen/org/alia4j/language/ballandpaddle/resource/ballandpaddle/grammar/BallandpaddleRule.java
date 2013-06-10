/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class BallandpaddleRule extends org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public BallandpaddleRule(org.eclipse.emf.ecore.EClass metaclass, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleChoice choice, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleCardinality cardinality) {
		super(cardinality, new org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleChoice getDefinition() {
		return (org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleChoice) getChildren()[0];
	}
	
}

