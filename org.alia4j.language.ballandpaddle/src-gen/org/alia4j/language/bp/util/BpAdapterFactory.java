/**
 */
package org.alia4j.language.bp.util;

import org.alia4j.language.bp.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.alia4j.language.bp.BpPackage
 * @generated
 */
public class BpAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BpPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BpAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = BpPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BpSwitch<Adapter> modelSwitch =
    new BpSwitch<Adapter>()
    {
      @Override
      public Adapter caseRoot(Root object)
      {
        return createRootAdapter();
      }
      @Override
      public Adapter caseLevel(Level object)
      {
        return createLevelAdapter();
      }
      @Override
      public Adapter caseBPObject(BPObject object)
      {
        return createBPObjectAdapter();
      }
      @Override
      public Adapter casePaddle(Paddle object)
      {
        return createPaddleAdapter();
      }
      @Override
      public Adapter caseBall(Ball object)
      {
        return createBallAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter casePower(Power object)
      {
        return createPowerAdapter();
      }
      @Override
      public Adapter caseTarget(Target object)
      {
        return createTargetAdapter();
      }
      @Override
      public Adapter caseObjectTarget(ObjectTarget object)
      {
        return createObjectTargetAdapter();
      }
      @Override
      public Adapter caseClassTarget(ClassTarget object)
      {
        return createClassTargetAdapter();
      }
      @Override
      public Adapter caseEffect(Effect object)
      {
        return createEffectAdapter();
      }
      @Override
      public Adapter caseGeneralEffect(GeneralEffect object)
      {
        return createGeneralEffectAdapter();
      }
      @Override
      public Adapter caseCollisionEffect(CollisionEffect object)
      {
        return createCollisionEffectAdapter();
      }
      @Override
      public Adapter caseEffectBody(EffectBody object)
      {
        return createEffectBodyAdapter();
      }
      @Override
      public Adapter caseGeneralEffectBody(GeneralEffectBody object)
      {
        return createGeneralEffectBodyAdapter();
      }
      @Override
      public Adapter caseCollisionEffectBody(CollisionEffectBody object)
      {
        return createCollisionEffectBodyAdapter();
      }
      @Override
      public Adapter caseCollisionExpression(CollisionExpression object)
      {
        return createCollisionExpressionAdapter();
      }
      @Override
      public Adapter caseBinaryCollisionExpression(BinaryCollisionExpression object)
      {
        return createBinaryCollisionExpressionAdapter();
      }
      @Override
      public Adapter caseUnaryCollisionExpression(UnaryCollisionExpression object)
      {
        return createUnaryCollisionExpressionAdapter();
      }
      @Override
      public Adapter caseEqCollisionExpression(EqCollisionExpression object)
      {
        return createEqCollisionExpressionAdapter();
      }
      @Override
      public Adapter caseSmthCollisionExpression(SmthCollisionExpression object)
      {
        return createSmthCollisionExpressionAdapter();
      }
      @Override
      public Adapter caseSeqCollisionExpression(SeqCollisionExpression object)
      {
        return createSeqCollisionExpressionAdapter();
      }
      @Override
      public Adapter caseLthCollisionExpression(LthCollisionExpression object)
      {
        return createLthCollisionExpressionAdapter();
      }
      @Override
      public Adapter caseLeqCollisionExpression(LeqCollisionExpression object)
      {
        return createLeqCollisionExpressionAdapter();
      }
      @Override
      public Adapter caseNeqCollisionExpression(NeqCollisionExpression object)
      {
        return createNeqCollisionExpressionAdapter();
      }
      @Override
      public Adapter caseOrCollisionExpression(OrCollisionExpression object)
      {
        return createOrCollisionExpressionAdapter();
      }
      @Override
      public Adapter caseAndCollisionExpression(AndCollisionExpression object)
      {
        return createAndCollisionExpressionAdapter();
      }
      @Override
      public Adapter caseMultCollisionExpression(MultCollisionExpression object)
      {
        return createMultCollisionExpressionAdapter();
      }
      @Override
      public Adapter caseDivCollisionExpression(DivCollisionExpression object)
      {
        return createDivCollisionExpressionAdapter();
      }
      @Override
      public Adapter casePlusCollisionExpression(PlusCollisionExpression object)
      {
        return createPlusCollisionExpressionAdapter();
      }
      @Override
      public Adapter caseMinusCollisionExpression(MinusCollisionExpression object)
      {
        return createMinusCollisionExpressionAdapter();
      }
      @Override
      public Adapter caseBracketCollisionExpression(BracketCollisionExpression object)
      {
        return createBracketCollisionExpressionAdapter();
      }
      @Override
      public Adapter caseNegCollisionExpression(NegCollisionExpression object)
      {
        return createNegCollisionExpressionAdapter();
      }
      @Override
      public Adapter caseNotCollisionExpression(NotCollisionExpression object)
      {
        return createNotCollisionExpressionAdapter();
      }
      @Override
      public Adapter caseIntCollisionOperand(IntCollisionOperand object)
      {
        return createIntCollisionOperandAdapter();
      }
      @Override
      public Adapter caseDoubleCollisionOperand(DoubleCollisionOperand object)
      {
        return createDoubleCollisionOperandAdapter();
      }
      @Override
      public Adapter caseBoolCollisionOperand(BoolCollisionOperand object)
      {
        return createBoolCollisionOperandAdapter();
      }
      @Override
      public Adapter caseAttCollisionOperand(AttCollisionOperand object)
      {
        return createAttCollisionOperandAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseBinaryExpression(BinaryExpression object)
      {
        return createBinaryExpressionAdapter();
      }
      @Override
      public Adapter caseUnaryExpression(UnaryExpression object)
      {
        return createUnaryExpressionAdapter();
      }
      @Override
      public Adapter caseEqExpression(EqExpression object)
      {
        return createEqExpressionAdapter();
      }
      @Override
      public Adapter caseSmthExpression(SmthExpression object)
      {
        return createSmthExpressionAdapter();
      }
      @Override
      public Adapter caseSeqExpression(SeqExpression object)
      {
        return createSeqExpressionAdapter();
      }
      @Override
      public Adapter caseLthExpression(LthExpression object)
      {
        return createLthExpressionAdapter();
      }
      @Override
      public Adapter caseLeqExpression(LeqExpression object)
      {
        return createLeqExpressionAdapter();
      }
      @Override
      public Adapter caseNeqExpression(NeqExpression object)
      {
        return createNeqExpressionAdapter();
      }
      @Override
      public Adapter caseOrExpression(OrExpression object)
      {
        return createOrExpressionAdapter();
      }
      @Override
      public Adapter caseAndExpression(AndExpression object)
      {
        return createAndExpressionAdapter();
      }
      @Override
      public Adapter caseMultExpression(MultExpression object)
      {
        return createMultExpressionAdapter();
      }
      @Override
      public Adapter caseDivExpression(DivExpression object)
      {
        return createDivExpressionAdapter();
      }
      @Override
      public Adapter casePlusExpression(PlusExpression object)
      {
        return createPlusExpressionAdapter();
      }
      @Override
      public Adapter caseMinusExpression(MinusExpression object)
      {
        return createMinusExpressionAdapter();
      }
      @Override
      public Adapter caseBracketExpression(BracketExpression object)
      {
        return createBracketExpressionAdapter();
      }
      @Override
      public Adapter caseNegExpression(NegExpression object)
      {
        return createNegExpressionAdapter();
      }
      @Override
      public Adapter caseNotExpression(NotExpression object)
      {
        return createNotExpressionAdapter();
      }
      @Override
      public Adapter caseAttOperand(AttOperand object)
      {
        return createAttOperandAdapter();
      }
      @Override
      public Adapter caseIntOperand(IntOperand object)
      {
        return createIntOperandAdapter();
      }
      @Override
      public Adapter caseDoubleOperand(DoubleOperand object)
      {
        return createDoubleOperandAdapter();
      }
      @Override
      public Adapter caseBooleanOperand(BooleanOperand object)
      {
        return createBooleanOperandAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.Root
   * @generated
   */
  public Adapter createRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.Level <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.Level
   * @generated
   */
  public Adapter createLevelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.BPObject <em>BP Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.BPObject
   * @generated
   */
  public Adapter createBPObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.Paddle <em>Paddle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.Paddle
   * @generated
   */
  public Adapter createPaddleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.Ball <em>Ball</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.Ball
   * @generated
   */
  public Adapter createBallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.Power <em>Power</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.Power
   * @generated
   */
  public Adapter createPowerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.Target <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.Target
   * @generated
   */
  public Adapter createTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.ObjectTarget <em>Object Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.ObjectTarget
   * @generated
   */
  public Adapter createObjectTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.ClassTarget <em>Class Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.ClassTarget
   * @generated
   */
  public Adapter createClassTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.Effect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.Effect
   * @generated
   */
  public Adapter createEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.GeneralEffect <em>General Effect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.GeneralEffect
   * @generated
   */
  public Adapter createGeneralEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.CollisionEffect <em>Collision Effect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.CollisionEffect
   * @generated
   */
  public Adapter createCollisionEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.EffectBody <em>Effect Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.EffectBody
   * @generated
   */
  public Adapter createEffectBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.GeneralEffectBody <em>General Effect Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.GeneralEffectBody
   * @generated
   */
  public Adapter createGeneralEffectBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.CollisionEffectBody <em>Collision Effect Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.CollisionEffectBody
   * @generated
   */
  public Adapter createCollisionEffectBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.CollisionExpression <em>Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.CollisionExpression
   * @generated
   */
  public Adapter createCollisionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.BinaryCollisionExpression <em>Binary Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.BinaryCollisionExpression
   * @generated
   */
  public Adapter createBinaryCollisionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.UnaryCollisionExpression <em>Unary Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.UnaryCollisionExpression
   * @generated
   */
  public Adapter createUnaryCollisionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.EqCollisionExpression <em>Eq Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.EqCollisionExpression
   * @generated
   */
  public Adapter createEqCollisionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.SmthCollisionExpression <em>Smth Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.SmthCollisionExpression
   * @generated
   */
  public Adapter createSmthCollisionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.SeqCollisionExpression <em>Seq Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.SeqCollisionExpression
   * @generated
   */
  public Adapter createSeqCollisionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.LthCollisionExpression <em>Lth Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.LthCollisionExpression
   * @generated
   */
  public Adapter createLthCollisionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.LeqCollisionExpression <em>Leq Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.LeqCollisionExpression
   * @generated
   */
  public Adapter createLeqCollisionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.NeqCollisionExpression <em>Neq Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.NeqCollisionExpression
   * @generated
   */
  public Adapter createNeqCollisionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.OrCollisionExpression <em>Or Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.OrCollisionExpression
   * @generated
   */
  public Adapter createOrCollisionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.AndCollisionExpression <em>And Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.AndCollisionExpression
   * @generated
   */
  public Adapter createAndCollisionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.MultCollisionExpression <em>Mult Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.MultCollisionExpression
   * @generated
   */
  public Adapter createMultCollisionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.DivCollisionExpression <em>Div Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.DivCollisionExpression
   * @generated
   */
  public Adapter createDivCollisionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.PlusCollisionExpression <em>Plus Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.PlusCollisionExpression
   * @generated
   */
  public Adapter createPlusCollisionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.MinusCollisionExpression <em>Minus Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.MinusCollisionExpression
   * @generated
   */
  public Adapter createMinusCollisionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.BracketCollisionExpression <em>Bracket Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.BracketCollisionExpression
   * @generated
   */
  public Adapter createBracketCollisionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.NegCollisionExpression <em>Neg Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.NegCollisionExpression
   * @generated
   */
  public Adapter createNegCollisionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.NotCollisionExpression <em>Not Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.NotCollisionExpression
   * @generated
   */
  public Adapter createNotCollisionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.IntCollisionOperand <em>Int Collision Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.IntCollisionOperand
   * @generated
   */
  public Adapter createIntCollisionOperandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.DoubleCollisionOperand <em>Double Collision Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.DoubleCollisionOperand
   * @generated
   */
  public Adapter createDoubleCollisionOperandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.BoolCollisionOperand <em>Bool Collision Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.BoolCollisionOperand
   * @generated
   */
  public Adapter createBoolCollisionOperandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.AttCollisionOperand <em>Att Collision Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.AttCollisionOperand
   * @generated
   */
  public Adapter createAttCollisionOperandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.BinaryExpression <em>Binary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.BinaryExpression
   * @generated
   */
  public Adapter createBinaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.UnaryExpression
   * @generated
   */
  public Adapter createUnaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.EqExpression <em>Eq Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.EqExpression
   * @generated
   */
  public Adapter createEqExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.SmthExpression <em>Smth Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.SmthExpression
   * @generated
   */
  public Adapter createSmthExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.SeqExpression <em>Seq Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.SeqExpression
   * @generated
   */
  public Adapter createSeqExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.LthExpression <em>Lth Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.LthExpression
   * @generated
   */
  public Adapter createLthExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.LeqExpression <em>Leq Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.LeqExpression
   * @generated
   */
  public Adapter createLeqExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.NeqExpression <em>Neq Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.NeqExpression
   * @generated
   */
  public Adapter createNeqExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.OrExpression
   * @generated
   */
  public Adapter createOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.AndExpression
   * @generated
   */
  public Adapter createAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.MultExpression <em>Mult Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.MultExpression
   * @generated
   */
  public Adapter createMultExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.DivExpression <em>Div Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.DivExpression
   * @generated
   */
  public Adapter createDivExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.PlusExpression <em>Plus Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.PlusExpression
   * @generated
   */
  public Adapter createPlusExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.MinusExpression <em>Minus Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.MinusExpression
   * @generated
   */
  public Adapter createMinusExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.BracketExpression <em>Bracket Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.BracketExpression
   * @generated
   */
  public Adapter createBracketExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.NegExpression <em>Neg Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.NegExpression
   * @generated
   */
  public Adapter createNegExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.NotExpression <em>Not Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.NotExpression
   * @generated
   */
  public Adapter createNotExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.AttOperand <em>Att Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.AttOperand
   * @generated
   */
  public Adapter createAttOperandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.IntOperand <em>Int Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.IntOperand
   * @generated
   */
  public Adapter createIntOperandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.DoubleOperand <em>Double Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.DoubleOperand
   * @generated
   */
  public Adapter createDoubleOperandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.bp.BooleanOperand <em>Boolean Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.bp.BooleanOperand
   * @generated
   */
  public Adapter createBooleanOperandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //BpAdapterFactory
