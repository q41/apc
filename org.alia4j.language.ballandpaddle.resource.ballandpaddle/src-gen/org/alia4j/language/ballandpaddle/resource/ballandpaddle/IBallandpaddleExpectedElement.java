/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IBallandpaddleExpectedElement {
	
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
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleSyntaxElement getSymtaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleExpectedElement follower, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public java.util.Collection<org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddlePair<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleExpectedElement, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleContainedFeature[]>> getFollowers();
	
}
