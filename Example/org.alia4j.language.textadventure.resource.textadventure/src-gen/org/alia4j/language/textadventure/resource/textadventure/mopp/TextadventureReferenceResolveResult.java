/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.mopp;

/**
 * A basic implementation of the
 * org.alia4j.language.textadventure.resource.textadventure.ITextadventureReference
 * ResolveResult interface that collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class TextadventureReferenceResolveResult<ReferenceType> implements org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<org.alia4j.language.textadventure.resource.textadventure.ITextadventureQuickFix> quickFixes;
	
	public TextadventureReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<org.alia4j.language.textadventure.resource.textadventure.ITextadventureQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<org.alia4j.language.textadventure.resource.textadventure.ITextadventureQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(org.alia4j.language.textadventure.resource.textadventure.ITextadventureQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<org.alia4j.language.textadventure.resource.textadventure.ITextadventureQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceMapping<ReferenceType>> getMappings() {
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
			mappings = new java.util.ArrayList<org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
