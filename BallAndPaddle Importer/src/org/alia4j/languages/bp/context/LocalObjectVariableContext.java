package org.alia4j.languages.bp.context;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

import org.alia4j.liam.Context;
import org.alia4j.liam.SimpleType;
import org.alia4j.liam.signature.Signed;
import org.alia4j.util.Maybe;

public final class LocalObjectVariableContext extends Context {

	private final String localVariableName;

	public LocalObjectVariableContext(Context calleeContext, String localVariableName) {
		super(Collections.singletonList(calleeContext));
		this.localVariableName = localVariableName;
	}

	@Override
	public Maybe<? extends Object> computeValueStatically(final List<? extends Signed<?>> callStack) {
		return new Maybe<Object>();
	}

	@Override
	public SimpleType getDeclaredResultType(final Signed<?> call) {
		return SimpleType.REFERENCE;
	}
	
	public Object getObjectValue(Object callee) {
		try {
			Field localVariable = callee.getClass().getField(localVariableName);
			localVariable.setAccessible(true);
			return localVariable.get(callee);
		} catch (NoSuchFieldException e) {
			System.out.format("SYNTAX ERROR: Field %s not defined on %s.", localVariableName, callee.getClass().toString());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
