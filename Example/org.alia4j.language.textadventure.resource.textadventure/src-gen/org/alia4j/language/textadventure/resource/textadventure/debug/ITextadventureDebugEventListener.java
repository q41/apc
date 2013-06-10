/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.debug;

public interface ITextadventureDebugEventListener {
	
	/**
	 * Notification that the given event occurred in the while debugging.
	 */
	public void handleMessage(org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureDebugMessage message);
}
