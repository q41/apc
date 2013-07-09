package org.alia4j.languages.bp.action;

import org.alia4j.hierarchy.TypeHierarchyProvider;
import org.alia4j.liam.Action;
import org.alia4j.liam.ActionFactory;
import org.alia4j.liam.signature.ResolutionStrategy;

public class DoubleAttributeIncAction {
		
	public static final Action methodCallAction = ActionFactory.findOrCreateMethodCallAction(
		TypeHierarchyProvider.findOrCreateFromClass(DoubleAttributeIncAction.class),
		"apply",
		TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[] {"double"}),
		TypeHierarchyProvider.findOrCreateFromClass(double.class),
		ResolutionStrategy.STATIC
	);
	
	public static double apply(double inc) throws Throwable {
		double result = (double) org.alia4j.fial.System.proceed();
		return result + inc;
	}

}