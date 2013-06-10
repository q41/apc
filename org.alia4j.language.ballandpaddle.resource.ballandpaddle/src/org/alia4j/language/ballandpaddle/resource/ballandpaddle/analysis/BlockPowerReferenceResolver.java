/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.analysis;

public class BlockPowerReferenceResolver implements org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceResolver<org.alia4j.language.ballandpaddle.Block, org.alia4j.language.ballandpaddle.Power> {
	
	private org.alia4j.language.ballandpaddle.resource.ballandpaddle.analysis.BallandpaddleDefaultResolverDelegate<org.alia4j.language.ballandpaddle.Block, org.alia4j.language.ballandpaddle.Power> delegate = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.analysis.BallandpaddleDefaultResolverDelegate<org.alia4j.language.ballandpaddle.Block, org.alia4j.language.ballandpaddle.Power>();
	
	public void resolve(String identifier, org.alia4j.language.ballandpaddle.Block container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceResolveResult<org.alia4j.language.ballandpaddle.Power> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.alia4j.language.ballandpaddle.Power element, org.alia4j.language.ballandpaddle.Block container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
