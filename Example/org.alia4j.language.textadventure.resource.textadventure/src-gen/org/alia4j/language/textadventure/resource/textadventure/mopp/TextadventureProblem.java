/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.mopp;

public class TextadventureProblem implements org.alia4j.language.textadventure.resource.textadventure.ITextadventureProblem {
	
	private String message;
	private org.alia4j.language.textadventure.resource.textadventure.TextadventureEProblemType type;
	private org.alia4j.language.textadventure.resource.textadventure.TextadventureEProblemSeverity severity;
	private java.util.Collection<org.alia4j.language.textadventure.resource.textadventure.ITextadventureQuickFix> quickFixes;
	
	public TextadventureProblem(String message, org.alia4j.language.textadventure.resource.textadventure.TextadventureEProblemType type, org.alia4j.language.textadventure.resource.textadventure.TextadventureEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<org.alia4j.language.textadventure.resource.textadventure.ITextadventureQuickFix>emptySet());
	}
	
	public TextadventureProblem(String message, org.alia4j.language.textadventure.resource.textadventure.TextadventureEProblemType type, org.alia4j.language.textadventure.resource.textadventure.TextadventureEProblemSeverity severity, org.alia4j.language.textadventure.resource.textadventure.ITextadventureQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public TextadventureProblem(String message, org.alia4j.language.textadventure.resource.textadventure.TextadventureEProblemType type, org.alia4j.language.textadventure.resource.textadventure.TextadventureEProblemSeverity severity, java.util.Collection<org.alia4j.language.textadventure.resource.textadventure.ITextadventureQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<org.alia4j.language.textadventure.resource.textadventure.ITextadventureQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.TextadventureEProblemType getType() {
		return type;
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.TextadventureEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<org.alia4j.language.textadventure.resource.textadventure.ITextadventureQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
