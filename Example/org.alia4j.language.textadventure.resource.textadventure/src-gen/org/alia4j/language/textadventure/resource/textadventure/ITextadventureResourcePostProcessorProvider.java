/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface ITextadventureResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public org.alia4j.language.textadventure.resource.textadventure.ITextadventureResourcePostProcessor getResourcePostProcessor();
	
}
