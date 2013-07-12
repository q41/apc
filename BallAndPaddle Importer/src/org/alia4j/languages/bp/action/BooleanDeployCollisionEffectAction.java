package org.alia4j.languages.bp.action;

import org.alia4j.hierarchy.TypeHierarchyProvider;
import org.alia4j.liam.Action;
import org.alia4j.liam.ActionFactory;
import org.alia4j.liam.Context;
import org.alia4j.liam.ContextFactory;
import org.alia4j.liam.signature.ResolutionStrategy;

public class BooleanDeployCollisionEffectAction {
	
	public static final Action methodCallAction = ActionFactory.findOrCreateMethodCallAction(
		TypeHierarchyProvider.findOrCreateFromClass(BooleanDeployCollisionEffectAction.class),
		"apply",
		TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[] {"boolean"}),
		TypeHierarchyProvider.findOrCreateFromClass(boolean.class),
		ResolutionStrategy.STATIC
	);
	
	public static void apply(boolean newAttributeValue) throws Throwable {
		Context newAttributeValueContext = ContextFactory.findOrCreateBooleanConstantContext(newAttributeValue);
		
	}

}
