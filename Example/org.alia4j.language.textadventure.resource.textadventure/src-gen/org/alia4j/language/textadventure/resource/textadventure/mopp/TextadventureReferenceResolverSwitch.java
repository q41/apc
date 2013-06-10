/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.mopp;

public class TextadventureReferenceResolverSwitch implements org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private java.util.Map<Object, Object> options;
	
	protected org.alia4j.language.textadventure.resource.textadventure.analysis.ItemLocationReferenceResolver itemLocationReferenceResolver = new org.alia4j.language.textadventure.resource.textadventure.analysis.ItemLocationReferenceResolver();
	protected org.alia4j.language.textadventure.resource.textadventure.analysis.RemoveActionWhatReferenceResolver removeActionWhatReferenceResolver = new org.alia4j.language.textadventure.resource.textadventure.analysis.RemoveActionWhatReferenceResolver();
	protected org.alia4j.language.textadventure.resource.textadventure.analysis.PersonLocationReferenceResolver personLocationReferenceResolver = new org.alia4j.language.textadventure.resource.textadventure.analysis.PersonLocationReferenceResolver();
	protected org.alia4j.language.textadventure.resource.textadventure.analysis.IgnoreItemAbilityIgnoredItemReferenceResolver ignoreItemAbilityIgnoredItemReferenceResolver = new org.alia4j.language.textadventure.resource.textadventure.analysis.IgnoreItemAbilityIgnoredItemReferenceResolver();
	
	public org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolver<org.alia4j.language.textadventure.Item, org.alia4j.language.textadventure.Tile> getItemLocationReferenceResolver() {
		return getResolverChain(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getItem_Location(), itemLocationReferenceResolver);
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolver<org.alia4j.language.textadventure.RemoveAction, org.alia4j.language.textadventure.Binding> getRemoveActionWhatReferenceResolver() {
		return getResolverChain(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getRemoveAction_What(), removeActionWhatReferenceResolver);
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolver<org.alia4j.language.textadventure.Person, org.alia4j.language.textadventure.Tile> getPersonLocationReferenceResolver() {
		return getResolverChain(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getPerson_Location(), personLocationReferenceResolver);
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolver<org.alia4j.language.textadventure.IgnoreItemAbility, org.alia4j.language.textadventure.Item> getIgnoreItemAbilityIgnoredItemReferenceResolver() {
		return getResolverChain(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getIgnoreItemAbility_IgnoredItem(), ignoreItemAbilityIgnoredItemReferenceResolver);
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		if (options != null) {
			this.options = new java.util.LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
		itemLocationReferenceResolver.setOptions(options);
		removeActionWhatReferenceResolver.setOptions(options);
		personLocationReferenceResolver.setOptions(options);
		ignoreItemAbilityIgnoredItemReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getItem().isInstance(container)) {
			TextadventureFuzzyResolveResult<org.alia4j.language.textadventure.Tile> frr = new TextadventureFuzzyResolveResult<org.alia4j.language.textadventure.Tile>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("location")) {
				itemLocationReferenceResolver.resolve(identifier, (org.alia4j.language.textadventure.Item) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getRemoveAction().isInstance(container)) {
			TextadventureFuzzyResolveResult<org.alia4j.language.textadventure.Binding> frr = new TextadventureFuzzyResolveResult<org.alia4j.language.textadventure.Binding>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("what")) {
				removeActionWhatReferenceResolver.resolve(identifier, (org.alia4j.language.textadventure.RemoveAction) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getPerson().isInstance(container)) {
			TextadventureFuzzyResolveResult<org.alia4j.language.textadventure.Tile> frr = new TextadventureFuzzyResolveResult<org.alia4j.language.textadventure.Tile>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("location")) {
				personLocationReferenceResolver.resolve(identifier, (org.alia4j.language.textadventure.Person) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getIgnoreItemAbility().isInstance(container)) {
			TextadventureFuzzyResolveResult<org.alia4j.language.textadventure.Item> frr = new TextadventureFuzzyResolveResult<org.alia4j.language.textadventure.Item>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("ignoredItem")) {
				ignoreItemAbilityIgnoredItemReferenceResolver.resolve(identifier, (org.alia4j.language.textadventure.IgnoreItemAbility) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getItem_Location()) {
			return getResolverChain(reference, itemLocationReferenceResolver);
		}
		if (reference == org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getRemoveAction_What()) {
			return getResolverChain(reference, removeActionWhatReferenceResolver);
		}
		if (reference == org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getPerson_Location()) {
			return getResolverChain(reference, personLocationReferenceResolver);
		}
		if (reference == org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getIgnoreItemAbility_IgnoredItem()) {
			return getResolverChain(reference, ignoreItemAbilityIgnoredItemReferenceResolver);
		}
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolver<ContainerType, ReferenceType> getResolverChain(org.eclipse.emf.ecore.EStructuralFeature reference, org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(org.alia4j.language.textadventure.resource.textadventure.ITextadventureOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof java.util.Map)) {
			// send this to the error log
			new org.alia4j.language.textadventure.resource.textadventure.util.TextadventureRuntimeUtil().logWarning("Found value with invalid type for option " + org.alia4j.language.textadventure.resource.textadventure.ITextadventureOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + java.util.Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		java.util.Map<?,?> resolverMap = (java.util.Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolver) {
			org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolver replacingResolver = (org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolver) resolverValue;
			if (replacingResolver instanceof org.alia4j.language.textadventure.resource.textadventure.ITextadventureDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((org.alia4j.language.textadventure.resource.textadventure.ITextadventureDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof java.util.Collection) {
			java.util.Collection replacingResolvers = (java.util.Collection) resolverValue;
			org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceCache) {
					org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolver nextResolver = (org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolver) next;
					if (nextResolver instanceof org.alia4j.language.textadventure.resource.textadventure.ITextadventureDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((org.alia4j.language.textadventure.resource.textadventure.ITextadventureDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new org.alia4j.language.textadventure.resource.textadventure.util.TextadventureRuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.alia4j.language.textadventure.resource.textadventure.ITextadventureOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.alia4j.language.textadventure.resource.textadventure.ITextadventureDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new org.alia4j.language.textadventure.resource.textadventure.util.TextadventureRuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.alia4j.language.textadventure.resource.textadventure.ITextadventureOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.alia4j.language.textadventure.resource.textadventure.ITextadventureDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
