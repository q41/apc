/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IBallandpaddleResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleResourcePostProcessor getResourcePostProcessor();
	
}
