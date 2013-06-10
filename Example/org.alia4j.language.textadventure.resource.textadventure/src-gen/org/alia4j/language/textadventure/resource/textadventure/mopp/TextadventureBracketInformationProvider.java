/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.mopp;

public class TextadventureBracketInformationProvider {
	
	public class BracketPair implements org.alia4j.language.textadventure.resource.textadventure.ITextadventureBracketPair {
		
		private String opening;
		private String closing;
		private boolean closingEnabledInside;
		
		public BracketPair(String opening, String closing, boolean closingEnabledInside) {
			super();
			this.opening = opening;
			this.closing = closing;
			this.closingEnabledInside = closingEnabledInside;
		}
		
		public String getOpeningBracket() {
			return opening;
		}
		
		public String getClosingBracket() {
			return closing;
		}
		
		public boolean isClosingEnabledInside() {
			return closingEnabledInside;
		}
	}
	
	public java.util.Collection<org.alia4j.language.textadventure.resource.textadventure.ITextadventureBracketPair> getBracketPairs() {
		java.util.Collection<org.alia4j.language.textadventure.resource.textadventure.ITextadventureBracketPair> result = new java.util.ArrayList<org.alia4j.language.textadventure.resource.textadventure.ITextadventureBracketPair>();
		result.add(new BracketPair("{", "}", true));
		result.add(new BracketPair("\"", "\"", false));
		return result;
	}
	
}
