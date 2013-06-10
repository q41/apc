/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.mopp;

public class TextadventureAntlrScanner implements org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextScanner {
	
	private org.antlr.runtime3_4_0.Lexer antlrLexer;
	
	public TextadventureAntlrScanner(org.antlr.runtime3_4_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_4_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextToken result = new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureANTLRTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_4_0.ANTLRStringStream(text));
	}
	
}
