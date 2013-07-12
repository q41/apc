package org.alia4j.languages.bp.action;

import org.alia4j.hierarchy.TypeHierarchyProvider;
import org.alia4j.liam.Action;
import org.alia4j.liam.ActionFactory;
import org.alia4j.liam.signature.ResolutionStrategy;

public class IntAttributeBoundsAssuranceAction {
		
	public static final Action methodCallAction = ActionFactory.findOrCreateMethodCallAction(
		TypeHierarchyProvider.findOrCreateFromClass(IntAttributeBoundsAssuranceAction.class),
		"apply",
		TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[] {"int","int"}),
		TypeHierarchyProvider.findOrCreateFromClass(int.class),
		ResolutionStrategy.STATIC
	);
	
	public static int apply(int max, int min) throws Throwable {
		int result = (int) org.alia4j.fial.System.proceed();
		if(result>max)
			result=max;
		if(result<min)
			result=min;
		return result;
	}

}