/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure;

public interface ITextadventureProblem {
	public String getMessage();
	public org.alia4j.language.textadventure.resource.textadventure.TextadventureEProblemSeverity getSeverity();
	public org.alia4j.language.textadventure.resource.textadventure.TextadventureEProblemType getType();
	public java.util.Collection<org.alia4j.language.textadventure.resource.textadventure.ITextadventureQuickFix> getQuickFixes();
}
