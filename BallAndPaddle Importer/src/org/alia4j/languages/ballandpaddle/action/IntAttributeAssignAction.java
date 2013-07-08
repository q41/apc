package org.alia4j.languages.ballandpaddle.action;

import org.alia4j.hierarchy.TypeHierarchyProvider;
import org.alia4j.liam.Action;
import org.alia4j.liam.ActionFactory;
import org.alia4j.liam.signature.ResolutionStrategy;

public class IntAttributeAssignAction {
	
	public static final Action methodCallAction = ActionFactory.findOrCreateMethodCallAction(
		TypeHierarchyProvider.findOrCreateFromClass(IntAttributeAssignAction.class),
		"apply",
		TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[] {"int"}),
		TypeHierarchyProvider.findOrCreateFromClass(int.class),
		ResolutionStrategy.STATIC
	);
	
	public static int apply(int newValue) throws Throwable {
		org.alia4j.fial.System.proceed();
		return newValue;
	}

}
