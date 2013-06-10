/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface ITextadventureExpectedElement {
	
	/**
	 * Returns the names of all tokens that are expected at the given position.
	 */
	public java.util.Set<String> getTokenNames();
	
	/**
	 * Returns the metaclass of the rule that contains the expected element.
	 */
	public org.eclipse.emf.ecore.EClass getRuleMetaclass();
	
	/**
	 * Returns the syntax element that is expected.
	 */
	public org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureSyntaxElement getSymtaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(org.alia4j.language.textadventure.resource.textadventure.ITextadventureExpectedElement follower, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public java.util.Collection<org.alia4j.language.textadventure.resource.textadventure.util.TextadventurePair<org.alia4j.language.textadventure.resource.textadventure.ITextadventureExpectedElement, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureContainedFeature[]>> getFollowers();
	
}
