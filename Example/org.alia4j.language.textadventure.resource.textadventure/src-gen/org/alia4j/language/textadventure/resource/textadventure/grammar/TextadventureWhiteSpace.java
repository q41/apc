/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.grammar;

public class TextadventureWhiteSpace extends org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureFormattingElement {
	
	private final int amount;
	
	public TextadventureWhiteSpace(int amount, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
