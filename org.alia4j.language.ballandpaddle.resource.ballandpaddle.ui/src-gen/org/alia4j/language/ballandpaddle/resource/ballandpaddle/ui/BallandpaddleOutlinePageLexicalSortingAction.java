/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui;

public class BallandpaddleOutlinePageLexicalSortingAction extends org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.AbstractBallandpaddleOutlinePageAction {
	
	public BallandpaddleOutlinePageLexicalSortingAction(org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Sort alphabetically", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/sort_lexically_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setSortLexically(on);
		getTreeViewer().refresh();
	}
	
}
