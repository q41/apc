/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.debug;

public class TextadventureSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureStackFrame) {
			org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureStackFrame frame = (org.alia4j.language.textadventure.resource.textadventure.debug.TextadventureStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
