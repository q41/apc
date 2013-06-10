/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar;

public class BallandpaddleContainment extends org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleTerminal {
	
	private final org.eclipse.emf.ecore.EClass[] allowedTypes;
	
	public BallandpaddleContainment(org.eclipse.emf.ecore.EStructuralFeature feature, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleCardinality cardinality, org.eclipse.emf.ecore.EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public org.eclipse.emf.ecore.EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddleStringUtil.explode(allowedTypes, ", ", new org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleFunction1<String, org.eclipse.emf.ecore.EClass>() {
				public String execute(org.eclipse.emf.ecore.EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
