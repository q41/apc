/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp;

/**
 * The BallandpaddleTokenResolverFactory class provides access to all generated
 * token resolvers. By giving the name of a defined token, the corresponding
 * resolve can be obtained. Despite the fact that this class is called
 * TokenResolverFactory is does NOT create new token resolvers whenever a client
 * calls methods to obtain a resolver. Rather, this class maintains a map of all
 * resolvers and creates each resolver at most once.
 */
public class BallandpaddleTokenResolverFactory implements org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolverFactory {
	
	private java.util.Map<String, org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver> featureName2CollectInTokenResolver;
	private static org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver defaultResolver = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.analysis.BallandpaddleDefaultTokenResolver();
	
	public BallandpaddleTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver>();
		registerTokenResolver("INTEGER", new org.alia4j.language.ballandpaddle.resource.ballandpaddle.analysis.BallandpaddleINTEGERTokenResolver());
		registerTokenResolver("FLOAT", new org.alia4j.language.ballandpaddle.resource.ballandpaddle.analysis.BallandpaddleFLOATTokenResolver());
		registerTokenResolver("CHAR", new org.alia4j.language.ballandpaddle.resource.ballandpaddle.analysis.BallandpaddleCHARTokenResolver());
		registerTokenResolver("LEVELLINE", new org.alia4j.language.ballandpaddle.resource.ballandpaddle.analysis.BallandpaddleLEVELLINETokenResolver());
		registerTokenResolver("TEXT", new org.alia4j.language.ballandpaddle.resource.ballandpaddle.analysis.BallandpaddleTEXTTokenResolver());
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver internalCreateResolver(java.util.Map<String, org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver> resolverMap, String key, org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
