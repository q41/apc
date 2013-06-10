/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class TextadventureAbstractExpectedElement implements org.alia4j.language.textadventure.resource.textadventure.ITextadventureExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<org.alia4j.language.textadventure.resource.textadventure.util.TextadventurePair<org.alia4j.language.textadventure.resource.textadventure.ITextadventureExpectedElement, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureContainedFeature[]>> followers = new java.util.LinkedHashSet<org.alia4j.language.textadventure.resource.textadventure.util.TextadventurePair<org.alia4j.language.textadventure.resource.textadventure.ITextadventureExpectedElement, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureContainedFeature[]>>();
	
	public TextadventureAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(org.alia4j.language.textadventure.resource.textadventure.ITextadventureExpectedElement follower, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureContainedFeature[] path) {
		followers.add(new org.alia4j.language.textadventure.resource.textadventure.util.TextadventurePair<org.alia4j.language.textadventure.resource.textadventure.ITextadventureExpectedElement, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<org.alia4j.language.textadventure.resource.textadventure.util.TextadventurePair<org.alia4j.language.textadventure.resource.textadventure.ITextadventureExpectedElement, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
