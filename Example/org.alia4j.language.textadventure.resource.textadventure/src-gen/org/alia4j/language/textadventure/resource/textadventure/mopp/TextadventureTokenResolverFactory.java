/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.mopp;

/**
 * The TextadventureTokenResolverFactory class provides access to all generated
 * token resolvers. By giving the name of a defined token, the corresponding
 * resolve can be obtained. Despite the fact that this class is called
 * TokenResolverFactory is does NOT create new token resolvers whenever a client
 * calls methods to obtain a resolver. Rather, this class maintains a map of all
 * resolvers and creates each resolver at most once.
 */
public class TextadventureTokenResolverFactory implements org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolverFactory {
	
	private java.util.Map<String, org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver> featureName2CollectInTokenResolver;
	private static org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver defaultResolver = new org.alia4j.language.textadventure.resource.textadventure.analysis.TextadventureDefaultTokenResolver();
	
	public TextadventureTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver>();
		registerTokenResolver("INTEGER", new org.alia4j.language.textadventure.resource.textadventure.analysis.TextadventureINTEGERTokenResolver());
		registerTokenResolver("TEXT", new org.alia4j.language.textadventure.resource.textadventure.analysis.TextadventureTEXTTokenResolver());
		registerTokenResolver("QUOTED_34_34", new org.alia4j.language.textadventure.resource.textadventure.analysis.TextadventureQUOTED_34_34TokenResolver());
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver internalCreateResolver(java.util.Map<String, org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver> resolverMap, String key, org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
