/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar;

public class BallandpaddleWhiteSpace extends org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleFormattingElement {
	
	private final int amount;
	
	public BallandpaddleWhiteSpace(int amount, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleCardinality cardinality) {
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
