package org.alia4j.languages.ballandpaddle.context;

import java.util.Collections;
import java.util.List;
import org.alia4j.liam.Context;
import org.alia4j.liam.SimpleType;
import org.alia4j.liam.signature.Signed;
import org.alia4j.noirin.CallContext;
import org.alia4j.noirin.SystemImpl;
import org.alia4j.util.Maybe;

public final class LocalVariableContext extends Context {

	private final String localVariableName;
	
	public static final Object LOCAL_VARIABLE_NOT_FOUND = "LOCAL_VARIABLE_NOT_FOUND";

	LocalVariableContext(String localVariableName) {
		super(Collections.<Context> emptyList());
		this.localVariableName = localVariableName;
	}

	@Override
	public Maybe<? extends Object> computeValueStatically(
			final List<? extends Signed<?>> callStack) {
		return new Maybe<Object>();
	}

	@Override
	public SimpleType getDeclaredResultType(final Signed<?> call) {
		return SimpleType.REFERENCE;
	}

	public Object getObjectValue() {
		final CallContext callContext = SystemImpl.getSingletonSystemImpl()
				.getCallStackTop();
		for (int i = 0; i < callContext.callerLocalsNames.length; i++) {
			if (callContext.callerLocalsNames[i].equals(localVariableName))
				return callContext.callerLocals[i];
		}
		return LOCAL_VARIABLE_NOT_FOUND;
	}

}
