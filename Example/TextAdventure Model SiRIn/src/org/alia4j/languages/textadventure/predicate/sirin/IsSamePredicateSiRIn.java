package org.alia4j.languages.textadventure.predicate.sirin;

import java.util.Arrays;
import java.util.List;

import org.alia4j.liam.AtomicPredicate;
import org.alia4j.liam.Context;
import org.alia4j.liam.signature.Signed;
import org.alia4j.liam.util.Maybe;

public final class IsSamePredicateSiRIn extends AtomicPredicate {

	IsSamePredicateSiRIn(Context firstOperandContext,
			Context secondOperandContext) {
		super(Arrays.asList(firstOperandContext, secondOperandContext));
	}

	public boolean isSatisfied(Object firstOperand, Object secondOperand) {
		return firstOperand == secondOperand;
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

}
