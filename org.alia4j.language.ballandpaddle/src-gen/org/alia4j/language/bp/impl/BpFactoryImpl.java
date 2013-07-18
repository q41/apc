/**
 */
package org.alia4j.language.bp.impl;

import org.alia4j.language.bp.*;

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
public class BpFactoryImpl extends EFactoryImpl implements BpFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BpFactory init()
  {
    try
    {
      BpFactory theBpFactory = (BpFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.emftext.org/language/ballandpaddle"); 
      if (theBpFactory != null)
      {
        return theBpFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BpFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BpFactoryImpl()
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
      case BpPackage.ROOT: return createRoot();
      case BpPackage.LEVEL: return createLevel();
      case BpPackage.PADDLE: return createPaddle();
      case BpPackage.BALL: return createBall();
      case BpPackage.BLOCK: return createBlock();
      case BpPackage.POWER: return createPower();
      case BpPackage.OBJECT_TARGET: return createObjectTarget();
      case BpPackage.CLASS_TARGET: return createClassTarget();
      case BpPackage.GENERAL_EFFECT: return createGeneralEffect();
      case BpPackage.COLLISION_EFFECT: return createCollisionEffect();
      case BpPackage.GENERAL_EFFECT_BODY: return createGeneralEffectBody();
      case BpPackage.COLLISION_EFFECT_BODY: return createCollisionEffectBody();
      case BpPackage.EQ_COLLISION_EXPRESSION: return createEqCollisionExpression();
      case BpPackage.SMTH_COLLISION_EXPRESSION: return createSmthCollisionExpression();
      case BpPackage.SEQ_COLLISION_EXPRESSION: return createSeqCollisionExpression();
      case BpPackage.LTH_COLLISION_EXPRESSION: return createLthCollisionExpression();
      case BpPackage.LEQ_COLLISION_EXPRESSION: return createLeqCollisionExpression();
      case BpPackage.NEQ_COLLISION_EXPRESSION: return createNeqCollisionExpression();
      case BpPackage.OR_COLLISION_EXPRESSION: return createOrCollisionExpression();
      case BpPackage.AND_COLLISION_EXPRESSION: return createAndCollisionExpression();
      case BpPackage.MULT_COLLISION_EXPRESSION: return createMultCollisionExpression();
      case BpPackage.DIV_COLLISION_EXPRESSION: return createDivCollisionExpression();
      case BpPackage.PLUS_COLLISION_EXPRESSION: return createPlusCollisionExpression();
      case BpPackage.MINUS_COLLISION_EXPRESSION: return createMinusCollisionExpression();
      case BpPackage.BRACKET_COLLISION_EXPRESSION: return createBracketCollisionExpression();
      case BpPackage.NEG_COLLISION_EXPRESSION: return createNegCollisionExpression();
      case BpPackage.NOT_COLLISION_EXPRESSION: return createNotCollisionExpression();
      case BpPackage.INT_COLLISION_OPERAND: return createIntCollisionOperand();
      case BpPackage.DOUBLE_COLLISION_OPERAND: return createDoubleCollisionOperand();
      case BpPackage.BOOL_COLLISION_OPERAND: return createBoolCollisionOperand();
      case BpPackage.ATT_COLLISION_OPERAND: return createAttCollisionOperand();
      case BpPackage.EQ_EXPRESSION: return createEqExpression();
      case BpPackage.SMTH_EXPRESSION: return createSmthExpression();
      case BpPackage.SEQ_EXPRESSION: return createSeqExpression();
      case BpPackage.LTH_EXPRESSION: return createLthExpression();
      case BpPackage.LEQ_EXPRESSION: return createLeqExpression();
      case BpPackage.NEQ_EXPRESSION: return createNeqExpression();
      case BpPackage.OR_EXPRESSION: return createOrExpression();
      case BpPackage.AND_EXPRESSION: return createAndExpression();
      case BpPackage.MULT_EXPRESSION: return createMultExpression();
      case BpPackage.DIV_EXPRESSION: return createDivExpression();
      case BpPackage.PLUS_EXPRESSION: return createPlusExpression();
      case BpPackage.MINUS_EXPRESSION: return createMinusExpression();
      case BpPackage.BRACKET_EXPRESSION: return createBracketExpression();
      case BpPackage.NEG_EXPRESSION: return createNegExpression();
      case BpPackage.NOT_EXPRESSION: return createNotExpression();
      case BpPackage.ATT_OPERAND: return createAttOperand();
      case BpPackage.INT_OPERAND: return createIntOperand();
      case BpPackage.DOUBLE_OPERAND: return createDoubleOperand();
      case BpPackage.BOOLEAN_OPERAND: return createBooleanOperand();
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
      case BpPackage.ATTRIBUTE:
        return createAttributeFromString(eDataType, initialValue);
      case BpPackage.BP_CLASS_TYPE:
        return createBPClassTypeFromString(eDataType, initialValue);
      case BpPackage.ADJUSTMENT_OPERATOR:
        return createAdjustmentOperatorFromString(eDataType, initialValue);
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
      case BpPackage.ATTRIBUTE:
        return convertAttributeToString(eDataType, instanceValue);
      case BpPackage.BP_CLASS_TYPE:
        return convertBPClassTypeToString(eDataType, instanceValue);
      case BpPackage.ADJUSTMENT_OPERATOR:
        return convertAdjustmentOperatorToString(eDataType, instanceValue);
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
  public ClassTarget createClassTarget()
  {
    ClassTargetImpl classTarget = new ClassTargetImpl();
    return classTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeneralEffect createGeneralEffect()
  {
    GeneralEffectImpl generalEffect = new GeneralEffectImpl();
    return generalEffect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollisionEffect createCollisionEffect()
  {
    CollisionEffectImpl collisionEffect = new CollisionEffectImpl();
    return collisionEffect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeneralEffectBody createGeneralEffectBody()
  {
    GeneralEffectBodyImpl generalEffectBody = new GeneralEffectBodyImpl();
    return generalEffectBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollisionEffectBody createCollisionEffectBody()
  {
    CollisionEffectBodyImpl collisionEffectBody = new CollisionEffectBodyImpl();
    return collisionEffectBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EqCollisionExpression createEqCollisionExpression()
  {
    EqCollisionExpressionImpl eqCollisionExpression = new EqCollisionExpressionImpl();
    return eqCollisionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmthCollisionExpression createSmthCollisionExpression()
  {
    SmthCollisionExpressionImpl smthCollisionExpression = new SmthCollisionExpressionImpl();
    return smthCollisionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeqCollisionExpression createSeqCollisionExpression()
  {
    SeqCollisionExpressionImpl seqCollisionExpression = new SeqCollisionExpressionImpl();
    return seqCollisionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LthCollisionExpression createLthCollisionExpression()
  {
    LthCollisionExpressionImpl lthCollisionExpression = new LthCollisionExpressionImpl();
    return lthCollisionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeqCollisionExpression createLeqCollisionExpression()
  {
    LeqCollisionExpressionImpl leqCollisionExpression = new LeqCollisionExpressionImpl();
    return leqCollisionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NeqCollisionExpression createNeqCollisionExpression()
  {
    NeqCollisionExpressionImpl neqCollisionExpression = new NeqCollisionExpressionImpl();
    return neqCollisionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrCollisionExpression createOrCollisionExpression()
  {
    OrCollisionExpressionImpl orCollisionExpression = new OrCollisionExpressionImpl();
    return orCollisionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndCollisionExpression createAndCollisionExpression()
  {
    AndCollisionExpressionImpl andCollisionExpression = new AndCollisionExpressionImpl();
    return andCollisionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultCollisionExpression createMultCollisionExpression()
  {
    MultCollisionExpressionImpl multCollisionExpression = new MultCollisionExpressionImpl();
    return multCollisionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DivCollisionExpression createDivCollisionExpression()
  {
    DivCollisionExpressionImpl divCollisionExpression = new DivCollisionExpressionImpl();
    return divCollisionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlusCollisionExpression createPlusCollisionExpression()
  {
    PlusCollisionExpressionImpl plusCollisionExpression = new PlusCollisionExpressionImpl();
    return plusCollisionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinusCollisionExpression createMinusCollisionExpression()
  {
    MinusCollisionExpressionImpl minusCollisionExpression = new MinusCollisionExpressionImpl();
    return minusCollisionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BracketCollisionExpression createBracketCollisionExpression()
  {
    BracketCollisionExpressionImpl bracketCollisionExpression = new BracketCollisionExpressionImpl();
    return bracketCollisionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NegCollisionExpression createNegCollisionExpression()
  {
    NegCollisionExpressionImpl negCollisionExpression = new NegCollisionExpressionImpl();
    return negCollisionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotCollisionExpression createNotCollisionExpression()
  {
    NotCollisionExpressionImpl notCollisionExpression = new NotCollisionExpressionImpl();
    return notCollisionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntCollisionOperand createIntCollisionOperand()
  {
    IntCollisionOperandImpl intCollisionOperand = new IntCollisionOperandImpl();
    return intCollisionOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleCollisionOperand createDoubleCollisionOperand()
  {
    DoubleCollisionOperandImpl doubleCollisionOperand = new DoubleCollisionOperandImpl();
    return doubleCollisionOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolCollisionOperand createBoolCollisionOperand()
  {
    BoolCollisionOperandImpl boolCollisionOperand = new BoolCollisionOperandImpl();
    return boolCollisionOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttCollisionOperand createAttCollisionOperand()
  {
    AttCollisionOperandImpl attCollisionOperand = new AttCollisionOperandImpl();
    return attCollisionOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EqExpression createEqExpression()
  {
    EqExpressionImpl eqExpression = new EqExpressionImpl();
    return eqExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmthExpression createSmthExpression()
  {
    SmthExpressionImpl smthExpression = new SmthExpressionImpl();
    return smthExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeqExpression createSeqExpression()
  {
    SeqExpressionImpl seqExpression = new SeqExpressionImpl();
    return seqExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LthExpression createLthExpression()
  {
    LthExpressionImpl lthExpression = new LthExpressionImpl();
    return lthExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeqExpression createLeqExpression()
  {
    LeqExpressionImpl leqExpression = new LeqExpressionImpl();
    return leqExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NeqExpression createNeqExpression()
  {
    NeqExpressionImpl neqExpression = new NeqExpressionImpl();
    return neqExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrExpression createOrExpression()
  {
    OrExpressionImpl orExpression = new OrExpressionImpl();
    return orExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExpression createAndExpression()
  {
    AndExpressionImpl andExpression = new AndExpressionImpl();
    return andExpression;
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
  public NotExpression createNotExpression()
  {
    NotExpressionImpl notExpression = new NotExpressionImpl();
    return notExpression;
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
  public DoubleOperand createDoubleOperand()
  {
    DoubleOperandImpl doubleOperand = new DoubleOperandImpl();
    return doubleOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanOperand createBooleanOperand()
  {
    BooleanOperandImpl booleanOperand = new BooleanOperandImpl();
    return booleanOperand;
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
  public BPClassType createBPClassTypeFromString(EDataType eDataType, String initialValue)
  {
    BPClassType result = BPClassType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBPClassTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdjustmentOperator createAdjustmentOperatorFromString(EDataType eDataType, String initialValue)
  {
    AdjustmentOperator result = AdjustmentOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAdjustmentOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BpPackage getBpPackage()
  {
    return (BpPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BpPackage getPackage()
  {
    return BpPackage.eINSTANCE;
  }

} //BpFactoryImpl
