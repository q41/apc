/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp;

public class BallandpaddleNewFileContentProvider {
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleMetaInformation getMetaInformation() {
		return new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleMetaInformation();
	}
	
	public String getNewFileContent(String newFileName) {
		return getExampleContent(new org.eclipse.emf.ecore.EClass[] {
			org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(),
		}, getMetaInformation().getClassesWithSyntax(), newFileName);
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass[] startClasses, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, String newFileName) {
		String content = "";
		for (org.eclipse.emf.ecore.EClass next : startClasses) {
			content = getExampleContent(next, allClassesWithSyntax, newFileName);
			if (content.trim().length() > 0) {
				break;
			}
		}
		return content;
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass eClass, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, String newFileName) {
		// create a minimal model
		org.eclipse.emf.ecore.EObject root = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddleMinimalModelHelper().getMinimalModel(eClass, allClassesWithSyntax, newFileName);
		if (root == null) {
			// could not create a minimal model. returning an empty document is the best we
			// can do.
			return "";
		}
		// use printer to get text for model
		java.io.ByteArrayOutputStream buffer = new java.io.ByteArrayOutputStream();
		org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextPrinter printer = getPrinter(buffer);
		try {
			printer.print(root);
		} catch (java.io.IOException e) {
			new org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddleRuntimeUtil().logError("Exception while generating example content.", e);
		}
		return buffer.toString();
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextPrinter getPrinter(java.io.OutputStream outputStream) {
		return getMetaInformation().createPrinter(outputStream, new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleResource());
	}
	
}
