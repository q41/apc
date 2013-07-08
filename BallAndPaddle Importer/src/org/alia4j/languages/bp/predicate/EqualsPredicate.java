package org.alia4j.languages.bp.predicate;

import java.util.Arrays;
import java.util.List;

import org.alia4j.liam.AtomicPredicate;
import org.alia4j.liam.Context;
import org.alia4j.liam.signature.Signed;
import org.alia4j.util.Maybe;

public class EqualsPredicate extends AtomicPredicate {

	public EqualsPredicate(Context first, Context second) {
		super(Arrays.asList(first, second));
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
	
	// boolean, char, byte, short, int, long, float, double, Object
	public boolean isSatisfied(boolean a, boolean b) {
		return a == b;
	}
	
	public boolean isSatisfied(boolean a, char b) {
		return false;
	}
	
	public boolean isSatisfied(Object a, Object b) {
		return a.equals(b);
	}
}
