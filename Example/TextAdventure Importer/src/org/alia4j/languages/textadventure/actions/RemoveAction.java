package org.alia4j.languages.textadventure.actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.alia4j.languages.textadventure.importer.SharedValue;

public class RemoveAction {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List removeFromResultList(SharedValue value) throws Throwable {
		List result = new ArrayList();
		result.addAll((List) org.alia4j.fial.System.proceed());
		result.remove(value.value);
		return Collections.unmodifiableList(result);
	}

}
