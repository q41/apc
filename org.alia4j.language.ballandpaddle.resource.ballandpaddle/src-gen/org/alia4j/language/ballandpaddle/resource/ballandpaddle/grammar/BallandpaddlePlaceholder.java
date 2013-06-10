/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class BallandpaddlePlaceholder extends org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleTerminal {
	
	private final String tokenName;
	
	public BallandpaddlePlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
