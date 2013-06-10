/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug;

/**
 * The DebugProxy allows to communicate between the interpreter, which runs in a
 * separate thread or process and the Eclipse Debug framework (i.e., the
 * DebugTarget class).
 */
public class BallandpaddleDebugProxy {
	
	public static final int STARTUP_DELAY = 1000;
	
	private java.io.PrintStream output;
	
	private java.io.BufferedReader reader;
	
	private org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugTarget debugTarget;
	
	private org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugCommunicationHelper communicationHelper = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugCommunicationHelper();
	
	public BallandpaddleDebugProxy(org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugTarget debugTarget, int requestPort) throws java.net.UnknownHostException, java.io.IOException {
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
		sendCommand(org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.EBallandpaddleDebugMessageTypes.RESUME);
	}
	
	public void stepOver() {
		sendCommand(org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.EBallandpaddleDebugMessageTypes.STEP_OVER);
	}
	
	public void stepInto() {
		sendCommand(org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.EBallandpaddleDebugMessageTypes.STEP_INTO);
	}
	
	public void stepReturn() {
		sendCommand(org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.EBallandpaddleDebugMessageTypes.STEP_RETURN);
	}
	
	public void terminate() {
		sendCommand(org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.EBallandpaddleDebugMessageTypes.EXIT);
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugMessage getStack() {
		return sendCommandAndRead(org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.EBallandpaddleDebugMessageTypes.GET_STACK);
	}
	
	public void addLineBreakpoint(String location, int line) {
		org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugMessage message = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugMessage(org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.EBallandpaddleDebugMessageTypes.ADD_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public void removeLineBreakpoint(String location, int line) {
		org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugMessage message = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugMessage(org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.EBallandpaddleDebugMessageTypes.REMOVE_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public org.eclipse.debug.core.model.IVariable[] getStackVariables(String stackFrame) {
		org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugMessage response = sendCommandAndRead(org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.EBallandpaddleDebugMessageTypes.GET_FRAME_VARIABLES, new String[] {stackFrame});
		String[] ids = response.getArguments();
		// fetch all variables
		org.eclipse.debug.core.model.IVariable[] variables = getVariables(ids);
		return variables;
	}
	
	public org.eclipse.debug.core.model.IVariable[] getVariables(String... requestedIDs) {
		org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugMessage response = sendCommandAndRead(org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.EBallandpaddleDebugMessageTypes.GET_VARIABLES, requestedIDs);
		String[] varStrings = response.getArguments();
		org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugVariable[] variables  = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugVariable[varStrings.length];
		int i = 0;
		for (String varString : varStrings) {
			java.util.Map<String, String> properties = org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddleStringUtil.convertFromString(varString);
			
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
			org.eclipse.debug.core.model.IValue value = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugValue(debugTarget, id, valueString, valueRefType, childVariables);
			
			String variableName = properties.get("!name");
			String variableRefType = properties.get("!type");
			
			org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugVariable variable = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugVariable(debugTarget, variableName, value, variableRefType);
			variables[i++] = variable;
		}
		return variables;
	}
	
	private void sendCommand(org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.EBallandpaddleDebugMessageTypes command, String... parameters) {
		org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugMessage message = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugMessage(command, parameters);
		communicationHelper.sendEvent(message, output);
	}
	
	private org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugMessage sendCommandAndRead(org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.EBallandpaddleDebugMessageTypes command, String... parameters) {
		org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugMessage message = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugMessage(command, parameters);
		return communicationHelper.sendAndReceive(message, output, reader);
	}
	
}
