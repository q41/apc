package org.alia4j.languages.bp.action;

import org.alia4j.hierarchy.TypeHierarchyProvider;
import org.alia4j.liam.Action;
import org.alia4j.liam.ActionFactory;
import org.alia4j.liam.signature.ResolutionStrategy;

public class IntAttributeIncAction {
		
	public static final Action methodCallAction = ActionFactory.findOrCreateMethodCallAction(
		TypeHierarchyProvider.findOrCreateFromClass(IntAttributeIncAction.class),
		"apply",
		TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[] {"int"}),
		TypeHierarchyProvider.findOrCreateFromClass(int.class),
		ResolutionStrategy.STATIC
	);
	
	public static int apply(int inc) throws Throwable {
		int result = (int) org.alia4j.fial.System.proceed();
		return result + inc;
	}

}