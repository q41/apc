/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class TextadventureExpectedCsString extends org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureAbstractExpectedElement {
	
	private org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureKeyword keyword;
	
	public TextadventureExpectedCsString(org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	/**
	 * Returns the expected keyword.
	 */
	public org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureSyntaxElement getSymtaxElement() {
		return keyword;
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof TextadventureExpectedCsString) {
			return getValue().equals(((TextadventureExpectedCsString) o).getValue());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getValue().hashCode();
	}
	
}
