/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.mopp;

public class TextadventureResourcePostProcessor implements org.alia4j.language.textadventure.resource.textadventure.ITextadventureResourcePostProcessor {
	
	public void process(org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureResource resource) {
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
