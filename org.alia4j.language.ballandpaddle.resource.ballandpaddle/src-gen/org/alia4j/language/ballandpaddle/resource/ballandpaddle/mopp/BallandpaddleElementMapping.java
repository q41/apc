/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp;

/**
 * A basic implementation of the
 * org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleElementMa
 * pping interface.
 * 
 * @param <ReferenceType> the type of the reference that can be mapped to
 */
public class BallandpaddleElementMapping<ReferenceType> implements org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleElementMapping<ReferenceType> {
	
	private final ReferenceType target;
	private String identifier;
	private String warning;
	
	public BallandpaddleElementMapping(String identifier, ReferenceType target, String warning) {
		super();
		this.target = target;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public ReferenceType getTargetElement() {
		return target;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
