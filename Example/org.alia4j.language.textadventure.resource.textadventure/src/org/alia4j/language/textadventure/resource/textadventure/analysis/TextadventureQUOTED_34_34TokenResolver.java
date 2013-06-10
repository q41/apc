/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.analysis;

public class TextadventureQUOTED_34_34TokenResolver implements org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver {
	
	private org.alia4j.language.textadventure.resource.textadventure.analysis.TextadventureDefaultTokenResolver defaultTokenResolver = new org.alia4j.language.textadventure.resource.textadventure.analysis.TextadventureDefaultTokenResolver(true);
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, "\"", "\"", null);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, "\"", "\"", null);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
