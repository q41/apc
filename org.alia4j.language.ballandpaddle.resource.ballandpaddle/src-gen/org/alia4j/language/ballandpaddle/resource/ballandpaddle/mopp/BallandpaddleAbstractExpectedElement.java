/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class BallandpaddleAbstractExpectedElement implements org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddlePair<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleExpectedElement, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleContainedFeature[]>> followers = new java.util.LinkedHashSet<org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddlePair<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleExpectedElement, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleContainedFeature[]>>();
	
	public BallandpaddleAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleExpectedElement follower, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleContainedFeature[] path) {
		followers.add(new org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddlePair<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleExpectedElement, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddlePair<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleExpectedElement, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
