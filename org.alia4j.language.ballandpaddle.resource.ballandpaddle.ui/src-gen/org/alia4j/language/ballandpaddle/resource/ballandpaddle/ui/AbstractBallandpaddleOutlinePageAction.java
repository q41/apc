/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui;

public abstract class AbstractBallandpaddleOutlinePageAction extends org.eclipse.jface.action.Action {
	
	private String preferenceKey = this.getClass().getSimpleName() + ".isChecked";
	
	private org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleOutlinePageTreeViewer treeViewer;
	
	public AbstractBallandpaddleOutlinePageAction(org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleOutlinePageTreeViewer treeViewer, String text, int style) {
		super(text, style);
		this.treeViewer = treeViewer;
	}
	
	public void initialize(String imagePath) {
		org.eclipse.jface.resource.ImageDescriptor descriptor = org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleImageProvider.INSTANCE.getImageDescriptor(imagePath);
		setDisabledImageDescriptor(descriptor);
		setImageDescriptor(descriptor);
		setHoverImageDescriptor(descriptor);
		boolean checked = org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleUIPlugin.getDefault().getPreferenceStore().getBoolean(preferenceKey);
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
			org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleUIPlugin.getDefault().getPreferenceStore().setValue(preferenceKey, on);
		}
	}
	
	public boolean keepState() {
		return true;
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleOutlinePageTreeViewer getTreeViewer() {
		return treeViewer;
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleOutlinePageTreeViewerComparator getTreeViewerComparator() {
		return (org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleOutlinePageTreeViewerComparator) treeViewer.getComparator();
	}
	
}
