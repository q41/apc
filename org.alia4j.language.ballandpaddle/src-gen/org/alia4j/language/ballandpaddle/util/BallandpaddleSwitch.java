/**
 */
package org.alia4j.language.ballandpaddle.util;

import org.alia4j.language.ballandpaddle.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage
 * @generated
 */
public class BallandpaddleSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BallandpaddlePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BallandpaddleSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BallandpaddlePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case BallandpaddlePackage.ROOT:
      {
        Root root = (Root)theEObject;
        T result = caseRoot(root);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.LEVEL:
      {
        Level level = (Level)theEObject;
        T result = caseLevel(level);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.BAP_OBJECT:
      {
        BAPObject bapObject = (BAPObject)theEObject;
        T result = caseBAPObject(bapObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.PADDLE:
      {
        Paddle paddle = (Paddle)theEObject;
        T result = casePaddle(paddle);
        if (result == null) result = caseBAPObject(paddle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.BALL:
      {
        Ball ball = (Ball)theEObject;
        T result = caseBall(ball);
        if (result == null) result = caseBAPObject(ball);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = caseBAPObject(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.POWER:
      {
        Power power = (Power)theEObject;
        T result = casePower(power);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.TARGET:
      {
        Target target = (Target)theEObject;
        T result = caseTarget(target);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.OBJECT_TARGET:
      {
        ObjectTarget objectTarget = (ObjectTarget)theEObject;
        T result = caseObjectTarget(objectTarget);
        if (result == null) result = caseTarget(objectTarget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.TYPE_TARGET:
      {
        TypeTarget typeTarget = (TypeTarget)theEObject;
        T result = caseTypeTarget(typeTarget);
        if (result == null) result = caseTarget(typeTarget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.BOOLEAN_EXPRESSION:
      {
        BooleanExpression booleanExpression = (BooleanExpression)theEObject;
        T result = caseBooleanExpression(booleanExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.BOOLEAN_BINARY_EXPRESSION:
      {
        BooleanBinaryExpression booleanBinaryExpression = (BooleanBinaryExpression)theEObject;
        T result = caseBooleanBinaryExpression(booleanBinaryExpression);
        if (result == null) result = caseBooleanExpression(booleanBinaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.BOOLEAN_UNARY_EXPRESSION:
      {
        BooleanUnaryExpression booleanUnaryExpression = (BooleanUnaryExpression)theEObject;
        T result = caseBooleanUnaryExpression(booleanUnaryExpression);
        if (result == null) result = caseBooleanExpression(booleanUnaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.EQ_PARAMETER:
      {
        EqParameter eqParameter = (EqParameter)theEObject;
        T result = caseEqParameter(eqParameter);
        if (result == null) result = caseBooleanBinaryExpression(eqParameter);
        if (result == null) result = caseBooleanExpression(eqParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.SMTH_PARAMETER:
      {
        SmthParameter smthParameter = (SmthParameter)theEObject;
        T result = caseSmthParameter(smthParameter);
        if (result == null) result = caseBooleanBinaryExpression(smthParameter);
        if (result == null) result = caseBooleanExpression(smthParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.SEQ_PARAMETER:
      {
        SeqParameter seqParameter = (SeqParameter)theEObject;
        T result = caseSeqParameter(seqParameter);
        if (result == null) result = caseBooleanBinaryExpression(seqParameter);
        if (result == null) result = caseBooleanExpression(seqParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.LTH_PARAMETER:
      {
        LthParameter lthParameter = (LthParameter)theEObject;
        T result = caseLthParameter(lthParameter);
        if (result == null) result = caseBooleanBinaryExpression(lthParameter);
        if (result == null) result = caseBooleanExpression(lthParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.LEQ_PARAMETER:
      {
        LeqParameter leqParameter = (LeqParameter)theEObject;
        T result = caseLeqParameter(leqParameter);
        if (result == null) result = caseBooleanBinaryExpression(leqParameter);
        if (result == null) result = caseBooleanExpression(leqParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.NEQ_PARAMETER:
      {
        NeqParameter neqParameter = (NeqParameter)theEObject;
        T result = caseNeqParameter(neqParameter);
        if (result == null) result = caseBooleanBinaryExpression(neqParameter);
        if (result == null) result = caseBooleanExpression(neqParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.OR_PARAMETER:
      {
        OrParameter orParameter = (OrParameter)theEObject;
        T result = caseOrParameter(orParameter);
        if (result == null) result = caseBooleanBinaryExpression(orParameter);
        if (result == null) result = caseBooleanExpression(orParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.AND_PARAMETER:
      {
        AndParameter andParameter = (AndParameter)theEObject;
        T result = caseAndParameter(andParameter);
        if (result == null) result = caseBooleanBinaryExpression(andParameter);
        if (result == null) result = caseBooleanExpression(andParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.BRACKET_PARAMETER:
      {
        BracketParameter bracketParameter = (BracketParameter)theEObject;
        T result = caseBracketParameter(bracketParameter);
        if (result == null) result = caseBooleanUnaryExpression(bracketParameter);
        if (result == null) result = caseBooleanExpression(bracketParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.NEG_PARAMETER:
      {
        NegParameter negParameter = (NegParameter)theEObject;
        T result = caseNegParameter(negParameter);
        if (result == null) result = caseBooleanUnaryExpression(negParameter);
        if (result == null) result = caseBooleanExpression(negParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.ATT_PARAMETER:
      {
        AttParameter attParameter = (AttParameter)theEObject;
        T result = caseAttParameter(attParameter);
        if (result == null) result = caseBooleanExpression(attParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.INT_VALUE_PARAMETER:
      {
        IntValueParameter intValueParameter = (IntValueParameter)theEObject;
        T result = caseIntValueParameter(intValueParameter);
        if (result == null) result = caseBooleanExpression(intValueParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.DOUBLE_VALUE_PARAMETER:
      {
        DoubleValueParameter doubleValueParameter = (DoubleValueParameter)theEObject;
        T result = caseDoubleValueParameter(doubleValueParameter);
        if (result == null) result = caseBooleanExpression(doubleValueParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.EFFECT:
      {
        Effect effect = (Effect)theEObject;
        T result = caseEffect(effect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.BINARY_EXPRESSION:
      {
        BinaryExpression binaryExpression = (BinaryExpression)theEObject;
        T result = caseBinaryExpression(binaryExpression);
        if (result == null) result = caseExpression(binaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.UNARY_EXPRESSION:
      {
        UnaryExpression unaryExpression = (UnaryExpression)theEObject;
        T result = caseUnaryExpression(unaryExpression);
        if (result == null) result = caseExpression(unaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.MULT_EXPRESSION:
      {
        MultExpression multExpression = (MultExpression)theEObject;
        T result = caseMultExpression(multExpression);
        if (result == null) result = caseBinaryExpression(multExpression);
        if (result == null) result = caseExpression(multExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.DIV_EXPRESSION:
      {
        DivExpression divExpression = (DivExpression)theEObject;
        T result = caseDivExpression(divExpression);
        if (result == null) result = caseBinaryExpression(divExpression);
        if (result == null) result = caseExpression(divExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.PLUS_EXPRESSION:
      {
        PlusExpression plusExpression = (PlusExpression)theEObject;
        T result = casePlusExpression(plusExpression);
        if (result == null) result = caseBinaryExpression(plusExpression);
        if (result == null) result = caseExpression(plusExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.MINUS_EXPRESSION:
      {
        MinusExpression minusExpression = (MinusExpression)theEObject;
        T result = caseMinusExpression(minusExpression);
        if (result == null) result = caseBinaryExpression(minusExpression);
        if (result == null) result = caseExpression(minusExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.BRACKET_EXPRESSION:
      {
        BracketExpression bracketExpression = (BracketExpression)theEObject;
        T result = caseBracketExpression(bracketExpression);
        if (result == null) result = caseUnaryExpression(bracketExpression);
        if (result == null) result = caseExpression(bracketExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.NEG_EXPRESSION:
      {
        NegExpression negExpression = (NegExpression)theEObject;
        T result = caseNegExpression(negExpression);
        if (result == null) result = caseUnaryExpression(negExpression);
        if (result == null) result = caseExpression(negExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.INT_OPERAND:
      {
        IntOperand intOperand = (IntOperand)theEObject;
        T result = caseIntOperand(intOperand);
        if (result == null) result = caseExpression(intOperand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.DOUBLE_OPERAND:
      {
        DoubleOperand doubleOperand = (DoubleOperand)theEObject;
        T result = caseDoubleOperand(doubleOperand);
        if (result == null) result = caseExpression(doubleOperand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BallandpaddlePackage.ATT_OPERAND:
      {
        AttOperand attOperand = (AttOperand)theEObject;
        T result = caseAttOperand(attOperand);
        if (result == null) result = caseExpression(attOperand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoot(Root object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Level</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Level</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLevel(Level object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BAP Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BAP Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBAPObject(BAPObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Paddle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Paddle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePaddle(Paddle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ball</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ball</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBall(Ball object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlock(Block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Power</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Power</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePower(Power object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTarget(Target object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectTarget(ObjectTarget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeTarget(TypeTarget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanExpression(BooleanExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Binary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Binary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanBinaryExpression(BooleanBinaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Unary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Unary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanUnaryExpression(BooleanUnaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Eq Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Eq Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEqParameter(EqParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Smth Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Smth Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSmthParameter(SmthParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seq Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seq Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeqParameter(SeqParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lth Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lth Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLthParameter(LthParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Leq Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Leq Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeqParameter(LeqParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Neq Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Neq Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNeqParameter(NeqParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrParameter(OrParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndParameter(AndParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bracket Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bracket Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBracketParameter(BracketParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Neg Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Neg Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNegParameter(NegParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Att Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Att Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttParameter(AttParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Value Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Value Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntValueParameter(IntValueParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Value Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Value Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleValueParameter(DoubleValueParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Effect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Effect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEffect(Effect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryExpression(BinaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryExpression(UnaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mult Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mult Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultExpression(MultExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Div Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Div Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDivExpression(DivExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlusExpression(PlusExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Minus Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Minus Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinusExpression(MinusExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bracket Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bracket Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBracketExpression(BracketExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Neg Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Neg Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNegExpression(NegExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Operand</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Operand</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntOperand(IntOperand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Operand</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Operand</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleOperand(DoubleOperand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Att Operand</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Att Operand</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttOperand(AttOperand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //BallandpaddleSwitch
