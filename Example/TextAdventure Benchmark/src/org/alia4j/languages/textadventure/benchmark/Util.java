package org.alia4j.languages.textadventure.benchmark;

import java.util.Collections;

import org.alia4j.hierarchy.TypeDescriptor;
import org.alia4j.hierarchy.TypeDescriptorConstants;
import org.alia4j.hierarchy.TypeHierarchyProvider;
import org.alia4j.languages.textadventure.context.TAContextFactory;
import org.alia4j.languages.textadventure.predicate.TAAtomicPredicateFactory;
import org.alia4j.liam.Action;
import org.alia4j.liam.ActionFactory;
import org.alia4j.liam.AtomicPredicate;
import org.alia4j.liam.Attachment;
import org.alia4j.liam.BasicPredicate;
import org.alia4j.liam.Context;
import org.alia4j.liam.ContextFactory;
import org.alia4j.liam.ScheduleInfo;
import org.alia4j.liam.Specialization;
import org.alia4j.liam.TruePredicate;
import org.alia4j.liam.pattern.MethodPattern;
import org.alia4j.liam.signature.ResolutionStrategy;
import org.alia4j.patterns.ExceptionsPattern;
import org.alia4j.patterns.ModifiersPattern;
import org.alia4j.patterns.ParametersPattern;
import org.alia4j.patterns.TypePattern;
import org.alia4j.patterns.names.ExactNamePattern;
import org.alia4j.patterns.types.ExactClassTypePattern;

import benchmark.JoinPointClass;

public class Util {
	
	public static void deployAttachment(Object first, Object second) {
		AtomicPredicate ap = TAAtomicPredicateFactory.findOrCreateIsSamePredicate(
				ContextFactory.findOrCreateObjectConstantContext(first),
				ContextFactory.findOrCreateObjectConstantContext(second));
		Specialization specialization = new Specialization(
				new MethodPattern(
						ModifiersPattern.ANY,
						TypePattern.ANY,
						new ExactClassTypePattern(TypeHierarchyProvider.findOrCreateFromClass(JoinPointClass.class)),
						new ExactNamePattern("joinPoint"),
						ParametersPattern.ANY,
						ExceptionsPattern.ANY),
				new BasicPredicate<AtomicPredicate>(ap, true),
				Collections.<Context>emptyList());
		Attachment attachment = new Attachment(
				Collections.singleton(specialization),
				ActionFactory.findOrCreateMethodCallAction(
						TypeHierarchyProvider.findOrCreateFromClass(Main.class),
						"advice",
						TypeDescriptorConstants.NO_ARG,
						TypeDescriptorConstants.VOID_PRIMITIVE,
						ResolutionStrategy.STATIC),
				ScheduleInfo.BEFORE);
		
		org.alia4j.fial.System.deploy(attachment);
	}

}
