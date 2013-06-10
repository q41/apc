/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.util;

/**
 * Class BallandpaddleTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddleResou
 * rceUtil.
 */
public class BallandpaddleTextResourceUtil {
	
	/**
	 * Use
	 * org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddleResou
	 * rceUtil.getResource() instead.
	 */
	@Deprecated	
	public static org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleResource getResource(org.eclipse.core.resources.IFile file) {
		return new org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddleEclipseProxy().getResource(file);
	}
	
	/**
	 * Use
	 * org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddleResou
	 * rceUtil.getResource() instead.
	 */
	@Deprecated	
	public static org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddleResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use
	 * org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddleResou
	 * rceUtil.getResource() instead.
	 */
	@Deprecated	
	public static org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleResource getResource(org.eclipse.emf.common.util.URI uri) {
		return org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddleResourceUtil.getResource(uri);
	}
	
	/**
	 * Use
	 * org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddleResou
	 * rceUtil.getResource() instead.
	 */
	@Deprecated	
	public static org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddleResourceUtil.getResource(uri, options);
	}
	
}
