package org.alia4j.languages.bp.context;

import java.util.Arrays;
import java.util.List;

import org.alia4j.liam.Context;
import org.alia4j.liam.SimpleType;
import org.alia4j.liam.signature.Signed;
import org.alia4j.util.Maybe;

import bp.base.BPObject;
import bp.base.Block;

public final class ObjectEqualContext extends Context {
	
	public ObjectEqualContext(final Context left, final Context right) {
		super(Arrays.asList(left, right));
    }

	@Override
	public Maybe<Boolean> computeValueStatically(final List<? extends Signed<?>> callStack) {
		return new Maybe<Boolean>();
	}

	@Override
	public SimpleType getDeclaredResultType(final Signed<?> call) {
		return SimpleType.BOOLEAN;
	}
	
	public boolean getBooleanValue(Object left, Object right) {
		return left.equals(right);
	}
}
