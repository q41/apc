/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class BallandpaddleProposalPostProcessor {
	
	public java.util.List<org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleCompletionProposal> process(java.util.List<org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
