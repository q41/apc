/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class TextadventureDebugMessage {
	
	private static final char DELIMITER = ':';
	private org.alia4j.language.textadventure.resource.textadventure.debug.ETextadventureDebugMessageTypes messageType;
	private String[] arguments;
	
	public TextadventureDebugMessage(org.alia4j.language.textadventure.resource.textadventure.debug.ETextadventureDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public TextadventureDebugMessage(org.alia4j.language.textadventure.resource.textadventure.debug.ETextadventureDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.debug.ETextadventureDebugMessageTypes getMessageType() {
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
		return org.alia4j.language.textadventure.resource.textadventure.util.TextadventureStringUtil.encode(DELIMITER, parts);
	}
	
	public static TextadventureDebugMessage deserialize(String response) {
		java.util.List<String> parts = org.alia4j.language.textadventure.resource.textadventure.util.TextadventureStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		org.alia4j.language.textadventure.resource.textadventure.debug.ETextadventureDebugMessageTypes type = org.alia4j.language.textadventure.resource.textadventure.debug.ETextadventureDebugMessageTypes.valueOf(messageType);
		TextadventureDebugMessage message = new TextadventureDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(org.alia4j.language.textadventure.resource.textadventure.debug.ETextadventureDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + org.alia4j.language.textadventure.resource.textadventure.util.TextadventureStringUtil.explode(arguments, ", ") + "]";
	}
	
}
