/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp;

public class BallandpaddleMetaInformation implements org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleMetaInformation {
	
	public String getSyntaxName() {
		return "ballandpaddle";
	}
	
	public String getURI() {
		return "http://www.alia4j.org/language/ballandpaddle";
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextScanner createLexer() {
		return new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleAntlrScanner(new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleLexer());
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleParser().createInstance(inputStream, encoding);
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextPrinter createPrinter(java.io.OutputStream outputStream, org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextResource resource) {
		return new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddlePrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleReferenceResolverSwitch();
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolverFactory getTokenResolverFactory() {
		return new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "org.alia4j.language.ballandpaddle/metamodel/ballandpaddle.text.cs";
	}
	
	public String[] getTokenNames() {
		return org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleParser.tokenNames;
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenStyle getDefaultTokenStyle(String tokenName) {
		return new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleBracketPair> getBracketPairs() {
		return new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleResourceFactory();
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleNewFileContentProvider getNewFileContentProvider() {
		return new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleResourceFactory());
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
		return "org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.launchConfigurationType";
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleNameProvider createNameProvider() {
		return new org.alia4j.language.ballandpaddle.resource.ballandpaddle.analysis.BallandpaddleDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleAntlrTokenHelper tokenHelper = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleAntlrTokenHelper();
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
		highlightableTokens.add(org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
