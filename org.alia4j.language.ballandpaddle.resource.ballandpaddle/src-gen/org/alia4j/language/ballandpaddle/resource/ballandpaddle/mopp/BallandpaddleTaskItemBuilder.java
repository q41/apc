/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp;

/**
 * The BallandpaddleTaskItemBuilder is used to find task items in text documents.
 * The current implementation uses the generated lexer and the TaskItemDetector to
 * detect task items. This class is called by the BuilderAdapter, which runs both
 * this builder and the default builder that is intended to be customized.
 */
public class BallandpaddleTaskItemBuilder {
	
	public void build(org.eclipse.core.resources.IFile resource, org.eclipse.emf.ecore.resource.ResourceSet resourceSet, org.eclipse.core.runtime.IProgressMonitor monitor) {
		monitor.setTaskName("Searching for task items");
		new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleMarkerHelper().removeAllMarkers(resource, org.eclipse.core.resources.IMarker.TASK);
		if (isInBinFolder(resource)) {
			return;
		}
		java.util.List<org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTaskItem> taskItems = new java.util.ArrayList<org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTaskItem>();
		org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTaskItemDetector taskItemDetector = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTaskItemDetector();
		try {
			java.io.InputStream inputStream = resource.getContents();
			String content = org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddleStreamUtil.getContent(inputStream);
			org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextScanner lexer = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleMetaInformation().createLexer();
			lexer.setText(content);
			
			org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextToken nextToken = lexer.getNextToken();
			while (nextToken != null) {
				String text = nextToken.getText();
				taskItems.addAll(taskItemDetector.findTaskItems(text, nextToken.getLine(), nextToken.getOffset()));
				nextToken = lexer.getNextToken();
			}
		} catch (java.io.IOException e) {
			org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddlePlugin.logError("Exception while searching for task items", e);
		} catch (org.eclipse.core.runtime.CoreException e) {
			org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddlePlugin.logError("Exception while searching for task items", e);
		}
		
		for (org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTaskItem taskItem : taskItems) {
			java.util.Map<String, Object> markerAttributes = new java.util.LinkedHashMap<String, Object>();
			markerAttributes.put(org.eclipse.core.resources.IMarker.USER_EDITABLE, false);
			markerAttributes.put(org.eclipse.core.resources.IMarker.DONE, false);
			markerAttributes.put(org.eclipse.core.resources.IMarker.LINE_NUMBER, taskItem.getLine());
			markerAttributes.put(org.eclipse.core.resources.IMarker.CHAR_START, taskItem.getCharStart());
			markerAttributes.put(org.eclipse.core.resources.IMarker.CHAR_END, taskItem.getCharEnd());
			markerAttributes.put(org.eclipse.core.resources.IMarker.MESSAGE, taskItem.getMessage());
			new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleMarkerHelper().createMarker(resource, org.eclipse.core.resources.IMarker.TASK, markerAttributes);
		}
	}
	
	public String getBuilderMarkerId() {
		return org.eclipse.core.resources.IMarker.TASK;
	}
	
	public boolean isInBinFolder(org.eclipse.core.resources.IFile resource) {
		org.eclipse.core.resources.IContainer parent = resource.getParent();
		while (parent != null) {
			if ("bin".equals(parent.getName())) {
				return true;
			}
			parent = parent.getParent();
		}
		return false;
	}
	
}
