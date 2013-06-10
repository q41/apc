/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui;

public class BallandpaddleOutlinePageExpandAllAction extends org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.AbstractBallandpaddleOutlinePageAction {
	
	public BallandpaddleOutlinePageExpandAllAction(org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Expand all", org.eclipse.jface.action.IAction.AS_PUSH_BUTTON);
		initialize("icons/expand_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().expandAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
