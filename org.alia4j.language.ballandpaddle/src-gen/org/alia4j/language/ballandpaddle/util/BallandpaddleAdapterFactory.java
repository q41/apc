/**
 */
package org.alia4j.language.ballandpaddle.util;

import org.alia4j.language.ballandpaddle.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage
 * @generated
 */
public class BallandpaddleAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BallandpaddlePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BallandpaddleAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = BallandpaddlePackage.eINSTANCE;
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
  protected BallandpaddleSwitch<Adapter> modelSwitch =
    new BallandpaddleSwitch<Adapter>()
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
      public Adapter caseBAPObject(BAPObject object)
      {
        return createBAPObjectAdapter();
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
      public Adapter caseTypeTarget(TypeTarget object)
      {
        return createTypeTargetAdapter();
      }
      @Override
      public Adapter caseBooleanExpression(BooleanExpression object)
      {
        return createBooleanExpressionAdapter();
      }
      @Override
      public Adapter caseBooleanBinaryExpression(BooleanBinaryExpression object)
      {
        return createBooleanBinaryExpressionAdapter();
      }
      @Override
      public Adapter caseBooleanUnaryExpression(BooleanUnaryExpression object)
      {
        return createBooleanUnaryExpressionAdapter();
      }
      @Override
      public Adapter caseEqParameter(EqParameter object)
      {
        return createEqParameterAdapter();
      }
      @Override
      public Adapter caseSmthParameter(SmthParameter object)
      {
        return createSmthParameterAdapter();
      }
      @Override
      public Adapter caseSeqParameter(SeqParameter object)
      {
        return createSeqParameterAdapter();
      }
      @Override
      public Adapter caseLthParameter(LthParameter object)
      {
        return createLthParameterAdapter();
      }
      @Override
      public Adapter caseLeqParameter(LeqParameter object)
      {
        return createLeqParameterAdapter();
      }
      @Override
      public Adapter caseNeqParameter(NeqParameter object)
      {
        return createNeqParameterAdapter();
      }
      @Override
      public Adapter caseOrParameter(OrParameter object)
      {
        return createOrParameterAdapter();
      }
      @Override
      public Adapter caseAndParameter(AndParameter object)
      {
        return createAndParameterAdapter();
      }
      @Override
      public Adapter caseBracketParameter(BracketParameter object)
      {
        return createBracketParameterAdapter();
      }
      @Override
      public Adapter caseNegParameter(NegParameter object)
      {
        return createNegParameterAdapter();
      }
      @Override
      public Adapter caseAttParameter(AttParameter object)
      {
        return createAttParameterAdapter();
      }
      @Override
      public Adapter caseValueParameter(ValueParameter object)
      {
        return createValueParameterAdapter();
      }
      @Override
      public Adapter caseEffect(Effect object)
      {
        return createEffectAdapter();
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
      public Adapter caseIntOperand(IntOperand object)
      {
        return createIntOperandAdapter();
      }
      @Override
      public Adapter caseAttOperand(AttOperand object)
      {
        return createAttOperandAdapter();
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
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.Root
   * @generated
   */
  public Adapter createRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.Level <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.Level
   * @generated
   */
  public Adapter createLevelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.BAPObject <em>BAP Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.BAPObject
   * @generated
   */
  public Adapter createBAPObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.Paddle <em>Paddle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.Paddle
   * @generated
   */
  public Adapter createPaddleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.Ball <em>Ball</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.Ball
   * @generated
   */
  public Adapter createBallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.Power <em>Power</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.Power
   * @generated
   */
  public Adapter createPowerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.Target <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.Target
   * @generated
   */
  public Adapter createTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.ObjectTarget <em>Object Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.ObjectTarget
   * @generated
   */
  public Adapter createObjectTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.TypeTarget <em>Type Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.TypeTarget
   * @generated
   */
  public Adapter createTypeTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.BooleanExpression <em>Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.BooleanExpression
   * @generated
   */
  public Adapter createBooleanExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.BooleanBinaryExpression <em>Boolean Binary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.BooleanBinaryExpression
   * @generated
   */
  public Adapter createBooleanBinaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.BooleanUnaryExpression <em>Boolean Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.BooleanUnaryExpression
   * @generated
   */
  public Adapter createBooleanUnaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.EqParameter <em>Eq Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.EqParameter
   * @generated
   */
  public Adapter createEqParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.SmthParameter <em>Smth Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.SmthParameter
   * @generated
   */
  public Adapter createSmthParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.SeqParameter <em>Seq Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.SeqParameter
   * @generated
   */
  public Adapter createSeqParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.LthParameter <em>Lth Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.LthParameter
   * @generated
   */
  public Adapter createLthParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.LeqParameter <em>Leq Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.LeqParameter
   * @generated
   */
  public Adapter createLeqParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.NeqParameter <em>Neq Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.NeqParameter
   * @generated
   */
  public Adapter createNeqParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.OrParameter <em>Or Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.OrParameter
   * @generated
   */
  public Adapter createOrParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.AndParameter <em>And Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.AndParameter
   * @generated
   */
  public Adapter createAndParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.BracketParameter <em>Bracket Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.BracketParameter
   * @generated
   */
  public Adapter createBracketParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.NegParameter <em>Neg Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.NegParameter
   * @generated
   */
  public Adapter createNegParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.AttParameter <em>Att Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.AttParameter
   * @generated
   */
  public Adapter createAttParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.ValueParameter <em>Value Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.ValueParameter
   * @generated
   */
  public Adapter createValueParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.Effect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.Effect
   * @generated
   */
  public Adapter createEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.BinaryExpression <em>Binary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.BinaryExpression
   * @generated
   */
  public Adapter createBinaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.UnaryExpression
   * @generated
   */
  public Adapter createUnaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.MultExpression <em>Mult Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.MultExpression
   * @generated
   */
  public Adapter createMultExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.DivExpression <em>Div Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.DivExpression
   * @generated
   */
  public Adapter createDivExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.PlusExpression <em>Plus Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.PlusExpression
   * @generated
   */
  public Adapter createPlusExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.MinusExpression <em>Minus Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.MinusExpression
   * @generated
   */
  public Adapter createMinusExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.BracketExpression <em>Bracket Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.BracketExpression
   * @generated
   */
  public Adapter createBracketExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.NegExpression <em>Neg Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.NegExpression
   * @generated
   */
  public Adapter createNegExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.IntOperand <em>Int Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.IntOperand
   * @generated
   */
  public Adapter createIntOperandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alia4j.language.ballandpaddle.AttOperand <em>Att Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alia4j.language.ballandpaddle.AttOperand
   * @generated
   */
  public Adapter createAttOperandAdapter()
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

} //BallandpaddleAdapterFactory
