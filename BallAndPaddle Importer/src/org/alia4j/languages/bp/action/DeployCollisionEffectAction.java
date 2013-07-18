package org.alia4j.languages.bp.action;

import java.util.Collections;

import org.alia4j.hierarchy.TypeHierarchyProvider;
import org.alia4j.liam.Action;
import org.alia4j.liam.ActionFactory;
import org.alia4j.liam.Attachment;
import org.alia4j.liam.Context;
import org.alia4j.liam.ContextFactory;
import org.alia4j.liam.Specialization;
import org.alia4j.liam.signature.ResolutionStrategy;

import bp.base.EffectDeployment;

public class DeployCollisionEffectAction {
	
	Attachment original;
	Class<?> typeClass;
	int duration;
	
	public DeployCollisionEffectAction(Attachment effectAttachment, Class<?> typeClass, int duration) {
		this.original = effectAttachment;
		this.duration = duration;
	}
	
	public final Action methodCallAction = ActionFactory.findOrCreateMethodCallAction(
		TypeHierarchyProvider.findOrCreateFromClass(DeployCollisionEffectAction.class),
		"apply",
		TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[] { typeClass.getName() }),
		TypeHierarchyProvider.findOrCreateFromClass(void.class),
		ResolutionStrategy.STATIC
	);
	
	public void apply(boolean value) throws Throwable {
		Context valueContext = ContextFactory.findOrCreateBooleanConstantContext(value);
		contructAnddeployEffectAttachment(valueContext);	
	}
	public void apply(double value) throws Throwable {
		Context valueContext = ContextFactory.findOrCreateDoubleConstantContext(value);
		contructAnddeployEffectAttachment(valueContext);	
	}
	public void apply(int value) throws Throwable {
		Context valueContext = ContextFactory.findOrCreateIntegerConstantContext(value);
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