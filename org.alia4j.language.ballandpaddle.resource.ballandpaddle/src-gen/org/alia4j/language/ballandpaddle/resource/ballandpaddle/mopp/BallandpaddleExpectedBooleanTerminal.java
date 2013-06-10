/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp;

/**
 * A representation for a range in a document where a boolean attribute is
 * expected.
 */
public class BallandpaddleExpectedBooleanTerminal extends org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleAbstractExpectedElement {
	
	private org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleBooleanTerminal booleanTerminal;
	
	public BallandpaddleExpectedBooleanTerminal(org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleBooleanTerminal booleanTerminal) {
		super(booleanTerminal.getMetaclass());
		this.booleanTerminal = booleanTerminal;
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleBooleanTerminal getBooleanTerminal() {
		return booleanTerminal;
	}
	
	/**
	 * Returns the expected boolean terminal.
	 */
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleSyntaxElement getSymtaxElement() {
		return booleanTerminal;
	}
	
	private org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return booleanTerminal.getFeature();
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof BallandpaddleExpectedBooleanTerminal) {
			return getFeature().equals(((BallandpaddleExpectedBooleanTerminal) o).getFeature());
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
