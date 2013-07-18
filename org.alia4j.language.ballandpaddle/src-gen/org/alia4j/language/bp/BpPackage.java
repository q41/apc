/**
 */
package org.alia4j.language.bp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.alia4j.language.bp.BpFactory
 * @model kind="package"
 * @generated
 */
public interface BpPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "bp";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftext.org/language/ballandpaddle";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "bp";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BpPackage eINSTANCE = org.alia4j.language.bp.impl.BpPackageImpl.init();

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.RootImpl <em>Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.RootImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getRoot()
   * @generated
   */
  int ROOT = 0;

  /**
   * The feature id for the '<em><b>Level</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__LEVEL = 0;

  /**
   * The feature id for the '<em><b>Paddles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__PADDLES = 1;

  /**
   * The feature id for the '<em><b>Balls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__BALLS = 2;

  /**
   * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__BLOCKS = 3;

  /**
   * The feature id for the '<em><b>Effects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__EFFECTS = 4;

  /**
   * The feature id for the '<em><b>Powers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__POWERS = 5;

  /**
   * The number of structural features of the '<em>Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.LevelImpl <em>Level</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.LevelImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getLevel()
   * @generated
   */
  int LEVEL = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL__ID = 0;

  /**
   * The feature id for the '<em><b>Power Spawn Chance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL__POWER_SPAWN_CHANCE = 1;

  /**
   * The feature id for the '<em><b>Blocks</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL__BLOCKS = 2;

  /**
   * The number of structural features of the '<em>Level</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.BPObjectImpl <em>BP Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.BPObjectImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getBPObject()
   * @generated
   */
  int BP_OBJECT = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BP_OBJECT__ID = 0;

  /**
   * The number of structural features of the '<em>BP Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BP_OBJECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.PaddleImpl <em>Paddle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.PaddleImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getPaddle()
   * @generated
   */
  int PADDLE = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PADDLE__ID = BP_OBJECT__ID;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PADDLE__X = BP_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PADDLE__Y = BP_OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PADDLE__SIZE = BP_OBJECT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Paddle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PADDLE_FEATURE_COUNT = BP_OBJECT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.BallImpl <em>Ball</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.BallImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getBall()
   * @generated
   */
  int BALL = 4;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BALL__ID = BP_OBJECT__ID;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BALL__X = BP_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BALL__Y = BP_OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BALL__SIZE = BP_OBJECT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Orientation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BALL__ORIENTATION = BP_OBJECT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Damage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BALL__DAMAGE = BP_OBJECT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Speed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BALL__SPEED = BP_OBJECT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Ball</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BALL_FEATURE_COUNT = BP_OBJECT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.BlockImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__ID = BP_OBJECT__ID;

  /**
   * The feature id for the '<em><b>Hardness</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__HARDNESS = BP_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Resistance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__RESISTANCE = BP_OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Power</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__POWER = BP_OBJECT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = BP_OBJECT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.PowerImpl <em>Power</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.PowerImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getPower()
   * @generated
   */
  int POWER = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER__ID = 0;

  /**
   * The feature id for the '<em><b>Effects</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER__EFFECTS = 1;

  /**
   * The feature id for the '<em><b>Power Spawn Chance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER__POWER_SPAWN_CHANCE = 2;

  /**
   * The number of structural features of the '<em>Power</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.TargetImpl <em>Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.TargetImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getTarget()
   * @generated
   */
  int TARGET = 7;

  /**
   * The number of structural features of the '<em>Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.ObjectTargetImpl <em>Object Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.ObjectTargetImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getObjectTarget()
   * @generated
   */
  int OBJECT_TARGET = 8;

  /**
   * The feature id for the '<em><b>Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TARGET__OBJECT = TARGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TARGET_FEATURE_COUNT = TARGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.ClassTargetImpl <em>Class Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.ClassTargetImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getClassTarget()
   * @generated
   */
  int CLASS_TARGET = 9;

  /**
   * The feature id for the '<em><b>Class Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_TARGET__CLASS_TYPE = TARGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Class Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_TARGET_FEATURE_COUNT = TARGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.EffectImpl <em>Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.EffectImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getEffect()
   * @generated
   */
  int EFFECT = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__ID = 0;

  /**
   * The feature id for the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__DURATION = 1;

  /**
   * The number of structural features of the '<em>Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.GeneralEffectImpl <em>General Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.GeneralEffectImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getGeneralEffect()
   * @generated
   */
  int GENERAL_EFFECT = 11;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_EFFECT__ID = EFFECT__ID;

  /**
   * The feature id for the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_EFFECT__DURATION = EFFECT__DURATION;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_EFFECT__TARGET = EFFECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_EFFECT__FILTER = EFFECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_EFFECT__BODY = EFFECT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>General Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.CollisionEffectImpl <em>Collision Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.CollisionEffectImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getCollisionEffect()
   * @generated
   */
  int COLLISION_EFFECT = 12;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLISION_EFFECT__ID = EFFECT__ID;

  /**
   * The feature id for the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLISION_EFFECT__DURATION = EFFECT__DURATION;

  /**
   * The feature id for the '<em><b>Left Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLISION_EFFECT__LEFT_TARGET = EFFECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Left Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLISION_EFFECT__LEFT_FILTER = EFFECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLISION_EFFECT__RIGHT_TARGET = EFFECT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Right Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLISION_EFFECT__RIGHT_FILTER = EFFECT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLISION_EFFECT__BODY = EFFECT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Collision Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLISION_EFFECT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.EffectBodyImpl <em>Effect Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.EffectBodyImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getEffectBody()
   * @generated
   */
  int EFFECT_BODY = 13;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_BODY__OP = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_BODY__NAME = 1;

  /**
   * The number of structural features of the '<em>Effect Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_BODY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.GeneralEffectBodyImpl <em>General Effect Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.GeneralEffectBodyImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getGeneralEffectBody()
   * @generated
   */
  int GENERAL_EFFECT_BODY = 14;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_EFFECT_BODY__OP = EFFECT_BODY__OP;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_EFFECT_BODY__NAME = EFFECT_BODY__NAME;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_EFFECT_BODY__EXPRESSION = EFFECT_BODY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>General Effect Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_EFFECT_BODY_FEATURE_COUNT = EFFECT_BODY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.CollisionEffectBodyImpl <em>Collision Effect Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.CollisionEffectBodyImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getCollisionEffectBody()
   * @generated
   */
  int COLLISION_EFFECT_BODY = 15;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLISION_EFFECT_BODY__OP = EFFECT_BODY__OP;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLISION_EFFECT_BODY__NAME = EFFECT_BODY__NAME;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLISION_EFFECT_BODY__TARGET = EFFECT_BODY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLISION_EFFECT_BODY__EXPRESSION = EFFECT_BODY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Collision Effect Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLISION_EFFECT_BODY_FEATURE_COUNT = EFFECT_BODY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.CollisionExpressionImpl <em>Collision Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.CollisionExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getCollisionExpression()
   * @generated
   */
  int COLLISION_EXPRESSION = 16;

  /**
   * The number of structural features of the '<em>Collision Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLISION_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.BinaryCollisionExpressionImpl <em>Binary Collision Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.BinaryCollisionExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getBinaryCollisionExpression()
   * @generated
   */
  int BINARY_COLLISION_EXPRESSION = 17;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_COLLISION_EXPRESSION__LEFT = COLLISION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_COLLISION_EXPRESSION__RIGHT = COLLISION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Binary Collision Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_COLLISION_EXPRESSION_FEATURE_COUNT = COLLISION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.UnaryCollisionExpressionImpl <em>Unary Collision Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.UnaryCollisionExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getUnaryCollisionExpression()
   * @generated
   */
  int UNARY_COLLISION_EXPRESSION = 18;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_COLLISION_EXPRESSION__BODY = COLLISION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Unary Collision Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_COLLISION_EXPRESSION_FEATURE_COUNT = COLLISION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.EqCollisionExpressionImpl <em>Eq Collision Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.EqCollisionExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getEqCollisionExpression()
   * @generated
   */
  int EQ_COLLISION_EXPRESSION = 19;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_COLLISION_EXPRESSION__LEFT = BINARY_COLLISION_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_COLLISION_EXPRESSION__RIGHT = BINARY_COLLISION_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Eq Collision Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_COLLISION_EXPRESSION_FEATURE_COUNT = BINARY_COLLISION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.SmthCollisionExpressionImpl <em>Smth Collision Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.SmthCollisionExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getSmthCollisionExpression()
   * @generated
   */
  int SMTH_COLLISION_EXPRESSION = 20;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMTH_COLLISION_EXPRESSION__LEFT = BINARY_COLLISION_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMTH_COLLISION_EXPRESSION__RIGHT = BINARY_COLLISION_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Smth Collision Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMTH_COLLISION_EXPRESSION_FEATURE_COUNT = BINARY_COLLISION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.SeqCollisionExpressionImpl <em>Seq Collision Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.SeqCollisionExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getSeqCollisionExpression()
   * @generated
   */
  int SEQ_COLLISION_EXPRESSION = 21;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_COLLISION_EXPRESSION__LEFT = BINARY_COLLISION_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_COLLISION_EXPRESSION__RIGHT = BINARY_COLLISION_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Seq Collision Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_COLLISION_EXPRESSION_FEATURE_COUNT = BINARY_COLLISION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.LthCollisionExpressionImpl <em>Lth Collision Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.LthCollisionExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getLthCollisionExpression()
   * @generated
   */
  int LTH_COLLISION_EXPRESSION = 22;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LTH_COLLISION_EXPRESSION__LEFT = BINARY_COLLISION_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LTH_COLLISION_EXPRESSION__RIGHT = BINARY_COLLISION_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Lth Collision Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LTH_COLLISION_EXPRESSION_FEATURE_COUNT = BINARY_COLLISION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.LeqCollisionExpressionImpl <em>Leq Collision Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.LeqCollisionExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getLeqCollisionExpression()
   * @generated
   */
  int LEQ_COLLISION_EXPRESSION = 23;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEQ_COLLISION_EXPRESSION__LEFT = BINARY_COLLISION_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEQ_COLLISION_EXPRESSION__RIGHT = BINARY_COLLISION_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Leq Collision Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEQ_COLLISION_EXPRESSION_FEATURE_COUNT = BINARY_COLLISION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.NeqCollisionExpressionImpl <em>Neq Collision Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.NeqCollisionExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getNeqCollisionExpression()
   * @generated
   */
  int NEQ_COLLISION_EXPRESSION = 24;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEQ_COLLISION_EXPRESSION__LEFT = BINARY_COLLISION_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEQ_COLLISION_EXPRESSION__RIGHT = BINARY_COLLISION_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Neq Collision Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEQ_COLLISION_EXPRESSION_FEATURE_COUNT = BINARY_COLLISION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.OrCollisionExpressionImpl <em>Or Collision Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.OrCollisionExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getOrCollisionExpression()
   * @generated
   */
  int OR_COLLISION_EXPRESSION = 25;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_COLLISION_EXPRESSION__LEFT = BINARY_COLLISION_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_COLLISION_EXPRESSION__RIGHT = BINARY_COLLISION_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Or Collision Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_COLLISION_EXPRESSION_FEATURE_COUNT = BINARY_COLLISION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.AndCollisionExpressionImpl <em>And Collision Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.AndCollisionExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getAndCollisionExpression()
   * @generated
   */
  int AND_COLLISION_EXPRESSION = 26;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_COLLISION_EXPRESSION__LEFT = BINARY_COLLISION_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_COLLISION_EXPRESSION__RIGHT = BINARY_COLLISION_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>And Collision Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_COLLISION_EXPRESSION_FEATURE_COUNT = BINARY_COLLISION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.MultCollisionExpressionImpl <em>Mult Collision Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.MultCollisionExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getMultCollisionExpression()
   * @generated
   */
  int MULT_COLLISION_EXPRESSION = 27;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULT_COLLISION_EXPRESSION__LEFT = BINARY_COLLISION_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULT_COLLISION_EXPRESSION__RIGHT = BINARY_COLLISION_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Mult Collision Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULT_COLLISION_EXPRESSION_FEATURE_COUNT = BINARY_COLLISION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.DivCollisionExpressionImpl <em>Div Collision Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.DivCollisionExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getDivCollisionExpression()
   * @generated
   */
  int DIV_COLLISION_EXPRESSION = 28;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_COLLISION_EXPRESSION__LEFT = BINARY_COLLISION_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_COLLISION_EXPRESSION__RIGHT = BINARY_COLLISION_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Div Collision Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_COLLISION_EXPRESSION_FEATURE_COUNT = BINARY_COLLISION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.PlusCollisionExpressionImpl <em>Plus Collision Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.PlusCollisionExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getPlusCollisionExpression()
   * @generated
   */
  int PLUS_COLLISION_EXPRESSION = 29;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_COLLISION_EXPRESSION__LEFT = BINARY_COLLISION_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_COLLISION_EXPRESSION__RIGHT = BINARY_COLLISION_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Plus Collision Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_COLLISION_EXPRESSION_FEATURE_COUNT = BINARY_COLLISION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.MinusCollisionExpressionImpl <em>Minus Collision Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.MinusCollisionExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getMinusCollisionExpression()
   * @generated
   */
  int MINUS_COLLISION_EXPRESSION = 30;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_COLLISION_EXPRESSION__LEFT = BINARY_COLLISION_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_COLLISION_EXPRESSION__RIGHT = BINARY_COLLISION_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Minus Collision Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_COLLISION_EXPRESSION_FEATURE_COUNT = BINARY_COLLISION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.BracketCollisionExpressionImpl <em>Bracket Collision Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.BracketCollisionExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getBracketCollisionExpression()
   * @generated
   */
  int BRACKET_COLLISION_EXPRESSION = 31;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACKET_COLLISION_EXPRESSION__BODY = UNARY_COLLISION_EXPRESSION__BODY;

  /**
   * The number of structural features of the '<em>Bracket Collision Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACKET_COLLISION_EXPRESSION_FEATURE_COUNT = UNARY_COLLISION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.NegCollisionExpressionImpl <em>Neg Collision Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.NegCollisionExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getNegCollisionExpression()
   * @generated
   */
  int NEG_COLLISION_EXPRESSION = 32;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEG_COLLISION_EXPRESSION__BODY = UNARY_COLLISION_EXPRESSION__BODY;

  /**
   * The number of structural features of the '<em>Neg Collision Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEG_COLLISION_EXPRESSION_FEATURE_COUNT = UNARY_COLLISION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.NotCollisionExpressionImpl <em>Not Collision Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.NotCollisionExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getNotCollisionExpression()
   * @generated
   */
  int NOT_COLLISION_EXPRESSION = 33;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_COLLISION_EXPRESSION__BODY = UNARY_COLLISION_EXPRESSION__BODY;

  /**
   * The number of structural features of the '<em>Not Collision Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_COLLISION_EXPRESSION_FEATURE_COUNT = UNARY_COLLISION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.IntCollisionOperandImpl <em>Int Collision Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.IntCollisionOperandImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getIntCollisionOperand()
   * @generated
   */
  int INT_COLLISION_OPERAND = 34;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_COLLISION_OPERAND__VALUE = COLLISION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Collision Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_COLLISION_OPERAND_FEATURE_COUNT = COLLISION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.DoubleCollisionOperandImpl <em>Double Collision Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.DoubleCollisionOperandImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getDoubleCollisionOperand()
   * @generated
   */
  int DOUBLE_COLLISION_OPERAND = 35;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_COLLISION_OPERAND__VALUE = COLLISION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Double Collision Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_COLLISION_OPERAND_FEATURE_COUNT = COLLISION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.BoolCollisionOperandImpl <em>Bool Collision Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.BoolCollisionOperandImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getBoolCollisionOperand()
   * @generated
   */
  int BOOL_COLLISION_OPERAND = 36;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_COLLISION_OPERAND__VALUE = COLLISION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bool Collision Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_COLLISION_OPERAND_FEATURE_COUNT = COLLISION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.AttCollisionOperandImpl <em>Att Collision Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.AttCollisionOperandImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getAttCollisionOperand()
   * @generated
   */
  int ATT_COLLISION_OPERAND = 37;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATT_COLLISION_OPERAND__TARGET = COLLISION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Att</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATT_COLLISION_OPERAND__ATT = COLLISION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Att Collision Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATT_COLLISION_OPERAND_FEATURE_COUNT = COLLISION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.ExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 38;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.BinaryExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getBinaryExpression()
   * @generated
   */
  int BINARY_EXPRESSION = 39;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Binary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.UnaryExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getUnaryExpression()
   * @generated
   */
  int UNARY_EXPRESSION = 40;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__BODY = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Unary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.EqExpressionImpl <em>Eq Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.EqExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getEqExpression()
   * @generated
   */
  int EQ_EXPRESSION = 41;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_EXPRESSION__LEFT = BINARY_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_EXPRESSION__RIGHT = BINARY_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Eq Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.SmthExpressionImpl <em>Smth Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.SmthExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getSmthExpression()
   * @generated
   */
  int SMTH_EXPRESSION = 42;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMTH_EXPRESSION__LEFT = BINARY_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMTH_EXPRESSION__RIGHT = BINARY_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Smth Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMTH_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.SeqExpressionImpl <em>Seq Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.SeqExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getSeqExpression()
   * @generated
   */
  int SEQ_EXPRESSION = 43;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_EXPRESSION__LEFT = BINARY_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_EXPRESSION__RIGHT = BINARY_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Seq Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.LthExpressionImpl <em>Lth Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.LthExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getLthExpression()
   * @generated
   */
  int LTH_EXPRESSION = 44;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LTH_EXPRESSION__LEFT = BINARY_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LTH_EXPRESSION__RIGHT = BINARY_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Lth Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LTH_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.LeqExpressionImpl <em>Leq Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.LeqExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getLeqExpression()
   * @generated
   */
  int LEQ_EXPRESSION = 45;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEQ_EXPRESSION__LEFT = BINARY_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEQ_EXPRESSION__RIGHT = BINARY_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Leq Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEQ_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.NeqExpressionImpl <em>Neq Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.NeqExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getNeqExpression()
   * @generated
   */
  int NEQ_EXPRESSION = 46;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEQ_EXPRESSION__LEFT = BINARY_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEQ_EXPRESSION__RIGHT = BINARY_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Neq Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEQ_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.OrExpressionImpl <em>Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.OrExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getOrExpression()
   * @generated
   */
  int OR_EXPRESSION = 47;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__LEFT = BINARY_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__RIGHT = BINARY_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.AndExpressionImpl <em>And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.AndExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getAndExpression()
   * @generated
   */
  int AND_EXPRESSION = 48;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__LEFT = BINARY_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__RIGHT = BINARY_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.MultExpressionImpl <em>Mult Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.MultExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getMultExpression()
   * @generated
   */
  int MULT_EXPRESSION = 49;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULT_EXPRESSION__LEFT = BINARY_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULT_EXPRESSION__RIGHT = BINARY_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Mult Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULT_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.DivExpressionImpl <em>Div Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.DivExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getDivExpression()
   * @generated
   */
  int DIV_EXPRESSION = 50;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_EXPRESSION__LEFT = BINARY_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_EXPRESSION__RIGHT = BINARY_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Div Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.PlusExpressionImpl <em>Plus Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.PlusExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getPlusExpression()
   * @generated
   */
  int PLUS_EXPRESSION = 51;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_EXPRESSION__LEFT = BINARY_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_EXPRESSION__RIGHT = BINARY_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Plus Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.MinusExpressionImpl <em>Minus Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.MinusExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getMinusExpression()
   * @generated
   */
  int MINUS_EXPRESSION = 52;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_EXPRESSION__LEFT = BINARY_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_EXPRESSION__RIGHT = BINARY_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Minus Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.BracketExpressionImpl <em>Bracket Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.BracketExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getBracketExpression()
   * @generated
   */
  int BRACKET_EXPRESSION = 53;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACKET_EXPRESSION__BODY = UNARY_EXPRESSION__BODY;

  /**
   * The number of structural features of the '<em>Bracket Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACKET_EXPRESSION_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.NegExpressionImpl <em>Neg Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.NegExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getNegExpression()
   * @generated
   */
  int NEG_EXPRESSION = 54;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEG_EXPRESSION__BODY = UNARY_EXPRESSION__BODY;

  /**
   * The number of structural features of the '<em>Neg Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEG_EXPRESSION_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.NotExpressionImpl <em>Not Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.NotExpressionImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getNotExpression()
   * @generated
   */
  int NOT_EXPRESSION = 55;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EXPRESSION__BODY = UNARY_EXPRESSION__BODY;

  /**
   * The number of structural features of the '<em>Not Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EXPRESSION_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.AttOperandImpl <em>Att Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.AttOperandImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getAttOperand()
   * @generated
   */
  int ATT_OPERAND = 56;

  /**
   * The feature id for the '<em><b>Att</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATT_OPERAND__ATT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Att Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATT_OPERAND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.IntOperandImpl <em>Int Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.IntOperandImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getIntOperand()
   * @generated
   */
  int INT_OPERAND = 57;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_OPERAND__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_OPERAND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.DoubleOperandImpl <em>Double Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.DoubleOperandImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getDoubleOperand()
   * @generated
   */
  int DOUBLE_OPERAND = 58;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_OPERAND__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Double Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_OPERAND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.impl.BooleanOperandImpl <em>Boolean Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.impl.BooleanOperandImpl
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getBooleanOperand()
   * @generated
   */
  int BOOLEAN_OPERAND = 59;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_OPERAND__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_OPERAND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.Attribute <em>Attribute</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.Attribute
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 60;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.BPClassType <em>BP Class Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.BPClassType
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getBPClassType()
   * @generated
   */
  int BP_CLASS_TYPE = 61;

  /**
   * The meta object id for the '{@link org.alia4j.language.bp.AdjustmentOperator <em>Adjustment Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.bp.AdjustmentOperator
   * @see org.alia4j.language.bp.impl.BpPackageImpl#getAdjustmentOperator()
   * @generated
   */
  int ADJUSTMENT_OPERATOR = 62;


  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root</em>'.
   * @see org.alia4j.language.bp.Root
   * @generated
   */
  EClass getRoot();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.bp.Root#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Level</em>'.
   * @see org.alia4j.language.bp.Root#getLevel()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Level();

  /**
   * Returns the meta object for the containment reference list '{@link org.alia4j.language.bp.Root#getPaddles <em>Paddles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Paddles</em>'.
   * @see org.alia4j.language.bp.Root#getPaddles()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Paddles();

  /**
   * Returns the meta object for the containment reference list '{@link org.alia4j.language.bp.Root#getBalls <em>Balls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Balls</em>'.
   * @see org.alia4j.language.bp.Root#getBalls()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Balls();

  /**
   * Returns the meta object for the containment reference list '{@link org.alia4j.language.bp.Root#getBlocks <em>Blocks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Blocks</em>'.
   * @see org.alia4j.language.bp.Root#getBlocks()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Blocks();

  /**
   * Returns the meta object for the containment reference list '{@link org.alia4j.language.bp.Root#getEffects <em>Effects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Effects</em>'.
   * @see org.alia4j.language.bp.Root#getEffects()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Effects();

  /**
   * Returns the meta object for the containment reference list '{@link org.alia4j.language.bp.Root#getPowers <em>Powers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Powers</em>'.
   * @see org.alia4j.language.bp.Root#getPowers()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Powers();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.Level <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Level</em>'.
   * @see org.alia4j.language.bp.Level
   * @generated
   */
  EClass getLevel();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.Level#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.alia4j.language.bp.Level#getId()
   * @see #getLevel()
   * @generated
   */
  EAttribute getLevel_Id();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.Level#getPowerSpawnChance <em>Power Spawn Chance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Power Spawn Chance</em>'.
   * @see org.alia4j.language.bp.Level#getPowerSpawnChance()
   * @see #getLevel()
   * @generated
   */
  EAttribute getLevel_PowerSpawnChance();

  /**
   * Returns the meta object for the attribute list '{@link org.alia4j.language.bp.Level#getBlocks <em>Blocks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Blocks</em>'.
   * @see org.alia4j.language.bp.Level#getBlocks()
   * @see #getLevel()
   * @generated
   */
  EAttribute getLevel_Blocks();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.BPObject <em>BP Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BP Object</em>'.
   * @see org.alia4j.language.bp.BPObject
   * @generated
   */
  EClass getBPObject();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.BPObject#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.alia4j.language.bp.BPObject#getId()
   * @see #getBPObject()
   * @generated
   */
  EAttribute getBPObject_Id();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.Paddle <em>Paddle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Paddle</em>'.
   * @see org.alia4j.language.bp.Paddle
   * @generated
   */
  EClass getPaddle();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.Paddle#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.alia4j.language.bp.Paddle#getX()
   * @see #getPaddle()
   * @generated
   */
  EAttribute getPaddle_X();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.Paddle#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.alia4j.language.bp.Paddle#getY()
   * @see #getPaddle()
   * @generated
   */
  EAttribute getPaddle_Y();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.Paddle#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.alia4j.language.bp.Paddle#getSize()
   * @see #getPaddle()
   * @generated
   */
  EAttribute getPaddle_Size();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.Ball <em>Ball</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ball</em>'.
   * @see org.alia4j.language.bp.Ball
   * @generated
   */
  EClass getBall();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.Ball#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.alia4j.language.bp.Ball#getX()
   * @see #getBall()
   * @generated
   */
  EAttribute getBall_X();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.Ball#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.alia4j.language.bp.Ball#getY()
   * @see #getBall()
   * @generated
   */
  EAttribute getBall_Y();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.Ball#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.alia4j.language.bp.Ball#getSize()
   * @see #getBall()
   * @generated
   */
  EAttribute getBall_Size();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.Ball#getOrientation <em>Orientation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Orientation</em>'.
   * @see org.alia4j.language.bp.Ball#getOrientation()
   * @see #getBall()
   * @generated
   */
  EAttribute getBall_Orientation();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.Ball#getDamage <em>Damage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Damage</em>'.
   * @see org.alia4j.language.bp.Ball#getDamage()
   * @see #getBall()
   * @generated
   */
  EAttribute getBall_Damage();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.Ball#getSpeed <em>Speed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Speed</em>'.
   * @see org.alia4j.language.bp.Ball#getSpeed()
   * @see #getBall()
   * @generated
   */
  EAttribute getBall_Speed();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see org.alia4j.language.bp.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.Block#getHardness <em>Hardness</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hardness</em>'.
   * @see org.alia4j.language.bp.Block#getHardness()
   * @see #getBlock()
   * @generated
   */
  EAttribute getBlock_Hardness();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.Block#getResistance <em>Resistance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resistance</em>'.
   * @see org.alia4j.language.bp.Block#getResistance()
   * @see #getBlock()
   * @generated
   */
  EAttribute getBlock_Resistance();

  /**
   * Returns the meta object for the reference '{@link org.alia4j.language.bp.Block#getPower <em>Power</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Power</em>'.
   * @see org.alia4j.language.bp.Block#getPower()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Power();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.Power <em>Power</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Power</em>'.
   * @see org.alia4j.language.bp.Power
   * @generated
   */
  EClass getPower();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.Power#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.alia4j.language.bp.Power#getId()
   * @see #getPower()
   * @generated
   */
  EAttribute getPower_Id();

  /**
   * Returns the meta object for the reference list '{@link org.alia4j.language.bp.Power#getEffects <em>Effects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Effects</em>'.
   * @see org.alia4j.language.bp.Power#getEffects()
   * @see #getPower()
   * @generated
   */
  EReference getPower_Effects();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.Power#getPowerSpawnChance <em>Power Spawn Chance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Power Spawn Chance</em>'.
   * @see org.alia4j.language.bp.Power#getPowerSpawnChance()
   * @see #getPower()
   * @generated
   */
  EAttribute getPower_PowerSpawnChance();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.Target <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Target</em>'.
   * @see org.alia4j.language.bp.Target
   * @generated
   */
  EClass getTarget();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.ObjectTarget <em>Object Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Target</em>'.
   * @see org.alia4j.language.bp.ObjectTarget
   * @generated
   */
  EClass getObjectTarget();

  /**
   * Returns the meta object for the reference '{@link org.alia4j.language.bp.ObjectTarget#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Object</em>'.
   * @see org.alia4j.language.bp.ObjectTarget#getObject()
   * @see #getObjectTarget()
   * @generated
   */
  EReference getObjectTarget_Object();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.ClassTarget <em>Class Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Target</em>'.
   * @see org.alia4j.language.bp.ClassTarget
   * @generated
   */
  EClass getClassTarget();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.ClassTarget#getClassType <em>Class Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Type</em>'.
   * @see org.alia4j.language.bp.ClassTarget#getClassType()
   * @see #getClassTarget()
   * @generated
   */
  EAttribute getClassTarget_ClassType();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.Effect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Effect</em>'.
   * @see org.alia4j.language.bp.Effect
   * @generated
   */
  EClass getEffect();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.Effect#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.alia4j.language.bp.Effect#getId()
   * @see #getEffect()
   * @generated
   */
  EAttribute getEffect_Id();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.Effect#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duration</em>'.
   * @see org.alia4j.language.bp.Effect#getDuration()
   * @see #getEffect()
   * @generated
   */
  EAttribute getEffect_Duration();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.GeneralEffect <em>General Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>General Effect</em>'.
   * @see org.alia4j.language.bp.GeneralEffect
   * @generated
   */
  EClass getGeneralEffect();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.bp.GeneralEffect#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.alia4j.language.bp.GeneralEffect#getTarget()
   * @see #getGeneralEffect()
   * @generated
   */
  EReference getGeneralEffect_Target();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.bp.GeneralEffect#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see org.alia4j.language.bp.GeneralEffect#getFilter()
   * @see #getGeneralEffect()
   * @generated
   */
  EReference getGeneralEffect_Filter();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.bp.GeneralEffect#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.alia4j.language.bp.GeneralEffect#getBody()
   * @see #getGeneralEffect()
   * @generated
   */
  EReference getGeneralEffect_Body();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.CollisionEffect <em>Collision Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collision Effect</em>'.
   * @see org.alia4j.language.bp.CollisionEffect
   * @generated
   */
  EClass getCollisionEffect();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.bp.CollisionEffect#getLeftTarget <em>Left Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Target</em>'.
   * @see org.alia4j.language.bp.CollisionEffect#getLeftTarget()
   * @see #getCollisionEffect()
   * @generated
   */
  EReference getCollisionEffect_LeftTarget();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.bp.CollisionEffect#getLeftFilter <em>Left Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Filter</em>'.
   * @see org.alia4j.language.bp.CollisionEffect#getLeftFilter()
   * @see #getCollisionEffect()
   * @generated
   */
  EReference getCollisionEffect_LeftFilter();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.bp.CollisionEffect#getRightTarget <em>Right Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Target</em>'.
   * @see org.alia4j.language.bp.CollisionEffect#getRightTarget()
   * @see #getCollisionEffect()
   * @generated
   */
  EReference getCollisionEffect_RightTarget();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.bp.CollisionEffect#getRightFilter <em>Right Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Filter</em>'.
   * @see org.alia4j.language.bp.CollisionEffect#getRightFilter()
   * @see #getCollisionEffect()
   * @generated
   */
  EReference getCollisionEffect_RightFilter();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.bp.CollisionEffect#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.alia4j.language.bp.CollisionEffect#getBody()
   * @see #getCollisionEffect()
   * @generated
   */
  EReference getCollisionEffect_Body();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.EffectBody <em>Effect Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Effect Body</em>'.
   * @see org.alia4j.language.bp.EffectBody
   * @generated
   */
  EClass getEffectBody();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.EffectBody#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.alia4j.language.bp.EffectBody#getOp()
   * @see #getEffectBody()
   * @generated
   */
  EAttribute getEffectBody_Op();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.EffectBody#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.alia4j.language.bp.EffectBody#getName()
   * @see #getEffectBody()
   * @generated
   */
  EAttribute getEffectBody_Name();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.GeneralEffectBody <em>General Effect Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>General Effect Body</em>'.
   * @see org.alia4j.language.bp.GeneralEffectBody
   * @generated
   */
  EClass getGeneralEffectBody();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.bp.GeneralEffectBody#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.alia4j.language.bp.GeneralEffectBody#getExpression()
   * @see #getGeneralEffectBody()
   * @generated
   */
  EReference getGeneralEffectBody_Expression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.CollisionEffectBody <em>Collision Effect Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collision Effect Body</em>'.
   * @see org.alia4j.language.bp.CollisionEffectBody
   * @generated
   */
  EClass getCollisionEffectBody();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.bp.CollisionEffectBody#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.alia4j.language.bp.CollisionEffectBody#getTarget()
   * @see #getCollisionEffectBody()
   * @generated
   */
  EReference getCollisionEffectBody_Target();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.bp.CollisionEffectBody#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.alia4j.language.bp.CollisionEffectBody#getExpression()
   * @see #getCollisionEffectBody()
   * @generated
   */
  EReference getCollisionEffectBody_Expression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.CollisionExpression <em>Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collision Expression</em>'.
   * @see org.alia4j.language.bp.CollisionExpression
   * @generated
   */
  EClass getCollisionExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.BinaryCollisionExpression <em>Binary Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Collision Expression</em>'.
   * @see org.alia4j.language.bp.BinaryCollisionExpression
   * @generated
   */
  EClass getBinaryCollisionExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.bp.BinaryCollisionExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.alia4j.language.bp.BinaryCollisionExpression#getLeft()
   * @see #getBinaryCollisionExpression()
   * @generated
   */
  EReference getBinaryCollisionExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.bp.BinaryCollisionExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.alia4j.language.bp.BinaryCollisionExpression#getRight()
   * @see #getBinaryCollisionExpression()
   * @generated
   */
  EReference getBinaryCollisionExpression_Right();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.UnaryCollisionExpression <em>Unary Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Collision Expression</em>'.
   * @see org.alia4j.language.bp.UnaryCollisionExpression
   * @generated
   */
  EClass getUnaryCollisionExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.bp.UnaryCollisionExpression#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.alia4j.language.bp.UnaryCollisionExpression#getBody()
   * @see #getUnaryCollisionExpression()
   * @generated
   */
  EReference getUnaryCollisionExpression_Body();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.EqCollisionExpression <em>Eq Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Eq Collision Expression</em>'.
   * @see org.alia4j.language.bp.EqCollisionExpression
   * @generated
   */
  EClass getEqCollisionExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.SmthCollisionExpression <em>Smth Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Smth Collision Expression</em>'.
   * @see org.alia4j.language.bp.SmthCollisionExpression
   * @generated
   */
  EClass getSmthCollisionExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.SeqCollisionExpression <em>Seq Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Seq Collision Expression</em>'.
   * @see org.alia4j.language.bp.SeqCollisionExpression
   * @generated
   */
  EClass getSeqCollisionExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.LthCollisionExpression <em>Lth Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lth Collision Expression</em>'.
   * @see org.alia4j.language.bp.LthCollisionExpression
   * @generated
   */
  EClass getLthCollisionExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.LeqCollisionExpression <em>Leq Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Leq Collision Expression</em>'.
   * @see org.alia4j.language.bp.LeqCollisionExpression
   * @generated
   */
  EClass getLeqCollisionExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.NeqCollisionExpression <em>Neq Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Neq Collision Expression</em>'.
   * @see org.alia4j.language.bp.NeqCollisionExpression
   * @generated
   */
  EClass getNeqCollisionExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.OrCollisionExpression <em>Or Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Collision Expression</em>'.
   * @see org.alia4j.language.bp.OrCollisionExpression
   * @generated
   */
  EClass getOrCollisionExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.AndCollisionExpression <em>And Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Collision Expression</em>'.
   * @see org.alia4j.language.bp.AndCollisionExpression
   * @generated
   */
  EClass getAndCollisionExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.MultCollisionExpression <em>Mult Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mult Collision Expression</em>'.
   * @see org.alia4j.language.bp.MultCollisionExpression
   * @generated
   */
  EClass getMultCollisionExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.DivCollisionExpression <em>Div Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div Collision Expression</em>'.
   * @see org.alia4j.language.bp.DivCollisionExpression
   * @generated
   */
  EClass getDivCollisionExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.PlusCollisionExpression <em>Plus Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus Collision Expression</em>'.
   * @see org.alia4j.language.bp.PlusCollisionExpression
   * @generated
   */
  EClass getPlusCollisionExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.MinusCollisionExpression <em>Minus Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus Collision Expression</em>'.
   * @see org.alia4j.language.bp.MinusCollisionExpression
   * @generated
   */
  EClass getMinusCollisionExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.BracketCollisionExpression <em>Bracket Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bracket Collision Expression</em>'.
   * @see org.alia4j.language.bp.BracketCollisionExpression
   * @generated
   */
  EClass getBracketCollisionExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.NegCollisionExpression <em>Neg Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Neg Collision Expression</em>'.
   * @see org.alia4j.language.bp.NegCollisionExpression
   * @generated
   */
  EClass getNegCollisionExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.NotCollisionExpression <em>Not Collision Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Collision Expression</em>'.
   * @see org.alia4j.language.bp.NotCollisionExpression
   * @generated
   */
  EClass getNotCollisionExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.IntCollisionOperand <em>Int Collision Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Collision Operand</em>'.
   * @see org.alia4j.language.bp.IntCollisionOperand
   * @generated
   */
  EClass getIntCollisionOperand();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.IntCollisionOperand#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.alia4j.language.bp.IntCollisionOperand#getValue()
   * @see #getIntCollisionOperand()
   * @generated
   */
  EAttribute getIntCollisionOperand_Value();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.DoubleCollisionOperand <em>Double Collision Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Collision Operand</em>'.
   * @see org.alia4j.language.bp.DoubleCollisionOperand
   * @generated
   */
  EClass getDoubleCollisionOperand();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.DoubleCollisionOperand#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.alia4j.language.bp.DoubleCollisionOperand#getValue()
   * @see #getDoubleCollisionOperand()
   * @generated
   */
  EAttribute getDoubleCollisionOperand_Value();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.BoolCollisionOperand <em>Bool Collision Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Collision Operand</em>'.
   * @see org.alia4j.language.bp.BoolCollisionOperand
   * @generated
   */
  EClass getBoolCollisionOperand();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.BoolCollisionOperand#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.alia4j.language.bp.BoolCollisionOperand#isValue()
   * @see #getBoolCollisionOperand()
   * @generated
   */
  EAttribute getBoolCollisionOperand_Value();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.AttCollisionOperand <em>Att Collision Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Att Collision Operand</em>'.
   * @see org.alia4j.language.bp.AttCollisionOperand
   * @generated
   */
  EClass getAttCollisionOperand();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.bp.AttCollisionOperand#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.alia4j.language.bp.AttCollisionOperand#getTarget()
   * @see #getAttCollisionOperand()
   * @generated
   */
  EReference getAttCollisionOperand_Target();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.AttCollisionOperand#getAtt <em>Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Att</em>'.
   * @see org.alia4j.language.bp.AttCollisionOperand#getAtt()
   * @see #getAttCollisionOperand()
   * @generated
   */
  EAttribute getAttCollisionOperand_Att();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.alia4j.language.bp.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.BinaryExpression <em>Binary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Expression</em>'.
   * @see org.alia4j.language.bp.BinaryExpression
   * @generated
   */
  EClass getBinaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.bp.BinaryExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.alia4j.language.bp.BinaryExpression#getLeft()
   * @see #getBinaryExpression()
   * @generated
   */
  EReference getBinaryExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.bp.BinaryExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.alia4j.language.bp.BinaryExpression#getRight()
   * @see #getBinaryExpression()
   * @generated
   */
  EReference getBinaryExpression_Right();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expression</em>'.
   * @see org.alia4j.language.bp.UnaryExpression
   * @generated
   */
  EClass getUnaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.bp.UnaryExpression#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.alia4j.language.bp.UnaryExpression#getBody()
   * @see #getUnaryExpression()
   * @generated
   */
  EReference getUnaryExpression_Body();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.EqExpression <em>Eq Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Eq Expression</em>'.
   * @see org.alia4j.language.bp.EqExpression
   * @generated
   */
  EClass getEqExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.SmthExpression <em>Smth Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Smth Expression</em>'.
   * @see org.alia4j.language.bp.SmthExpression
   * @generated
   */
  EClass getSmthExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.SeqExpression <em>Seq Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Seq Expression</em>'.
   * @see org.alia4j.language.bp.SeqExpression
   * @generated
   */
  EClass getSeqExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.LthExpression <em>Lth Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lth Expression</em>'.
   * @see org.alia4j.language.bp.LthExpression
   * @generated
   */
  EClass getLthExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.LeqExpression <em>Leq Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Leq Expression</em>'.
   * @see org.alia4j.language.bp.LeqExpression
   * @generated
   */
  EClass getLeqExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.NeqExpression <em>Neq Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Neq Expression</em>'.
   * @see org.alia4j.language.bp.NeqExpression
   * @generated
   */
  EClass getNeqExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expression</em>'.
   * @see org.alia4j.language.bp.OrExpression
   * @generated
   */
  EClass getOrExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expression</em>'.
   * @see org.alia4j.language.bp.AndExpression
   * @generated
   */
  EClass getAndExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.MultExpression <em>Mult Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mult Expression</em>'.
   * @see org.alia4j.language.bp.MultExpression
   * @generated
   */
  EClass getMultExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.DivExpression <em>Div Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div Expression</em>'.
   * @see org.alia4j.language.bp.DivExpression
   * @generated
   */
  EClass getDivExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.PlusExpression <em>Plus Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus Expression</em>'.
   * @see org.alia4j.language.bp.PlusExpression
   * @generated
   */
  EClass getPlusExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.MinusExpression <em>Minus Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus Expression</em>'.
   * @see org.alia4j.language.bp.MinusExpression
   * @generated
   */
  EClass getMinusExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.BracketExpression <em>Bracket Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bracket Expression</em>'.
   * @see org.alia4j.language.bp.BracketExpression
   * @generated
   */
  EClass getBracketExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.NegExpression <em>Neg Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Neg Expression</em>'.
   * @see org.alia4j.language.bp.NegExpression
   * @generated
   */
  EClass getNegExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.NotExpression <em>Not Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Expression</em>'.
   * @see org.alia4j.language.bp.NotExpression
   * @generated
   */
  EClass getNotExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.AttOperand <em>Att Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Att Operand</em>'.
   * @see org.alia4j.language.bp.AttOperand
   * @generated
   */
  EClass getAttOperand();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.AttOperand#getAtt <em>Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Att</em>'.
   * @see org.alia4j.language.bp.AttOperand#getAtt()
   * @see #getAttOperand()
   * @generated
   */
  EAttribute getAttOperand_Att();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.IntOperand <em>Int Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Operand</em>'.
   * @see org.alia4j.language.bp.IntOperand
   * @generated
   */
  EClass getIntOperand();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.IntOperand#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.alia4j.language.bp.IntOperand#getValue()
   * @see #getIntOperand()
   * @generated
   */
  EAttribute getIntOperand_Value();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.DoubleOperand <em>Double Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Operand</em>'.
   * @see org.alia4j.language.bp.DoubleOperand
   * @generated
   */
  EClass getDoubleOperand();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.DoubleOperand#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.alia4j.language.bp.DoubleOperand#getValue()
   * @see #getDoubleOperand()
   * @generated
   */
  EAttribute getDoubleOperand_Value();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.bp.BooleanOperand <em>Boolean Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Operand</em>'.
   * @see org.alia4j.language.bp.BooleanOperand
   * @generated
   */
  EClass getBooleanOperand();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.bp.BooleanOperand#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.alia4j.language.bp.BooleanOperand#isValue()
   * @see #getBooleanOperand()
   * @generated
   */
  EAttribute getBooleanOperand_Value();

  /**
   * Returns the meta object for enum '{@link org.alia4j.language.bp.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Attribute</em>'.
   * @see org.alia4j.language.bp.Attribute
   * @generated
   */
  EEnum getAttribute();

  /**
   * Returns the meta object for enum '{@link org.alia4j.language.bp.BPClassType <em>BP Class Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>BP Class Type</em>'.
   * @see org.alia4j.language.bp.BPClassType
   * @generated
   */
  EEnum getBPClassType();

  /**
   * Returns the meta object for enum '{@link org.alia4j.language.bp.AdjustmentOperator <em>Adjustment Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Adjustment Operator</em>'.
   * @see org.alia4j.language.bp.AdjustmentOperator
   * @generated
   */
  EEnum getAdjustmentOperator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BpFactory getBpFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.RootImpl <em>Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.RootImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getRoot()
     * @generated
     */
    EClass ROOT = eINSTANCE.getRoot();

    /**
     * The meta object literal for the '<em><b>Level</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT__LEVEL = eINSTANCE.getRoot_Level();

    /**
     * The meta object literal for the '<em><b>Paddles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT__PADDLES = eINSTANCE.getRoot_Paddles();

    /**
     * The meta object literal for the '<em><b>Balls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT__BALLS = eINSTANCE.getRoot_Balls();

    /**
     * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT__BLOCKS = eINSTANCE.getRoot_Blocks();

    /**
     * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT__EFFECTS = eINSTANCE.getRoot_Effects();

    /**
     * The meta object literal for the '<em><b>Powers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT__POWERS = eINSTANCE.getRoot_Powers();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.LevelImpl <em>Level</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.LevelImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getLevel()
     * @generated
     */
    EClass LEVEL = eINSTANCE.getLevel();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LEVEL__ID = eINSTANCE.getLevel_Id();

    /**
     * The meta object literal for the '<em><b>Power Spawn Chance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LEVEL__POWER_SPAWN_CHANCE = eINSTANCE.getLevel_PowerSpawnChance();

    /**
     * The meta object literal for the '<em><b>Blocks</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LEVEL__BLOCKS = eINSTANCE.getLevel_Blocks();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.BPObjectImpl <em>BP Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.BPObjectImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getBPObject()
     * @generated
     */
    EClass BP_OBJECT = eINSTANCE.getBPObject();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BP_OBJECT__ID = eINSTANCE.getBPObject_Id();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.PaddleImpl <em>Paddle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.PaddleImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getPaddle()
     * @generated
     */
    EClass PADDLE = eINSTANCE.getPaddle();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PADDLE__X = eINSTANCE.getPaddle_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PADDLE__Y = eINSTANCE.getPaddle_Y();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PADDLE__SIZE = eINSTANCE.getPaddle_Size();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.BallImpl <em>Ball</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.BallImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getBall()
     * @generated
     */
    EClass BALL = eINSTANCE.getBall();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BALL__X = eINSTANCE.getBall_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BALL__Y = eINSTANCE.getBall_Y();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BALL__SIZE = eINSTANCE.getBall_Size();

    /**
     * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BALL__ORIENTATION = eINSTANCE.getBall_Orientation();

    /**
     * The meta object literal for the '<em><b>Damage</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BALL__DAMAGE = eINSTANCE.getBall_Damage();

    /**
     * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BALL__SPEED = eINSTANCE.getBall_Speed();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.BlockImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Hardness</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BLOCK__HARDNESS = eINSTANCE.getBlock_Hardness();

    /**
     * The meta object literal for the '<em><b>Resistance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BLOCK__RESISTANCE = eINSTANCE.getBlock_Resistance();

    /**
     * The meta object literal for the '<em><b>Power</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__POWER = eINSTANCE.getBlock_Power();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.PowerImpl <em>Power</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.PowerImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getPower()
     * @generated
     */
    EClass POWER = eINSTANCE.getPower();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POWER__ID = eINSTANCE.getPower_Id();

    /**
     * The meta object literal for the '<em><b>Effects</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POWER__EFFECTS = eINSTANCE.getPower_Effects();

    /**
     * The meta object literal for the '<em><b>Power Spawn Chance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POWER__POWER_SPAWN_CHANCE = eINSTANCE.getPower_PowerSpawnChance();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.TargetImpl <em>Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.TargetImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getTarget()
     * @generated
     */
    EClass TARGET = eINSTANCE.getTarget();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.ObjectTargetImpl <em>Object Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.ObjectTargetImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getObjectTarget()
     * @generated
     */
    EClass OBJECT_TARGET = eINSTANCE.getObjectTarget();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_TARGET__OBJECT = eINSTANCE.getObjectTarget_Object();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.ClassTargetImpl <em>Class Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.ClassTargetImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getClassTarget()
     * @generated
     */
    EClass CLASS_TARGET = eINSTANCE.getClassTarget();

    /**
     * The meta object literal for the '<em><b>Class Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_TARGET__CLASS_TYPE = eINSTANCE.getClassTarget_ClassType();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.EffectImpl <em>Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.EffectImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getEffect()
     * @generated
     */
    EClass EFFECT = eINSTANCE.getEffect();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EFFECT__ID = eINSTANCE.getEffect_Id();

    /**
     * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EFFECT__DURATION = eINSTANCE.getEffect_Duration();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.GeneralEffectImpl <em>General Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.GeneralEffectImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getGeneralEffect()
     * @generated
     */
    EClass GENERAL_EFFECT = eINSTANCE.getGeneralEffect();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERAL_EFFECT__TARGET = eINSTANCE.getGeneralEffect_Target();

    /**
     * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERAL_EFFECT__FILTER = eINSTANCE.getGeneralEffect_Filter();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERAL_EFFECT__BODY = eINSTANCE.getGeneralEffect_Body();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.CollisionEffectImpl <em>Collision Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.CollisionEffectImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getCollisionEffect()
     * @generated
     */
    EClass COLLISION_EFFECT = eINSTANCE.getCollisionEffect();

    /**
     * The meta object literal for the '<em><b>Left Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLISION_EFFECT__LEFT_TARGET = eINSTANCE.getCollisionEffect_LeftTarget();

    /**
     * The meta object literal for the '<em><b>Left Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLISION_EFFECT__LEFT_FILTER = eINSTANCE.getCollisionEffect_LeftFilter();

    /**
     * The meta object literal for the '<em><b>Right Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLISION_EFFECT__RIGHT_TARGET = eINSTANCE.getCollisionEffect_RightTarget();

    /**
     * The meta object literal for the '<em><b>Right Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLISION_EFFECT__RIGHT_FILTER = eINSTANCE.getCollisionEffect_RightFilter();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLISION_EFFECT__BODY = eINSTANCE.getCollisionEffect_Body();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.EffectBodyImpl <em>Effect Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.EffectBodyImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getEffectBody()
     * @generated
     */
    EClass EFFECT_BODY = eINSTANCE.getEffectBody();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EFFECT_BODY__OP = eINSTANCE.getEffectBody_Op();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EFFECT_BODY__NAME = eINSTANCE.getEffectBody_Name();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.GeneralEffectBodyImpl <em>General Effect Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.GeneralEffectBodyImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getGeneralEffectBody()
     * @generated
     */
    EClass GENERAL_EFFECT_BODY = eINSTANCE.getGeneralEffectBody();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERAL_EFFECT_BODY__EXPRESSION = eINSTANCE.getGeneralEffectBody_Expression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.CollisionEffectBodyImpl <em>Collision Effect Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.CollisionEffectBodyImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getCollisionEffectBody()
     * @generated
     */
    EClass COLLISION_EFFECT_BODY = eINSTANCE.getCollisionEffectBody();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLISION_EFFECT_BODY__TARGET = eINSTANCE.getCollisionEffectBody_Target();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLISION_EFFECT_BODY__EXPRESSION = eINSTANCE.getCollisionEffectBody_Expression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.CollisionExpressionImpl <em>Collision Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.CollisionExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getCollisionExpression()
     * @generated
     */
    EClass COLLISION_EXPRESSION = eINSTANCE.getCollisionExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.BinaryCollisionExpressionImpl <em>Binary Collision Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.BinaryCollisionExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getBinaryCollisionExpression()
     * @generated
     */
    EClass BINARY_COLLISION_EXPRESSION = eINSTANCE.getBinaryCollisionExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_COLLISION_EXPRESSION__LEFT = eINSTANCE.getBinaryCollisionExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_COLLISION_EXPRESSION__RIGHT = eINSTANCE.getBinaryCollisionExpression_Right();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.UnaryCollisionExpressionImpl <em>Unary Collision Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.UnaryCollisionExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getUnaryCollisionExpression()
     * @generated
     */
    EClass UNARY_COLLISION_EXPRESSION = eINSTANCE.getUnaryCollisionExpression();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_COLLISION_EXPRESSION__BODY = eINSTANCE.getUnaryCollisionExpression_Body();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.EqCollisionExpressionImpl <em>Eq Collision Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.EqCollisionExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getEqCollisionExpression()
     * @generated
     */
    EClass EQ_COLLISION_EXPRESSION = eINSTANCE.getEqCollisionExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.SmthCollisionExpressionImpl <em>Smth Collision Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.SmthCollisionExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getSmthCollisionExpression()
     * @generated
     */
    EClass SMTH_COLLISION_EXPRESSION = eINSTANCE.getSmthCollisionExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.SeqCollisionExpressionImpl <em>Seq Collision Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.SeqCollisionExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getSeqCollisionExpression()
     * @generated
     */
    EClass SEQ_COLLISION_EXPRESSION = eINSTANCE.getSeqCollisionExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.LthCollisionExpressionImpl <em>Lth Collision Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.LthCollisionExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getLthCollisionExpression()
     * @generated
     */
    EClass LTH_COLLISION_EXPRESSION = eINSTANCE.getLthCollisionExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.LeqCollisionExpressionImpl <em>Leq Collision Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.LeqCollisionExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getLeqCollisionExpression()
     * @generated
     */
    EClass LEQ_COLLISION_EXPRESSION = eINSTANCE.getLeqCollisionExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.NeqCollisionExpressionImpl <em>Neq Collision Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.NeqCollisionExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getNeqCollisionExpression()
     * @generated
     */
    EClass NEQ_COLLISION_EXPRESSION = eINSTANCE.getNeqCollisionExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.OrCollisionExpressionImpl <em>Or Collision Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.OrCollisionExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getOrCollisionExpression()
     * @generated
     */
    EClass OR_COLLISION_EXPRESSION = eINSTANCE.getOrCollisionExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.AndCollisionExpressionImpl <em>And Collision Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.AndCollisionExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getAndCollisionExpression()
     * @generated
     */
    EClass AND_COLLISION_EXPRESSION = eINSTANCE.getAndCollisionExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.MultCollisionExpressionImpl <em>Mult Collision Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.MultCollisionExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getMultCollisionExpression()
     * @generated
     */
    EClass MULT_COLLISION_EXPRESSION = eINSTANCE.getMultCollisionExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.DivCollisionExpressionImpl <em>Div Collision Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.DivCollisionExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getDivCollisionExpression()
     * @generated
     */
    EClass DIV_COLLISION_EXPRESSION = eINSTANCE.getDivCollisionExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.PlusCollisionExpressionImpl <em>Plus Collision Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.PlusCollisionExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getPlusCollisionExpression()
     * @generated
     */
    EClass PLUS_COLLISION_EXPRESSION = eINSTANCE.getPlusCollisionExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.MinusCollisionExpressionImpl <em>Minus Collision Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.MinusCollisionExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getMinusCollisionExpression()
     * @generated
     */
    EClass MINUS_COLLISION_EXPRESSION = eINSTANCE.getMinusCollisionExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.BracketCollisionExpressionImpl <em>Bracket Collision Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.BracketCollisionExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getBracketCollisionExpression()
     * @generated
     */
    EClass BRACKET_COLLISION_EXPRESSION = eINSTANCE.getBracketCollisionExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.NegCollisionExpressionImpl <em>Neg Collision Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.NegCollisionExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getNegCollisionExpression()
     * @generated
     */
    EClass NEG_COLLISION_EXPRESSION = eINSTANCE.getNegCollisionExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.NotCollisionExpressionImpl <em>Not Collision Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.NotCollisionExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getNotCollisionExpression()
     * @generated
     */
    EClass NOT_COLLISION_EXPRESSION = eINSTANCE.getNotCollisionExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.IntCollisionOperandImpl <em>Int Collision Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.IntCollisionOperandImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getIntCollisionOperand()
     * @generated
     */
    EClass INT_COLLISION_OPERAND = eINSTANCE.getIntCollisionOperand();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_COLLISION_OPERAND__VALUE = eINSTANCE.getIntCollisionOperand_Value();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.DoubleCollisionOperandImpl <em>Double Collision Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.DoubleCollisionOperandImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getDoubleCollisionOperand()
     * @generated
     */
    EClass DOUBLE_COLLISION_OPERAND = eINSTANCE.getDoubleCollisionOperand();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOUBLE_COLLISION_OPERAND__VALUE = eINSTANCE.getDoubleCollisionOperand_Value();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.BoolCollisionOperandImpl <em>Bool Collision Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.BoolCollisionOperandImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getBoolCollisionOperand()
     * @generated
     */
    EClass BOOL_COLLISION_OPERAND = eINSTANCE.getBoolCollisionOperand();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOL_COLLISION_OPERAND__VALUE = eINSTANCE.getBoolCollisionOperand_Value();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.AttCollisionOperandImpl <em>Att Collision Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.AttCollisionOperandImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getAttCollisionOperand()
     * @generated
     */
    EClass ATT_COLLISION_OPERAND = eINSTANCE.getAttCollisionOperand();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATT_COLLISION_OPERAND__TARGET = eINSTANCE.getAttCollisionOperand_Target();

    /**
     * The meta object literal for the '<em><b>Att</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATT_COLLISION_OPERAND__ATT = eINSTANCE.getAttCollisionOperand_Att();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.ExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.BinaryExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getBinaryExpression()
     * @generated
     */
    EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_EXPRESSION__LEFT = eINSTANCE.getBinaryExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_EXPRESSION__RIGHT = eINSTANCE.getBinaryExpression_Right();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.UnaryExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getUnaryExpression()
     * @generated
     */
    EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION__BODY = eINSTANCE.getUnaryExpression_Body();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.EqExpressionImpl <em>Eq Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.EqExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getEqExpression()
     * @generated
     */
    EClass EQ_EXPRESSION = eINSTANCE.getEqExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.SmthExpressionImpl <em>Smth Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.SmthExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getSmthExpression()
     * @generated
     */
    EClass SMTH_EXPRESSION = eINSTANCE.getSmthExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.SeqExpressionImpl <em>Seq Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.SeqExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getSeqExpression()
     * @generated
     */
    EClass SEQ_EXPRESSION = eINSTANCE.getSeqExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.LthExpressionImpl <em>Lth Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.LthExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getLthExpression()
     * @generated
     */
    EClass LTH_EXPRESSION = eINSTANCE.getLthExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.LeqExpressionImpl <em>Leq Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.LeqExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getLeqExpression()
     * @generated
     */
    EClass LEQ_EXPRESSION = eINSTANCE.getLeqExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.NeqExpressionImpl <em>Neq Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.NeqExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getNeqExpression()
     * @generated
     */
    EClass NEQ_EXPRESSION = eINSTANCE.getNeqExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.OrExpressionImpl <em>Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.OrExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getOrExpression()
     * @generated
     */
    EClass OR_EXPRESSION = eINSTANCE.getOrExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.AndExpressionImpl <em>And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.AndExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getAndExpression()
     * @generated
     */
    EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.MultExpressionImpl <em>Mult Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.MultExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getMultExpression()
     * @generated
     */
    EClass MULT_EXPRESSION = eINSTANCE.getMultExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.DivExpressionImpl <em>Div Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.DivExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getDivExpression()
     * @generated
     */
    EClass DIV_EXPRESSION = eINSTANCE.getDivExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.PlusExpressionImpl <em>Plus Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.PlusExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getPlusExpression()
     * @generated
     */
    EClass PLUS_EXPRESSION = eINSTANCE.getPlusExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.MinusExpressionImpl <em>Minus Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.MinusExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getMinusExpression()
     * @generated
     */
    EClass MINUS_EXPRESSION = eINSTANCE.getMinusExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.BracketExpressionImpl <em>Bracket Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.BracketExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getBracketExpression()
     * @generated
     */
    EClass BRACKET_EXPRESSION = eINSTANCE.getBracketExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.NegExpressionImpl <em>Neg Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.NegExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getNegExpression()
     * @generated
     */
    EClass NEG_EXPRESSION = eINSTANCE.getNegExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.NotExpressionImpl <em>Not Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.NotExpressionImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getNotExpression()
     * @generated
     */
    EClass NOT_EXPRESSION = eINSTANCE.getNotExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.AttOperandImpl <em>Att Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.AttOperandImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getAttOperand()
     * @generated
     */
    EClass ATT_OPERAND = eINSTANCE.getAttOperand();

    /**
     * The meta object literal for the '<em><b>Att</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATT_OPERAND__ATT = eINSTANCE.getAttOperand_Att();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.IntOperandImpl <em>Int Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.IntOperandImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getIntOperand()
     * @generated
     */
    EClass INT_OPERAND = eINSTANCE.getIntOperand();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_OPERAND__VALUE = eINSTANCE.getIntOperand_Value();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.DoubleOperandImpl <em>Double Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.DoubleOperandImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getDoubleOperand()
     * @generated
     */
    EClass DOUBLE_OPERAND = eINSTANCE.getDoubleOperand();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOUBLE_OPERAND__VALUE = eINSTANCE.getDoubleOperand_Value();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.impl.BooleanOperandImpl <em>Boolean Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.impl.BooleanOperandImpl
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getBooleanOperand()
     * @generated
     */
    EClass BOOLEAN_OPERAND = eINSTANCE.getBooleanOperand();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_OPERAND__VALUE = eINSTANCE.getBooleanOperand_Value();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.Attribute <em>Attribute</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.Attribute
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getAttribute()
     * @generated
     */
    EEnum ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.BPClassType <em>BP Class Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.BPClassType
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getBPClassType()
     * @generated
     */
    EEnum BP_CLASS_TYPE = eINSTANCE.getBPClassType();

    /**
     * The meta object literal for the '{@link org.alia4j.language.bp.AdjustmentOperator <em>Adjustment Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.bp.AdjustmentOperator
     * @see org.alia4j.language.bp.impl.BpPackageImpl#getAdjustmentOperator()
     * @generated
     */
    EEnum ADJUSTMENT_OPERATOR = eINSTANCE.getAdjustmentOperator();

  }

} //BpPackage
