/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure;

/**
 * Implementors of this interface provide an EMF resource.
 */
public interface ITextadventureResourceProvider {
	
	/**
	 * Returns the resource.
	 */
	public org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextResource getResource();
	
}
