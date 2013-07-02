/**
 */
package org.alia4j.language.ballandpaddle.impl;

import org.alia4j.language.ballandpaddle.AndParameter;
import org.alia4j.language.ballandpaddle.AttOperand;
import org.alia4j.language.ballandpaddle.AttParameter;
import org.alia4j.language.ballandpaddle.Attribute;
import org.alia4j.language.ballandpaddle.BAPObject;
import org.alia4j.language.ballandpaddle.Ball;
import org.alia4j.language.ballandpaddle.BallandpaddleFactory;
import org.alia4j.language.ballandpaddle.BallandpaddlePackage;
import org.alia4j.language.ballandpaddle.BinaryExpression;
import org.alia4j.language.ballandpaddle.Block;
import org.alia4j.language.ballandpaddle.BooleanBinaryExpression;
import org.alia4j.language.ballandpaddle.BooleanExpression;
import org.alia4j.language.ballandpaddle.BooleanUnaryExpression;
import org.alia4j.language.ballandpaddle.BracketExpression;
import org.alia4j.language.ballandpaddle.BracketParameter;
import org.alia4j.language.ballandpaddle.DamageEffectType;
import org.alia4j.language.ballandpaddle.DivExpression;
import org.alia4j.language.ballandpaddle.DoubleOperand;
import org.alia4j.language.ballandpaddle.DoubleValueParameter;
import org.alia4j.language.ballandpaddle.Effect;
import org.alia4j.language.ballandpaddle.EqParameter;
import org.alia4j.language.ballandpaddle.Expression;
import org.alia4j.language.ballandpaddle.IntOperand;
import org.alia4j.language.ballandpaddle.IntValueParameter;
import org.alia4j.language.ballandpaddle.LeqParameter;
import org.alia4j.language.ballandpaddle.Level;
import org.alia4j.language.ballandpaddle.LthParameter;
import org.alia4j.language.ballandpaddle.MinusExpression;
import org.alia4j.language.ballandpaddle.MultExpression;
import org.alia4j.language.ballandpaddle.NegExpression;
import org.alia4j.language.ballandpaddle.NegParameter;
import org.alia4j.language.ballandpaddle.NeqParameter;
import org.alia4j.language.ballandpaddle.ObjectTarget;
import org.alia4j.language.ballandpaddle.OrParameter;
import org.alia4j.language.ballandpaddle.Paddle;
import org.alia4j.language.ballandpaddle.PlusExpression;
import org.alia4j.language.ballandpaddle.Power;
import org.alia4j.language.ballandpaddle.Root;
import org.alia4j.language.ballandpaddle.SeqParameter;
import org.alia4j.language.ballandpaddle.SmthParameter;
import org.alia4j.language.ballandpaddle.Target;
import org.alia4j.language.ballandpaddle.TargetType;
import org.alia4j.language.ballandpaddle.TypeTarget;
import org.alia4j.language.ballandpaddle.UnaryExpression;

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
public class BallandpaddlePackageImpl extends EPackageImpl implements BallandpaddlePackage
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
  private EClass bapObjectEClass = null;

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
  private EClass typeTargetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanBinaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanUnaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eqParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smthParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass seqParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lthParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass leqParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass neqParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bracketParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass negParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intValueParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doubleValueParameterEClass = null;

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
  private EClass attOperandEClass = null;

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
  private EEnum damageEffectTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum targetTypeEEnum = null;

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
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BallandpaddlePackageImpl()
  {
    super(eNS_URI, BallandpaddleFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link BallandpaddlePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BallandpaddlePackage init()
  {
    if (isInited) return (BallandpaddlePackage)EPackage.Registry.INSTANCE.getEPackage(BallandpaddlePackage.eNS_URI);

    // Obtain or create and register package
    BallandpaddlePackageImpl theBallandpaddlePackage = (BallandpaddlePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BallandpaddlePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BallandpaddlePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theBallandpaddlePackage.createPackageContents();

    // Initialize created meta-data
    theBallandpaddlePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBallandpaddlePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BallandpaddlePackage.eNS_URI, theBallandpaddlePackage);
    return theBallandpaddlePackage;
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
  public EClass getBAPObject()
  {
    return bapObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBAPObject_Id()
  {
    return (EAttribute)bapObjectEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getPaddle_Orientation()
  {
    return (EAttribute)paddleEClass.getEStructuralFeatures().get(3);
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
  public EAttribute getBall_Direction()
  {
    return (EAttribute)ballEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBall_Speed()
  {
    return (EAttribute)ballEClass.getEStructuralFeatures().get(4);
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
  public EAttribute getBlock_NormalRes()
  {
    return (EAttribute)blockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBlock_FireRes()
  {
    return (EAttribute)blockEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBlock_ColdRes()
  {
    return (EAttribute)blockEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBlock_ShockRes()
  {
    return (EAttribute)blockEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlock_Power()
  {
    return (EReference)blockEClass.getEStructuralFeatures().get(5);
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
  public EAttribute getPower_Duration()
  {
    return (EAttribute)powerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPower_PowerSpawnChance()
  {
    return (EAttribute)powerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPower_Target()
  {
    return (EReference)powerEClass.getEStructuralFeatures().get(4);
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
  public EReference getObjectTarget_Item()
  {
    return (EReference)objectTargetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeTarget()
  {
    return typeTargetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeTarget_Type()
  {
    return (EAttribute)typeTargetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeTarget_Params()
  {
    return (EReference)typeTargetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanExpression()
  {
    return booleanExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanBinaryExpression()
  {
    return booleanBinaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanBinaryExpression_Left()
  {
    return (EReference)booleanBinaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanBinaryExpression_Right()
  {
    return (EReference)booleanBinaryExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanUnaryExpression()
  {
    return booleanUnaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanUnaryExpression_Body()
  {
    return (EReference)booleanUnaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEqParameter()
  {
    return eqParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSmthParameter()
  {
    return smthParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSeqParameter()
  {
    return seqParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLthParameter()
  {
    return lthParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLeqParameter()
  {
    return leqParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNeqParameter()
  {
    return neqParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrParameter()
  {
    return orParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndParameter()
  {
    return andParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBracketParameter()
  {
    return bracketParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNegParameter()
  {
    return negParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttParameter()
  {
    return attParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttParameter_Att()
  {
    return (EAttribute)attParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntValueParameter()
  {
    return intValueParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntValueParameter_Value()
  {
    return (EAttribute)intValueParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoubleValueParameter()
  {
    return doubleValueParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDoubleValueParameter_Value()
  {
    return (EAttribute)doubleValueParameterEClass.getEStructuralFeatures().get(0);
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
  public EReference getEffect_Target()
  {
    return (EReference)effectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEffect_Type()
  {
    return (EAttribute)effectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEffect_Expression()
  {
    return (EReference)effectEClass.getEStructuralFeatures().get(3);
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
  public EEnum getAttribute()
  {
    return attributeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDamageEffectType()
  {
    return damageEffectTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTargetType()
  {
    return targetTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BallandpaddleFactory getBallandpaddleFactory()
  {
    return (BallandpaddleFactory)getEFactoryInstance();
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

    bapObjectEClass = createEClass(BAP_OBJECT);
    createEAttribute(bapObjectEClass, BAP_OBJECT__ID);

    paddleEClass = createEClass(PADDLE);
    createEAttribute(paddleEClass, PADDLE__X);
    createEAttribute(paddleEClass, PADDLE__Y);
    createEAttribute(paddleEClass, PADDLE__SIZE);
    createEAttribute(paddleEClass, PADDLE__ORIENTATION);

    ballEClass = createEClass(BALL);
    createEAttribute(ballEClass, BALL__X);
    createEAttribute(ballEClass, BALL__Y);
    createEAttribute(ballEClass, BALL__SIZE);
    createEAttribute(ballEClass, BALL__DIRECTION);
    createEAttribute(ballEClass, BALL__SPEED);

    blockEClass = createEClass(BLOCK);
    createEAttribute(blockEClass, BLOCK__HARDNESS);
    createEAttribute(blockEClass, BLOCK__NORMAL_RES);
    createEAttribute(blockEClass, BLOCK__FIRE_RES);
    createEAttribute(blockEClass, BLOCK__COLD_RES);
    createEAttribute(blockEClass, BLOCK__SHOCK_RES);
    createEReference(blockEClass, BLOCK__POWER);

    powerEClass = createEClass(POWER);
    createEAttribute(powerEClass, POWER__ID);
    createEReference(powerEClass, POWER__EFFECTS);
    createEAttribute(powerEClass, POWER__DURATION);
    createEAttribute(powerEClass, POWER__POWER_SPAWN_CHANCE);
    createEReference(powerEClass, POWER__TARGET);

    targetEClass = createEClass(TARGET);

    objectTargetEClass = createEClass(OBJECT_TARGET);
    createEReference(objectTargetEClass, OBJECT_TARGET__ITEM);

    typeTargetEClass = createEClass(TYPE_TARGET);
    createEAttribute(typeTargetEClass, TYPE_TARGET__TYPE);
    createEReference(typeTargetEClass, TYPE_TARGET__PARAMS);

    booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);

    booleanBinaryExpressionEClass = createEClass(BOOLEAN_BINARY_EXPRESSION);
    createEReference(booleanBinaryExpressionEClass, BOOLEAN_BINARY_EXPRESSION__LEFT);
    createEReference(booleanBinaryExpressionEClass, BOOLEAN_BINARY_EXPRESSION__RIGHT);

    booleanUnaryExpressionEClass = createEClass(BOOLEAN_UNARY_EXPRESSION);
    createEReference(booleanUnaryExpressionEClass, BOOLEAN_UNARY_EXPRESSION__BODY);

    eqParameterEClass = createEClass(EQ_PARAMETER);

    smthParameterEClass = createEClass(SMTH_PARAMETER);

    seqParameterEClass = createEClass(SEQ_PARAMETER);

    lthParameterEClass = createEClass(LTH_PARAMETER);

    leqParameterEClass = createEClass(LEQ_PARAMETER);

    neqParameterEClass = createEClass(NEQ_PARAMETER);

    orParameterEClass = createEClass(OR_PARAMETER);

    andParameterEClass = createEClass(AND_PARAMETER);

    bracketParameterEClass = createEClass(BRACKET_PARAMETER);

    negParameterEClass = createEClass(NEG_PARAMETER);

    attParameterEClass = createEClass(ATT_PARAMETER);
    createEAttribute(attParameterEClass, ATT_PARAMETER__ATT);

    intValueParameterEClass = createEClass(INT_VALUE_PARAMETER);
    createEAttribute(intValueParameterEClass, INT_VALUE_PARAMETER__VALUE);

    doubleValueParameterEClass = createEClass(DOUBLE_VALUE_PARAMETER);
    createEAttribute(doubleValueParameterEClass, DOUBLE_VALUE_PARAMETER__VALUE);

    effectEClass = createEClass(EFFECT);
    createEAttribute(effectEClass, EFFECT__ID);
    createEReference(effectEClass, EFFECT__TARGET);
    createEAttribute(effectEClass, EFFECT__TYPE);
    createEReference(effectEClass, EFFECT__EXPRESSION);

    expressionEClass = createEClass(EXPRESSION);

    binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
    createEReference(binaryExpressionEClass, BINARY_EXPRESSION__LEFT);
    createEReference(binaryExpressionEClass, BINARY_EXPRESSION__RIGHT);

    unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
    createEReference(unaryExpressionEClass, UNARY_EXPRESSION__BODY);

    multExpressionEClass = createEClass(MULT_EXPRESSION);

    divExpressionEClass = createEClass(DIV_EXPRESSION);

    plusExpressionEClass = createEClass(PLUS_EXPRESSION);

    minusExpressionEClass = createEClass(MINUS_EXPRESSION);

    bracketExpressionEClass = createEClass(BRACKET_EXPRESSION);

    negExpressionEClass = createEClass(NEG_EXPRESSION);

    intOperandEClass = createEClass(INT_OPERAND);
    createEAttribute(intOperandEClass, INT_OPERAND__VALUE);

    doubleOperandEClass = createEClass(DOUBLE_OPERAND);
    createEAttribute(doubleOperandEClass, DOUBLE_OPERAND__VALUE);

    attOperandEClass = createEClass(ATT_OPERAND);
    createEAttribute(attOperandEClass, ATT_OPERAND__ATT);

    // Create enums
    attributeEEnum = createEEnum(ATTRIBUTE);
    damageEffectTypeEEnum = createEEnum(DAMAGE_EFFECT_TYPE);
    targetTypeEEnum = createEEnum(TARGET_TYPE);
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
    paddleEClass.getESuperTypes().add(this.getBAPObject());
    ballEClass.getESuperTypes().add(this.getBAPObject());
    blockEClass.getESuperTypes().add(this.getBAPObject());
    objectTargetEClass.getESuperTypes().add(this.getTarget());
    typeTargetEClass.getESuperTypes().add(this.getTarget());
    booleanBinaryExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
    booleanUnaryExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
    eqParameterEClass.getESuperTypes().add(this.getBooleanBinaryExpression());
    smthParameterEClass.getESuperTypes().add(this.getBooleanBinaryExpression());
    seqParameterEClass.getESuperTypes().add(this.getBooleanBinaryExpression());
    lthParameterEClass.getESuperTypes().add(this.getBooleanBinaryExpression());
    leqParameterEClass.getESuperTypes().add(this.getBooleanBinaryExpression());
    neqParameterEClass.getESuperTypes().add(this.getBooleanBinaryExpression());
    orParameterEClass.getESuperTypes().add(this.getBooleanBinaryExpression());
    andParameterEClass.getESuperTypes().add(this.getBooleanBinaryExpression());
    bracketParameterEClass.getESuperTypes().add(this.getBooleanUnaryExpression());
    negParameterEClass.getESuperTypes().add(this.getBooleanUnaryExpression());
    attParameterEClass.getESuperTypes().add(this.getBooleanExpression());
    intValueParameterEClass.getESuperTypes().add(this.getBooleanExpression());
    doubleValueParameterEClass.getESuperTypes().add(this.getBooleanExpression());
    binaryExpressionEClass.getESuperTypes().add(this.getExpression());
    unaryExpressionEClass.getESuperTypes().add(this.getExpression());
    multExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
    divExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
    plusExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
    minusExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
    bracketExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
    negExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
    intOperandEClass.getESuperTypes().add(this.getExpression());
    doubleOperandEClass.getESuperTypes().add(this.getExpression());
    attOperandEClass.getESuperTypes().add(this.getExpression());

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

    initEClass(bapObjectEClass, BAPObject.class, "BAPObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBAPObject_Id(), ecorePackage.getEString(), "id", null, 1, 1, BAPObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paddleEClass, Paddle.class, "Paddle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPaddle_X(), ecorePackage.getEDouble(), "x", null, 1, 1, Paddle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPaddle_Y(), ecorePackage.getEDouble(), "y", null, 1, 1, Paddle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPaddle_Size(), ecorePackage.getEInt(), "size", null, 1, 1, Paddle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPaddle_Orientation(), ecorePackage.getEInt(), "orientation", null, 1, 1, Paddle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ballEClass, Ball.class, "Ball", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBall_X(), ecorePackage.getEDouble(), "x", null, 1, 1, Ball.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBall_Y(), ecorePackage.getEDouble(), "y", null, 1, 1, Ball.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBall_Size(), ecorePackage.getEInt(), "size", null, 0, 1, Ball.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBall_Direction(), ecorePackage.getEInt(), "direction", null, 0, 1, Ball.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBall_Speed(), ecorePackage.getEInt(), "speed", null, 0, 1, Ball.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBlock_Hardness(), ecorePackage.getEInt(), "hardness", null, 1, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBlock_NormalRes(), ecorePackage.getEInt(), "normalRes", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBlock_FireRes(), ecorePackage.getEInt(), "fireRes", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBlock_ColdRes(), ecorePackage.getEInt(), "coldRes", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBlock_ShockRes(), ecorePackage.getEInt(), "shockRes", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBlock_Power(), this.getPower(), null, "power", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(powerEClass, Power.class, "Power", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPower_Id(), ecorePackage.getEString(), "id", null, 1, 1, Power.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPower_Effects(), this.getEffect(), null, "effects", null, 1, -1, Power.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPower_Duration(), ecorePackage.getEInt(), "duration", null, 1, 1, Power.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPower_PowerSpawnChance(), ecorePackage.getEFloat(), "powerSpawnChance", null, 0, 1, Power.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPower_Target(), this.getTarget(), null, "target", null, 1, 1, Power.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(targetEClass, Target.class, "Target", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectTargetEClass, ObjectTarget.class, "ObjectTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectTarget_Item(), this.getBAPObject(), null, "item", null, 1, 1, ObjectTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeTargetEClass, TypeTarget.class, "TypeTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeTarget_Type(), this.getTargetType(), "type", null, 1, 1, TypeTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeTarget_Params(), this.getBooleanExpression(), null, "params", null, 1, 1, TypeTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanBinaryExpressionEClass, BooleanBinaryExpression.class, "BooleanBinaryExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBooleanBinaryExpression_Left(), this.getBooleanExpression(), null, "left", null, 1, 1, BooleanBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBooleanBinaryExpression_Right(), this.getBooleanExpression(), null, "right", null, 1, 1, BooleanBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanUnaryExpressionEClass, BooleanUnaryExpression.class, "BooleanUnaryExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBooleanUnaryExpression_Body(), this.getBooleanExpression(), null, "body", null, 1, 1, BooleanUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eqParameterEClass, EqParameter.class, "EqParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smthParameterEClass, SmthParameter.class, "SmthParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(seqParameterEClass, SeqParameter.class, "SeqParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lthParameterEClass, LthParameter.class, "LthParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(leqParameterEClass, LeqParameter.class, "LeqParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(neqParameterEClass, NeqParameter.class, "NeqParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(orParameterEClass, OrParameter.class, "OrParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(andParameterEClass, AndParameter.class, "AndParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bracketParameterEClass, BracketParameter.class, "BracketParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(negParameterEClass, NegParameter.class, "NegParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(attParameterEClass, AttParameter.class, "AttParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttParameter_Att(), this.getAttribute(), "att", null, 1, 1, AttParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intValueParameterEClass, IntValueParameter.class, "IntValueParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntValueParameter_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntValueParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doubleValueParameterEClass, DoubleValueParameter.class, "DoubleValueParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDoubleValueParameter_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, DoubleValueParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(effectEClass, Effect.class, "Effect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEffect_Id(), ecorePackage.getEString(), "id", null, 1, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEffect_Target(), this.getTarget(), null, "target", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEffect_Type(), this.getAttribute(), "type", null, 1, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEffect_Expression(), this.getExpression(), null, "expression", null, 1, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinaryExpression_Left(), this.getExpression(), null, "left", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryExpression_Right(), this.getExpression(), null, "right", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnaryExpression_Body(), this.getExpression(), null, "body", null, 1, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multExpressionEClass, MultExpression.class, "MultExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(divExpressionEClass, DivExpression.class, "DivExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(plusExpressionEClass, PlusExpression.class, "PlusExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(minusExpressionEClass, MinusExpression.class, "MinusExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bracketExpressionEClass, BracketExpression.class, "BracketExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(negExpressionEClass, NegExpression.class, "NegExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(intOperandEClass, IntOperand.class, "IntOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntOperand_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doubleOperandEClass, DoubleOperand.class, "DoubleOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDoubleOperand_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, DoubleOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attOperandEClass, AttOperand.class, "AttOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttOperand_Att(), this.getAttribute(), "att", null, 1, 1, AttOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(attributeEEnum, Attribute.class, "Attribute");
    addEEnumLiteral(attributeEEnum, Attribute.X);
    addEEnumLiteral(attributeEEnum, Attribute.Y);
    addEEnumLiteral(attributeEEnum, Attribute.SIZE);
    addEEnumLiteral(attributeEEnum, Attribute.ORIENTATION);
    addEEnumLiteral(attributeEEnum, Attribute.SPEED);
    addEEnumLiteral(attributeEEnum, Attribute.HARDNESS);
    addEEnumLiteral(attributeEEnum, Attribute.NORMAL_RES);
    addEEnumLiteral(attributeEEnum, Attribute.FIRE_RES);
    addEEnumLiteral(attributeEEnum, Attribute.COLD_RES);
    addEEnumLiteral(attributeEEnum, Attribute.SHOCK_RES);
    addEEnumLiteral(attributeEEnum, Attribute.NORMAL_DAM);
    addEEnumLiteral(attributeEEnum, Attribute.FIRE_DAM);
    addEEnumLiteral(attributeEEnum, Attribute.COLD_DAM);
    addEEnumLiteral(attributeEEnum, Attribute.SHOCK_DAM);

    initEEnum(damageEffectTypeEEnum, DamageEffectType.class, "DamageEffectType");
    addEEnumLiteral(damageEffectTypeEEnum, DamageEffectType.DAMAGE);

    initEEnum(targetTypeEEnum, TargetType.class, "TargetType");
    addEEnumLiteral(targetTypeEEnum, TargetType.BLOCK);
    addEEnumLiteral(targetTypeEEnum, TargetType.PADDLE);
    addEEnumLiteral(targetTypeEEnum, TargetType.BALL);

    // Create resource
    createResource(eNS_URI);
  }

} //BallandpaddlePackageImpl
