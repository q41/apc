package org.alia4j.languages.ballandpaddle.predicate;

import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.List;

import org.alia4j.liam.AtomicPredicate;
import org.alia4j.liam.Context;
import org.alia4j.liam.signature.Signed;
import org.alia4j.util.Maybe;

public class isMethodFinalPredicate extends AtomicPredicate {
		
		public isMethodFinalPredicate(Context ctx) {
			super(Collections.singletonList(ctx));
		}
		
		@Override
		public int estimateRuntimeCost() {
			return 1;
		}
		
		@Override
		public Maybe<Boolean> computeIsSatisfiedStatically(
				List<? extends Signed<?>> callStack) {
			return new Maybe<Boolean>();
		}
		
		public boolean isSatisfied(Object o) {
			Member m = (Member) o;
			return Modifier.isFinal(m.getModifiers());
		}
	}