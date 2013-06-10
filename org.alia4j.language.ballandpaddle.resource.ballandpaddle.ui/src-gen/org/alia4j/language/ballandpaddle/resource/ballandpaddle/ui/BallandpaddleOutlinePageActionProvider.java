/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui;

public class BallandpaddleOutlinePageActionProvider {
	
	public java.util.List<org.eclipse.jface.action.IAction> getActions(org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		java.util.List<org.eclipse.jface.action.IAction> defaultActions = new java.util.ArrayList<org.eclipse.jface.action.IAction>();
		defaultActions.add(new org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
