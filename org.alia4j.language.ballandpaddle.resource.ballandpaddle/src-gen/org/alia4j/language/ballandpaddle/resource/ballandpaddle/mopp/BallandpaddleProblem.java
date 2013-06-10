/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp;

public class BallandpaddleProblem implements org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleProblem {
	
	private String message;
	private org.alia4j.language.ballandpaddle.resource.ballandpaddle.BallandpaddleEProblemType type;
	private org.alia4j.language.ballandpaddle.resource.ballandpaddle.BallandpaddleEProblemSeverity severity;
	private java.util.Collection<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleQuickFix> quickFixes;
	
	public BallandpaddleProblem(String message, org.alia4j.language.ballandpaddle.resource.ballandpaddle.BallandpaddleEProblemType type, org.alia4j.language.ballandpaddle.resource.ballandpaddle.BallandpaddleEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleQuickFix>emptySet());
	}
	
	public BallandpaddleProblem(String message, org.alia4j.language.ballandpaddle.resource.ballandpaddle.BallandpaddleEProblemType type, org.alia4j.language.ballandpaddle.resource.ballandpaddle.BallandpaddleEProblemSeverity severity, org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public BallandpaddleProblem(String message, org.alia4j.language.ballandpaddle.resource.ballandpaddle.BallandpaddleEProblemType type, org.alia4j.language.ballandpaddle.resource.ballandpaddle.BallandpaddleEProblemSeverity severity, java.util.Collection<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.BallandpaddleEProblemType getType() {
		return type;
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.BallandpaddleEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
