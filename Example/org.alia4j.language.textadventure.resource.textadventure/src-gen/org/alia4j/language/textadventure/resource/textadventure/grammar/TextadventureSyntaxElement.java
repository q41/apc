/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class TextadventureSyntaxElement {
	
	private TextadventureSyntaxElement[] children;
	private TextadventureSyntaxElement parent;
	private org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureCardinality cardinality;
	
	public TextadventureSyntaxElement(org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureCardinality cardinality, TextadventureSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (TextadventureSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(TextadventureSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public TextadventureSyntaxElement getParent() {
		return parent;
	}
	
	public TextadventureSyntaxElement[] getChildren() {
		if (children == null) {
			return new TextadventureSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureCardinality getCardinality() {
		return cardinality;
	}
	
}
