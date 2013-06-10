/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.mopp;

/**
 * A TextadventureContainedFeature represents a path element of a
 * org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureCo
 * ntainmentTrace
 */
public class TextadventureContainedFeature {
	
	/**
	 * The class to which the feature points.
	 */
	private org.eclipse.emf.ecore.EClass containerClass;
	
	/**
	 * The feature that points to the container class.
	 */
	private org.eclipse.emf.ecore.EStructuralFeature feature;
	
	public TextadventureContainedFeature(org.eclipse.emf.ecore.EClass containerClass, org.eclipse.emf.ecore.EStructuralFeature feature) {
		super();
		this.containerClass = containerClass;
		this.feature = feature;
	}
	
	public org.eclipse.emf.ecore.EClass getContainerClass() {
		return containerClass;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return feature;
	}
	
	public String toString() {
		return (feature == null ? "null" : feature.getName()) + "->" + (containerClass == null ? "null" : containerClass.getName());
	}
	
}
