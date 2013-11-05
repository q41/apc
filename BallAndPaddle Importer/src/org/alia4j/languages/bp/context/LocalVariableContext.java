package org.alia4j.languages.bp.context;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

import org.alia4j.language.bp.Target;
import org.alia4j.languages.bp.action.AttributeAssignAction;
import org.alia4j.languages.bp.importer.AttributeType;
import org.alia4j.liam.Context;
import org.alia4j.liam.SimpleType;
import org.alia4j.liam.signature.Signed;
import org.alia4j.util.Maybe;

import bp.base.BPObject;

public final class LocalVariableContext extends Context {

	private final String localVariableName;
	private AttributeType attrType;

	public LocalVariableContext(Context calleeContext, AttributeType attrType, String localVariableName) {
		super(Collections.singletonList(calleeContext));
		this.localVariableName = localVariableName;
		this.attrType = attrType;
	}

	@Override
	public Maybe<? extends Object> computeValueStatically(final List<? extends Signed<?>> callStack) {
		return new Maybe<Object>();
	}

	@Override
	public SimpleType getDeclaredResultType(final Signed<?> call) {
		return SimpleType.get(attrType.getTypeDescriptor());
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
	
	public int getIntegerValue(Object callee) {
		try {
			Field localVariable = callee.getClass().getDeclaredField(localVariableName.toLowerCase());
			localVariable.setAccessible(true);
			return localVariable.getInt(callee);
		} catch (NoSuchFieldException e) {
			System.out.format("SYNTAX ERROR: Field %s not defined on %s.", localVariableName, callee.getClass().toString());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int getIntValue(Object callee){
		return getIntegerValue(callee);
	}

	public boolean getBooleanValue(BPObject callee) {
		try {
			Field localVariable = callee.getClass().getDeclaredField(localVariableName);
			localVariable.setAccessible(true);
			return localVariable.getBoolean(callee);
		} catch (NoSuchFieldException e) {
			System.out.format("SYNTAX ERROR: Field %s not defined on %s.", localVariableName, callee.getClass().toString());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
