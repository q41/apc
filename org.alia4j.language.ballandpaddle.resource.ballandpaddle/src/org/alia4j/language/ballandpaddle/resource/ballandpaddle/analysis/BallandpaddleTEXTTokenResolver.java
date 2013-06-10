/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.analysis;

public class BallandpaddleTEXTTokenResolver implements org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver {
	
	private org.alia4j.language.ballandpaddle.resource.ballandpaddle.analysis.BallandpaddleDefaultTokenResolver defaultTokenResolver = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.analysis.BallandpaddleDefaultTokenResolver(true);
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, null, null, null);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, null, null, null);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
