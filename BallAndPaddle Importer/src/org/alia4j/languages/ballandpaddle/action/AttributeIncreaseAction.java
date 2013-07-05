package org.alia4j.languages.ballandpaddle.action;

import org.alia4j.hierarchy.TypeHierarchyProvider;
import org.alia4j.liam.Action;
import org.alia4j.liam.ActionFactory;
import org.alia4j.liam.signature.ResolutionStrategy;

public class AttributeIncreaseAction<X> {
	
	public static AttributeIncreaseAction<Double> DOUBLE_INSTANCE = new AttributeIncreaseAction<Double>();
	public static AttributeIncreaseAction<Integer> INTEGER_INSTANCE = new AttributeIncreaseAction<Integer>();
	public static AttributeIncreaseAction<Boolean> BOOLEAN_INSTANCE = new AttributeIncreaseAction<Boolean>();
	
	private AttributeIncreaseAction() {}
	
	public final Action methodCallAction = ActionFactory.findOrCreateMethodCallAction(
		TypeHierarchyProvider.findOrCreateFromClass(AttributeIncreaseAction.class),
		"apply",
		TypeHierarchyProvider.findOrCreateFromClasses(new Class[] {double.class}),
		TypeHierarchyProvider.findOrCreateFromClass(double.class),
		ResolutionStrategy.STATIC
	);
	
	public X apply(X inc) throws Throwable {
		X result = (X) org.alia4j.fial.System.proceed();
		//result += inc;
		return result;
	}

}
