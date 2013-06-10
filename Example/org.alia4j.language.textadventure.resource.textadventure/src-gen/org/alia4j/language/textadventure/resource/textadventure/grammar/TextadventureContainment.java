/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.grammar;

public class TextadventureContainment extends org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureTerminal {
	
	private final org.eclipse.emf.ecore.EClass[] allowedTypes;
	
	public TextadventureContainment(org.eclipse.emf.ecore.EStructuralFeature feature, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureCardinality cardinality, org.eclipse.emf.ecore.EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public org.eclipse.emf.ecore.EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = org.alia4j.language.textadventure.resource.textadventure.util.TextadventureStringUtil.explode(allowedTypes, ", ", new org.alia4j.language.textadventure.resource.textadventure.ITextadventureFunction1<String, org.eclipse.emf.ecore.EClass>() {
				public String execute(org.eclipse.emf.ecore.EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
