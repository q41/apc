/**
 */
package org.alia4j.language.bp.impl;

import org.alia4j.language.bp.AdjustmentOperator;
import org.alia4j.language.bp.AndCollisionExpression;
import org.alia4j.language.bp.AndExpression;
import org.alia4j.language.bp.AttCollisionOperand;
import org.alia4j.language.bp.AttOperand;
import org.alia4j.language.bp.Attribute;
import org.alia4j.language.bp.BPClassType;
import org.alia4j.language.bp.BPObject;
import org.alia4j.language.bp.Ball;
import org.alia4j.language.bp.BinaryCollisionExpression;
import org.alia4j.language.bp.BinaryExpression;
import org.alia4j.language.bp.Block;
import org.alia4j.language.bp.BoolCollisionOperand;
import org.alia4j.language.bp.BooleanOperand;
import org.alia4j.language.bp.BpFactory;
import org.alia4j.language.bp.BpPackage;
import org.alia4j.language.bp.BracketCollisionExpression;
import org.alia4j.language.bp.BracketExpression;
import org.alia4j.language.bp.ClassTarget;
import org.alia4j.language.bp.CollisionEffect;
import org.alia4j.language.bp.CollisionEffectBody;
import org.alia4j.language.bp.CollisionExpression;
import org.alia4j.language.bp.DivCollisionExpression;
import org.alia4j.language.bp.DivExpression;
import org.alia4j.language.bp.DoubleCollisionOperand;
import org.alia4j.language.bp.DoubleOperand;
import org.alia4j.language.bp.Effect;
import org.alia4j.language.bp.EffectBody;
import org.alia4j.language.bp.EqCollisionExpression;
import org.alia4j.language.bp.EqExpression;
import org.alia4j.language.bp.Expression;
import org.alia4j.language.bp.GeneralEffect;
import org.alia4j.language.bp.GeneralEffectBody;
import org.alia4j.language.bp.IntCollisionOperand;
import org.alia4j.language.bp.IntOperand;
import org.alia4j.language.bp.LeqCollisionExpression;
import org.alia4j.language.bp.LeqExpression;
import org.alia4j.language.bp.Level;
import org.alia4j.language.bp.LthCollisionExpression;
import org.alia4j.language.bp.LthExpression;
import org.alia4j.language.bp.MinusCollisionExpression;
import org.alia4j.language.bp.MinusExpression;
import org.alia4j.language.bp.MultCollisionExpression;
import org.alia4j.language.bp.MultExpression;
import org.alia4j.language.bp.NegCollisionExpression;
import org.alia4j.language.bp.NegExpression;
import org.alia4j.language.bp.NeqCollisionExpression;
import org.alia4j.language.bp.NeqExpression;
import org.alia4j.language.bp.NotCollisionExpression;
import org.alia4j.language.bp.NotExpression;
import org.alia4j.language.bp.ObjectTarget;
import org.alia4j.language.bp.OrCollisionExpression;
import org.alia4j.language.bp.OrExpression;
import org.alia4j.language.bp.Paddle;
import org.alia4j.language.bp.PlusCollisionExpression;
import org.alia4j.language.bp.PlusExpression;
import org.alia4j.language.bp.Power;
import org.alia4j.language.bp.Root;
import org.alia4j.language.bp.SeqCollisionExpression;
import org.alia4j.language.bp.SeqExpression;
import org.alia4j.language.bp.SmthCollisionExpression;
import org.alia4j.language.bp.SmthExpression;
import org.alia4j.language.bp.Target;
import org.alia4j.language.bp.UnaryCollisionExpression;
import org.alia4j.language.bp.UnaryExpression;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BpPackageImpl extends EPackageImpl implements BpPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass levelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bpObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paddleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ballEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass powerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass targetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectTargetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classTargetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass effectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generalEffectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass collisionEffectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass effectBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generalEffectBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass collisionEffectBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass collisionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryCollisionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryCollisionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eqCollisionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smthCollisionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass seqCollisionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lthCollisionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass leqCollisionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass neqCollisionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orCollisionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andCollisionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multCollisionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass divCollisionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass plusCollisionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minusCollisionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bracketCollisionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass negCollisionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notCollisionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intCollisionOperandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doubleCollisionOperandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolCollisionOperandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attCollisionOperandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eqExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smthExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass seqExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lthExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass leqExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass neqExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass divExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass plusExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minusExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bracketExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass negExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attOperandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intOperandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doubleOperandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanOperandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum attributeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum bpClassTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum adjustmentOperatorEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.alia4j.language.bp.BpPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BpPackageImpl()
  {
    super(eNS_URI, BpFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link BpPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BpPackage init()
  {
    if (isInited) return (BpPackage)EPackage.Registry.INSTANCE.getEPackage(BpPackage.eNS_URI);

    // Obtain or create and register package
    BpPackageImpl theBpPackage = (BpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BpPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theBpPackage.createPackageContents();

    // Initialize created meta-data
    theBpPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBpPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BpPackage.eNS_URI, theBpPackage);
    return theBpPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoot()
  {
    return rootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoot_Level()
  {
    return (EReference)rootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoot_Paddles()
  {
    return (EReference)rootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoot_Balls()
  {
    return (EReference)rootEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoot_Blocks()
  {
    return (EReference)rootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoot_Effects()
  {
    return (EReference)rootEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoot_Powers()
  {
    return (EReference)rootEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLevel()
  {
    return levelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLevel_Id()
  {
    return (EAttribute)levelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLevel_PowerSpawnChance()
  {
    return (EAttribute)levelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLevel_Blocks()
  {
    return (EAttribute)levelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBPObject()
  {
    return bpObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBPObject_Id()
  {
    return (EAttribute)bpObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPaddle()
  {
    return paddleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPaddle_X()
  {
    return (EAttribute)paddleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPaddle_Y()
  {
    return (EAttribute)paddleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPaddle_Size()
  {
    return (EAttribute)paddleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBall()
  {
    return ballEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBall_X()
  {
    return (EAttribute)ballEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBall_Y()
  {
    return (EAttribute)ballEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBall_Size()
  {
    return (EAttribute)ballEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBall_Orientation()
  {
    return (EAttribute)ballEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBall_Damage()
  {
    return (EAttribute)ballEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBall_Speed()
  {
    return (EAttribute)ballEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlock()
  {
    return blockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBlock_Hardness()
  {
    return (EAttribute)blockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBlock_Resistance()
  {
    return (EAttribute)blockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlock_Power()
  {
    return (EReference)blockEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPower()
  {
    return powerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPower_Id()
  {
    return (EAttribute)powerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPower_Effects()
  {
    return (EReference)powerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPower_PowerSpawnChance()
  {
    return (EAttribute)powerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTarget()
  {
    return targetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectTarget()
  {
    return objectTargetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectTarget_Object()
  {
    return (EReference)objectTargetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassTarget()
  {
    return classTargetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassTarget_ClassType()
  {
    return (EAttribute)classTargetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEffect()
  {
    return effectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEffect_Id()
  {
    return (EAttribute)effectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEffect_Duration()
  {
    return (EAttribute)effectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeneralEffect()
  {
    return generalEffectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeneralEffect_Target()
  {
    return (EReference)generalEffectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeneralEffect_Filter()
  {
    return (EReference)generalEffectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeneralEffect_Body()
  {
    return (EReference)generalEffectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCollisionEffect()
  {
    return collisionEffectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollisionEffect_LeftTarget()
  {
    return (EReference)collisionEffectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollisionEffect_LeftFilter()
  {
    return (EReference)collisionEffectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollisionEffect_RightTarget()
  {
    return (EReference)collisionEffectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollisionEffect_RightFilter()
  {
    return (EReference)collisionEffectEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollisionEffect_Body()
  {
    return (EReference)collisionEffectEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEffectBody()
  {
    return effectBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEffectBody_Op()
  {
    return (EAttribute)effectBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEffectBody_Name()
  {
    return (EAttribute)effectBodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeneralEffectBody()
  {
    return generalEffectBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeneralEffectBody_Expression()
  {
    return (EReference)generalEffectBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCollisionEffectBody()
  {
    return collisionEffectBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollisionEffectBody_Target()
  {
    return (EReference)collisionEffectBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollisionEffectBody_Expression()
  {
    return (EReference)collisionEffectBodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCollisionExpression()
  {
    return collisionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryCollisionExpression()
  {
    return binaryCollisionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryCollisionExpression_Left()
  {
    return (EReference)binaryCollisionExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryCollisionExpression_Right()
  {
    return (EReference)binaryCollisionExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryCollisionExpression()
  {
    return unaryCollisionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryCollisionExpression_Body()
  {
    return (EReference)unaryCollisionExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEqCollisionExpression()
  {
    return eqCollisionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSmthCollisionExpression()
  {
    return smthCollisionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSeqCollisionExpression()
  {
    return seqCollisionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLthCollisionExpression()
  {
    return lthCollisionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLeqCollisionExpression()
  {
    return leqCollisionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNeqCollisionExpression()
  {
    return neqCollisionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrCollisionExpression()
  {
    return orCollisionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndCollisionExpression()
  {
    return andCollisionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultCollisionExpression()
  {
    return multCollisionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDivCollisionExpression()
  {
    return divCollisionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlusCollisionExpression()
  {
    return plusCollisionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMinusCollisionExpression()
  {
    return minusCollisionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBracketCollisionExpression()
  {
    return bracketCollisionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNegCollisionExpression()
  {
    return negCollisionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotCollisionExpression()
  {
    return notCollisionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntCollisionOperand()
  {
    return intCollisionOperandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntCollisionOperand_Value()
  {
    return (EAttribute)intCollisionOperandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoubleCollisionOperand()
  {
    return doubleCollisionOperandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDoubleCollisionOperand_Value()
  {
    return (EAttribute)doubleCollisionOperandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolCollisionOperand()
  {
    return boolCollisionOperandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBoolCollisionOperand_Value()
  {
    return (EAttribute)boolCollisionOperandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttCollisionOperand()
  {
    return attCollisionOperandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttCollisionOperand_Target()
  {
    return (EReference)attCollisionOperandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttCollisionOperand_Att()
  {
    return (EAttribute)attCollisionOperandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryExpression()
  {
    return binaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpression_Left()
  {
    return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpression_Right()
  {
    return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryExpression()
  {
    return unaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpression_Body()
  {
    return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEqExpression()
  {
    return eqExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSmthExpression()
  {
    return smthExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSeqExpression()
  {
    return seqExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLthExpression()
  {
    return lthExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLeqExpression()
  {
    return leqExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNeqExpression()
  {
    return neqExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrExpression()
  {
    return orExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndExpression()
  {
    return andExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultExpression()
  {
    return multExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDivExpression()
  {
    return divExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlusExpression()
  {
    return plusExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMinusExpression()
  {
    return minusExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBracketExpression()
  {
    return bracketExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNegExpression()
  {
    return negExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotExpression()
  {
    return notExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttOperand()
  {
    return attOperandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttOperand_Att()
  {
    return (EAttribute)attOperandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntOperand()
  {
    return intOperandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntOperand_Value()
  {
    return (EAttribute)intOperandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoubleOperand()
  {
    return doubleOperandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDoubleOperand_Value()
  {
    return (EAttribute)doubleOperandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanOperand()
  {
    return booleanOperandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanOperand_Value()
  {
    return (EAttribute)booleanOperandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAttribute()
  {
    return attributeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBPClassType()
  {
    return bpClassTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAdjustmentOperator()
  {
    return adjustmentOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BpFactory getBpFactory()
  {
    return (BpFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    rootEClass = createEClass(ROOT);
    createEReference(rootEClass, ROOT__LEVEL);
    createEReference(rootEClass, ROOT__PADDLES);
    createEReference(rootEClass, ROOT__BALLS);
    createEReference(rootEClass, ROOT__BLOCKS);
    createEReference(rootEClass, ROOT__EFFECTS);
    createEReference(rootEClass, ROOT__POWERS);

    levelEClass = createEClass(LEVEL);
    createEAttribute(levelEClass, LEVEL__ID);
    createEAttribute(levelEClass, LEVEL__POWER_SPAWN_CHANCE);
    createEAttribute(levelEClass, LEVEL__BLOCKS);

    bpObjectEClass = createEClass(BP_OBJECT);
    createEAttribute(bpObjectEClass, BP_OBJECT__ID);

    paddleEClass = createEClass(PADDLE);
    createEAttribute(paddleEClass, PADDLE__X);
    createEAttribute(paddleEClass, PADDLE__Y);
    createEAttribute(paddleEClass, PADDLE__SIZE);

    ballEClass = createEClass(BALL);
    createEAttribute(ballEClass, BALL__X);
    createEAttribute(ballEClass, BALL__Y);
    createEAttribute(ballEClass, BALL__SIZE);
    createEAttribute(ballEClass, BALL__ORIENTATION);
    createEAttribute(ballEClass, BALL__DAMAGE);
    createEAttribute(ballEClass, BALL__SPEED);

    blockEClass = createEClass(BLOCK);
    createEAttribute(blockEClass, BLOCK__HARDNESS);
    createEAttribute(blockEClass, BLOCK__RESISTANCE);
    createEReference(blockEClass, BLOCK__POWER);

    powerEClass = createEClass(POWER);
    createEAttribute(powerEClass, POWER__ID);
    createEReference(powerEClass, POWER__EFFECTS);
    createEAttribute(powerEClass, POWER__POWER_SPAWN_CHANCE);

    targetEClass = createEClass(TARGET);

    objectTargetEClass = createEClass(OBJECT_TARGET);
    createEReference(objectTargetEClass, OBJECT_TARGET__OBJECT);

    classTargetEClass = createEClass(CLASS_TARGET);
    createEAttribute(classTargetEClass, CLASS_TARGET__CLASS_TYPE);

    effectEClass = createEClass(EFFECT);
    createEAttribute(effectEClass, EFFECT__ID);
    createEAttribute(effectEClass, EFFECT__DURATION);

    generalEffectEClass = createEClass(GENERAL_EFFECT);
    createEReference(generalEffectEClass, GENERAL_EFFECT__TARGET);
    createEReference(generalEffectEClass, GENERAL_EFFECT__FILTER);
    createEReference(generalEffectEClass, GENERAL_EFFECT__BODY);

    collisionEffectEClass = createEClass(COLLISION_EFFECT);
    createEReference(collisionEffectEClass, COLLISION_EFFECT__LEFT_TARGET);
    createEReference(collisionEffectEClass, COLLISION_EFFECT__LEFT_FILTER);
    createEReference(collisionEffectEClass, COLLISION_EFFECT__RIGHT_TARGET);
    createEReference(collisionEffectEClass, COLLISION_EFFECT__RIGHT_FILTER);
    createEReference(collisionEffectEClass, COLLISION_EFFECT__BODY);

    effectBodyEClass = createEClass(EFFECT_BODY);
    createEAttribute(effectBodyEClass, EFFECT_BODY__OP);
    createEAttribute(effectBodyEClass, EFFECT_BODY__NAME);

    generalEffectBodyEClass = createEClass(GENERAL_EFFECT_BODY);
    createEReference(generalEffectBodyEClass, GENERAL_EFFECT_BODY__EXPRESSION);

    collisionEffectBodyEClass = createEClass(COLLISION_EFFECT_BODY);
    createEReference(collisionEffectBodyEClass, COLLISION_EFFECT_BODY__TARGET);
    createEReference(collisionEffectBodyEClass, COLLISION_EFFECT_BODY__EXPRESSION);

    collisionExpressionEClass = createEClass(COLLISION_EXPRESSION);

    binaryCollisionExpressionEClass = createEClass(BINARY_COLLISION_EXPRESSION);
    createEReference(binaryCollisionExpressionEClass, BINARY_COLLISION_EXPRESSION__LEFT);
    createEReference(binaryCollisionExpressionEClass, BINARY_COLLISION_EXPRESSION__RIGHT);

    unaryCollisionExpressionEClass = createEClass(UNARY_COLLISION_EXPRESSION);
    createEReference(unaryCollisionExpressionEClass, UNARY_COLLISION_EXPRESSION__BODY);

    eqCollisionExpressionEClass = createEClass(EQ_COLLISION_EXPRESSION);

    smthCollisionExpressionEClass = createEClass(SMTH_COLLISION_EXPRESSION);

    seqCollisionExpressionEClass = createEClass(SEQ_COLLISION_EXPRESSION);

    lthCollisionExpressionEClass = createEClass(LTH_COLLISION_EXPRESSION);

    leqCollisionExpressionEClass = createEClass(LEQ_COLLISION_EXPRESSION);

    neqCollisionExpressionEClass = createEClass(NEQ_COLLISION_EXPRESSION);

    orCollisionExpressionEClass = createEClass(OR_COLLISION_EXPRESSION);

    andCollisionExpressionEClass = createEClass(AND_COLLISION_EXPRESSION);

    multCollisionExpressionEClass = createEClass(MULT_COLLISION_EXPRESSION);

    divCollisionExpressionEClass = createEClass(DIV_COLLISION_EXPRESSION);

    plusCollisionExpressionEClass = createEClass(PLUS_COLLISION_EXPRESSION);

    minusCollisionExpressionEClass = createEClass(MINUS_COLLISION_EXPRESSION);

    bracketCollisionExpressionEClass = createEClass(BRACKET_COLLISION_EXPRESSION);

    negCollisionExpressionEClass = createEClass(NEG_COLLISION_EXPRESSION);

    notCollisionExpressionEClass = createEClass(NOT_COLLISION_EXPRESSION);

    intCollisionOperandEClass = createEClass(INT_COLLISION_OPERAND);
    createEAttribute(intCollisionOperandEClass, INT_COLLISION_OPERAND__VALUE);

    doubleCollisionOperandEClass = createEClass(DOUBLE_COLLISION_OPERAND);
    createEAttribute(doubleCollisionOperandEClass, DOUBLE_COLLISION_OPERAND__VALUE);

    boolCollisionOperandEClass = createEClass(BOOL_COLLISION_OPERAND);
    createEAttribute(boolCollisionOperandEClass, BOOL_COLLISION_OPERAND__VALUE);

    attCollisionOperandEClass = createEClass(ATT_COLLISION_OPERAND);
    createEReference(attCollisionOperandEClass, ATT_COLLISION_OPERAND__TARGET);
    createEAttribute(attCollisionOperandEClass, ATT_COLLISION_OPERAND__ATT);

    expressionEClass = createEClass(EXPRESSION);

    binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
    createEReference(binaryExpressionEClass, BINARY_EXPRESSION__LEFT);
    createEReference(binaryExpressionEClass, BINARY_EXPRESSION__RIGHT);

    unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
    createEReference(unaryExpressionEClass, UNARY_EXPRESSION__BODY);

    eqExpressionEClass = createEClass(EQ_EXPRESSION);

    smthExpressionEClass = createEClass(SMTH_EXPRESSION);

    seqExpressionEClass = createEClass(SEQ_EXPRESSION);

    lthExpressionEClass = createEClass(LTH_EXPRESSION);

    leqExpressionEClass = createEClass(LEQ_EXPRESSION);

    neqExpressionEClass = createEClass(NEQ_EXPRESSION);

    orExpressionEClass = createEClass(OR_EXPRESSION);

    andExpressionEClass = createEClass(AND_EXPRESSION);

    multExpressionEClass = createEClass(MULT_EXPRESSION);

    divExpressionEClass = createEClass(DIV_EXPRESSION);

    plusExpressionEClass = createEClass(PLUS_EXPRESSION);

    minusExpressionEClass = createEClass(MINUS_EXPRESSION);

    bracketExpressionEClass = createEClass(BRACKET_EXPRESSION);

    negExpressionEClass = createEClass(NEG_EXPRESSION);

    notExpressionEClass = createEClass(NOT_EXPRESSION);

    attOperandEClass = createEClass(ATT_OPERAND);
    createEAttribute(attOperandEClass, ATT_OPERAND__ATT);

    intOperandEClass = createEClass(INT_OPERAND);
    createEAttribute(intOperandEClass, INT_OPERAND__VALUE);

    doubleOperandEClass = createEClass(DOUBLE_OPERAND);
    createEAttribute(doubleOperandEClass, DOUBLE_OPERAND__VALUE);

    booleanOperandEClass = createEClass(BOOLEAN_OPERAND);
    createEAttribute(booleanOperandEClass, BOOLEAN_OPERAND__VALUE);

    // Create enums
    attributeEEnum = createEEnum(ATTRIBUTE);
    bpClassTypeEEnum = createEEnum(BP_CLASS_TYPE);
    adjustmentOperatorEEnum = createEEnum(ADJUSTMENT_OPERATOR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    paddleEClass.getESuperTypes().add(this.getBPObject());
    ballEClass.getESuperTypes().add(this.getBPObject());
    blockEClass.getESuperTypes().add(this.getBPObject());
    objectTargetEClass.getESuperTypes().add(this.getTarget());
    classTargetEClass.getESuperTypes().add(this.getTarget());
    generalEffectEClass.getESuperTypes().add(this.getEffect());
    collisionEffectEClass.getESuperTypes().add(this.getEffect());
    generalEffectBodyEClass.getESuperTypes().add(this.getEffectBody());
    collisionEffectBodyEClass.getESuperTypes().add(this.getEffectBody());
    binaryCollisionExpressionEClass.getESuperTypes().add(this.getCollisionExpression());
    unaryCollisionExpressionEClass.getESuperTypes().add(this.getCollisionExpression());
    eqCollisionExpressionEClass.getESuperTypes().add(this.getBinaryCollisionExpression());
    smthCollisionExpressionEClass.getESuperTypes().add(this.getBinaryCollisionExpression());
    seqCollisionExpressionEClass.getESuperTypes().add(this.getBinaryCollisionExpression());
    lthCollisionExpressionEClass.getESuperTypes().add(this.getBinaryCollisionExpression());
    leqCollisionExpressionEClass.getESuperTypes().add(this.getBinaryCollisionExpression());
    neqCollisionExpressionEClass.getESuperTypes().add(this.getBinaryCollisionExpression());
    orCollisionExpressionEClass.getESuperTypes().add(this.getBinaryCollisionExpression());
    andCollisionExpressionEClass.getESuperTypes().add(this.getBinaryCollisionExpression());
    multCollisionExpressionEClass.getESuperTypes().add(this.getBinaryCollisionExpression());
    divCollisionExpressionEClass.getESuperTypes().add(this.getBinaryCollisionExpression());
    plusCollisionExpressionEClass.getESuperTypes().add(this.getBinaryCollisionExpression());
    minusCollisionExpressionEClass.getESuperTypes().add(this.getBinaryCollisionExpression());
    bracketCollisionExpressionEClass.getESuperTypes().add(this.getUnaryCollisionExpression());
    negCollisionExpressionEClass.getESuperTypes().add(this.getUnaryCollisionExpression());
    notCollisionExpressionEClass.getESuperTypes().add(this.getUnaryCollisionExpression());
    intCollisionOperandEClass.getESuperTypes().add(this.getCollisionExpression());
    doubleCollisionOperandEClass.getESuperTypes().add(this.getCollisionExpression());
    boolCollisionOperandEClass.getESuperTypes().add(this.getCollisionExpression());
    attCollisionOperandEClass.getESuperTypes().add(this.getCollisionExpression());
    binaryExpressionEClass.getESuperTypes().add(this.getExpression());
    unaryExpressionEClass.getESuperTypes().add(this.getExpression());
    eqExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
    smthExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
    seqExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
    lthExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
    leqExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
    neqExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
    orExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
    andExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
    multExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
    divExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
    plusExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
    minusExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
    bracketExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
    negExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
    notExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
    attOperandEClass.getESuperTypes().add(this.getExpression());
    intOperandEClass.getESuperTypes().add(this.getExpression());
    doubleOperandEClass.getESuperTypes().add(this.getExpression());
    booleanOperandEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRoot_Level(), this.getLevel(), null, "level", null, 1, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRoot_Paddles(), this.getPaddle(), null, "paddles", null, 1, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRoot_Balls(), this.getBall(), null, "balls", null, 1, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRoot_Blocks(), this.getBlock(), null, "blocks", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRoot_Effects(), this.getEffect(), null, "effects", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRoot_Powers(), this.getPower(), null, "powers", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(levelEClass, Level.class, "Level", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLevel_Id(), ecorePackage.getEString(), "id", null, 1, 1, Level.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLevel_PowerSpawnChance(), ecorePackage.getEFloat(), "powerSpawnChance", null, 0, 1, Level.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLevel_Blocks(), ecorePackage.getEString(), "blocks", null, 0, -1, Level.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bpObjectEClass, BPObject.class, "BPObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBPObject_Id(), ecorePackage.getEString(), "id", null, 1, 1, BPObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paddleEClass, Paddle.class, "Paddle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPaddle_X(), ecorePackage.getEDouble(), "x", null, 1, 1, Paddle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPaddle_Y(), ecorePackage.getEDouble(), "y", null, 1, 1, Paddle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPaddle_Size(), ecorePackage.getEInt(), "size", null, 1, 1, Paddle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ballEClass, Ball.class, "Ball", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBall_X(), ecorePackage.getEDouble(), "x", null, 1, 1, Ball.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBall_Y(), ecorePackage.getEDouble(), "y", null, 1, 1, Ball.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBall_Size(), ecorePackage.getEInt(), "size", null, 0, 1, Ball.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBall_Orientation(), ecorePackage.getEInt(), "orientation", null, 0, 1, Ball.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBall_Damage(), ecorePackage.getEInt(), "damage", null, 0, 1, Ball.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBall_Speed(), ecorePackage.getEInt(), "speed", null, 0, 1, Ball.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBlock_Hardness(), ecorePackage.getEInt(), "hardness", null, 1, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBlock_Resistance(), ecorePackage.getEInt(), "resistance", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBlock_Power(), this.getPower(), null, "power", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(powerEClass, Power.class, "Power", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPower_Id(), ecorePackage.getEString(), "id", null, 1, 1, Power.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPower_Effects(), this.getEffect(), null, "effects", null, 1, -1, Power.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPower_PowerSpawnChance(), ecorePackage.getEFloat(), "powerSpawnChance", null, 0, 1, Power.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(targetEClass, Target.class, "Target", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectTargetEClass, ObjectTarget.class, "ObjectTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectTarget_Object(), this.getBPObject(), null, "object", null, 1, 1, ObjectTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classTargetEClass, ClassTarget.class, "ClassTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClassTarget_ClassType(), this.getBPClassType(), "classType", null, 1, 1, ClassTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(effectEClass, Effect.class, "Effect", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEffect_Id(), ecorePackage.getEString(), "id", null, 1, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEffect_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(generalEffectEClass, GeneralEffect.class, "GeneralEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGeneralEffect_Target(), this.getTarget(), null, "target", null, 1, 1, GeneralEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGeneralEffect_Filter(), this.getExpression(), null, "filter", null, 0, 1, GeneralEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGeneralEffect_Body(), this.getGeneralEffectBody(), null, "body", null, 1, 1, GeneralEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(collisionEffectEClass, CollisionEffect.class, "CollisionEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCollisionEffect_LeftTarget(), this.getTarget(), null, "leftTarget", null, 1, 1, CollisionEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCollisionEffect_LeftFilter(), this.getExpression(), null, "leftFilter", null, 0, 1, CollisionEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCollisionEffect_RightTarget(), this.getTarget(), null, "rightTarget", null, 1, 1, CollisionEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCollisionEffect_RightFilter(), this.getExpression(), null, "rightFilter", null, 0, 1, CollisionEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCollisionEffect_Body(), this.getCollisionEffectBody(), null, "body", null, 1, 1, CollisionEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(effectBodyEClass, EffectBody.class, "EffectBody", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEffectBody_Op(), this.getAdjustmentOperator(), "op", null, 1, 1, EffectBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEffectBody_Name(), this.getAttribute(), "name", null, 1, 1, EffectBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(generalEffectBodyEClass, GeneralEffectBody.class, "GeneralEffectBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGeneralEffectBody_Expression(), this.getExpression(), null, "expression", null, 1, 1, GeneralEffectBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(collisionEffectBodyEClass, CollisionEffectBody.class, "CollisionEffectBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCollisionEffectBody_Target(), this.getTarget(), null, "target", null, 1, 1, CollisionEffectBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCollisionEffectBody_Expression(), this.getCollisionExpression(), null, "expression", null, 1, 1, CollisionEffectBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(collisionExpressionEClass, CollisionExpression.class, "CollisionExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(binaryCollisionExpressionEClass, BinaryCollisionExpression.class, "BinaryCollisionExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinaryCollisionExpression_Left(), this.getCollisionExpression(), null, "left", null, 1, 1, BinaryCollisionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryCollisionExpression_Right(), this.getCollisionExpression(), null, "right", null, 1, 1, BinaryCollisionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryCollisionExpressionEClass, UnaryCollisionExpression.class, "UnaryCollisionExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnaryCollisionExpression_Body(), this.getCollisionExpression(), null, "body", null, 1, 1, UnaryCollisionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eqCollisionExpressionEClass, EqCollisionExpression.class, "EqCollisionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smthCollisionExpressionEClass, SmthCollisionExpression.class, "SmthCollisionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(seqCollisionExpressionEClass, SeqCollisionExpression.class, "SeqCollisionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lthCollisionExpressionEClass, LthCollisionExpression.class, "LthCollisionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(leqCollisionExpressionEClass, LeqCollisionExpression.class, "LeqCollisionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(neqCollisionExpressionEClass, NeqCollisionExpression.class, "NeqCollisionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(orCollisionExpressionEClass, OrCollisionExpression.class, "OrCollisionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(andCollisionExpressionEClass, AndCollisionExpression.class, "AndCollisionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(multCollisionExpressionEClass, MultCollisionExpression.class, "MultCollisionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(divCollisionExpressionEClass, DivCollisionExpression.class, "DivCollisionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(plusCollisionExpressionEClass, PlusCollisionExpression.class, "PlusCollisionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(minusCollisionExpressionEClass, MinusCollisionExpression.class, "MinusCollisionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bracketCollisionExpressionEClass, BracketCollisionExpression.class, "BracketCollisionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(negCollisionExpressionEClass, NegCollisionExpression.class, "NegCollisionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(notCollisionExpressionEClass, NotCollisionExpression.class, "NotCollisionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(intCollisionOperandEClass, IntCollisionOperand.class, "IntCollisionOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntCollisionOperand_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntCollisionOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doubleCollisionOperandEClass, DoubleCollisionOperand.class, "DoubleCollisionOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDoubleCollisionOperand_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, DoubleCollisionOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boolCollisionOperandEClass, BoolCollisionOperand.class, "BoolCollisionOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBoolCollisionOperand_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BoolCollisionOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attCollisionOperandEClass, AttCollisionOperand.class, "AttCollisionOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttCollisionOperand_Target(), this.getTarget(), null, "target", null, 1, 1, AttCollisionOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttCollisionOperand_Att(), this.getAttribute(), "att", null, 1, 1, AttCollisionOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinaryExpression_Left(), this.getExpression(), null, "left", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryExpression_Right(), this.getExpression(), null, "right", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnaryExpression_Body(), this.getExpression(), null, "body", null, 1, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eqExpressionEClass, EqExpression.class, "EqExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smthExpressionEClass, SmthExpression.class, "SmthExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(seqExpressionEClass, SeqExpression.class, "SeqExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lthExpressionEClass, LthExpression.class, "LthExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(leqExpressionEClass, LeqExpression.class, "LeqExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(neqExpressionEClass, NeqExpression.class, "NeqExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(orExpressionEClass, OrExpression.class, "OrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(andExpressionEClass, AndExpression.class, "AndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(multExpressionEClass, MultExpression.class, "MultExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(divExpressionEClass, DivExpression.class, "DivExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(plusExpressionEClass, PlusExpression.class, "PlusExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(minusExpressionEClass, MinusExpression.class, "MinusExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bracketExpressionEClass, BracketExpression.class, "BracketExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(negExpressionEClass, NegExpression.class, "NegExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(notExpressionEClass, NotExpression.class, "NotExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(attOperandEClass, AttOperand.class, "AttOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttOperand_Att(), this.getAttribute(), "att", null, 1, 1, AttOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intOperandEClass, IntOperand.class, "IntOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntOperand_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doubleOperandEClass, DoubleOperand.class, "DoubleOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDoubleOperand_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, DoubleOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanOperandEClass, BooleanOperand.class, "BooleanOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanOperand_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BooleanOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(attributeEEnum, Attribute.class, "Attribute");
    addEEnumLiteral(attributeEEnum, Attribute.SIZE);
    addEEnumLiteral(attributeEEnum, Attribute.ORIENTATION);
    addEEnumLiteral(attributeEEnum, Attribute.SPEED);
    addEEnumLiteral(attributeEEnum, Attribute.HARDNESS);
    addEEnumLiteral(attributeEEnum, Attribute.RESISTANCE);
    addEEnumLiteral(attributeEEnum, Attribute.IMMATERIAL);
    addEEnumLiteral(attributeEEnum, Attribute.X);
    addEEnumLiteral(attributeEEnum, Attribute.Y);
    addEEnumLiteral(attributeEEnum, Attribute.DAMAGE);

    initEEnum(bpClassTypeEEnum, BPClassType.class, "BPClassType");
    addEEnumLiteral(bpClassTypeEEnum, BPClassType.BLOCK);
    addEEnumLiteral(bpClassTypeEEnum, BPClassType.PADDLE);
    addEEnumLiteral(bpClassTypeEEnum, BPClassType.BALL);

    initEEnum(adjustmentOperatorEEnum, AdjustmentOperator.class, "AdjustmentOperator");
    addEEnumLiteral(adjustmentOperatorEEnum, AdjustmentOperator.INC);
    addEEnumLiteral(adjustmentOperatorEEnum, AdjustmentOperator.SET);

    // Create resource
    createResource(eNS_URI);
  }

} //BpPackageImpl
