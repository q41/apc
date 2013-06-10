/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui;

public class BallandpaddleCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleResourceProvider resourceProvider;
	private org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.IBallandpaddleBracketHandlerProvider bracketHandlerProvider;
	
	public BallandpaddleCompletionProcessor(org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleResourceProvider resourceProvider, org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.IBallandpaddleBracketHandlerProvider bracketHandlerProvider) {
		this.resourceProvider = resourceProvider;
		this.bracketHandlerProvider = bracketHandlerProvider;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextResource textResource = resourceProvider.getResource();
		if (textResource == null) {
			return new org.eclipse.jface.text.contentassist.ICompletionProposal[0];
		}
		String content = viewer.getDocument().get();
		org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleCodeCompletionHelper helper = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleCodeCompletionHelper();
		org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleProposalPostProcessor proposalPostProcessor = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleProposalPostProcessor();
		java.util.List<org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleCompletionProposal> finalProposalList = new java.util.ArrayList<org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleCompletionProposal>();
		for (org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleCompletionProposal proposal : extendedProposalList) {
			if (proposal.getMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleCompletionProposal proposal : finalProposalList) {
			String proposalString = proposal.getInsertString();
			String displayString = proposal.getDisplayString();
			String prefix = proposal.getPrefix();
			org.eclipse.swt.graphics.Image image = proposal.getImage();
			org.eclipse.jface.text.contentassist.IContextInformation info;
			info = new org.eclipse.jface.text.contentassist.ContextInformation(image, proposalString, proposalString);
			int begin = offset - prefix.length();
			int replacementLength = prefix.length();
			// if a closing bracket was automatically inserted right before, we enlarge the
			// replacement length in order to overwrite the bracket.
			org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.IBallandpaddleBracketHandler bracketHandler = bracketHandlerProvider.getBracketHandler();
			String closingBracket = bracketHandler.getClosingBracket();
			if (bracketHandler.addedClosingBracket() && proposalString.endsWith(closingBracket)) {
				replacementLength += closingBracket.length();
			}
			result[i++] = new org.eclipse.jface.text.contentassist.CompletionProposal(proposalString, begin, replacementLength, proposalString.length(), image, displayString, info, proposalString);
		}
		return result;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformation[] computeContextInformation(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		return null;
	}
	
	public char[] getCompletionProposalAutoActivationCharacters() {
		return null;
	}
	
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformationValidator getContextInformationValidator() {
		return null;
	}
	
	public String getErrorMessage() {
		return null;
	}
}
