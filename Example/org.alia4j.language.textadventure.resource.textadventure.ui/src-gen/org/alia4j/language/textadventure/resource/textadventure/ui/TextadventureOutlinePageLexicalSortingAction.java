/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.ui;

public class TextadventureOutlinePageLexicalSortingAction extends org.alia4j.language.textadventure.resource.textadventure.ui.AbstractTextadventureOutlinePageAction {
	
	public TextadventureOutlinePageLexicalSortingAction(org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Sort alphabetically", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/sort_lexically_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setSortLexically(on);
		getTreeViewer().refresh();
	}
	
}
