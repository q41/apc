/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar;

public class BallandpaddleLineBreak extends org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleFormattingElement {
	
	private final int tabs;
	
	public BallandpaddleLineBreak(org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
