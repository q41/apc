/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class TextadventureRule extends org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public TextadventureRule(org.eclipse.emf.ecore.EClass metaclass, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureChoice choice, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureCardinality cardinality) {
		super(cardinality, new org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureChoice getDefinition() {
		return (org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureChoice) getChildren()[0];
	}
	
}

