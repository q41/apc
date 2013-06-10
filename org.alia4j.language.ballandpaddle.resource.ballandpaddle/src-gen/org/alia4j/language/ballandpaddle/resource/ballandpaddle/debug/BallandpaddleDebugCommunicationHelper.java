/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug;

public class BallandpaddleDebugCommunicationHelper {
	
	public void sendEvent(org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugMessage message, java.io.PrintStream stream) {
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
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugMessage sendAndReceive(org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugMessage message, java.io.PrintStream stream, java.io.BufferedReader reader) {
		synchronized (stream) {
			sendEvent(message, stream);
			org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugMessage response = receive(reader);
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
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugMessage receive(java.io.BufferedReader reader) {
		try {
			String response = reader.readLine();
			if (response == null) {
				return null;
			}
			org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugMessage receivedMessage = org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugMessage.deserialize(response);
			return receivedMessage;
		} catch (java.io.IOException e) {
			return null;
		}
	}
	
}
