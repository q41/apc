/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp;

/**
 * A basic implementation of the
 * org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReference
 * ResolveResult interface that collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class BallandpaddleReferenceResolveResult<ReferenceType> implements org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleQuickFix> quickFixes;
	
	public BallandpaddleReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceMapping<ReferenceType>> getMappings() {
		return mappings;
	}
	
	public boolean wasResolved() {
		return mappings != null;
	}
	
	public boolean wasResolvedMultiple() {
		return mappings != null && mappings.size() > 1;
	}
	
	public boolean wasResolvedUniquely() {
		return mappings != null && mappings.size() == 1;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		if (!resolveFuzzy && target == null) {
			throw new IllegalArgumentException("Mapping references to null is only allowed for fuzzy resolution.");
		}
		addMapping(identifier, target, null);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
