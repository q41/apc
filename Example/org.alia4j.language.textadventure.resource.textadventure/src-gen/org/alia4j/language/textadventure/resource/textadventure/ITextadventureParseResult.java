/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure;

/**
 * An interface used to access the result of parsing a document.
 */
public interface ITextadventureParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<org.alia4j.language.textadventure.resource.textadventure.ITextadventureCommand<org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextResource>> getPostParseCommands();
	
}
