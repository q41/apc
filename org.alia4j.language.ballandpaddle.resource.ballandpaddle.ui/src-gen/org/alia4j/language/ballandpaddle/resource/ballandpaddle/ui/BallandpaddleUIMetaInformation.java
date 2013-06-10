/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui;

public class BallandpaddleUIMetaInformation extends org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleMetaInformation {
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleHoverTextProvider getHoverTextProvider() {
		return new org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleHoverTextProvider();
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleImageProvider getImageProvider() {
		return org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleImageProvider.INSTANCE;
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleColorManager createColorManager() {
		return new org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBal
	 * landpaddleTextResource,
	 * org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleColorMa
	 * nager) instead.
	 */
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleTokenScanner createTokenScanner(org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleTokenScanner createTokenScanner(org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextResource resource, org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleColorManager colorManager) {
		return new org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleTokenScanner(resource, colorManager);
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleCodeCompletionHelper createCodeCompletionHelper() {
		return new org.alia4j.language.ballandpaddle.resource.ballandpaddle.ui.BallandpaddleCodeCompletionHelper();
	}
	
}
