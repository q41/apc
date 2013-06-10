/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.mopp;

public class TextadventureMetaInformation implements org.alia4j.language.textadventure.resource.textadventure.ITextadventureMetaInformation {
	
	public String getSyntaxName() {
		return "textadventure";
	}
	
	public String getURI() {
		return "http://www.alia4j.org/alia4j-language-textadventure";
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextScanner createLexer() {
		return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureAntlrScanner(new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureLexer());
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureParser().createInstance(inputStream, encoding);
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextPrinter createPrinter(java.io.OutputStream outputStream, org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextResource resource) {
		return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventurePrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.ITextadventureReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureReferenceResolverSwitch();
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolverFactory getTokenResolverFactory() {
		return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "org.alia4j.language.textadventure/metamodel/textadventure.text.cs";
	}
	
	public String[] getTokenNames() {
		return org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureParser.tokenNames;
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenStyle getDefaultTokenStyle(String tokenName) {
		return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.alia4j.language.textadventure.resource.textadventure.ITextadventureBracketPair> getBracketPairs() {
		return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureResourceFactory();
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureNewFileContentProvider getNewFileContentProvider() {
		return new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureResourceFactory());
	}
	
	/**
	 * Returns the key of the option that can be used to register a preprocessor that
	 * is used as a pipe when loading resources. This key is language-specific. To
	 * register one preprocessor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getInputStreamPreprocessorProviderOptionKey() {
		return getSyntaxName() + "_" + "INPUT_STREAM_PREPROCESSOR_PROVIDER";
	}
	
	/**
	 * Returns the key of the option that can be used to register a post-processors
	 * that are invoked after loading resources. This key is language-specific. To
	 * register one post-processor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getResourcePostProcessorProviderOptionKey() {
		return getSyntaxName() + "_" + "RESOURCE_POSTPROCESSOR_PROVIDER";
	}
	
	public String getLaunchConfigurationType() {
		return "org.alia4j.language.textadventure.resource.textadventure.ui.launchConfigurationType";
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.ITextadventureNameProvider createNameProvider() {
		return new org.alia4j.language.textadventure.resource.textadventure.analysis.TextadventureDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureAntlrTokenHelper tokenHelper = new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureAntlrTokenHelper();
		java.util.List<String> highlightableTokens = new java.util.ArrayList<String>();
		String[] parserTokenNames = getTokenNames();
		for (int i = 0; i < parserTokenNames.length; i++) {
			// If ANTLR is used we need to normalize the token names
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			String tokenName = tokenHelper.getTokenName(parserTokenNames, i);
			if (tokenName == null) {
				continue;
			}
			highlightableTokens.add(tokenName);
		}
		highlightableTokens.add(org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
