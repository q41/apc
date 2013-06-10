/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.analysis;

public class PowerEffectsReferenceResolver implements org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceResolver<org.alia4j.language.ballandpaddle.Power, org.alia4j.language.ballandpaddle.Effect> {
	
	private org.alia4j.language.ballandpaddle.resource.ballandpaddle.analysis.BallandpaddleDefaultResolverDelegate<org.alia4j.language.ballandpaddle.Power, org.alia4j.language.ballandpaddle.Effect> delegate = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.analysis.BallandpaddleDefaultResolverDelegate<org.alia4j.language.ballandpaddle.Power, org.alia4j.language.ballandpaddle.Effect>();
	
	public void resolve(String identifier, org.alia4j.language.ballandpaddle.Power container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceResolveResult<org.alia4j.language.ballandpaddle.Effect> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.alia4j.language.ballandpaddle.Effect element, org.alia4j.language.ballandpaddle.Power container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
