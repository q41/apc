/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug;

public class BallandpaddleSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleStackFrame) {
			org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleStackFrame frame = (org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
