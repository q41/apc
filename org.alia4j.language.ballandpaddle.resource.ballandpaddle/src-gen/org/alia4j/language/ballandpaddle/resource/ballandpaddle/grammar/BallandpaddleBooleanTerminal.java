/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar;

/**
 * A class to represent boolean terminals in a grammar.
 */
public class BallandpaddleBooleanTerminal extends org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleTerminal {
	
	private String trueLiteral;
	private String falseLiteral;
	
	public BallandpaddleBooleanTerminal(org.eclipse.emf.ecore.EStructuralFeature attribute, String trueLiteral, String falseLiteral, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleCardinality cardinality, int mandatoryOccurrencesAfter) {
		super(attribute, cardinality, mandatoryOccurrencesAfter);
		assert attribute instanceof org.eclipse.emf.ecore.EAttribute;
		this.trueLiteral = trueLiteral;
		this.falseLiteral = falseLiteral;
	}
	
	public String getTrueLiteral() {
		return trueLiteral;
	}
	
	public String getFalseLiteral() {
		return falseLiteral;
	}
	
	public org.eclipse.emf.ecore.EAttribute getAttribute() {
		return (org.eclipse.emf.ecore.EAttribute) getFeature();
	}
	
}
