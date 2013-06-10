/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class BallandpaddleExpectedCsString extends org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleAbstractExpectedElement {
	
	private org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleKeyword keyword;
	
	public BallandpaddleExpectedCsString(org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	/**
	 * Returns the expected keyword.
	 */
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleSyntaxElement getSymtaxElement() {
		return keyword;
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof BallandpaddleExpectedCsString) {
			return getValue().equals(((BallandpaddleExpectedCsString) o).getValue());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getValue().hashCode();
	}
	
}
