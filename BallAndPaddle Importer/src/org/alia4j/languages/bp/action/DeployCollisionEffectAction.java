package org.alia4j.languages.bp.action;

import org.alia4j.fial.Importer;
import org.alia4j.hierarchy.TypeHierarchyProvider;
import org.alia4j.language.bp.CollisionEffect;
import org.alia4j.language.bp.CollisionEffectBody;
import org.alia4j.language.bp.ObjectTarget;
import org.alia4j.liam.Action;
import org.alia4j.liam.ActionFactory;
import org.alia4j.liam.AtomicPredicate;
import org.alia4j.liam.AtomicPredicateFactory;
import org.alia4j.liam.BasicPredicate;
import org.alia4j.liam.Context;
import org.alia4j.liam.ContextFactory;
import org.alia4j.liam.Predicate;
import org.alia4j.liam.signature.ResolutionStrategy;

import bp.base.BPObject;

public class DeployCollisionEffectAction {
	
	public static final Action methodCallAction = ActionFactory.findOrCreateMethodCallAction(
		TypeHierarchyProvider.findOrCreateFromClass(DeployCollisionEffectAction.class),
		"apply",
		TypeHierarchyProvider.findOrCreateFromNormalTypeNames(new String[] {"boolean"}),
		TypeHierarchyProvider.findOrCreateFromClass(void.class),
		ResolutionStrategy.STATIC
	);
	
	public static void apply(Importer temp, CollisionEffect effect, BPObject one, BPObject other) throws Throwable {
		CollisionEffectBody body = effect.getBody();
		//use effect to determine which ArgumentContext is refered to (constant order) and generate effect
		
		//whole attachment create goes here
		
		
		//create predicate
		//Context effectApplies = (body.getTarget() instanceof ObjectTarget) ? generateIsTargetInstanceContext(ContextFactory.findOrCreateCalleeContext(), (ObjectTarget) body.getTarget()) : null;
		//Predicate<AtomicPredicate> predicate = (effectApplies!=null) ? new BasicPredicate<AtomicPredicate>(AtomicPredicateFactory.findOrCreateContextValuePredicate(effectApplies), true) : null;
	}

}