package org.alia4j.languages.bp.action;

import java.util.Collections;

import org.alia4j.hierarchy.TypeDescriptor;
import org.alia4j.hierarchy.TypeDescriptorConstants;
import org.alia4j.hierarchy.TypeHierarchyProvider;
import org.alia4j.languages.bp.context.ObjectEqualContext;
import org.alia4j.languages.bp.predicate.EqualsPredicate;
import org.alia4j.liam.Action;
import org.alia4j.liam.ActionFactory;
import org.alia4j.liam.AtomicPredicate;
import org.alia4j.liam.AtomicPredicateFactory;
import org.alia4j.liam.Attachment;
import org.alia4j.liam.BasicPredicate;
import org.alia4j.liam.Context;
import org.alia4j.liam.ContextFactory;
import org.alia4j.liam.Predicate;
import org.alia4j.liam.Specialization;
import org.alia4j.liam.signature.ResolutionStrategy;

import bp.base.BPObject;
import bp.base.EffectDeployment;
import bp.base.Level;

public class DeployCollisionEffectAction extends Action{
	
	Attachment original;
	int duration;
	
	public DeployCollisionEffectAction(Attachment effectAttachment, int duration) {
		this.original = effectAttachment;
		this.duration = duration;
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
		else if(parameterPosition==0)
			return TypeDescriptorConstants.OBJECT_CLASS;
		else
			return null;
	}

    public void perform(final Object exposedContextValues) throws IllegalArgumentException, SecurityException,
    IllegalAccessException, ClassNotFoundException, NoSuchFieldException {
    	Object[] objects = (Object[]) exposedContextValues;
    	Context valueContext;
    	if(objects[0] instanceof Integer)
    		valueContext = ContextFactory.findOrCreateIntegerConstantContext((int) objects[0]);
    	else if(objects[0] instanceof Double)
    		valueContext = ContextFactory.findOrCreateDoubleConstantContext((double) objects[0]);
    	else
    		valueContext = ContextFactory.findOrCreateBooleanConstantContext((boolean) objects[0]);
    	contructAnddeployEffectAttachment(valueContext, (BPObject) objects[1]);    	
	}
    
	
	private void contructAnddeployEffectAttachment(Context context, BPObject object) {
		//construct new attachment from original + new context
		Context obeq = new ObjectEqualContext(ContextFactory.findOrCreateCalleeContext(),ContextFactory.findOrCreateObjectConstantContext(object));
		BasicPredicate<AtomicPredicate> predicate = new BasicPredicate<AtomicPredicate>(AtomicPredicateFactory.findOrCreateContextValuePredicate(obeq), true);
		Specialization originalSpecialization = original.getSpecializations().iterator().next();
		Specialization newSpecialization = new Specialization(originalSpecialization.getPattern(), predicate, Collections.singletonList(context));
		Attachment newAttachment = new Attachment(Collections.singleton(newSpecialization), original.getAction(), original.getScheduleInfo());		
		new EffectDeployment(newAttachment, duration, Level.getInstance().getTesting());
	}
	
	
}

