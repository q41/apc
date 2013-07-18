package org.alia4j.languages.bp.action;

import org.alia4j.hierarchy.TypeDescriptor;
import org.alia4j.languages.bp.importer.AttributeType;
import org.alia4j.liam.Action;

public class AttributeAssignAction extends Action {
	
	private AttributeType attrType;
	
	public AttributeAssignAction(AttributeType attrType) {
		this.attrType = attrType;
	}

	@Override
	public TypeDescriptor getResultType() {
		return attrType.getTypeDescriptor();
	}

	@Override
	public TypeDescriptor getRequiredParameterType(int parameterPosition) {
		if(parameterPosition==0) return attrType.getTypeDescriptor();
		else return null;
	}
	
	public double performDouble(Object exposedContextValues) throws Throwable {
		org.alia4j.fial.System.proceed();
		Object context = ((Object[]) exposedContextValues)[0];
		double newValue;
		if(context instanceof Integer) newValue = (int) context;
		else newValue = (double) context;
		return newValue;
	}
	
	public int performInt(Object exposedContextValues) throws Throwable {
		org.alia4j.fial.System.proceed();
		Object context = ((Object[]) exposedContextValues)[0];
		double newValue;
		if(context instanceof Integer) newValue = (int) context;
		else newValue = (double) context;
		return (int) newValue;
	}
	
	public boolean performBoolean(Object exposedContextValues) throws Throwable {
		org.alia4j.fial.System.proceed();
		return (boolean) ((Object[]) exposedContextValues)[0];
	}
}
