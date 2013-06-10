/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.mopp;

public class TextadventureSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(),
			org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getTile(),
			org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getItem(),
			org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getBinding(),
			org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWhileEffect(),
			org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getRemoveAction(),
			org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getList(),
			org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getPerson(),
			org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getIgnoreItemAbility(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(),
		};
	}
	
}
