/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.util;

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
public class AbstractBallandpaddleInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleInterpreterListener> listeners = new java.util.ArrayList<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleInterpreterListener>();
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
		if (object instanceof org.alia4j.language.ballandpaddle.Root) {
			result = interprete_org_alia4j_language_ballandpaddle_Root((org.alia4j.language.ballandpaddle.Root) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.Level) {
			result = interprete_org_alia4j_language_ballandpaddle_Level((org.alia4j.language.ballandpaddle.Level) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.Paddle) {
			result = interprete_org_alia4j_language_ballandpaddle_Paddle((org.alia4j.language.ballandpaddle.Paddle) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.Ball) {
			result = interprete_org_alia4j_language_ballandpaddle_Ball((org.alia4j.language.ballandpaddle.Ball) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.Block) {
			result = interprete_org_alia4j_language_ballandpaddle_Block((org.alia4j.language.ballandpaddle.Block) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.BAPObject) {
			result = interprete_org_alia4j_language_ballandpaddle_BAPObject((org.alia4j.language.ballandpaddle.BAPObject) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.Power) {
			result = interprete_org_alia4j_language_ballandpaddle_Power((org.alia4j.language.ballandpaddle.Power) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.ObjectTarget) {
			result = interprete_org_alia4j_language_ballandpaddle_ObjectTarget((org.alia4j.language.ballandpaddle.ObjectTarget) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.TypeTarget) {
			result = interprete_org_alia4j_language_ballandpaddle_TypeTarget((org.alia4j.language.ballandpaddle.TypeTarget) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.Target) {
			result = interprete_org_alia4j_language_ballandpaddle_Target((org.alia4j.language.ballandpaddle.Target) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.EqParameter) {
			result = interprete_org_alia4j_language_ballandpaddle_EqParameter((org.alia4j.language.ballandpaddle.EqParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.SmthParameter) {
			result = interprete_org_alia4j_language_ballandpaddle_SmthParameter((org.alia4j.language.ballandpaddle.SmthParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.LthParameter) {
			result = interprete_org_alia4j_language_ballandpaddle_LthParameter((org.alia4j.language.ballandpaddle.LthParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.LeqParameter) {
			result = interprete_org_alia4j_language_ballandpaddle_LeqParameter((org.alia4j.language.ballandpaddle.LeqParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.NeqParameter) {
			result = interprete_org_alia4j_language_ballandpaddle_NeqParameter((org.alia4j.language.ballandpaddle.NeqParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.AndParameter) {
			result = interprete_org_alia4j_language_ballandpaddle_AndParameter((org.alia4j.language.ballandpaddle.AndParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.BooleanBinaryExpression) {
			result = interprete_org_alia4j_language_ballandpaddle_BooleanBinaryExpression((org.alia4j.language.ballandpaddle.BooleanBinaryExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.BracketParameter) {
			result = interprete_org_alia4j_language_ballandpaddle_BracketParameter((org.alia4j.language.ballandpaddle.BracketParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.NegParameter) {
			result = interprete_org_alia4j_language_ballandpaddle_NegParameter((org.alia4j.language.ballandpaddle.NegParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.BooleanUnaryExpression) {
			result = interprete_org_alia4j_language_ballandpaddle_BooleanUnaryExpression((org.alia4j.language.ballandpaddle.BooleanUnaryExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.SeqParameter) {
			result = interprete_org_alia4j_language_ballandpaddle_SeqParameter((org.alia4j.language.ballandpaddle.SeqParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.OrParameter) {
			result = interprete_org_alia4j_language_ballandpaddle_OrParameter((org.alia4j.language.ballandpaddle.OrParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.AttParameter) {
			result = interprete_org_alia4j_language_ballandpaddle_AttParameter((org.alia4j.language.ballandpaddle.AttParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.IntValueParameter) {
			result = interprete_org_alia4j_language_ballandpaddle_IntValueParameter((org.alia4j.language.ballandpaddle.IntValueParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.DoubleValueParameter) {
			result = interprete_org_alia4j_language_ballandpaddle_DoubleValueParameter((org.alia4j.language.ballandpaddle.DoubleValueParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.BooleanExpression) {
			result = interprete_org_alia4j_language_ballandpaddle_BooleanExpression((org.alia4j.language.ballandpaddle.BooleanExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.Effect) {
			result = interprete_org_alia4j_language_ballandpaddle_Effect((org.alia4j.language.ballandpaddle.Effect) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.BinaryExpression) {
			result = interprete_org_alia4j_language_ballandpaddle_BinaryExpression((org.alia4j.language.ballandpaddle.BinaryExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.UnaryExpression) {
			result = interprete_org_alia4j_language_ballandpaddle_UnaryExpression((org.alia4j.language.ballandpaddle.UnaryExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.MultExpression) {
			result = interprete_org_alia4j_language_ballandpaddle_MultExpression((org.alia4j.language.ballandpaddle.MultExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.DivExpression) {
			result = interprete_org_alia4j_language_ballandpaddle_DivExpression((org.alia4j.language.ballandpaddle.DivExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.PlusExpression) {
			result = interprete_org_alia4j_language_ballandpaddle_PlusExpression((org.alia4j.language.ballandpaddle.PlusExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.MinusExpression) {
			result = interprete_org_alia4j_language_ballandpaddle_MinusExpression((org.alia4j.language.ballandpaddle.MinusExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.BracketExpression) {
			result = interprete_org_alia4j_language_ballandpaddle_BracketExpression((org.alia4j.language.ballandpaddle.BracketExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.NegExpression) {
			result = interprete_org_alia4j_language_ballandpaddle_NegExpression((org.alia4j.language.ballandpaddle.NegExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.IntOperand) {
			result = interprete_org_alia4j_language_ballandpaddle_IntOperand((org.alia4j.language.ballandpaddle.IntOperand) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.DoubleOperand) {
			result = interprete_org_alia4j_language_ballandpaddle_DoubleOperand((org.alia4j.language.ballandpaddle.DoubleOperand) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.AttOperand) {
			result = interprete_org_alia4j_language_ballandpaddle_AttOperand((org.alia4j.language.ballandpaddle.AttOperand) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.alia4j.language.ballandpaddle.Expression) {
			result = interprete_org_alia4j_language_ballandpaddle_Expression((org.alia4j.language.ballandpaddle.Expression) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_Root(org.alia4j.language.ballandpaddle.Root root, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_Level(org.alia4j.language.ballandpaddle.Level level, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_BAPObject(org.alia4j.language.ballandpaddle.BAPObject bAPObject, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_Paddle(org.alia4j.language.ballandpaddle.Paddle paddle, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_Ball(org.alia4j.language.ballandpaddle.Ball ball, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_Block(org.alia4j.language.ballandpaddle.Block block, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_Power(org.alia4j.language.ballandpaddle.Power power, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_Target(org.alia4j.language.ballandpaddle.Target target, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_ObjectTarget(org.alia4j.language.ballandpaddle.ObjectTarget objectTarget, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_TypeTarget(org.alia4j.language.ballandpaddle.TypeTarget typeTarget, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_BooleanExpression(org.alia4j.language.ballandpaddle.BooleanExpression booleanExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_BooleanBinaryExpression(org.alia4j.language.ballandpaddle.BooleanBinaryExpression booleanBinaryExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_BooleanUnaryExpression(org.alia4j.language.ballandpaddle.BooleanUnaryExpression booleanUnaryExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_EqParameter(org.alia4j.language.ballandpaddle.EqParameter eqParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_SmthParameter(org.alia4j.language.ballandpaddle.SmthParameter smthParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_SeqParameter(org.alia4j.language.ballandpaddle.SeqParameter seqParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_LthParameter(org.alia4j.language.ballandpaddle.LthParameter lthParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_LeqParameter(org.alia4j.language.ballandpaddle.LeqParameter leqParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_NeqParameter(org.alia4j.language.ballandpaddle.NeqParameter neqParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_OrParameter(org.alia4j.language.ballandpaddle.OrParameter orParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_AndParameter(org.alia4j.language.ballandpaddle.AndParameter andParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_BracketParameter(org.alia4j.language.ballandpaddle.BracketParameter bracketParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_NegParameter(org.alia4j.language.ballandpaddle.NegParameter negParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_AttParameter(org.alia4j.language.ballandpaddle.AttParameter attParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_IntValueParameter(org.alia4j.language.ballandpaddle.IntValueParameter intValueParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_DoubleValueParameter(org.alia4j.language.ballandpaddle.DoubleValueParameter doubleValueParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_Effect(org.alia4j.language.ballandpaddle.Effect effect, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_Expression(org.alia4j.language.ballandpaddle.Expression expression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_BinaryExpression(org.alia4j.language.ballandpaddle.BinaryExpression binaryExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_UnaryExpression(org.alia4j.language.ballandpaddle.UnaryExpression unaryExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_MultExpression(org.alia4j.language.ballandpaddle.MultExpression multExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_DivExpression(org.alia4j.language.ballandpaddle.DivExpression divExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_PlusExpression(org.alia4j.language.ballandpaddle.PlusExpression plusExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_MinusExpression(org.alia4j.language.ballandpaddle.MinusExpression minusExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_BracketExpression(org.alia4j.language.ballandpaddle.BracketExpression bracketExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_NegExpression(org.alia4j.language.ballandpaddle.NegExpression negExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_IntOperand(org.alia4j.language.ballandpaddle.IntOperand intOperand, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_DoubleOperand(org.alia4j.language.ballandpaddle.DoubleOperand doubleOperand, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_alia4j_language_ballandpaddle_AttOperand(org.alia4j.language.ballandpaddle.AttOperand attOperand, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleInterpreterListener listener : listeners) {
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
	
	public void addListener(org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleInterpreterListener listener) {
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
