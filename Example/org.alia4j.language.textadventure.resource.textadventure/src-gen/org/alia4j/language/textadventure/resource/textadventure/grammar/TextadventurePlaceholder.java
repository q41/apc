/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class TextadventurePlaceholder extends org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureTerminal {
	
	private final String tokenName;
	
	public TextadventurePlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
