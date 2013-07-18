package org.alia4j.languages.bp.action;

import java.util.Collections;

import org.alia4j.hierarchy.TypeDescriptor;
import org.alia4j.hierarchy.TypeDescriptorConstants;
import org.alia4j.hierarchy.TypeHierarchyProvider;
import org.alia4j.liam.Action;
import org.alia4j.liam.ActionFactory;
import org.alia4j.liam.Attachment;
import org.alia4j.liam.Context;
import org.alia4j.liam.ContextFactory;
import org.alia4j.liam.Specialization;
import org.alia4j.liam.signature.ResolutionStrategy;

import bp.base.EffectDeployment;

public class DeployCollisionEffectAction extends Action{
	
	Attachment original;
	Class<?> typeClass;
	int duration;
	
	public DeployCollisionEffectAction(Attachment effectAttachment, Class<?> typeClass, int duration) {
		this.original = effectAttachment;
		this.duration = duration;
		this.typeClass = typeClass;
	}
	
	@Override
	public TypeDescriptor getResultType() {
		// TODO Auto-generated method stub
		return TypeDescriptorConstants.VOID_PRIMITIVE;
	}

	@Override
	public TypeDescriptor getRequiredParameterType(int parameterPosition) {
		if(parameterPosition==0)
			return TypeDescriptorConstants.OBJECT_CLASS;
		else
			return null;
	}

    public void perform(final Object exposedContextValues) throws IllegalArgumentException, SecurityException,
    IllegalAccessException, ClassNotFoundException, NoSuchFieldException {
    	final Object owner;
    	final Object newValue;
    	Object[] objects = (Object[]) exposedContextValues;
    	Context valueContext;
    	if(objects[0] instanceof Integer)
    		valueContext = ContextFactory.findOrCreateIntegerConstantContext((int) objects[0]);
    	else if(objects[0] instanceof Double)
    		valueContext = ContextFactory.findOrCreateDoubleConstantContext((double) objects[0]);
    	else
    		valueContext = ContextFactory.findOrCreateBooleanConstantContext((boolean) objects[0]);
    	contructAnddeployEffectAttachment(valueContext);    	
	}
    
	
	private void contructAnddeployEffectAttachment(Context context) {
		//construct new attachment from original + new context
		Specialization originalSpecialization = original.getSpecializations().iterator().next();
		Specialization newSpecialization = new Specialization(originalSpecialization.getPattern(), originalSpecialization.getPredicate(), Collections.singletonList(context));
		Attachment newAttachment = new Attachment(Collections.singleton(newSpecialization), original.getAction(), original.getScheduleInfo());
		
		new EffectDeployment(newAttachment, duration);
	}
	
	
}

