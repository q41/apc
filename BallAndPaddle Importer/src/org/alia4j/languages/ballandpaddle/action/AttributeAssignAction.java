package org.alia4j.languages.ballandpaddle.action;

import org.alia4j.hierarchy.TypeHierarchyProvider;
import org.alia4j.liam.Action;
import org.alia4j.liam.ActionFactory;
import org.alia4j.liam.signature.ResolutionStrategy;

public class AttributeAssignAction<X> {
	
	public static AttributeAssignAction<Double> DOUBLE_INSTANCE = new AttributeAssignAction<Double>();
	public static AttributeAssignAction<Integer> INTEGER_INSTANCE = new AttributeAssignAction<Integer>();
	public static AttributeAssignAction<Boolean> BOOLEAN_INSTANCE = new AttributeAssignAction<Boolean>();
	
	private AttributeAssignAction() {}
	
	public final Action methodCallAction = ActionFactory.findOrCreateMethodCallAction(
		TypeHierarchyProvider.findOrCreateFromClass(AttributeAssignAction.class),
		"apply",
		TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[] {"double"}),
		TypeHierarchyProvider.findOrCreateFromClass(double.class),
		ResolutionStrategy.VIRTUAL //TODO:correct?
	);
	
	public X apply(X newValue) throws Throwable {
		org.alia4j.fial.System.proceed();
		return newValue;
	}

}
