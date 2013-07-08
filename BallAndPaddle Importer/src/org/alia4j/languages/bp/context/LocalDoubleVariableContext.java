package org.alia4j.languages.bp.context;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

import org.alia4j.liam.Context;
import org.alia4j.liam.SimpleType;
import org.alia4j.liam.signature.Signed;
import org.alia4j.util.Maybe;

public final class LocalDoubleVariableContext extends Context {

	private final String localVariableName;

	public LocalDoubleVariableContext(Context calleeContext, String localVariableName) {
		super(Collections.singletonList(calleeContext));
		this.localVariableName = localVariableName;
	}

	@Override
	public Maybe<? extends Object> computeValueStatically(
			final List<? extends Signed<?>> callStack) {
		return new Maybe<Double>();
	}

	@Override
	public SimpleType getDeclaredResultType(final Signed<?> call) {
		return SimpleType.DOUBLE;
	}
	
	public double getDoubleValue(Object callee) {
		try {
			Field localVariable = callee.getClass().getDeclaredField(localVariableName);
			localVariable.setAccessible(true);
			return localVariable.getDouble(callee);
		} catch (NoSuchFieldException e) {
			System.out.format("SYNTAX ERROR: Field %s not defined on %s.", localVariableName, callee.getClass().toString());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}
