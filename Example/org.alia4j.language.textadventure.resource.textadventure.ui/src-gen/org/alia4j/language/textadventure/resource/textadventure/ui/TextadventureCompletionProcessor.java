/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.ui;

public class TextadventureCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private org.alia4j.language.textadventure.resource.textadventure.ITextadventureResourceProvider resourceProvider;
	private org.alia4j.language.textadventure.resource.textadventure.ui.ITextadventureBracketHandlerProvider bracketHandlerProvider;
	
	public TextadventureCompletionProcessor(org.alia4j.language.textadventure.resource.textadventure.ITextadventureResourceProvider resourceProvider, org.alia4j.language.textadventure.resource.textadventure.ui.ITextadventureBracketHandlerProvider bracketHandlerProvider) {
		this.resourceProvider = resourceProvider;
		this.bracketHandlerProvider = bracketHandlerProvider;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextResource textResource = resourceProvider.getResource();
		if (textResource == null) {
			return new org.eclipse.jface.text.contentassist.ICompletionProposal[0];
		}
		String content = viewer.getDocument().get();
		org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureCodeCompletionHelper helper = new org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureCodeCompletionHelper();
		org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureProposalPostProcessor proposalPostProcessor = new org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureProposalPostProcessor();
		java.util.List<org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureCompletionProposal> finalProposalList = new java.util.ArrayList<org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureCompletionProposal>();
		for (org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureCompletionProposal proposal : extendedProposalList) {
			if (proposal.getMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureCompletionProposal proposal : finalProposalList) {
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
			org.alia4j.language.textadventure.resource.textadventure.ui.ITextadventureBracketHandler bracketHandler = bracketHandlerProvider.getBracketHandler();
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
