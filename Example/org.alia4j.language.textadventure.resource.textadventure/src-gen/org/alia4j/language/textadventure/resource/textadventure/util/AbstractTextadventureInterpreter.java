/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractTextadventureInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<org.alia4j.language.textadventure.resource.textadventure.ITextadventureInterpreterListener> listeners = new java.util.ArrayList<org.alia4j.language.textadventure.resource.textadventure.ITextadventureInterpreterListener>();
	private org.eclipse.emf.ecore.EObject nextObjectToInterprete;
	private Object currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		org.eclipse.emf.ecore.EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (java.util.EmptyStackException ese) {
				// this can happen when the interpreter was terminated between the call to empty()
				// and pop()
				break;
			}
			nextObjectToInterprete = next;
			notifyListeners(next);
			result = interprete(next, context);
			if (!continueInterpretation(context, result)) {
				break;
			}
		}
		currentContext = null;
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ContextType context, ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof org.alia4j.language.textadventure.World) {
			result = interprete_org_alia4j_language_textadventure_World((org.alia4j.language.textadventure.World) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.textadventure.Tile) {
			result = interprete_org_alia4j_language_textadventure_Tile((org.alia4j.language.textadventure.Tile) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.textadventure.Item) {
			result = interprete_org_alia4j_language_textadventure_Item((org.alia4j.language.textadventure.Item) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.textadventure.Binding) {
			result = interprete_org_alia4j_language_textadventure_Binding((org.alia4j.language.textadventure.Binding) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.textadventure.WhileEffect) {
			result = interprete_org_alia4j_language_textadventure_WhileEffect((org.alia4j.language.textadventure.WhileEffect) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.textadventure.Effect) {
			result = interprete_org_alia4j_language_textadventure_Effect((org.alia4j.language.textadventure.Effect) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.textadventure.RemoveAction) {
			result = interprete_org_alia4j_language_textadventure_RemoveAction((org.alia4j.language.textadventure.RemoveAction) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.textadventure.Action) {
			result = interprete_org_alia4j_language_textadventure_Action((org.alia4j.language.textadventure.Action) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.textadventure.List) {
			result = interprete_org_alia4j_language_textadventure_List((org.alia4j.language.textadventure.List) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.textadventure.Person) {
			result = interprete_org_alia4j_language_textadventure_Person((org.alia4j.language.textadventure.Person) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.textadventure.IgnoreItemAbility) {
			result = interprete_org_alia4j_language_textadventure_IgnoreItemAbility((org.alia4j.language.textadventure.IgnoreItemAbility) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.textadventure.Ability) {
			result = interprete_org_alia4j_language_textadventure_Ability((org.alia4j.language.textadventure.Ability) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_org_alia4j_language_textadventure_World(org.alia4j.language.textadventure.World world, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_textadventure_Tile(org.alia4j.language.textadventure.Tile tile, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_textadventure_Item(org.alia4j.language.textadventure.Item item, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_textadventure_Binding(org.alia4j.language.textadventure.Binding binding, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_textadventure_Effect(org.alia4j.language.textadventure.Effect effect, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_textadventure_WhileEffect(org.alia4j.language.textadventure.WhileEffect whileEffect, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_textadventure_Action(org.alia4j.language.textadventure.Action action, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_textadventure_RemoveAction(org.alia4j.language.textadventure.RemoveAction removeAction, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_textadventure_List(org.alia4j.language.textadventure.List list, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_textadventure_Person(org.alia4j.language.textadventure.Person person, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_textadventure_Ability(org.alia4j.language.textadventure.Ability ability, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_textadventure_IgnoreItemAbility(org.alia4j.language.textadventure.IgnoreItemAbility ignoreItemAbility, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (org.alia4j.language.textadventure.resource.textadventure.ITextadventureInterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		for (org.eclipse.emf.ecore.EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		java.util.List<org.eclipse.emf.ecore.EObject> reverse = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>(objects.size());
		reverse.addAll(objects);
		java.util.Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(org.eclipse.emf.ecore.EObject root) {
		java.util.List<org.eclipse.emf.ecore.EObject> objects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		objects.add(root);
		java.util.Iterator<org.eclipse.emf.ecore.EObject> it = root.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(org.alia4j.language.textadventure.resource.textadventure.ITextadventureInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(org.alia4j.language.textadventure.resource.textadventure.ITextadventureInterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public org.eclipse.emf.ecore.EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public java.util.Stack<org.eclipse.emf.ecore.EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public Object getCurrentContext() {
		return currentContext;
	}
	
}
