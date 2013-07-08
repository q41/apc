package org.alia4j.languages.ballandpaddle.action;

import org.alia4j.hierarchy.TypeHierarchyProvider;
import org.alia4j.liam.Action;
import org.alia4j.liam.ActionFactory;
import org.alia4j.liam.signature.ResolutionStrategy;

public class BooleanAttributeAssignAction {
	
	public static final Action methodCallAction = ActionFactory.findOrCreateMethodCallAction(
		TypeHierarchyProvider.findOrCreateFromClass(BooleanAttributeAssignAction.class),
		"apply",
		TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[] {"boolean"}),
		TypeHierarchyProvider.findOrCreateFromClass(boolean.class),
		ResolutionStrategy.STATIC
	);
	
	public static boolean apply(boolean newValue) throws Throwable {
		org.alia4j.fial.System.proceed();
		return newValue;
	}

}
