/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface ITextadventureCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
