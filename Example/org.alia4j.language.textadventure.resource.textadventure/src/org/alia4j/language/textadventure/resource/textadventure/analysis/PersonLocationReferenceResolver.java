/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.analysis;

public class PersonLocationReferenceResolver implements org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolver<org.alia4j.language.textadventure.Person, org.alia4j.language.textadventure.Tile> {
	
	private org.alia4j.language.textadventure.resource.textadventure.analysis.TextadventureDefaultResolverDelegate<org.alia4j.language.textadventure.Person, org.alia4j.language.textadventure.Tile> delegate = new org.alia4j.language.textadventure.resource.textadventure.analysis.TextadventureDefaultResolverDelegate<org.alia4j.language.textadventure.Person, org.alia4j.language.textadventure.Tile>();
	
	public void resolve(String identifier, org.alia4j.language.textadventure.Person container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolveResult<org.alia4j.language.textadventure.Tile> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.alia4j.language.textadventure.Tile element, org.alia4j.language.textadventure.Person container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
