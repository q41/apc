/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class BallandpaddleDebugMessage {
	
	private static final char DELIMITER = ':';
	private org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.EBallandpaddleDebugMessageTypes messageType;
	private String[] arguments;
	
	public BallandpaddleDebugMessage(org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.EBallandpaddleDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public BallandpaddleDebugMessage(org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.EBallandpaddleDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.EBallandpaddleDebugMessageTypes getMessageType() {
		return messageType;
	}
	
	public String[] getArguments() {
		return arguments;
	}
	
	public String serialize() {
		java.util.List<String> parts = new java.util.ArrayList<String>();
		parts.add(messageType.name());
		for (String argument : arguments) {
			parts.add(argument);
		}
		return org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddleStringUtil.encode(DELIMITER, parts);
	}
	
	public static BallandpaddleDebugMessage deserialize(String response) {
		java.util.List<String> parts = org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddleStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.EBallandpaddleDebugMessageTypes type = org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.EBallandpaddleDebugMessageTypes.valueOf(messageType);
		BallandpaddleDebugMessage message = new BallandpaddleDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.EBallandpaddleDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddleStringUtil.explode(arguments, ", ") + "]";
	}
	
}
