/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.ui;

public class TextadventureOutlinePageTypeSortingAction extends org.alia4j.language.textadventure.resource.textadventure.ui.AbstractTextadventureOutlinePageAction {
	
	public TextadventureOutlinePageTypeSortingAction(org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Group types", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/group_types_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setGroupTypes(on);
		getTreeViewer().refresh();
	}
	
}
