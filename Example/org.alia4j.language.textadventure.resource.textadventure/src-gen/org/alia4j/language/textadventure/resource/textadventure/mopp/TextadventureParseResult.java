/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.mopp;

public class TextadventureParseResult implements org.alia4j.language.textadventure.resource.textadventure.ITextadventureParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<org.alia4j.language.textadventure.resource.textadventure.ITextadventureCommand<org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextResource>> commands = new java.util.ArrayList<org.alia4j.language.textadventure.resource.textadventure.ITextadventureCommand<org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextResource>>();
	
	public TextadventureParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<org.alia4j.language.textadventure.resource.textadventure.ITextadventureCommand<org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
