/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.mopp;

public class TextadventureSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private TextadventureSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<Integer> indicesToPrint = new java.util.ArrayList<Integer>();
	
	public TextadventureSyntaxElementDecorator(org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureSyntaxElement decoratedElement, TextadventureSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public TextadventureSyntaxElementDecorator[] getChildDecorators() {
		return childDecorators;
	}
	
	public Integer getNextIndexToPrint() {
		if (indicesToPrint.size() == 0) {
			return null;
		}
		return indicesToPrint.remove(0);
	}
	
	public String toString() {
		return "" + getDecoratedElement();
	}
	
}
