package org.alia4j.languages.bp.context;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

import org.alia4j.liam.Context;
import org.alia4j.liam.SimpleType;
import org.alia4j.liam.signature.Signed;
import org.alia4j.noirin.context.CalleeContext;
import org.alia4j.util.Maybe;

public final class LocalGetterResultContext extends Context {
	
	private final String localGetterName;
	private SimpleType returnType;

	public LocalGetterResultContext(CalleeContext calleeContext, String localGetterName, SimpleType returnType) {
		super(Collections.singletonList(calleeContext));
		this.localGetterName = localGetterName;
		this.returnType = returnType;
	}

	@Override
	public Maybe<? extends Object> computeValueStatically(final List<? extends Signed<?>> callStack) {
		return new Maybe<>();
	}

	@Override
	public SimpleType getDeclaredResultType(final Signed<?> call) {
		return returnType;
	}
	
	private Object evaluateMethod(CalleeContext callee) {
		Object result = null;
		try {
			Method localGetter = callee.getClass().getDeclaredMethod(localGetterName);
			localGetter.setAccessible(true);
			result = localGetter.invoke(callee);
		} catch (NoSuchMethodException e) {
				System.out.format("SYNTAX ERROR: Field %s not defined on %s.", localGetterName, callee.getClass().toString());
				e.printStackTrace();
		} catch(SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean getBooleanValue(CalleeContext callee) {
		return (boolean) evaluateMethod(callee);
	}
	
	public int getIntegerValue(CalleeContext callee) {
		return (int) evaluateMethod(callee);
	}
	
	public double getDoubleValue(CalleeContext callee) {
		return (double) evaluateMethod(callee);
	}
	
	public Object getObjectValue(CalleeContext callee) {
		return evaluateMethod(callee);
	}
}
