/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class TextadventureProposalPostProcessor {
	
	public java.util.List<org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureCompletionProposal> process(java.util.List<org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
