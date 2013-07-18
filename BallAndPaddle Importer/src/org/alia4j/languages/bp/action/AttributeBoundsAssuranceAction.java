package org.alia4j.languages.bp.action;

import org.alia4j.hierarchy.TypeDescriptor;
import org.alia4j.hierarchy.TypeHierarchyProvider;
import org.alia4j.languages.bp.importer.AttributeType;
import org.alia4j.liam.Action;
import org.alia4j.liam.ActionFactory;
import org.alia4j.liam.signature.ResolutionStrategy;

public class AttributeBoundsAssuranceAction extends Action {
	
	private AttributeType attrType;
	
	public AttributeBoundsAssuranceAction(AttributeType attrType) {
		this.attrType = attrType;
	}
	
	@Override
	public TypeDescriptor getResultType() {
		return attrType.getTypeDescriptor();
	}

	@Override
	public TypeDescriptor getRequiredParameterType(int parameterPosition) {
		if(parameterPosition == 0 || parameterPosition == 1) return attrType.getTypeDescriptor();
		else return null;
	}

    public int performInt(final Object exposedContextValues) throws Throwable {
    	int min = (int)((Object[])exposedContextValues)[0];
    	int max = (int)((Object[])exposedContextValues)[1];
    	int result = (int) org.alia4j.fial.System.proceed();
		if(result>max) result = (int)max;
		else if(result<min) result = (int)min;
		return result;
	}
    
    public double performDouble(final Object exposedContextValues) throws Throwable {
    	double min = (double)((Object[])exposedContextValues)[0];
    	double max = (double)((Object[])exposedContextValues)[1];
    	double result = (double) org.alia4j.fial.System.proceed();
		if(result>max) result = max;
		else if(result<min) result = min;
		return result;
	}
}