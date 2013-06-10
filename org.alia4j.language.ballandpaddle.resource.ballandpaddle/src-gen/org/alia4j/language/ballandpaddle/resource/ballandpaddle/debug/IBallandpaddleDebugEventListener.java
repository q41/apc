/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug;

public interface IBallandpaddleDebugEventListener {
	
	/**
	 * Notification that the given event occurred in the while debugging.
	 */
	public void handleMessage(org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugMessage message);
}
