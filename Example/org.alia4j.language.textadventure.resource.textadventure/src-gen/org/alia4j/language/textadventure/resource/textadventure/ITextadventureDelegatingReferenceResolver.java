/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure;

/**
 * A delegating reference resolver is an extension of a normal reference resolver
 * that can be configured with another resolver that it may delegate method calls
 * to. This interface can be implemented by additional resolvers to customize
 * resolving using the load option ADDITIONAL_REFERENCE_RESOLVERS.
 * 
 * @see
 * org.alia4j.language.textadventure.resource.textadventure.ITextadventureOptions
 */
public interface ITextadventureDelegatingReferenceResolver<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> extends org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolver<ContainerType, ReferenceType> {
	
	/**
	 * Sets the delegate for this resolver.
	 */
	public void setDelegate(org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolver<ContainerType, ReferenceType> delegate);
	
}
