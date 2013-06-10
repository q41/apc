/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp;

/**
 * A basic implementation of the
 * org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleURIMappin
 * g interface that can map identifiers to URIs.
 * 
 * @param <ReferenceType> unused type parameter which is needed to implement
 * org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleURIMappin
 * g.
 */
public class BallandpaddleURIMapping<ReferenceType> implements org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleURIMapping<ReferenceType> {
	
	private org.eclipse.emf.common.util.URI uri;
	private String identifier;
	private String warning;
	
	public BallandpaddleURIMapping(String identifier, org.eclipse.emf.common.util.URI newIdentifier, String warning) {
		super();
		this.uri = newIdentifier;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public org.eclipse.emf.common.util.URI getTargetIdentifier() {
		return uri;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
