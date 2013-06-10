/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.ui;

public abstract class AbstractTextadventureOutlinePageAction extends org.eclipse.jface.action.Action {
	
	private String preferenceKey = this.getClass().getSimpleName() + ".isChecked";
	
	private org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureOutlinePageTreeViewer treeViewer;
	
	public AbstractTextadventureOutlinePageAction(org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureOutlinePageTreeViewer treeViewer, String text, int style) {
		super(text, style);
		this.treeViewer = treeViewer;
	}
	
	public void initialize(String imagePath) {
		org.eclipse.jface.resource.ImageDescriptor descriptor = org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureImageProvider.INSTANCE.getImageDescriptor(imagePath);
		setDisabledImageDescriptor(descriptor);
		setImageDescriptor(descriptor);
		setHoverImageDescriptor(descriptor);
		boolean checked = org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureUIPlugin.getDefault().getPreferenceStore().getBoolean(preferenceKey);
		valueChanged(checked, false);
	}
	
	@Override	
	public void run() {
		if (keepState()) {
			valueChanged(isChecked(), true);
		} else {
			runBusy(true);
		}
	}
	
	public void runBusy(final boolean on) {
		org.eclipse.swt.custom.BusyIndicator.showWhile(org.eclipse.swt.widgets.Display.getCurrent(), new Runnable() {
			public void run() {
				runInternal(on);
			}
		});
	}
	
	public abstract void runInternal(boolean on);
	
	private void valueChanged(boolean on, boolean store) {
		setChecked(on);
		runBusy(on);
		if (store) {
			org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureUIPlugin.getDefault().getPreferenceStore().setValue(preferenceKey, on);
		}
	}
	
	public boolean keepState() {
		return true;
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureOutlinePageTreeViewer getTreeViewer() {
		return treeViewer;
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureOutlinePageTreeViewerComparator getTreeViewerComparator() {
		return (org.alia4j.language.textadventure.resource.textadventure.ui.TextadventureOutlinePageTreeViewerComparator) treeViewer.getComparator();
	}
	
}
