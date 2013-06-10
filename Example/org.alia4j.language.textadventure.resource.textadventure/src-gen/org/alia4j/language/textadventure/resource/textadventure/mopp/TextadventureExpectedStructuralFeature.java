/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class TextadventureExpectedStructuralFeature extends org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureAbstractExpectedElement {
	
	private org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventurePlaceholder placeholder;
	
	public TextadventureExpectedStructuralFeature(org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventurePlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	/**
	 * Returns the expected placeholder.
	 */
	public org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureSyntaxElement getSymtaxElement() {
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
		if (o instanceof TextadventureExpectedStructuralFeature) {
			return getFeature().equals(((TextadventureExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
	@Override	
	public int hashCode() {
		return getFeature().hashCode();
	}
	
}
