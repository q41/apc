/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug;

public abstract class BallandpaddleDebugElement extends org.eclipse.debug.core.model.DebugElement {
	
	/**
	 * Constructs a new debug element in the given target.
	 */
	public BallandpaddleDebugElement(org.eclipse.debug.core.model.IDebugTarget target) {
		super(target);
	}
	
	public String getModelIdentifier() {
		return org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddlePlugin.DEBUG_MODEL_ID;
	}
	
	/**
	 * Returns the breakpoint manager.
	 * 
	 * @return the breakpoint manager
	 */
	protected org.eclipse.debug.core.IBreakpointManager getBreakpointManager() {
		return org.eclipse.debug.core.DebugPlugin.getDefault().getBreakpointManager();
	}
	
}
