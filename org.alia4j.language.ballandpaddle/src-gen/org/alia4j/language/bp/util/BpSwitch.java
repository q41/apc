/**
 */
package org.alia4j.language.bp.util;

import org.alia4j.language.bp.*;

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
 * @see org.alia4j.language.bp.BpPackage
 * @generated
 */
public class BpSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BpPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BpSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BpPackage.eINSTANCE;
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
      case BpPackage.ROOT:
      {
        Root root = (Root)theEObject;
        T result = caseRoot(root);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.LEVEL:
      {
        Level level = (Level)theEObject;
        T result = caseLevel(level);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.BP_OBJECT:
      {
        BPObject bpObject = (BPObject)theEObject;
        T result = caseBPObject(bpObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.PADDLE:
      {
        Paddle paddle = (Paddle)theEObject;
        T result = casePaddle(paddle);
        if (result == null) result = caseBPObject(paddle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.BALL:
      {
        Ball ball = (Ball)theEObject;
        T result = caseBall(ball);
        if (result == null) result = caseBPObject(ball);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = caseBPObject(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.POWER:
      {
        Power power = (Power)theEObject;
        T result = casePower(power);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.TARGET:
      {
        Target target = (Target)theEObject;
        T result = caseTarget(target);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.OBJECT_TARGET:
      {
        ObjectTarget objectTarget = (ObjectTarget)theEObject;
        T result = caseObjectTarget(objectTarget);
        if (result == null) result = caseTarget(objectTarget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.CLASS_TARGET:
      {
        ClassTarget classTarget = (ClassTarget)theEObject;
        T result = caseClassTarget(classTarget);
        if (result == null) result = caseTarget(classTarget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.EFFECT:
      {
        Effect effect = (Effect)theEObject;
        T result = caseEffect(effect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.GENERAL_EFFECT:
      {
        GeneralEffect generalEffect = (GeneralEffect)theEObject;
        T result = caseGeneralEffect(generalEffect);
        if (result == null) result = caseEffect(generalEffect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.COLLISION_EFFECT:
      {
        CollisionEffect collisionEffect = (CollisionEffect)theEObject;
        T result = caseCollisionEffect(collisionEffect);
        if (result == null) result = caseEffect(collisionEffect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.EFFECT_BODY:
      {
        EffectBody effectBody = (EffectBody)theEObject;
        T result = caseEffectBody(effectBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.GENERAL_EFFECT_BODY:
      {
        GeneralEffectBody generalEffectBody = (GeneralEffectBody)theEObject;
        T result = caseGeneralEffectBody(generalEffectBody);
        if (result == null) result = caseEffectBody(generalEffectBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.COLLISION_EFFECT_BODY:
      {
        CollisionEffectBody collisionEffectBody = (CollisionEffectBody)theEObject;
        T result = caseCollisionEffectBody(collisionEffectBody);
        if (result == null) result = caseEffectBody(collisionEffectBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.COLLISION_EXPRESSION:
      {
        CollisionExpression collisionExpression = (CollisionExpression)theEObject;
        T result = caseCollisionExpression(collisionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.BINARY_COLLISION_EXPRESSION:
      {
        BinaryCollisionExpression binaryCollisionExpression = (BinaryCollisionExpression)theEObject;
        T result = caseBinaryCollisionExpression(binaryCollisionExpression);
        if (result == null) result = caseCollisionExpression(binaryCollisionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.UNARY_COLLISION_EXPRESSION:
      {
        UnaryCollisionExpression unaryCollisionExpression = (UnaryCollisionExpression)theEObject;
        T result = caseUnaryCollisionExpression(unaryCollisionExpression);
        if (result == null) result = caseCollisionExpression(unaryCollisionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.EQ_COLLISION_EXPRESSION:
      {
        EqCollisionExpression eqCollisionExpression = (EqCollisionExpression)theEObject;
        T result = caseEqCollisionExpression(eqCollisionExpression);
        if (result == null) result = caseBinaryCollisionExpression(eqCollisionExpression);
        if (result == null) result = caseCollisionExpression(eqCollisionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.SMTH_COLLISION_EXPRESSION:
      {
        SmthCollisionExpression smthCollisionExpression = (SmthCollisionExpression)theEObject;
        T result = caseSmthCollisionExpression(smthCollisionExpression);
        if (result == null) result = caseBinaryCollisionExpression(smthCollisionExpression);
        if (result == null) result = caseCollisionExpression(smthCollisionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.SEQ_COLLISION_EXPRESSION:
      {
        SeqCollisionExpression seqCollisionExpression = (SeqCollisionExpression)theEObject;
        T result = caseSeqCollisionExpression(seqCollisionExpression);
        if (result == null) result = caseBinaryCollisionExpression(seqCollisionExpression);
        if (result == null) result = caseCollisionExpression(seqCollisionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.LTH_COLLISION_EXPRESSION:
      {
        LthCollisionExpression lthCollisionExpression = (LthCollisionExpression)theEObject;
        T result = caseLthCollisionExpression(lthCollisionExpression);
        if (result == null) result = caseBinaryCollisionExpression(lthCollisionExpression);
        if (result == null) result = caseCollisionExpression(lthCollisionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.LEQ_COLLISION_EXPRESSION:
      {
        LeqCollisionExpression leqCollisionExpression = (LeqCollisionExpression)theEObject;
        T result = caseLeqCollisionExpression(leqCollisionExpression);
        if (result == null) result = caseBinaryCollisionExpression(leqCollisionExpression);
        if (result == null) result = caseCollisionExpression(leqCollisionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.NEQ_COLLISION_EXPRESSION:
      {
        NeqCollisionExpression neqCollisionExpression = (NeqCollisionExpression)theEObject;
        T result = caseNeqCollisionExpression(neqCollisionExpression);
        if (result == null) result = caseBinaryCollisionExpression(neqCollisionExpression);
        if (result == null) result = caseCollisionExpression(neqCollisionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.OR_COLLISION_EXPRESSION:
      {
        OrCollisionExpression orCollisionExpression = (OrCollisionExpression)theEObject;
        T result = caseOrCollisionExpression(orCollisionExpression);
        if (result == null) result = caseBinaryCollisionExpression(orCollisionExpression);
        if (result == null) result = caseCollisionExpression(orCollisionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.AND_COLLISION_EXPRESSION:
      {
        AndCollisionExpression andCollisionExpression = (AndCollisionExpression)theEObject;
        T result = caseAndCollisionExpression(andCollisionExpression);
        if (result == null) result = caseBinaryCollisionExpression(andCollisionExpression);
        if (result == null) result = caseCollisionExpression(andCollisionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.MULT_COLLISION_EXPRESSION:
      {
        MultCollisionExpression multCollisionExpression = (MultCollisionExpression)theEObject;
        T result = caseMultCollisionExpression(multCollisionExpression);
        if (result == null) result = caseBinaryCollisionExpression(multCollisionExpression);
        if (result == null) result = caseCollisionExpression(multCollisionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.DIV_COLLISION_EXPRESSION:
      {
        DivCollisionExpression divCollisionExpression = (DivCollisionExpression)theEObject;
        T result = caseDivCollisionExpression(divCollisionExpression);
        if (result == null) result = caseBinaryCollisionExpression(divCollisionExpression);
        if (result == null) result = caseCollisionExpression(divCollisionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.PLUS_COLLISION_EXPRESSION:
      {
        PlusCollisionExpression plusCollisionExpression = (PlusCollisionExpression)theEObject;
        T result = casePlusCollisionExpression(plusCollisionExpression);
        if (result == null) result = caseBinaryCollisionExpression(plusCollisionExpression);
        if (result == null) result = caseCollisionExpression(plusCollisionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.MINUS_COLLISION_EXPRESSION:
      {
        MinusCollisionExpression minusCollisionExpression = (MinusCollisionExpression)theEObject;
        T result = caseMinusCollisionExpression(minusCollisionExpression);
        if (result == null) result = caseBinaryCollisionExpression(minusCollisionExpression);
        if (result == null) result = caseCollisionExpression(minusCollisionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.BRACKET_COLLISION_EXPRESSION:
      {
        BracketCollisionExpression bracketCollisionExpression = (BracketCollisionExpression)theEObject;
        T result = caseBracketCollisionExpression(bracketCollisionExpression);
        if (result == null) result = caseUnaryCollisionExpression(bracketCollisionExpression);
        if (result == null) result = caseCollisionExpression(bracketCollisionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.NEG_COLLISION_EXPRESSION:
      {
        NegCollisionExpression negCollisionExpression = (NegCollisionExpression)theEObject;
        T result = caseNegCollisionExpression(negCollisionExpression);
        if (result == null) result = caseUnaryCollisionExpression(negCollisionExpression);
        if (result == null) result = caseCollisionExpression(negCollisionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.NOT_COLLISION_EXPRESSION:
      {
        NotCollisionExpression notCollisionExpression = (NotCollisionExpression)theEObject;
        T result = caseNotCollisionExpression(notCollisionExpression);
        if (result == null) result = caseUnaryCollisionExpression(notCollisionExpression);
        if (result == null) result = caseCollisionExpression(notCollisionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.INT_COLLISION_OPERAND:
      {
        IntCollisionOperand intCollisionOperand = (IntCollisionOperand)theEObject;
        T result = caseIntCollisionOperand(intCollisionOperand);
        if (result == null) result = caseCollisionExpression(intCollisionOperand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.DOUBLE_COLLISION_OPERAND:
      {
        DoubleCollisionOperand doubleCollisionOperand = (DoubleCollisionOperand)theEObject;
        T result = caseDoubleCollisionOperand(doubleCollisionOperand);
        if (result == null) result = caseCollisionExpression(doubleCollisionOperand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.BOOL_COLLISION_OPERAND:
      {
        BoolCollisionOperand boolCollisionOperand = (BoolCollisionOperand)theEObject;
        T result = caseBoolCollisionOperand(boolCollisionOperand);
        if (result == null) result = caseCollisionExpression(boolCollisionOperand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.ATT_COLLISION_OPERAND:
      {
        AttCollisionOperand attCollisionOperand = (AttCollisionOperand)theEObject;
        T result = caseAttCollisionOperand(attCollisionOperand);
        if (result == null) result = caseCollisionExpression(attCollisionOperand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.BINARY_EXPRESSION:
      {
        BinaryExpression binaryExpression = (BinaryExpression)theEObject;
        T result = caseBinaryExpression(binaryExpression);
        if (result == null) result = caseExpression(binaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.UNARY_EXPRESSION:
      {
        UnaryExpression unaryExpression = (UnaryExpression)theEObject;
        T result = caseUnaryExpression(unaryExpression);
        if (result == null) result = caseExpression(unaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.EQ_EXPRESSION:
      {
        EqExpression eqExpression = (EqExpression)theEObject;
        T result = caseEqExpression(eqExpression);
        if (result == null) result = caseBinaryExpression(eqExpression);
        if (result == null) result = caseExpression(eqExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.SMTH_EXPRESSION:
      {
        SmthExpression smthExpression = (SmthExpression)theEObject;
        T result = caseSmthExpression(smthExpression);
        if (result == null) result = caseBinaryExpression(smthExpression);
        if (result == null) result = caseExpression(smthExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.SEQ_EXPRESSION:
      {
        SeqExpression seqExpression = (SeqExpression)theEObject;
        T result = caseSeqExpression(seqExpression);
        if (result == null) result = caseBinaryExpression(seqExpression);
        if (result == null) result = caseExpression(seqExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.LTH_EXPRESSION:
      {
        LthExpression lthExpression = (LthExpression)theEObject;
        T result = caseLthExpression(lthExpression);
        if (result == null) result = caseBinaryExpression(lthExpression);
        if (result == null) result = caseExpression(lthExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.LEQ_EXPRESSION:
      {
        LeqExpression leqExpression = (LeqExpression)theEObject;
        T result = caseLeqExpression(leqExpression);
        if (result == null) result = caseBinaryExpression(leqExpression);
        if (result == null) result = caseExpression(leqExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.NEQ_EXPRESSION:
      {
        NeqExpression neqExpression = (NeqExpression)theEObject;
        T result = caseNeqExpression(neqExpression);
        if (result == null) result = caseBinaryExpression(neqExpression);
        if (result == null) result = caseExpression(neqExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.OR_EXPRESSION:
      {
        OrExpression orExpression = (OrExpression)theEObject;
        T result = caseOrExpression(orExpression);
        if (result == null) result = caseBinaryExpression(orExpression);
        if (result == null) result = caseExpression(orExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.AND_EXPRESSION:
      {
        AndExpression andExpression = (AndExpression)theEObject;
        T result = caseAndExpression(andExpression);
        if (result == null) result = caseBinaryExpression(andExpression);
        if (result == null) result = caseExpression(andExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.MULT_EXPRESSION:
      {
        MultExpression multExpression = (MultExpression)theEObject;
        T result = caseMultExpression(multExpression);
        if (result == null) result = caseBinaryExpression(multExpression);
        if (result == null) result = caseExpression(multExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.DIV_EXPRESSION:
      {
        DivExpression divExpression = (DivExpression)theEObject;
        T result = caseDivExpression(divExpression);
        if (result == null) result = caseBinaryExpression(divExpression);
        if (result == null) result = caseExpression(divExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.PLUS_EXPRESSION:
      {
        PlusExpression plusExpression = (PlusExpression)theEObject;
        T result = casePlusExpression(plusExpression);
        if (result == null) result = caseBinaryExpression(plusExpression);
        if (result == null) result = caseExpression(plusExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.MINUS_EXPRESSION:
      {
        MinusExpression minusExpression = (MinusExpression)theEObject;
        T result = caseMinusExpression(minusExpression);
        if (result == null) result = caseBinaryExpression(minusExpression);
        if (result == null) result = caseExpression(minusExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.BRACKET_EXPRESSION:
      {
        BracketExpression bracketExpression = (BracketExpression)theEObject;
        T result = caseBracketExpression(bracketExpression);
        if (result == null) result = caseUnaryExpression(bracketExpression);
        if (result == null) result = caseExpression(bracketExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.NEG_EXPRESSION:
      {
        NegExpression negExpression = (NegExpression)theEObject;
        T result = caseNegExpression(negExpression);
        if (result == null) result = caseUnaryExpression(negExpression);
        if (result == null) result = caseExpression(negExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.NOT_EXPRESSION:
      {
        NotExpression notExpression = (NotExpression)theEObject;
        T result = caseNotExpression(notExpression);
        if (result == null) result = caseUnaryExpression(notExpression);
        if (result == null) result = caseExpression(notExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.ATT_OPERAND:
      {
        AttOperand attOperand = (AttOperand)theEObject;
        T result = caseAttOperand(attOperand);
        if (result == null) result = caseExpression(attOperand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.INT_OPERAND:
      {
        IntOperand intOperand = (IntOperand)theEObject;
        T result = caseIntOperand(intOperand);
        if (result == null) result = caseExpression(intOperand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.DOUBLE_OPERAND:
      {
        DoubleOperand doubleOperand = (DoubleOperand)theEObject;
        T result = caseDoubleOperand(doubleOperand);
        if (result == null) result = caseExpression(doubleOperand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BpPackage.BOOLEAN_OPERAND:
      {
        BooleanOperand booleanOperand = (BooleanOperand)theEObject;
        T result = caseBooleanOperand(booleanOperand);
        if (result == null) result = caseExpression(booleanOperand);
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
   * Returns the result of interpreting the object as an instance of '<em>BP Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BP Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBPObject(BPObject object)
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
   * Returns the result of interpreting the object as an instance of '<em>Class Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassTarget(ClassTarget object)
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
   * Returns the result of interpreting the object as an instance of '<em>General Effect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>General Effect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeneralEffect(GeneralEffect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collision Effect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collision Effect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollisionEffect(CollisionEffect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Effect Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Effect Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEffectBody(EffectBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>General Effect Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>General Effect Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeneralEffectBody(GeneralEffectBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collision Effect Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collision Effect Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollisionEffectBody(CollisionEffectBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collision Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollisionExpression(CollisionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Collision Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryCollisionExpression(BinaryCollisionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Collision Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryCollisionExpression(UnaryCollisionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Eq Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Eq Collision Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEqCollisionExpression(EqCollisionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Smth Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Smth Collision Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSmthCollisionExpression(SmthCollisionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seq Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seq Collision Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeqCollisionExpression(SeqCollisionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lth Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lth Collision Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLthCollisionExpression(LthCollisionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Leq Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Leq Collision Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeqCollisionExpression(LeqCollisionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Neq Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Neq Collision Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNeqCollisionExpression(NeqCollisionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Collision Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrCollisionExpression(OrCollisionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Collision Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndCollisionExpression(AndCollisionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mult Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mult Collision Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultCollisionExpression(MultCollisionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Div Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Div Collision Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDivCollisionExpression(DivCollisionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus Collision Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlusCollisionExpression(PlusCollisionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Minus Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Minus Collision Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinusCollisionExpression(MinusCollisionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bracket Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bracket Collision Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBracketCollisionExpression(BracketCollisionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Neg Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Neg Collision Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNegCollisionExpression(NegCollisionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not Collision Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotCollisionExpression(NotCollisionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Collision Operand</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Collision Operand</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntCollisionOperand(IntCollisionOperand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Collision Operand</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Collision Operand</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleCollisionOperand(DoubleCollisionOperand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Collision Operand</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Collision Operand</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolCollisionOperand(BoolCollisionOperand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Att Collision Operand</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Att Collision Operand</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttCollisionOperand(AttCollisionOperand object)
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
   * Returns the result of interpreting the object as an instance of '<em>Eq Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Eq Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEqExpression(EqExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Smth Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Smth Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSmthExpression(SmthExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seq Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seq Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeqExpression(SeqExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lth Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lth Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLthExpression(LthExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Leq Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Leq Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeqExpression(LeqExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Neq Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Neq Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNeqExpression(NeqExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrExpression(OrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndExpression(AndExpression object)
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
   * Returns the result of interpreting the object as an instance of '<em>Not Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotExpression(NotExpression object)
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
   * Returns the result of interpreting the object as an instance of '<em>Boolean Operand</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Operand</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanOperand(BooleanOperand object)
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

} //BpSwitch
