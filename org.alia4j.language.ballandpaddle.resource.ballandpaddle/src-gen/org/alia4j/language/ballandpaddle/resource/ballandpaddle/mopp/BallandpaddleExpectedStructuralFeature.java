/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class BallandpaddleExpectedStructuralFeature extends org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleAbstractExpectedElement {
	
	private org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddlePlaceholder placeholder;
	
	public BallandpaddleExpectedStructuralFeature(org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddlePlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	/**
	 * Returns the expected placeholder.
	 */
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleSyntaxElement getSymtaxElement() {
		return placeholder;
	}
	
	public String getTokenName() {
		return placeholder.getTokenName();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton(getTokenName());
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof BallandpaddleExpectedStructuralFeature) {
			return getFeature().equals(((BallandpaddleExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
	@Override	
	public int hashCode() {
		return getFeature().hashCode();
	}
	
}
