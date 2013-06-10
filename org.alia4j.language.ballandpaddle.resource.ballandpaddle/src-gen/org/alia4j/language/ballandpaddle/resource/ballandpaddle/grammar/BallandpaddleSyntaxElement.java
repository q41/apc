/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class BallandpaddleSyntaxElement {
	
	private BallandpaddleSyntaxElement[] children;
	private BallandpaddleSyntaxElement parent;
	private org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleCardinality cardinality;
	
	public BallandpaddleSyntaxElement(org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleCardinality cardinality, BallandpaddleSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (BallandpaddleSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(BallandpaddleSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public BallandpaddleSyntaxElement getParent() {
		return parent;
	}
	
	public BallandpaddleSyntaxElement[] getChildren() {
		if (children == null) {
			return new BallandpaddleSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleCardinality getCardinality() {
		return cardinality;
	}
	
}
