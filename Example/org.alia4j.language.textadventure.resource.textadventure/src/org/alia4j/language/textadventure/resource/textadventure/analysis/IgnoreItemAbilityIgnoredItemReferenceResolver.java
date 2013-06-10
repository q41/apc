/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.analysis;

public class IgnoreItemAbilityIgnoredItemReferenceResolver implements org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolver<org.alia4j.language.textadventure.IgnoreItemAbility, org.alia4j.language.textadventure.Item> {
	
	private org.alia4j.language.textadventure.resource.textadventure.analysis.TextadventureDefaultResolverDelegate<org.alia4j.language.textadventure.IgnoreItemAbility, org.alia4j.language.textadventure.Item> delegate = new org.alia4j.language.textadventure.resource.textadventure.analysis.TextadventureDefaultResolverDelegate<org.alia4j.language.textadventure.IgnoreItemAbility, org.alia4j.language.textadventure.Item>();
	
	public void resolve(String identifier, org.alia4j.language.textadventure.IgnoreItemAbility container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolveResult<org.alia4j.language.textadventure.Item> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.alia4j.language.textadventure.Item element, org.alia4j.language.textadventure.IgnoreItemAbility container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
