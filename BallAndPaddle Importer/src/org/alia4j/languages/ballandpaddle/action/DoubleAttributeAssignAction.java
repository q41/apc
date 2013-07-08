package org.alia4j.languages.ballandpaddle.action;

import org.alia4j.hierarchy.TypeHierarchyProvider;
import org.alia4j.liam.Action;
import org.alia4j.liam.ActionFactory;
import org.alia4j.liam.signature.ResolutionStrategy;

public class DoubleAttributeAssignAction<X> {
	
	public static final Action methodCallAction = ActionFactory.findOrCreateMethodCallAction(
		TypeHierarchyProvider.findOrCreateFromClass(DoubleAttributeAssignAction.class),
		"apply",
		TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[] {"double"}),
		TypeHierarchyProvider.findOrCreateFromClass(double.class),
		ResolutionStrategy.STATIC
	);
	
	public static double apply(double newValue) throws Throwable {
		org.alia4j.fial.System.proceed();
		return newValue;
	}

}
