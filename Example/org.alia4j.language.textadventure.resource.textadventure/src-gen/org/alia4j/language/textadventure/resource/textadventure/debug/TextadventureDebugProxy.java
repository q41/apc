/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.debug;

/**
 * The DebugProxy allows to communicate between the interpreter, which runs in a
 * separate thread or process and the Eclipse Debug framework (i.e., the
 * DebugTarget class).
 */
public class TextadventureDebugProxy {
	
	public static final int STARTUP_DELAY = 1000;
	
	private java.io.PrintStream output;
	
	private java.io.BufferedReader reader;
	
	private org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugTarget debugTarget;
	
	private org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugCommunicationHelper communicationHelper = new org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugCommunicationHelper();
	
	public TextadventureDebugProxy(org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugTarget debugTarget, int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		this.debugTarget = debugTarget;
		// give interpreter a chance to start
		try {
			Thread.sleep(STARTUP_DELAY);
		} catch (InterruptedException e) {
		}
		startSocket(requestPort);
	}
	
	private void startSocket(int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		// creating client proxy socket (trying to connect)...
		java.net.Socket client = new java.net.Socket("localhost", requestPort);
		// creating client proxy socket - done. (connected)
		try {
			java.io.BufferedInputStream input = new java.io.BufferedInputStream(client.getInputStream());
			reader = new java.io.BufferedReader(new java.io.InputStreamReader(input));
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
		try {
			output = new java.io.PrintStream(client.getOutputStream());
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
	}
	
	public void resume() {
		sendCommand(org.alia4j.language.textadventure.resource.textadventure.debug.ETextadventureDebugMessageTypes.RESUME);
	}
	
	public void stepOver() {
		sendCommand(org.alia4j.language.textadventure.resource.textadventure.debug.ETextadventureDebugMessageTypes.STEP_OVER);
	}
	
	public void stepInto() {
		sendCommand(org.alia4j.language.textadventure.resource.textadventure.debug.ETextadventureDebugMessageTypes.STEP_INTO);
	}
	
	public void stepReturn() {
		sendCommand(org.alia4j.language.textadventure.resource.textadventure.debug.ETextadventureDebugMessageTypes.STEP_RETURN);
	}
	
	public void terminate() {
		sendCommand(org.alia4j.language.textadventure.resource.textadventure.debug.ETextadventureDebugMessageTypes.EXIT);
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugMessage getStack() {
		return sendCommandAndRead(org.alia4j.language.textadventure.resource.textadventure.debug.ETextadventureDebugMessageTypes.GET_STACK);
	}
	
	public void addLineBreakpoint(String location, int line) {
		org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugMessage message = new org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugMessage(org.alia4j.language.textadventure.resource.textadventure.debug.ETextadventureDebugMessageTypes.ADD_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public void removeLineBreakpoint(String location, int line) {
		org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugMessage message = new org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugMessage(org.alia4j.language.textadventure.resource.textadventure.debug.ETextadventureDebugMessageTypes.REMOVE_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public org.eclipse.debug.core.model.IVariable[] getStackVariables(String stackFrame) {
		org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugMessage response = sendCommandAndRead(org.alia4j.language.textadventure.resource.textadventure.debug.ETextadventureDebugMessageTypes.GET_FRAME_VARIABLES, new String[] {stackFrame});
		String[] ids = response.getArguments();
		// fetch all variables
		org.eclipse.debug.core.model.IVariable[] variables = getVariables(ids);
		return variables;
	}
	
	public org.eclipse.debug.core.model.IVariable[] getVariables(String... requestedIDs) {
		org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugMessage response = sendCommandAndRead(org.alia4j.language.textadventure.resource.textadventure.debug.ETextadventureDebugMessageTypes.GET_VARIABLES, requestedIDs);
		String[] varStrings = response.getArguments();
		org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugVariable[] variables  = new org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugVariable[varStrings.length];
		int i = 0;
		for (String varString : varStrings) {
			java.util.Map<String, String> properties = org.alia4j.language.textadventure.resource.textadventure.util.TextadventureStringUtil.convertFromString(varString);
			
			// convert varString to variables and values
			String valueString = properties.get("!valueString");
			String valueRefType = "valueRefType";
			java.util.Map<String, Long> childVariables = new java.util.TreeMap<String, Long>(new java.util.Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});
			for (String property : properties.keySet()) {
				// ignore special properties - they are not children
				if (property.startsWith("!")) {
					continue;
				}
				childVariables.put(property, Long.parseLong(properties.get(property)));
			}
			String id = properties.get("!id");
			org.eclipse.debug.core.model.IValue value = new org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugValue(debugTarget, id, valueString, valueRefType, childVariables);
			
			String variableName = properties.get("!name");
			String variableRefType = properties.get("!type");
			
			org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugVariable variable = new org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugVariable(debugTarget, variableName, value, variableRefType);
			variables[i++] = variable;
		}
		return variables;
	}
	
	private void sendCommand(org.alia4j.language.textadventure.resource.textadventure.debug.ETextadventureDebugMessageTypes command, String... parameters) {
		org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugMessage message = new org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugMessage(command, parameters);
		communicationHelper.sendEvent(message, output);
	}
	
	private org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugMessage sendCommandAndRead(org.alia4j.language.textadventure.resource.textadventure.debug.ETextadventureDebugMessageTypes command, String... parameters) {
		org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugMessage message = new org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugMessage(command, parameters);
		return communicationHelper.sendAndReceive(message, output, reader);
	}
	
}
