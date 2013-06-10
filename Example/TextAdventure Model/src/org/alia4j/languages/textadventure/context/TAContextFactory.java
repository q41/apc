package org.alia4j.languages.textadventure.context;

import java.util.HashMap;
import java.util.Map;

import org.alia4j.liam.Context;

public class TAContextFactory {
    
	public TAContextFactory() {
        if (TAContextFactory.singleton != null)
            throw new IllegalStateException();
        TAContextFactory.singleton = this;
    }
    
    private static TAContextFactory getInstance() {
        return TAContextFactory.singleton;
    }
    
    private static TAContextFactory singleton;
	
	public static Context findOrCreateLocalVariableContext(String localVariableName) {
		if (!canonicalLocalVariableContexts.containsKey(localVariableName)) {
			canonicalLocalVariableContexts.put(localVariableName, getInstance().createLocalVariableContext(localVariableName));
		}
		return canonicalLocalVariableContexts.get(localVariableName);
	}
	
	private static Map<String, Context> canonicalLocalVariableContexts = new HashMap<String, Context>();
	
	protected Context createLocalVariableContext(String localVariableName) {
		return new LocalVariableContext(localVariableName);
	}
}
