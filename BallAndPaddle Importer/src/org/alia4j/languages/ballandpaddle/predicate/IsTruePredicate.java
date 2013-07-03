package org.alia4j.languages.ballandpaddle.predicate;

import java.util.Arrays;
import java.util.List;

import org.alia4j.liam.AtomicPredicate;
import org.alia4j.liam.Context;
import org.alia4j.liam.signature.Signed;
import org.alia4j.util.Maybe;

public class IsTruePredicate extends AtomicPredicate {

	public IsTruePredicate(Context context) {
		super(Arrays.asList(context));
	}

	@Override
	public Maybe<Boolean> computeIsSatisfiedStatically(
			List<? extends Signed<?>> callStack) {
		return new Maybe<Boolean>();
	}

	@Override
	public int estimateRuntimeCost() {
		return 1;
	}
	
	public boolean isSatisfied(boolean a) {
		return a;
	}
	
}
