/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.debug;

public class TextadventureDebugCommunicationHelper {
	
	public void sendEvent(org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugMessage message, java.io.PrintStream stream) {
		synchronized (stream) {
			stream.println(message.serialize());
		}
	}
	
	/**
	 * Sends a message using the given stream and waits for an answer.
	 * 
	 * @param messageType the type of message to send
	 * @param stream the stream to send the message to
	 * @param reader the reader to obtain the answer from
	 * @param parameters additional parameter to send
	 * 
	 * @return the answer that is received
	 */
	public org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugMessage sendAndReceive(org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugMessage message, java.io.PrintStream stream, java.io.BufferedReader reader) {
		synchronized (stream) {
			sendEvent(message, stream);
			org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugMessage response = receive(reader);
			return response;
		}
	}
	
	/**
	 * Receives a message from the given reader. This method block until a message has
	 * arrived.
	 * 
	 * @param reader the read to obtain the message from
	 * 
	 * @return the received message
	 */
	public org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugMessage receive(java.io.BufferedReader reader) {
		try {
			String response = reader.readLine();
			if (response == null) {
				return null;
			}
			org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugMessage receivedMessage = org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugMessage.deserialize(response);
			return receivedMessage;
		} catch (java.io.IOException e) {
			return null;
		}
	}
	
}
