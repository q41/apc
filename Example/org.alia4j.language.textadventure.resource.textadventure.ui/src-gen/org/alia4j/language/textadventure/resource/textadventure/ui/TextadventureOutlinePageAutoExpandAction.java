/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.ui;

public class TextadventureOutlinePageAutoExpandAction extends org.alia4j.language.textadventure.resource.textadventure.ui.AbstractTextadventureOutlinePageAction {
	
	public TextadventureOutlinePageAutoExpandAction(org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
