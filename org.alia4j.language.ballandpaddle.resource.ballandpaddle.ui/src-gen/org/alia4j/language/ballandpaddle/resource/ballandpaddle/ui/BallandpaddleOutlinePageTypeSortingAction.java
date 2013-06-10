/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui;

public class BallandpaddleOutlinePageTypeSortingAction extends org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.AbstractBallandpaddleOutlinePageAction {
	
	public BallandpaddleOutlinePageTypeSortingAction(org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Group types", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/group_types_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setGroupTypes(on);
		getTreeViewer().refresh();
	}
	
}
