package org.alia4j.languages.bp.context;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.alia4j.language.bp.ClassTarget;
import org.alia4j.language.bp.ObjectTarget;
import org.alia4j.language.bp.Target;
import org.alia4j.languages.bp.importer.AttributeType;
import org.alia4j.languages.bp.importer.Importer;
import org.alia4j.liam.Context;
import org.alia4j.liam.ContextFactory;
import org.alia4j.liam.SimpleType;
import org.alia4j.liam.signature.Signed;
import org.alia4j.util.Maybe;

import bp.base.BPObject;

public final class TargetVariableContext extends Context {

	private final String localVariableName;
	private final AttributeType attrType;

	public TargetVariableContext(Context collider1, Context collider2, Target target, AttributeType attrType, String localVariableName) {
		super(Arrays.asList(collider1, collider2, ContextFactory.findOrCreateObjectConstantContext(target)));
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
	
	private BPObject getTargetObject(BPObject collider1, BPObject collider2, Target target) {
		BPObject targetObject = null;
		if(target instanceof ClassTarget) {
			Class<?> BPObjectClass = Importer.getBPObjectClass((ClassTarget)target);
			targetObject = (BPObjectClass.isInstance(collider1))?collider1:collider2;
		} else {
			String id = ((ObjectTarget) target).getObject().getId();
			targetObject = (collider1.id.equals(id))?collider1:collider2;
		}
		return targetObject;
	}
	
	public double getDoubleValue(BPObject collider1, BPObject collider2, Target target) {
		//determine which colliding object is the owner of the attribute
		BPObject targetObject = getTargetObject(collider1, collider2, target);
		
		//access the variable
		try {
			Field localVariable = targetObject.getClass().getDeclaredField(localVariableName);
			localVariable.setAccessible(true);
			return localVariable.getDouble(targetObject);
		} catch (NoSuchFieldException e) {
			System.out.format("SYNTAX ERROR: Field %s not defined on %s.", localVariableName, targetObject.getClass().toString());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0.0;
	}
	
	public int getIntegerValue(BPObject collider1, BPObject collider2, Target target) {
		//determine which colliding object is the owner of the attribute
		BPObject targetObject = getTargetObject(collider1, collider2, target);
		
		//access the variable
		try {
			Field localVariable = targetObject.getClass().getDeclaredField(localVariableName);
			localVariable.setAccessible(true);
			return localVariable.getInt(targetObject);
		} catch (NoSuchFieldException e) {
			System.out.format("SYNTAX ERROR: Field %s not defined on %s.", localVariableName, targetObject.getClass().toString());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int getIntValue(BPObject collider1, BPObject collider2, Target target){
		return getIntegerValue(collider1, collider2, target);
	}
	
	public boolean getBooleanValue(BPObject collider1, BPObject collider2, Target target) {
		//determine which colliding object is the owner of the attribute
		BPObject targetObject = getTargetObject(collider1, collider2, target);
		
		//access the variable
		try {
			Field localVariable = targetObject.getClass().getDeclaredField(localVariableName);
			localVariable.setAccessible(true);
			return localVariable.getBoolean(targetObject);
		} catch (NoSuchFieldException e) {
			System.out.format("SYNTAX ERROR: Field %s not defined on %s.", localVariableName, targetObject.getClass().toString());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
