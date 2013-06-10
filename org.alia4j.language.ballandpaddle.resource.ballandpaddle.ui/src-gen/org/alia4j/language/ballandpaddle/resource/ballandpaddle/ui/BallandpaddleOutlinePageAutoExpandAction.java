/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui;

public class BallandpaddleOutlinePageAutoExpandAction extends org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.AbstractBallandpaddleOutlinePageAction {
	
	public BallandpaddleOutlinePageAutoExpandAction(org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
