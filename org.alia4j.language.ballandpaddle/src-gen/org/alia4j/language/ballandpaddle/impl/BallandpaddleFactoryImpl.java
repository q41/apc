/**
 */
package org.alia4j.language.ballandpaddle.impl;

import org.alia4j.language.ballandpaddle.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BallandpaddleFactoryImpl extends EFactoryImpl implements BallandpaddleFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BallandpaddleFactory init()
  {
    try
    {
      BallandpaddleFactory theBallandpaddleFactory = (BallandpaddleFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.alia4j.org/language/ballandpaddle"); 
      if (theBallandpaddleFactory != null)
      {
        return theBallandpaddleFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BallandpaddleFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BallandpaddleFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BallandpaddlePackage.ROOT: return createRoot();
      case BallandpaddlePackage.LEVEL: return createLevel();
      case BallandpaddlePackage.PADDLE: return createPaddle();
      case BallandpaddlePackage.BALL: return createBall();
      case BallandpaddlePackage.BLOCK: return createBlock();
      case BallandpaddlePackage.POWER: return createPower();
      case BallandpaddlePackage.OBJECT_TARGET: return createObjectTarget();
      case BallandpaddlePackage.TYPE_TARGET: return createTypeTarget();
      case BallandpaddlePackage.EQ_PARAMETER: return createEqParameter();
      case BallandpaddlePackage.SMTH_PARAMETER: return createSmthParameter();
      case BallandpaddlePackage.SEQ_PARAMETER: return createSeqParameter();
      case BallandpaddlePackage.LTH_PARAMETER: return createLthParameter();
      case BallandpaddlePackage.LEQ_PARAMETER: return createLeqParameter();
      case BallandpaddlePackage.NEQ_PARAMETER: return createNeqParameter();
      case BallandpaddlePackage.OR_PARAMETER: return createOrParameter();
      case BallandpaddlePackage.AND_PARAMETER: return createAndParameter();
      case BallandpaddlePackage.BRACKET_PARAMETER: return createBracketParameter();
      case BallandpaddlePackage.NEG_PARAMETER: return createNegParameter();
      case BallandpaddlePackage.ATT_PARAMETER: return createAttParameter();
      case BallandpaddlePackage.VALUE_PARAMETER: return createValueParameter();
      case BallandpaddlePackage.EFFECT: return createEffect();
      case BallandpaddlePackage.MULT_EXPRESSION: return createMultExpression();
      case BallandpaddlePackage.DIV_EXPRESSION: return createDivExpression();
      case BallandpaddlePackage.PLUS_EXPRESSION: return createPlusExpression();
      case BallandpaddlePackage.MINUS_EXPRESSION: return createMinusExpression();
      case BallandpaddlePackage.BRACKET_EXPRESSION: return createBracketExpression();
      case BallandpaddlePackage.NEG_EXPRESSION: return createNegExpression();
      case BallandpaddlePackage.INT_OPERAND: return createIntOperand();
      case BallandpaddlePackage.ATT_OPERAND: return createAttOperand();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BallandpaddlePackage.ATTRIBUTE:
        return createAttributeFromString(eDataType, initialValue);
      case BallandpaddlePackage.SHAPE:
        return createShapeFromString(eDataType, initialValue);
      case BallandpaddlePackage.DAMAGE_EFFECT_TYPE:
        return createDamageEffectTypeFromString(eDataType, initialValue);
      case BallandpaddlePackage.TARGET_TYPE:
        return createTargetTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BallandpaddlePackage.ATTRIBUTE:
        return convertAttributeToString(eDataType, instanceValue);
      case BallandpaddlePackage.SHAPE:
        return convertShapeToString(eDataType, instanceValue);
      case BallandpaddlePackage.DAMAGE_EFFECT_TYPE:
        return convertDamageEffectTypeToString(eDataType, instanceValue);
      case BallandpaddlePackage.TARGET_TYPE:
        return convertTargetTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Root createRoot()
  {
    RootImpl root = new RootImpl();
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Level createLevel()
  {
    LevelImpl level = new LevelImpl();
    return level;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Paddle createPaddle()
  {
    PaddleImpl paddle = new PaddleImpl();
    return paddle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ball createBall()
  {
    BallImpl ball = new BallImpl();
    return ball;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Power createPower()
  {
    PowerImpl power = new PowerImpl();
    return power;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectTarget createObjectTarget()
  {
    ObjectTargetImpl objectTarget = new ObjectTargetImpl();
    return objectTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeTarget createTypeTarget()
  {
    TypeTargetImpl typeTarget = new TypeTargetImpl();
    return typeTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EqParameter createEqParameter()
  {
    EqParameterImpl eqParameter = new EqParameterImpl();
    return eqParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmthParameter createSmthParameter()
  {
    SmthParameterImpl smthParameter = new SmthParameterImpl();
    return smthParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeqParameter createSeqParameter()
  {
    SeqParameterImpl seqParameter = new SeqParameterImpl();
    return seqParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LthParameter createLthParameter()
  {
    LthParameterImpl lthParameter = new LthParameterImpl();
    return lthParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeqParameter createLeqParameter()
  {
    LeqParameterImpl leqParameter = new LeqParameterImpl();
    return leqParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NeqParameter createNeqParameter()
  {
    NeqParameterImpl neqParameter = new NeqParameterImpl();
    return neqParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrParameter createOrParameter()
  {
    OrParameterImpl orParameter = new OrParameterImpl();
    return orParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndParameter createAndParameter()
  {
    AndParameterImpl andParameter = new AndParameterImpl();
    return andParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BracketParameter createBracketParameter()
  {
    BracketParameterImpl bracketParameter = new BracketParameterImpl();
    return bracketParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NegParameter createNegParameter()
  {
    NegParameterImpl negParameter = new NegParameterImpl();
    return negParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttParameter createAttParameter()
  {
    AttParameterImpl attParameter = new AttParameterImpl();
    return attParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueParameter createValueParameter()
  {
    ValueParameterImpl valueParameter = new ValueParameterImpl();
    return valueParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Effect createEffect()
  {
    EffectImpl effect = new EffectImpl();
    return effect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultExpression createMultExpression()
  {
    MultExpressionImpl multExpression = new MultExpressionImpl();
    return multExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DivExpression createDivExpression()
  {
    DivExpressionImpl divExpression = new DivExpressionImpl();
    return divExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlusExpression createPlusExpression()
  {
    PlusExpressionImpl plusExpression = new PlusExpressionImpl();
    return plusExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinusExpression createMinusExpression()
  {
    MinusExpressionImpl minusExpression = new MinusExpressionImpl();
    return minusExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BracketExpression createBracketExpression()
  {
    BracketExpressionImpl bracketExpression = new BracketExpressionImpl();
    return bracketExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NegExpression createNegExpression()
  {
    NegExpressionImpl negExpression = new NegExpressionImpl();
    return negExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntOperand createIntOperand()
  {
    IntOperandImpl intOperand = new IntOperandImpl();
    return intOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttOperand createAttOperand()
  {
    AttOperandImpl attOperand = new AttOperandImpl();
    return attOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttributeFromString(EDataType eDataType, String initialValue)
  {
    Attribute result = Attribute.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAttributeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Shape createShapeFromString(EDataType eDataType, String initialValue)
  {
    Shape result = Shape.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertShapeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DamageEffectType createDamageEffectTypeFromString(EDataType eDataType, String initialValue)
  {
    DamageEffectType result = DamageEffectType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDamageEffectTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetType createTargetTypeFromString(EDataType eDataType, String initialValue)
  {
    TargetType result = TargetType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTargetTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BallandpaddlePackage getBallandpaddlePackage()
  {
    return (BallandpaddlePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BallandpaddlePackage getPackage()
  {
    return BallandpaddlePackage.eINSTANCE;
  }

} //BallandpaddleFactoryImpl
