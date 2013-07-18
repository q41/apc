package org.alia4j.languages.bp.context;

import java.util.Arrays;
import java.util.List;

import org.alia4j.liam.Context;
import org.alia4j.liam.SimpleType;
import org.alia4j.liam.signature.Signed;
import org.alia4j.util.Maybe;

import bp.base.BPObject;
import bp.base.Ball;

public class ClassContext extends Context{

	public ClassContext(final Context item) {
		super(Arrays.asList(item));
    }

	@Override
	public Maybe<Boolean> computeValueStatically(final List<? extends Signed<?>> callStack) {
		return new Maybe<Boolean>();
	}

	@Override
	public SimpleType getDeclaredResultType(final Signed<?> call) {
		return SimpleType.REFERENCE;
	}
	
	public Object getObjectValue(Object item) {
		return item;
	}
		
}
