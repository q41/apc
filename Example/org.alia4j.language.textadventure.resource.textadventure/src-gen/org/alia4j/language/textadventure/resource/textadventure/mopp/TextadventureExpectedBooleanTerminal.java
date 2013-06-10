/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.mopp;

/**
 * A representation for a range in a document where a boolean attribute is
 * expected.
 */
public class TextadventureExpectedBooleanTerminal extends org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureAbstractExpectedElement {
	
	private org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureBooleanTerminal booleanTerminal;
	
	public TextadventureExpectedBooleanTerminal(org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureBooleanTerminal booleanTerminal) {
		super(booleanTerminal.getMetaclass());
		this.booleanTerminal = booleanTerminal;
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureBooleanTerminal getBooleanTerminal() {
		return booleanTerminal;
	}
	
	/**
	 * Returns the expected boolean terminal.
	 */
	public org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureSyntaxElement getSymtaxElement() {
		return booleanTerminal;
	}
	
	private org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return booleanTerminal.getFeature();
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof TextadventureExpectedBooleanTerminal) {
			return getFeature().equals(((TextadventureExpectedBooleanTerminal) o).getFeature());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getFeature().hashCode();
	}
	
	public java.util.Set<String> getTokenNames() {
		// BooleanTerminals are associated with two or one token(s)
		java.util.Set<String> tokenNames = new java.util.LinkedHashSet<String>(2);
		String trueLiteral = booleanTerminal.getTrueLiteral();
		if (!"".equals(trueLiteral)) {
			tokenNames.add("'" + trueLiteral + "'");
		}
		String falseLiteral = booleanTerminal.getFalseLiteral();
		if (!"".equals(falseLiteral)) {
			tokenNames.add("'" + falseLiteral + "'");
		}
		return tokenNames;
	}
	
}
