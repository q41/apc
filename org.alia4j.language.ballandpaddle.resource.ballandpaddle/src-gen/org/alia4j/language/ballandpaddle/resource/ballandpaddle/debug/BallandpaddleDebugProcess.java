/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug;

public class BallandpaddleDebugProcess extends org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugElement implements org.eclipse.debug.core.model.IProcess, org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.IBallandpaddleDebugEventListener {
	
	private org.eclipse.debug.core.ILaunch launch;
	
	private boolean terminated = false;
	
	public BallandpaddleDebugProcess(org.eclipse.debug.core.ILaunch launch) {
		super(launch.getDebugTarget());
		this.launch = launch;
	}
	
	public boolean canTerminate() {
		return !terminated;
	}
	
	public boolean isTerminated() {
		return terminated;
	}
	
	public void terminate() throws org.eclipse.debug.core.DebugException {
		terminated = true;
	}
	
	public String getLabel() {
		return null;
	}
	
	public org.eclipse.debug.core.ILaunch getLaunch() {
		return launch;
	}
	
	public org.eclipse.debug.core.model.IStreamsProxy getStreamsProxy() {
		return null;
	}
	
	public void setAttribute(String key, String value) {
	}
	
	public String getAttribute(String key) {
		return null;
	}
	
	public int getExitValue() throws org.eclipse.debug.core.DebugException {
		return 0;
	}
	
	public void handleMessage(org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleDebugMessage message) {
		if (message.hasType(org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.EBallandpaddleDebugMessageTypes.TERMINATED)) {
			terminated = true;
		} else {
			// ignore other events
		}
	}
	
}
