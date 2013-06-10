/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp;

public class BallandpaddleParseResult implements org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleCommand<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextResource>> commands = new java.util.ArrayList<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleCommand<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextResource>>();
	
	public BallandpaddleParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleCommand<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
