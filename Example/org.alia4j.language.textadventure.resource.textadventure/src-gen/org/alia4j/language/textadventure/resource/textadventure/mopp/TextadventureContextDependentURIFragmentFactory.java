/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.mopp;

/**
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class TextadventureContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements org.alia4j.language.textadventure.resource.textadventure.ITextadventureContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public TextadventureContextDependentURIFragmentFactory(org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.ITextadventureContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
