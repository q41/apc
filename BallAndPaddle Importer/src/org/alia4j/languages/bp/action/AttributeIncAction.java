package org.alia4j.languages.bp.action;

import org.alia4j.hierarchy.TypeDescriptor;
import org.alia4j.languages.bp.importer.AttributeType;
import org.alia4j.liam.Action;

public class AttributeIncAction extends Action {
		
	private AttributeType attrType;
	
	public AttributeIncAction(AttributeType attrType) {
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
		double result = (double) org.alia4j.fial.System.proceed();
		Object objectContext = ((Object[]) exposedContextValues)[0];
		double increment;
		if(objectContext instanceof Integer) increment = (int) objectContext;
		else increment = (double) objectContext; 
		return result + increment;
	}
	
	public int performInt(Object exposedContextValues) throws Throwable {
		int result = (int) org.alia4j.fial.System.proceed();
		Object objectContext = ((Object[]) exposedContextValues)[0];
		double increment;
		if(objectContext instanceof Double) increment = (double) objectContext;
		else increment = (int) objectContext; 
		return result + (int)increment;
	}
}