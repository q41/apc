/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug;

public class BallandpaddleSourceLocator extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupDirector {
	
	public void initializeParticipants() {
		addParticipants(new org.eclipse.debug.core.sourcelookup.ISourceLookupParticipant[]{new org.alia4j.language.ballandpaddle.resource.ballandpaddle.debug.BallandpaddleSourceLookupParticipant()});
	}
	
}
