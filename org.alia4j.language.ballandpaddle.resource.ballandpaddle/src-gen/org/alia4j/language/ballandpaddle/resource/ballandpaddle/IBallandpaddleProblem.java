/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle;

public interface IBallandpaddleProblem {
	public String getMessage();
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.BallandpaddleEProblemSeverity getSeverity();
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.BallandpaddleEProblemType getType();
	public java.util.Collection<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleQuickFix> getQuickFixes();
}
