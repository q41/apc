/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp;

public class BallandpaddleResourcePostProcessor implements org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleResourcePostProcessor {
	
	public void process(org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleResource resource) {
		// Set the overrideResourcePostProcessor option to false to customize resource
		// post processing.
	}
	
	public void terminate() {
		// To signal termination to the process() method, setting a boolean field is
		// recommended. Depending on the value of this field process() can stop its
		// computation. However, this is only required for computation intensive
		// post-processors.
	}
	
}
