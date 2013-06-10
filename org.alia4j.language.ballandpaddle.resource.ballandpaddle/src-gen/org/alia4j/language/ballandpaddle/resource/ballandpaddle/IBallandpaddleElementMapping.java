/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle;

/**
 * A mapping from an identifier to an EObject.
 * 
 * @param <ReferenceType> the type of the reference this mapping points to.
 */
public interface IBallandpaddleElementMapping<ReferenceType> extends org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceMapping<ReferenceType> {
	
	/**
	 * Returns the target object the identifier is mapped to.
	 */
	public ReferenceType getTargetElement();
}
