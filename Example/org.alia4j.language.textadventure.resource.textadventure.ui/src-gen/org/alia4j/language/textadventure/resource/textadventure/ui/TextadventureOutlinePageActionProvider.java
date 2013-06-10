/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.ui;

public class TextadventureOutlinePageActionProvider {
	
	public java.util.List<org.eclipse.jface.action.IAction> getActions(org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		java.util.List<org.eclipse.jface.action.IAction> defaultActions = new java.util.ArrayList<org.eclipse.jface.action.IAction>();
		defaultActions.add(new org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
