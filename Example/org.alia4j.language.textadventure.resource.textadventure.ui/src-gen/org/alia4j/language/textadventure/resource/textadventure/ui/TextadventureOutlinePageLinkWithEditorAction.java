/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.ui;

public class TextadventureOutlinePageLinkWithEditorAction extends org.alia4j.language.textadventure.resource.textadventure.ui.AbstractTextadventureOutlinePageAction {
	
	public TextadventureOutlinePageLinkWithEditorAction(org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Link with Editor", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/link_with_editor_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setLinkWithEditor(on);
	}
	
}
