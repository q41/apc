/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.util;

/**
 * A utility class to inject/extract layout information into/from a model.
 */
public class BallandpaddleLayoutUtil {
	
	public final String LAYOUT_PACKAGE_NS_URI = "http://www.emftext.org/commons/layout";
	public final String LAYOUT_INFORMATION_ECLASS_NAME = "LayoutInformation";
	public final String ATTRIBUTE_LAYOUT_INFORMATION_ECLASS_NAME = "AttributeLayoutInformation";
	public final String REFERENCE_LAYOUT_INFORMATION_ECLASS_NAME = "ReferenceLayoutInformation";
	public final String KEYWORD_LAYOUT_INFORMATION_ECLASS_NAME = "KeywordLayoutInformation";
	
	public final String SYNTAX_ELEMENT_ID_EATTRIBUTE_NAME = "syntaxElementID";
	public final String OBJECT_EATTRIBUTE_NAME = "object";
	public final String VISIBLE_TOKEN_TEXT_EATTRIBUTE_NAME = "visibleTokenText";
	public final String HIDDEN_TOKEN_TEXT_EATTRIBUTE_NAME = "hiddenTokenText";
	public final String START_OFFSET_EATTRIBUTE_NAME = "startOffset";
	
	public void transferAllLayoutInformationToModel(org.eclipse.emf.ecore.EObject root) {
		transferLayoutInformationToModel(root);
		for (java.util.Iterator<org.eclipse.emf.ecore.EObject> i = root.eAllContents(); i.hasNext(); ) {
			transferLayoutInformationToModel(i.next());
		}
	}
	
	public void transferAllLayoutInformationFromModel(org.eclipse.emf.ecore.EObject root) {
		transferLayoutInformationFromModel(root);
		for (org.eclipse.emf.ecore.EObject next : new java.util.ArrayList<org.eclipse.emf.ecore.EObject>(root.eContents())) {
			transferAllLayoutInformationFromModel(next);
		}
	}
	
	public void transferLayoutInformationToModel(org.eclipse.emf.ecore.EObject element) {
		org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(element);
		layoutInformationAdapter.getLayoutInformations();
		for (java.util.Iterator<org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleLayoutInformation> i = layoutInformationAdapter.getLayoutInformations().iterator(); i.hasNext(); ) {
			org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleLayoutInformation layoutInformation = i.next();
			org.eclipse.emf.ecore.EReference layoutReference = findLayoutReference(element.eClass());
			if (layoutReference != null) {
				org.eclipse.emf.ecore.EObject layoutInformationModelElement = createLayoutInformationModelElement(layoutInformation, layoutReference.getEType().getEPackage());
				if (layoutInformationModelElement != null) {
					@SuppressWarnings("unchecked")					
					java.util.List<org.eclipse.emf.ecore.EObject> list = (java.util.List<org.eclipse.emf.ecore.EObject>) element.eGet(layoutReference);
					list.add(layoutInformationModelElement);
					i.remove();
				}
			}
		}
	}
	
	public void transferLayoutInformationFromModel(org.eclipse.emf.ecore.EObject element) {
		org.eclipse.emf.ecore.EReference layoutReference = findLayoutReference(element.eClass());
		if (layoutReference != null) {
			org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(element);
			@SuppressWarnings("unchecked")			
			java.util.List<org.eclipse.emf.ecore.EObject> list = (java.util.List<org.eclipse.emf.ecore.EObject>) element.eGet(layoutReference);
			for (java.util.Iterator<org.eclipse.emf.ecore.EObject> i = list.iterator(); i.hasNext(); ) {
				org.eclipse.emf.ecore.EObject layoutModelElement = i.next();
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleLayoutInformation layoutInformation = createLayoutInformation(layoutModelElement);
				if (layoutInformation != null) {
					layoutInformationAdapter.getLayoutInformations().add(layoutInformation);
					i.remove();
				}
			}
		}
	}
	
	public org.eclipse.emf.ecore.EObject createLayoutInformationModelElement(org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleLayoutInformation layoutInformation, org.eclipse.emf.ecore.EPackage layoutPackage) {
		org.eclipse.emf.ecore.EFactory factory = layoutPackage.getEFactoryInstance();
		Object object = layoutInformation.getObject(null, false);
		org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleSyntaxElement syntaxElement = layoutInformation.getSyntaxElement();
		org.eclipse.emf.ecore.EClass layoutInformationEClass = null;
		org.eclipse.emf.ecore.EObject layoutInformationModelElement = null;
		if (object == null) {
			// keyword
			layoutInformationEClass = (org.eclipse.emf.ecore.EClass) layoutPackage.getEClassifier(KEYWORD_LAYOUT_INFORMATION_ECLASS_NAME);
			layoutInformationModelElement = factory.create(layoutInformationEClass);
		} else if (object instanceof org.eclipse.emf.ecore.EObject) {
			// reference
			layoutInformationEClass = (org.eclipse.emf.ecore.EClass) layoutPackage.getEClassifier(REFERENCE_LAYOUT_INFORMATION_ECLASS_NAME);
			layoutInformationModelElement = factory.create(layoutInformationEClass);
			layoutInformationModelElement.eSet(layoutInformationEClass.getEStructuralFeature(OBJECT_EATTRIBUTE_NAME), object);
		} else {
			// attribute
			layoutInformationEClass = (org.eclipse.emf.ecore.EClass) layoutPackage.getEClassifier(ATTRIBUTE_LAYOUT_INFORMATION_ECLASS_NAME);
			layoutInformationModelElement = factory.create(layoutInformationEClass);
		}
		layoutInformationModelElement.eSet(layoutInformationEClass.getEStructuralFeature(START_OFFSET_EATTRIBUTE_NAME), layoutInformation.getStartOffset());
		layoutInformationModelElement.eSet(layoutInformationEClass.getEStructuralFeature(HIDDEN_TOKEN_TEXT_EATTRIBUTE_NAME), layoutInformation.getHiddenTokenText());
		layoutInformationModelElement.eSet(layoutInformationEClass.getEStructuralFeature(VISIBLE_TOKEN_TEXT_EATTRIBUTE_NAME), layoutInformation.getVisibleTokenText());
		layoutInformationModelElement.eSet(layoutInformationEClass.getEStructuralFeature(SYNTAX_ELEMENT_ID_EATTRIBUTE_NAME), org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.getSyntaxElementID(syntaxElement));
		return layoutInformationModelElement;
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleLayoutInformation createLayoutInformation(org.eclipse.emf.ecore.EObject layoutInformationModelElement) {
		Object object = null;
		org.eclipse.emf.ecore.EStructuralFeature objectFeature = layoutInformationModelElement.eClass().getEStructuralFeature(OBJECT_EATTRIBUTE_NAME);
		int startOffset = (Integer) layoutInformationModelElement.eGet(layoutInformationModelElement.eClass().getEStructuralFeature(START_OFFSET_EATTRIBUTE_NAME));
		String hiddenTokenText = (String) layoutInformationModelElement.eGet(layoutInformationModelElement.eClass().getEStructuralFeature(HIDDEN_TOKEN_TEXT_EATTRIBUTE_NAME));
		String visibleTokenText = (String) layoutInformationModelElement.eGet(layoutInformationModelElement.eClass().getEStructuralFeature(VISIBLE_TOKEN_TEXT_EATTRIBUTE_NAME));
		org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleSyntaxElement syntaxElement = org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.getSyntaxElementByID((String) layoutInformationModelElement.eGet(layoutInformationModelElement.eClass().getEStructuralFeature(SYNTAX_ELEMENT_ID_EATTRIBUTE_NAME)));
		if (objectFeature != null) {
			object = layoutInformationModelElement.eGet(objectFeature);
		} else if (syntaxElement instanceof org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddlePlaceholder) {
			org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddlePlaceholder placeholder = (org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddlePlaceholder) syntaxElement;
			org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTokenResolverFactory().createTokenResolver(placeholder.getTokenName());
			org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTokenResolveResult();
			tokenResolver.resolve(visibleTokenText, placeholder.getFeature(), result);
			object = result.getResolvedToken();
		}
		return new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleLayoutInformation(syntaxElement, object, startOffset, hiddenTokenText, visibleTokenText);
	}
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleLayoutInformationAdapter getLayoutInformationAdapter(org.eclipse.emf.ecore.EObject element) {
		for (org.eclipse.emf.common.notify.Adapter adapter : element.eAdapters()) {
			if (adapter instanceof org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleLayoutInformationAdapter) {
				return (org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleLayoutInformationAdapter) adapter;
			}
		}
		org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleLayoutInformationAdapter newAdapter = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleLayoutInformationAdapter();
		element.eAdapters().add(newAdapter);
		return newAdapter;
	}
	
	public org.eclipse.emf.ecore.EReference findLayoutReference(org.eclipse.emf.ecore.EClass eClass) {
		for (org.eclipse.emf.ecore.EReference ref : eClass.getEAllReferences()) {
			org.eclipse.emf.ecore.EClass type = ref.getEReferenceType();
			if (LAYOUT_PACKAGE_NS_URI.equals(type.getEPackage().getNsURI()) && ref.isMany() && LAYOUT_INFORMATION_ECLASS_NAME.equals(type.getName())) {
				return ref;
			}
		}
		return null;
	}
	
}
