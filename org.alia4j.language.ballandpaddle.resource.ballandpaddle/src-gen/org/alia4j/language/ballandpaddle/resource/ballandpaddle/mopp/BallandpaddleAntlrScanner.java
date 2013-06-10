/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp;

public class BallandpaddleAntlrScanner implements org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextScanner {
	
	private org.antlr.runtime3_4_0.Lexer antlrLexer;
	
	public BallandpaddleAntlrScanner(org.antlr.runtime3_4_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_4_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextToken result = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleANTLRTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_4_0.ANTLRStringStream(text));
	}
	
}
