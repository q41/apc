package org.alia4j.languages.bp.action;

import org.alia4j.hierarchy.TypeHierarchyProvider;
import org.alia4j.liam.Action;
import org.alia4j.liam.ActionFactory;
import org.alia4j.liam.signature.ResolutionStrategy;

public class DoubleAttributeBoundsAssuranceAction {
		
	public static final Action methodCallAction = ActionFactory.findOrCreateMethodCallAction(
		TypeHierarchyProvider.findOrCreateFromClass(DoubleAttributeBoundsAssuranceAction.class),
		"apply",
		TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[] {"double","double"}),
		TypeHierarchyProvider.findOrCreateFromClass(double.class),
		ResolutionStrategy.STATIC
	);
	
	public static double apply(double max, double min) throws Throwable {
		double result = (double) org.alia4j.fial.System.proceed();
		if(result>max)
			result=max;
		if(result<min)
			result=min;
		return result;
	}

}