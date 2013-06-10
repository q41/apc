/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui;

public class BallandpaddleMarkerResolutionGenerator implements org.eclipse.ui.IMarkerResolutionGenerator {
	
	public org.eclipse.ui.IMarkerResolution[] getResolutions(org.eclipse.core.resources.IMarker marker) {
		try {
			if (!hasQuickFixes(marker)) {
				return new org.eclipse.ui.IMarkerResolution[] {};
			}
			org.eclipse.core.resources.IResource resource = marker.getResource();
			if (resource instanceof org.eclipse.core.resources.IFile) {
				// load model
				final org.eclipse.core.resources.IFile file = (org.eclipse.core.resources.IFile) resource;
				org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				org.eclipse.emf.ecore.resource.ResourceSet rs = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
				rs.getLoadOptions().put(org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleOptions.DISABLE_CREATING_MARKERS_FOR_PROBLEMS, "true");
				org.eclipse.emf.ecore.resource.Resource emfResource = rs.getResource(uri, true);
				if (emfResource instanceof org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleResource) {
					org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleResource customResource = (org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleResource) emfResource;
					org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(customResource);
					java.util.Collection<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleQuickFix> quickFixes = getQuickFixes(customResource, marker);
					java.util.List<org.eclipse.ui.IMarkerResolution2> resolutions = new java.util.ArrayList<org.eclipse.ui.IMarkerResolution2>();
					for (final org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleQuickFix quickFix : quickFixes) {
						resolutions.add(new org.eclipse.ui.IMarkerResolution2() {
							
							public void run(org.eclipse.core.resources.IMarker marker) {
								String newText = quickFix.apply(null);
								// set new text as content for resource
								try {
									file.setContents(new java.io.ByteArrayInputStream(newText.getBytes()), true, true, null);
								} catch (org.eclipse.core.runtime.CoreException e) {
									org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleUIPlugin.logError("Exception while applying quick fix", e);
								}
							}
							
							public String getLabel() {
								return quickFix.getDisplayString();
							}
							
							public org.eclipse.swt.graphics.Image getImage() {
								return new org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleUIMetaInformation().getImageProvider().getImage(quickFix.getImageKey());
							}
							
							public String getDescription() {
								return null;
							}
							
						});
					}
					return resolutions.toArray(new org.eclipse.ui.IMarkerResolution[resolutions.size()]);
				}
			}
		} catch (Exception e) {
			org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleUIPlugin.logError("Exception while computing quick fix resolutions", e);
		}
		return new org.eclipse.ui.IMarkerResolution[] {};
	}
	
	public java.util.Collection<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleQuickFix> getQuickFixes(org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextResource resource, org.eclipse.core.resources.IMarker marker) {
		java.util.Collection<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleQuickFix> foundQuickFixes = new java.util.ArrayList<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleQuickFix>();
		try {
			String quickFixContexts = getQuickFixContextString(marker);
			if (quickFixContexts != null) {
				String[] quickFixContextParts = quickFixContexts.split("\\|");
				for (String quickFixContext : quickFixContextParts) {
					org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleQuickFix quickFix = resource.getQuickFix(quickFixContext);
					if (quickFix != null) {
						foundQuickFixes.add(quickFix);
					}
				}
			}
		} catch (org.eclipse.core.runtime.CoreException ce) {
			if (ce.getMessage().matches("Marker.*not found.")) {
				// ignore
				System.out.println("getQuickFixes() marker not found: " + ce.getMessage());
			} else {
				ce.printStackTrace();
			}
		}
		return foundQuickFixes;
	}
	
	private String getQuickFixContextString(org.eclipse.core.resources.IMarker marker) throws org.eclipse.core.runtime.CoreException {
		Object quickFixValue = marker.getAttribute(org.eclipse.core.resources.IMarker.SOURCE_ID);
		if (quickFixValue != null && quickFixValue instanceof String) {
			return (String) quickFixValue;
		}
		return null;
	}
	private boolean hasQuickFixes(org.eclipse.core.resources.IMarker marker) throws org.eclipse.core.runtime.CoreException {
		return getQuickFixContextString(marker) != null;
	}
}
