/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IBallandpaddleCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
