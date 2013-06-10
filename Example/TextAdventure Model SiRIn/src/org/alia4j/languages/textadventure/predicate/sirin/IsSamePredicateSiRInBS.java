package org.alia4j.languages.textadventure.predicate.sirin;

import java.util.Arrays;
import java.util.List;

import org.alia4j.liam.AtomicPredicate;
import org.alia4j.liam.Context;
import org.alia4j.liam.signature.Signed;
import org.alia4j.liam.util.Maybe;
import org.alia4j.sirin.BytecodeBuilder;
import org.alia4j.sirin.BytecodeSupport;
import org.alia4j.sirin.context.ObjectConstantContextImpl;

public final class IsSamePredicateSiRInBS extends AtomicPredicate implements BytecodeSupport {

	IsSamePredicateSiRInBS(Context firstOperandContext,
			Context secondOperandContext) {
		super(Arrays.asList(firstOperandContext, secondOperandContext));
	}

	@Override
	public Maybe<Boolean> computeIsSatisfiedStatically(
			final List<? extends Signed<?>> callStack) {
		return new Maybe<Boolean>();
	}

	@Override
	public int estimateRuntimeCost() {
		return 1;
	}

	@Override
	public String toString() {
		return "IsSamePredicate [getContexts()=" + getContexts() + "]";
	}

	@Override
	public void build(BytecodeBuilder builder, Signed<?> call) {
		Context first = getContexts().get(0);
		Context second = getContexts().get(1);
		// if both values can be statically evaluated to null
		if ((first instanceof ObjectConstantContextImpl && ((ObjectConstantContextImpl) first).getValue() == null) &&
				second instanceof ObjectConstantContextImpl && ((ObjectConstantContextImpl) second).getValue() == null) {
			builder.appendSipush((short) 1); // interpreted as boolean true
		}
		// if one values can be statically evaluated to null
		else if (first instanceof ObjectConstantContextImpl && ((ObjectConstantContextImpl) first).getValue() == null) {
			builder.buildContext(second);
			Object sameLabel = builder.createLabel();
			Object doneLabel = builder.createLabel();
			builder.appendIfnull(sameLabel); // BRANCH
			builder.appendSipush((short) 0); // interpreted as boolean false
			builder.appendGoto(doneLabel);
			builder.insertLabel(sameLabel);
			builder.appendSipush((short) 1); // interpreted as boolean true
			builder.insertLabel(doneLabel);
		}
		// if one values can be statically evaluated to null
		else if (second instanceof ObjectConstantContextImpl && ((ObjectConstantContextImpl) second).getValue() == null) {
			builder.buildContext(first);
			Object sameLabel = builder.createLabel();
			Object doneLabel = builder.createLabel();
			builder.appendIfnull(sameLabel); // BRANCH
			builder.appendSipush((short) 0); // interpreted as boolean false
			builder.appendGoto(doneLabel);
			builder.insertLabel(sameLabel);
			builder.appendSipush((short) 1); // interpreted as boolean true
			builder.insertLabel(doneLabel);
		}
		// if one values cannot be evaluated statically
		else {
			builder.buildContext(first);
			builder.buildContext(second);
			Object sameLabel = builder.createLabel();
			Object doneLabel = builder.createLabel();
			builder.appendIfAcmpeq(sameLabel); // BRANCH
			builder.appendSipush((short) 0); // interpreted as boolean false
			builder.appendGoto(doneLabel);
			builder.insertLabel(sameLabel);
			builder.appendSipush((short) 1); // interpreted as boolean true
			builder.insertLabel(doneLabel);
		}
	}

}
