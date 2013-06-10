/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp;

public class BallandpaddleReferenceResolverSwitch implements org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private java.util.Map<Object, Object> options;
	
	protected org.alia4j.language.ballandpaddle.resource.ballandpaddle.analysis.BlockPowerReferenceResolver blockPowerReferenceResolver = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.analysis.BlockPowerReferenceResolver();
	protected org.alia4j.language.ballandpaddle.resource.ballandpaddle.analysis.PowerEffectsReferenceResolver powerEffectsReferenceResolver = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.analysis.PowerEffectsReferenceResolver();
	protected org.alia4j.language.ballandpaddle.resource.ballandpaddle.analysis.ObjectTargetItemReferenceResolver objectTargetItemReferenceResolver = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.analysis.ObjectTargetItemReferenceResolver();
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceResolver<org.alia4j.language.ballandpaddle.Block, org.alia4j.language.ballandpaddle.Power> getBlockPowerReferenceResolver() {
		return getResolverChain(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getBlock_Power(), blockPowerReferenceResolver);
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceResolver<org.alia4j.language.ballandpaddle.Power, org.alia4j.language.ballandpaddle.Effect> getPowerEffectsReferenceResolver() {
		return getResolverChain(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getPower_Effects(), powerEffectsReferenceResolver);
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceResolver<org.alia4j.language.ballandpaddle.ObjectTarget, org.alia4j.language.ballandpaddle.BAPObject> getObjectTargetItemReferenceResolver() {
		return getResolverChain(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getObjectTarget_Item(), objectTargetItemReferenceResolver);
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		if (options != null) {
			this.options = new java.util.LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
		blockPowerReferenceResolver.setOptions(options);
		powerEffectsReferenceResolver.setOptions(options);
		objectTargetItemReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getBlock().isInstance(container)) {
			BallandpaddleFuzzyResolveResult<org.alia4j.language.ballandpaddle.Power> frr = new BallandpaddleFuzzyResolveResult<org.alia4j.language.ballandpaddle.Power>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("power")) {
				blockPowerReferenceResolver.resolve(identifier, (org.alia4j.language.ballandpaddle.Block) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getPower().isInstance(container)) {
			BallandpaddleFuzzyResolveResult<org.alia4j.language.ballandpaddle.Effect> frr = new BallandpaddleFuzzyResolveResult<org.alia4j.language.ballandpaddle.Effect>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("effects")) {
				powerEffectsReferenceResolver.resolve(identifier, (org.alia4j.language.ballandpaddle.Power) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getObjectTarget().isInstance(container)) {
			BallandpaddleFuzzyResolveResult<org.alia4j.language.ballandpaddle.BAPObject> frr = new BallandpaddleFuzzyResolveResult<org.alia4j.language.ballandpaddle.BAPObject>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("item")) {
				objectTargetItemReferenceResolver.resolve(identifier, (org.alia4j.language.ballandpaddle.ObjectTarget) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getBlock_Power()) {
			return getResolverChain(reference, blockPowerReferenceResolver);
		}
		if (reference == org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getPower_Effects()) {
			return getResolverChain(reference, powerEffectsReferenceResolver);
		}
		if (reference == org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getObjectTarget_Item()) {
			return getResolverChain(reference, objectTargetItemReferenceResolver);
		}
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceResolver<ContainerType, ReferenceType> getResolverChain(org.eclipse.emf.ecore.EStructuralFeature reference, org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof java.util.Map)) {
			// send this to the error log
			new org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddleRuntimeUtil().logWarning("Found value with invalid type for option " + org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + java.util.Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		java.util.Map<?,?> resolverMap = (java.util.Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceResolver) {
			org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceResolver replacingResolver = (org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceResolver) resolverValue;
			if (replacingResolver instanceof org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof java.util.Collection) {
			java.util.Collection replacingResolvers = (java.util.Collection) resolverValue;
			org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceCache) {
					org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceResolver nextResolver = (org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceResolver) next;
					if (nextResolver instanceof org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddleRuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddleRuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
