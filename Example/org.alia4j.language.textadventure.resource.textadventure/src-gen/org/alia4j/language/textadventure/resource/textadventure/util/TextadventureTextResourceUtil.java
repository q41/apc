/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.util;

/**
 * Class TextadventureTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * org.alia4j.language.textadventure.resource.textadventure.util.TextadventureResou
 * rceUtil.
 */
public class TextadventureTextResourceUtil {
	
	/**
	 * Use
	 * org.alia4j.language.textadventure.resource.textadventure.util.TextadventureResou
	 * rceUtil.getResource() instead.
	 */
	@Deprecated	
	public static org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureResource getResource(org.eclipse.core.resources.IFile file) {
		return new org.alia4j.language.textadventure.resource.textadventure.util.TextadventureEclipseProxy().getResource(file);
	}
	
	/**
	 * Use
	 * org.alia4j.language.textadventure.resource.textadventure.util.TextadventureResou
	 * rceUtil.getResource() instead.
	 */
	@Deprecated	
	public static org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return org.alia4j.language.textadventure.resource.textadventure.util.TextadventureResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use
	 * org.alia4j.language.textadventure.resource.textadventure.util.TextadventureResou
	 * rceUtil.getResource() instead.
	 */
	@Deprecated	
	public static org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureResource getResource(org.eclipse.emf.common.util.URI uri) {
		return org.alia4j.language.textadventure.resource.textadventure.util.TextadventureResourceUtil.getResource(uri);
	}
	
	/**
	 * Use
	 * org.alia4j.language.textadventure.resource.textadventure.util.TextadventureResou
	 * rceUtil.getResource() instead.
	 */
	@Deprecated	
	public static org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return org.alia4j.language.textadventure.resource.textadventure.util.TextadventureResourceUtil.getResource(uri, options);
	}
	
}
