/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp;

/**
 * A basic implementation of the ITokenResolveResult interface.
 */
public class BallandpaddleTokenResolveResult implements org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult {
	
	private String errorMessage;
	private Object resolvedToken;
	
	public BallandpaddleTokenResolveResult() {
		super();
		clear();
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public Object getResolvedToken() {
		return resolvedToken;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void setResolvedToken(Object resolvedToken) {
		this.resolvedToken = resolvedToken;
	}
	
	public void clear() {
		errorMessage = "Can't resolve token.";
		resolvedToken = null;
	}
	
}
