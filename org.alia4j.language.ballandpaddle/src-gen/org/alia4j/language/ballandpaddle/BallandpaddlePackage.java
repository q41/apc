/**
 */
package org.alia4j.language.ballandpaddle;

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
 * @see org.alia4j.language.ballandpaddle.BallandpaddleFactory
 * @model kind="package"
 * @generated
 */
public interface BallandpaddlePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ballandpaddle";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.alia4j.org/language/ballandpaddle";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ballandpaddle";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BallandpaddlePackage eINSTANCE = org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl.init();

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.RootImpl <em>Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.RootImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getRoot()
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
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.LevelImpl <em>Level</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.LevelImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getLevel()
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
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.BAPObjectImpl <em>BAP Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.BAPObjectImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getBAPObject()
   * @generated
   */
  int BAP_OBJECT = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAP_OBJECT__ID = 0;

  /**
   * The number of structural features of the '<em>BAP Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAP_OBJECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.PaddleImpl <em>Paddle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.PaddleImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getPaddle()
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
  int PADDLE__ID = BAP_OBJECT__ID;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PADDLE__X = BAP_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PADDLE__Y = BAP_OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Shape</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PADDLE__SHAPE = BAP_OBJECT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PADDLE__SIZE = BAP_OBJECT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Orientation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PADDLE__ORIENTATION = BAP_OBJECT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Paddle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PADDLE_FEATURE_COUNT = BAP_OBJECT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.BallImpl <em>Ball</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.BallImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getBall()
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
  int BALL__ID = BAP_OBJECT__ID;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BALL__X = BAP_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BALL__Y = BAP_OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BALL__SIZE = BAP_OBJECT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BALL__DIRECTION = BAP_OBJECT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Speed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BALL__SPEED = BAP_OBJECT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Ball</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BALL_FEATURE_COUNT = BAP_OBJECT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.BlockImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getBlock()
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
  int BLOCK__ID = BAP_OBJECT__ID;

  /**
   * The feature id for the '<em><b>Hardness</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__HARDNESS = BAP_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Normal Res</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__NORMAL_RES = BAP_OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fire Res</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__FIRE_RES = BAP_OBJECT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Cold Res</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__COLD_RES = BAP_OBJECT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Shock Res</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__SHOCK_RES = BAP_OBJECT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Power</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__POWER = BAP_OBJECT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = BAP_OBJECT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.PowerImpl <em>Power</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.PowerImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getPower()
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
   * The feature id for the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER__DURATION = 2;

  /**
   * The feature id for the '<em><b>Power Spawn Chance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER__POWER_SPAWN_CHANCE = 3;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER__TARGET = 4;

  /**
   * The number of structural features of the '<em>Power</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.TargetImpl <em>Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.TargetImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getTarget()
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
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.ObjectTargetImpl <em>Object Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.ObjectTargetImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getObjectTarget()
   * @generated
   */
  int OBJECT_TARGET = 8;

  /**
   * The feature id for the '<em><b>Item</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TARGET__ITEM = TARGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TARGET_FEATURE_COUNT = TARGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.TypeTargetImpl <em>Type Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.TypeTargetImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getTypeTarget()
   * @generated
   */
  int TYPE_TARGET = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TARGET__TYPE = TARGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TARGET__PARAMS = TARGET_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TARGET_FEATURE_COUNT = TARGET_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.BooleanExpressionImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getBooleanExpression()
   * @generated
   */
  int BOOLEAN_EXPRESSION = 10;

  /**
   * The number of structural features of the '<em>Boolean Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.BooleanBinaryExpressionImpl <em>Boolean Binary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.BooleanBinaryExpressionImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getBooleanBinaryExpression()
   * @generated
   */
  int BOOLEAN_BINARY_EXPRESSION = 11;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_BINARY_EXPRESSION__LEFT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_BINARY_EXPRESSION__RIGHT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Boolean Binary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_BINARY_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.BooleanUnaryExpressionImpl <em>Boolean Unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.BooleanUnaryExpressionImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getBooleanUnaryExpression()
   * @generated
   */
  int BOOLEAN_UNARY_EXPRESSION = 12;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_UNARY_EXPRESSION__BODY = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Unary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_UNARY_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.EqParameterImpl <em>Eq Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.EqParameterImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getEqParameter()
   * @generated
   */
  int EQ_PARAMETER = 13;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_PARAMETER__LEFT = BOOLEAN_BINARY_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_PARAMETER__RIGHT = BOOLEAN_BINARY_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Eq Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_PARAMETER_FEATURE_COUNT = BOOLEAN_BINARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.SmthParameterImpl <em>Smth Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.SmthParameterImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getSmthParameter()
   * @generated
   */
  int SMTH_PARAMETER = 14;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMTH_PARAMETER__LEFT = BOOLEAN_BINARY_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMTH_PARAMETER__RIGHT = BOOLEAN_BINARY_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Smth Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMTH_PARAMETER_FEATURE_COUNT = BOOLEAN_BINARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.SeqParameterImpl <em>Seq Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.SeqParameterImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getSeqParameter()
   * @generated
   */
  int SEQ_PARAMETER = 15;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_PARAMETER__LEFT = BOOLEAN_BINARY_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_PARAMETER__RIGHT = BOOLEAN_BINARY_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Seq Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_PARAMETER_FEATURE_COUNT = BOOLEAN_BINARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.LthParameterImpl <em>Lth Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.LthParameterImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getLthParameter()
   * @generated
   */
  int LTH_PARAMETER = 16;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LTH_PARAMETER__LEFT = BOOLEAN_BINARY_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LTH_PARAMETER__RIGHT = BOOLEAN_BINARY_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Lth Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LTH_PARAMETER_FEATURE_COUNT = BOOLEAN_BINARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.LeqParameterImpl <em>Leq Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.LeqParameterImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getLeqParameter()
   * @generated
   */
  int LEQ_PARAMETER = 17;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEQ_PARAMETER__LEFT = BOOLEAN_BINARY_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEQ_PARAMETER__RIGHT = BOOLEAN_BINARY_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Leq Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEQ_PARAMETER_FEATURE_COUNT = BOOLEAN_BINARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.NeqParameterImpl <em>Neq Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.NeqParameterImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getNeqParameter()
   * @generated
   */
  int NEQ_PARAMETER = 18;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEQ_PARAMETER__LEFT = BOOLEAN_BINARY_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEQ_PARAMETER__RIGHT = BOOLEAN_BINARY_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Neq Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEQ_PARAMETER_FEATURE_COUNT = BOOLEAN_BINARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.OrParameterImpl <em>Or Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.OrParameterImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getOrParameter()
   * @generated
   */
  int OR_PARAMETER = 19;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_PARAMETER__LEFT = BOOLEAN_BINARY_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_PARAMETER__RIGHT = BOOLEAN_BINARY_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Or Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_PARAMETER_FEATURE_COUNT = BOOLEAN_BINARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.AndParameterImpl <em>And Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.AndParameterImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getAndParameter()
   * @generated
   */
  int AND_PARAMETER = 20;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_PARAMETER__LEFT = BOOLEAN_BINARY_EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_PARAMETER__RIGHT = BOOLEAN_BINARY_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>And Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_PARAMETER_FEATURE_COUNT = BOOLEAN_BINARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.BracketParameterImpl <em>Bracket Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.BracketParameterImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getBracketParameter()
   * @generated
   */
  int BRACKET_PARAMETER = 21;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACKET_PARAMETER__BODY = BOOLEAN_UNARY_EXPRESSION__BODY;

  /**
   * The number of structural features of the '<em>Bracket Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACKET_PARAMETER_FEATURE_COUNT = BOOLEAN_UNARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.NegParameterImpl <em>Neg Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.NegParameterImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getNegParameter()
   * @generated
   */
  int NEG_PARAMETER = 22;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEG_PARAMETER__BODY = BOOLEAN_UNARY_EXPRESSION__BODY;

  /**
   * The number of structural features of the '<em>Neg Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEG_PARAMETER_FEATURE_COUNT = BOOLEAN_UNARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.AttParameterImpl <em>Att Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.AttParameterImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getAttParameter()
   * @generated
   */
  int ATT_PARAMETER = 23;

  /**
   * The feature id for the '<em><b>Att</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATT_PARAMETER__ATT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Att Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATT_PARAMETER_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.ValueParameterImpl <em>Value Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.ValueParameterImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getValueParameter()
   * @generated
   */
  int VALUE_PARAMETER = 24;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_PARAMETER__VALUE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Value Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_PARAMETER_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.EffectImpl <em>Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.EffectImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getEffect()
   * @generated
   */
  int EFFECT = 25;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__ID = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__TARGET = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__TYPE = 2;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__EXPRESSION = 3;

  /**
   * The number of structural features of the '<em>Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.ExpressionImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 26;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.BinaryExpressionImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getBinaryExpression()
   * @generated
   */
  int BINARY_EXPRESSION = 27;

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
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.UnaryExpressionImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getUnaryExpression()
   * @generated
   */
  int UNARY_EXPRESSION = 28;

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
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.MultExpressionImpl <em>Mult Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.MultExpressionImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getMultExpression()
   * @generated
   */
  int MULT_EXPRESSION = 29;

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
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.DivExpressionImpl <em>Div Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.DivExpressionImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getDivExpression()
   * @generated
   */
  int DIV_EXPRESSION = 30;

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
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.PlusExpressionImpl <em>Plus Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.PlusExpressionImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getPlusExpression()
   * @generated
   */
  int PLUS_EXPRESSION = 31;

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
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.MinusExpressionImpl <em>Minus Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.MinusExpressionImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getMinusExpression()
   * @generated
   */
  int MINUS_EXPRESSION = 32;

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
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.BracketExpressionImpl <em>Bracket Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.BracketExpressionImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getBracketExpression()
   * @generated
   */
  int BRACKET_EXPRESSION = 33;

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
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.NegExpressionImpl <em>Neg Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.NegExpressionImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getNegExpression()
   * @generated
   */
  int NEG_EXPRESSION = 34;

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
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.IntOperandImpl <em>Int Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.IntOperandImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getIntOperand()
   * @generated
   */
  int INT_OPERAND = 35;

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
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.impl.AttOperandImpl <em>Att Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.impl.AttOperandImpl
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getAttOperand()
   * @generated
   */
  int ATT_OPERAND = 36;

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
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.Attribute <em>Attribute</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.Attribute
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 37;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.Shape <em>Shape</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.Shape
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getShape()
   * @generated
   */
  int SHAPE = 38;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.DamageEffectType <em>Damage Effect Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.DamageEffectType
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getDamageEffectType()
   * @generated
   */
  int DAMAGE_EFFECT_TYPE = 39;

  /**
   * The meta object id for the '{@link org.alia4j.language.ballandpaddle.TargetType <em>Target Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alia4j.language.ballandpaddle.TargetType
   * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getTargetType()
   * @generated
   */
  int TARGET_TYPE = 40;


  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root</em>'.
   * @see org.alia4j.language.ballandpaddle.Root
   * @generated
   */
  EClass getRoot();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.ballandpaddle.Root#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Level</em>'.
   * @see org.alia4j.language.ballandpaddle.Root#getLevel()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Level();

  /**
   * Returns the meta object for the containment reference list '{@link org.alia4j.language.ballandpaddle.Root#getPaddles <em>Paddles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Paddles</em>'.
   * @see org.alia4j.language.ballandpaddle.Root#getPaddles()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Paddles();

  /**
   * Returns the meta object for the containment reference list '{@link org.alia4j.language.ballandpaddle.Root#getBalls <em>Balls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Balls</em>'.
   * @see org.alia4j.language.ballandpaddle.Root#getBalls()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Balls();

  /**
   * Returns the meta object for the containment reference list '{@link org.alia4j.language.ballandpaddle.Root#getBlocks <em>Blocks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Blocks</em>'.
   * @see org.alia4j.language.ballandpaddle.Root#getBlocks()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Blocks();

  /**
   * Returns the meta object for the containment reference list '{@link org.alia4j.language.ballandpaddle.Root#getEffects <em>Effects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Effects</em>'.
   * @see org.alia4j.language.ballandpaddle.Root#getEffects()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Effects();

  /**
   * Returns the meta object for the containment reference list '{@link org.alia4j.language.ballandpaddle.Root#getPowers <em>Powers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Powers</em>'.
   * @see org.alia4j.language.ballandpaddle.Root#getPowers()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Powers();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.Level <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Level</em>'.
   * @see org.alia4j.language.ballandpaddle.Level
   * @generated
   */
  EClass getLevel();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.Level#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.alia4j.language.ballandpaddle.Level#getId()
   * @see #getLevel()
   * @generated
   */
  EAttribute getLevel_Id();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.Level#getPowerSpawnChance <em>Power Spawn Chance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Power Spawn Chance</em>'.
   * @see org.alia4j.language.ballandpaddle.Level#getPowerSpawnChance()
   * @see #getLevel()
   * @generated
   */
  EAttribute getLevel_PowerSpawnChance();

  /**
   * Returns the meta object for the attribute list '{@link org.alia4j.language.ballandpaddle.Level#getBlocks <em>Blocks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Blocks</em>'.
   * @see org.alia4j.language.ballandpaddle.Level#getBlocks()
   * @see #getLevel()
   * @generated
   */
  EAttribute getLevel_Blocks();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.BAPObject <em>BAP Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BAP Object</em>'.
   * @see org.alia4j.language.ballandpaddle.BAPObject
   * @generated
   */
  EClass getBAPObject();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.BAPObject#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.alia4j.language.ballandpaddle.BAPObject#getId()
   * @see #getBAPObject()
   * @generated
   */
  EAttribute getBAPObject_Id();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.Paddle <em>Paddle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Paddle</em>'.
   * @see org.alia4j.language.ballandpaddle.Paddle
   * @generated
   */
  EClass getPaddle();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.Paddle#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.alia4j.language.ballandpaddle.Paddle#getX()
   * @see #getPaddle()
   * @generated
   */
  EAttribute getPaddle_X();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.Paddle#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.alia4j.language.ballandpaddle.Paddle#getY()
   * @see #getPaddle()
   * @generated
   */
  EAttribute getPaddle_Y();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.Paddle#getShape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Shape</em>'.
   * @see org.alia4j.language.ballandpaddle.Paddle#getShape()
   * @see #getPaddle()
   * @generated
   */
  EAttribute getPaddle_Shape();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.Paddle#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.alia4j.language.ballandpaddle.Paddle#getSize()
   * @see #getPaddle()
   * @generated
   */
  EAttribute getPaddle_Size();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.Paddle#getOrientation <em>Orientation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Orientation</em>'.
   * @see org.alia4j.language.ballandpaddle.Paddle#getOrientation()
   * @see #getPaddle()
   * @generated
   */
  EAttribute getPaddle_Orientation();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.Ball <em>Ball</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ball</em>'.
   * @see org.alia4j.language.ballandpaddle.Ball
   * @generated
   */
  EClass getBall();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.Ball#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.alia4j.language.ballandpaddle.Ball#getX()
   * @see #getBall()
   * @generated
   */
  EAttribute getBall_X();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.Ball#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.alia4j.language.ballandpaddle.Ball#getY()
   * @see #getBall()
   * @generated
   */
  EAttribute getBall_Y();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.Ball#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.alia4j.language.ballandpaddle.Ball#getSize()
   * @see #getBall()
   * @generated
   */
  EAttribute getBall_Size();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.Ball#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direction</em>'.
   * @see org.alia4j.language.ballandpaddle.Ball#getDirection()
   * @see #getBall()
   * @generated
   */
  EAttribute getBall_Direction();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.Ball#getSpeed <em>Speed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Speed</em>'.
   * @see org.alia4j.language.ballandpaddle.Ball#getSpeed()
   * @see #getBall()
   * @generated
   */
  EAttribute getBall_Speed();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see org.alia4j.language.ballandpaddle.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.Block#getHardness <em>Hardness</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hardness</em>'.
   * @see org.alia4j.language.ballandpaddle.Block#getHardness()
   * @see #getBlock()
   * @generated
   */
  EAttribute getBlock_Hardness();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.Block#getNormalRes <em>Normal Res</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Normal Res</em>'.
   * @see org.alia4j.language.ballandpaddle.Block#getNormalRes()
   * @see #getBlock()
   * @generated
   */
  EAttribute getBlock_NormalRes();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.Block#getFireRes <em>Fire Res</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fire Res</em>'.
   * @see org.alia4j.language.ballandpaddle.Block#getFireRes()
   * @see #getBlock()
   * @generated
   */
  EAttribute getBlock_FireRes();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.Block#getColdRes <em>Cold Res</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cold Res</em>'.
   * @see org.alia4j.language.ballandpaddle.Block#getColdRes()
   * @see #getBlock()
   * @generated
   */
  EAttribute getBlock_ColdRes();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.Block#getShockRes <em>Shock Res</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Shock Res</em>'.
   * @see org.alia4j.language.ballandpaddle.Block#getShockRes()
   * @see #getBlock()
   * @generated
   */
  EAttribute getBlock_ShockRes();

  /**
   * Returns the meta object for the reference '{@link org.alia4j.language.ballandpaddle.Block#getPower <em>Power</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Power</em>'.
   * @see org.alia4j.language.ballandpaddle.Block#getPower()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Power();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.Power <em>Power</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Power</em>'.
   * @see org.alia4j.language.ballandpaddle.Power
   * @generated
   */
  EClass getPower();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.Power#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.alia4j.language.ballandpaddle.Power#getId()
   * @see #getPower()
   * @generated
   */
  EAttribute getPower_Id();

  /**
   * Returns the meta object for the reference list '{@link org.alia4j.language.ballandpaddle.Power#getEffects <em>Effects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Effects</em>'.
   * @see org.alia4j.language.ballandpaddle.Power#getEffects()
   * @see #getPower()
   * @generated
   */
  EReference getPower_Effects();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.Power#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duration</em>'.
   * @see org.alia4j.language.ballandpaddle.Power#getDuration()
   * @see #getPower()
   * @generated
   */
  EAttribute getPower_Duration();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.Power#getPowerSpawnChance <em>Power Spawn Chance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Power Spawn Chance</em>'.
   * @see org.alia4j.language.ballandpaddle.Power#getPowerSpawnChance()
   * @see #getPower()
   * @generated
   */
  EAttribute getPower_PowerSpawnChance();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.ballandpaddle.Power#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.alia4j.language.ballandpaddle.Power#getTarget()
   * @see #getPower()
   * @generated
   */
  EReference getPower_Target();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.Target <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Target</em>'.
   * @see org.alia4j.language.ballandpaddle.Target
   * @generated
   */
  EClass getTarget();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.ObjectTarget <em>Object Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Target</em>'.
   * @see org.alia4j.language.ballandpaddle.ObjectTarget
   * @generated
   */
  EClass getObjectTarget();

  /**
   * Returns the meta object for the reference '{@link org.alia4j.language.ballandpaddle.ObjectTarget#getItem <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Item</em>'.
   * @see org.alia4j.language.ballandpaddle.ObjectTarget#getItem()
   * @see #getObjectTarget()
   * @generated
   */
  EReference getObjectTarget_Item();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.TypeTarget <em>Type Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Target</em>'.
   * @see org.alia4j.language.ballandpaddle.TypeTarget
   * @generated
   */
  EClass getTypeTarget();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.TypeTarget#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.alia4j.language.ballandpaddle.TypeTarget#getType()
   * @see #getTypeTarget()
   * @generated
   */
  EAttribute getTypeTarget_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.ballandpaddle.TypeTarget#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see org.alia4j.language.ballandpaddle.TypeTarget#getParams()
   * @see #getTypeTarget()
   * @generated
   */
  EReference getTypeTarget_Params();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.BooleanExpression <em>Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Expression</em>'.
   * @see org.alia4j.language.ballandpaddle.BooleanExpression
   * @generated
   */
  EClass getBooleanExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.BooleanBinaryExpression <em>Boolean Binary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Binary Expression</em>'.
   * @see org.alia4j.language.ballandpaddle.BooleanBinaryExpression
   * @generated
   */
  EClass getBooleanBinaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.ballandpaddle.BooleanBinaryExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.alia4j.language.ballandpaddle.BooleanBinaryExpression#getLeft()
   * @see #getBooleanBinaryExpression()
   * @generated
   */
  EReference getBooleanBinaryExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.ballandpaddle.BooleanBinaryExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.alia4j.language.ballandpaddle.BooleanBinaryExpression#getRight()
   * @see #getBooleanBinaryExpression()
   * @generated
   */
  EReference getBooleanBinaryExpression_Right();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.BooleanUnaryExpression <em>Boolean Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Unary Expression</em>'.
   * @see org.alia4j.language.ballandpaddle.BooleanUnaryExpression
   * @generated
   */
  EClass getBooleanUnaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.ballandpaddle.BooleanUnaryExpression#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.alia4j.language.ballandpaddle.BooleanUnaryExpression#getBody()
   * @see #getBooleanUnaryExpression()
   * @generated
   */
  EReference getBooleanUnaryExpression_Body();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.EqParameter <em>Eq Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Eq Parameter</em>'.
   * @see org.alia4j.language.ballandpaddle.EqParameter
   * @generated
   */
  EClass getEqParameter();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.SmthParameter <em>Smth Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Smth Parameter</em>'.
   * @see org.alia4j.language.ballandpaddle.SmthParameter
   * @generated
   */
  EClass getSmthParameter();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.SeqParameter <em>Seq Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Seq Parameter</em>'.
   * @see org.alia4j.language.ballandpaddle.SeqParameter
   * @generated
   */
  EClass getSeqParameter();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.LthParameter <em>Lth Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lth Parameter</em>'.
   * @see org.alia4j.language.ballandpaddle.LthParameter
   * @generated
   */
  EClass getLthParameter();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.LeqParameter <em>Leq Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Leq Parameter</em>'.
   * @see org.alia4j.language.ballandpaddle.LeqParameter
   * @generated
   */
  EClass getLeqParameter();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.NeqParameter <em>Neq Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Neq Parameter</em>'.
   * @see org.alia4j.language.ballandpaddle.NeqParameter
   * @generated
   */
  EClass getNeqParameter();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.OrParameter <em>Or Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Parameter</em>'.
   * @see org.alia4j.language.ballandpaddle.OrParameter
   * @generated
   */
  EClass getOrParameter();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.AndParameter <em>And Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Parameter</em>'.
   * @see org.alia4j.language.ballandpaddle.AndParameter
   * @generated
   */
  EClass getAndParameter();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.BracketParameter <em>Bracket Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bracket Parameter</em>'.
   * @see org.alia4j.language.ballandpaddle.BracketParameter
   * @generated
   */
  EClass getBracketParameter();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.NegParameter <em>Neg Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Neg Parameter</em>'.
   * @see org.alia4j.language.ballandpaddle.NegParameter
   * @generated
   */
  EClass getNegParameter();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.AttParameter <em>Att Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Att Parameter</em>'.
   * @see org.alia4j.language.ballandpaddle.AttParameter
   * @generated
   */
  EClass getAttParameter();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.AttParameter#getAtt <em>Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Att</em>'.
   * @see org.alia4j.language.ballandpaddle.AttParameter#getAtt()
   * @see #getAttParameter()
   * @generated
   */
  EAttribute getAttParameter_Att();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.ValueParameter <em>Value Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Parameter</em>'.
   * @see org.alia4j.language.ballandpaddle.ValueParameter
   * @generated
   */
  EClass getValueParameter();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.ValueParameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.alia4j.language.ballandpaddle.ValueParameter#getValue()
   * @see #getValueParameter()
   * @generated
   */
  EAttribute getValueParameter_Value();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.Effect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Effect</em>'.
   * @see org.alia4j.language.ballandpaddle.Effect
   * @generated
   */
  EClass getEffect();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.Effect#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.alia4j.language.ballandpaddle.Effect#getId()
   * @see #getEffect()
   * @generated
   */
  EAttribute getEffect_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.ballandpaddle.Effect#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.alia4j.language.ballandpaddle.Effect#getTarget()
   * @see #getEffect()
   * @generated
   */
  EReference getEffect_Target();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.Effect#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.alia4j.language.ballandpaddle.Effect#getType()
   * @see #getEffect()
   * @generated
   */
  EAttribute getEffect_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.ballandpaddle.Effect#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.alia4j.language.ballandpaddle.Effect#getExpression()
   * @see #getEffect()
   * @generated
   */
  EReference getEffect_Expression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.alia4j.language.ballandpaddle.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.BinaryExpression <em>Binary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Expression</em>'.
   * @see org.alia4j.language.ballandpaddle.BinaryExpression
   * @generated
   */
  EClass getBinaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.ballandpaddle.BinaryExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.alia4j.language.ballandpaddle.BinaryExpression#getLeft()
   * @see #getBinaryExpression()
   * @generated
   */
  EReference getBinaryExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.ballandpaddle.BinaryExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.alia4j.language.ballandpaddle.BinaryExpression#getRight()
   * @see #getBinaryExpression()
   * @generated
   */
  EReference getBinaryExpression_Right();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expression</em>'.
   * @see org.alia4j.language.ballandpaddle.UnaryExpression
   * @generated
   */
  EClass getUnaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.alia4j.language.ballandpaddle.UnaryExpression#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.alia4j.language.ballandpaddle.UnaryExpression#getBody()
   * @see #getUnaryExpression()
   * @generated
   */
  EReference getUnaryExpression_Body();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.MultExpression <em>Mult Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mult Expression</em>'.
   * @see org.alia4j.language.ballandpaddle.MultExpression
   * @generated
   */
  EClass getMultExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.DivExpression <em>Div Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div Expression</em>'.
   * @see org.alia4j.language.ballandpaddle.DivExpression
   * @generated
   */
  EClass getDivExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.PlusExpression <em>Plus Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus Expression</em>'.
   * @see org.alia4j.language.ballandpaddle.PlusExpression
   * @generated
   */
  EClass getPlusExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.MinusExpression <em>Minus Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus Expression</em>'.
   * @see org.alia4j.language.ballandpaddle.MinusExpression
   * @generated
   */
  EClass getMinusExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.BracketExpression <em>Bracket Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bracket Expression</em>'.
   * @see org.alia4j.language.ballandpaddle.BracketExpression
   * @generated
   */
  EClass getBracketExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.NegExpression <em>Neg Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Neg Expression</em>'.
   * @see org.alia4j.language.ballandpaddle.NegExpression
   * @generated
   */
  EClass getNegExpression();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.IntOperand <em>Int Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Operand</em>'.
   * @see org.alia4j.language.ballandpaddle.IntOperand
   * @generated
   */
  EClass getIntOperand();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.IntOperand#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.alia4j.language.ballandpaddle.IntOperand#getValue()
   * @see #getIntOperand()
   * @generated
   */
  EAttribute getIntOperand_Value();

  /**
   * Returns the meta object for class '{@link org.alia4j.language.ballandpaddle.AttOperand <em>Att Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Att Operand</em>'.
   * @see org.alia4j.language.ballandpaddle.AttOperand
   * @generated
   */
  EClass getAttOperand();

  /**
   * Returns the meta object for the attribute '{@link org.alia4j.language.ballandpaddle.AttOperand#getAtt <em>Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Att</em>'.
   * @see org.alia4j.language.ballandpaddle.AttOperand#getAtt()
   * @see #getAttOperand()
   * @generated
   */
  EAttribute getAttOperand_Att();

  /**
   * Returns the meta object for enum '{@link org.alia4j.language.ballandpaddle.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Attribute</em>'.
   * @see org.alia4j.language.ballandpaddle.Attribute
   * @generated
   */
  EEnum getAttribute();

  /**
   * Returns the meta object for enum '{@link org.alia4j.language.ballandpaddle.Shape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Shape</em>'.
   * @see org.alia4j.language.ballandpaddle.Shape
   * @generated
   */
  EEnum getShape();

  /**
   * Returns the meta object for enum '{@link org.alia4j.language.ballandpaddle.DamageEffectType <em>Damage Effect Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Damage Effect Type</em>'.
   * @see org.alia4j.language.ballandpaddle.DamageEffectType
   * @generated
   */
  EEnum getDamageEffectType();

  /**
   * Returns the meta object for enum '{@link org.alia4j.language.ballandpaddle.TargetType <em>Target Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Target Type</em>'.
   * @see org.alia4j.language.ballandpaddle.TargetType
   * @generated
   */
  EEnum getTargetType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BallandpaddleFactory getBallandpaddleFactory();

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
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.RootImpl <em>Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.RootImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getRoot()
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
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.LevelImpl <em>Level</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.LevelImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getLevel()
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
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.BAPObjectImpl <em>BAP Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.BAPObjectImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getBAPObject()
     * @generated
     */
    EClass BAP_OBJECT = eINSTANCE.getBAPObject();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BAP_OBJECT__ID = eINSTANCE.getBAPObject_Id();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.PaddleImpl <em>Paddle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.PaddleImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getPaddle()
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
     * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PADDLE__SHAPE = eINSTANCE.getPaddle_Shape();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PADDLE__SIZE = eINSTANCE.getPaddle_Size();

    /**
     * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PADDLE__ORIENTATION = eINSTANCE.getPaddle_Orientation();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.BallImpl <em>Ball</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.BallImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getBall()
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
     * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BALL__DIRECTION = eINSTANCE.getBall_Direction();

    /**
     * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BALL__SPEED = eINSTANCE.getBall_Speed();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.BlockImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getBlock()
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
     * The meta object literal for the '<em><b>Normal Res</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BLOCK__NORMAL_RES = eINSTANCE.getBlock_NormalRes();

    /**
     * The meta object literal for the '<em><b>Fire Res</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BLOCK__FIRE_RES = eINSTANCE.getBlock_FireRes();

    /**
     * The meta object literal for the '<em><b>Cold Res</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BLOCK__COLD_RES = eINSTANCE.getBlock_ColdRes();

    /**
     * The meta object literal for the '<em><b>Shock Res</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BLOCK__SHOCK_RES = eINSTANCE.getBlock_ShockRes();

    /**
     * The meta object literal for the '<em><b>Power</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__POWER = eINSTANCE.getBlock_Power();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.PowerImpl <em>Power</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.PowerImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getPower()
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
     * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POWER__DURATION = eINSTANCE.getPower_Duration();

    /**
     * The meta object literal for the '<em><b>Power Spawn Chance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POWER__POWER_SPAWN_CHANCE = eINSTANCE.getPower_PowerSpawnChance();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POWER__TARGET = eINSTANCE.getPower_Target();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.TargetImpl <em>Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.TargetImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getTarget()
     * @generated
     */
    EClass TARGET = eINSTANCE.getTarget();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.ObjectTargetImpl <em>Object Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.ObjectTargetImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getObjectTarget()
     * @generated
     */
    EClass OBJECT_TARGET = eINSTANCE.getObjectTarget();

    /**
     * The meta object literal for the '<em><b>Item</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_TARGET__ITEM = eINSTANCE.getObjectTarget_Item();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.TypeTargetImpl <em>Type Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.TypeTargetImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getTypeTarget()
     * @generated
     */
    EClass TYPE_TARGET = eINSTANCE.getTypeTarget();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_TARGET__TYPE = eINSTANCE.getTypeTarget_Type();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_TARGET__PARAMS = eINSTANCE.getTypeTarget_Params();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.BooleanExpressionImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getBooleanExpression()
     * @generated
     */
    EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.BooleanBinaryExpressionImpl <em>Boolean Binary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.BooleanBinaryExpressionImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getBooleanBinaryExpression()
     * @generated
     */
    EClass BOOLEAN_BINARY_EXPRESSION = eINSTANCE.getBooleanBinaryExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_BINARY_EXPRESSION__LEFT = eINSTANCE.getBooleanBinaryExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_BINARY_EXPRESSION__RIGHT = eINSTANCE.getBooleanBinaryExpression_Right();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.BooleanUnaryExpressionImpl <em>Boolean Unary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.BooleanUnaryExpressionImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getBooleanUnaryExpression()
     * @generated
     */
    EClass BOOLEAN_UNARY_EXPRESSION = eINSTANCE.getBooleanUnaryExpression();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_UNARY_EXPRESSION__BODY = eINSTANCE.getBooleanUnaryExpression_Body();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.EqParameterImpl <em>Eq Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.EqParameterImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getEqParameter()
     * @generated
     */
    EClass EQ_PARAMETER = eINSTANCE.getEqParameter();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.SmthParameterImpl <em>Smth Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.SmthParameterImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getSmthParameter()
     * @generated
     */
    EClass SMTH_PARAMETER = eINSTANCE.getSmthParameter();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.SeqParameterImpl <em>Seq Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.SeqParameterImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getSeqParameter()
     * @generated
     */
    EClass SEQ_PARAMETER = eINSTANCE.getSeqParameter();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.LthParameterImpl <em>Lth Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.LthParameterImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getLthParameter()
     * @generated
     */
    EClass LTH_PARAMETER = eINSTANCE.getLthParameter();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.LeqParameterImpl <em>Leq Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.LeqParameterImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getLeqParameter()
     * @generated
     */
    EClass LEQ_PARAMETER = eINSTANCE.getLeqParameter();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.NeqParameterImpl <em>Neq Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.NeqParameterImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getNeqParameter()
     * @generated
     */
    EClass NEQ_PARAMETER = eINSTANCE.getNeqParameter();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.OrParameterImpl <em>Or Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.OrParameterImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getOrParameter()
     * @generated
     */
    EClass OR_PARAMETER = eINSTANCE.getOrParameter();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.AndParameterImpl <em>And Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.AndParameterImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getAndParameter()
     * @generated
     */
    EClass AND_PARAMETER = eINSTANCE.getAndParameter();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.BracketParameterImpl <em>Bracket Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.BracketParameterImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getBracketParameter()
     * @generated
     */
    EClass BRACKET_PARAMETER = eINSTANCE.getBracketParameter();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.NegParameterImpl <em>Neg Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.NegParameterImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getNegParameter()
     * @generated
     */
    EClass NEG_PARAMETER = eINSTANCE.getNegParameter();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.AttParameterImpl <em>Att Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.AttParameterImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getAttParameter()
     * @generated
     */
    EClass ATT_PARAMETER = eINSTANCE.getAttParameter();

    /**
     * The meta object literal for the '<em><b>Att</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATT_PARAMETER__ATT = eINSTANCE.getAttParameter_Att();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.ValueParameterImpl <em>Value Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.ValueParameterImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getValueParameter()
     * @generated
     */
    EClass VALUE_PARAMETER = eINSTANCE.getValueParameter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_PARAMETER__VALUE = eINSTANCE.getValueParameter_Value();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.EffectImpl <em>Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.EffectImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getEffect()
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
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EFFECT__TARGET = eINSTANCE.getEffect_Target();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EFFECT__TYPE = eINSTANCE.getEffect_Type();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EFFECT__EXPRESSION = eINSTANCE.getEffect_Expression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.ExpressionImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.BinaryExpressionImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getBinaryExpression()
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
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.UnaryExpressionImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getUnaryExpression()
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
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.MultExpressionImpl <em>Mult Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.MultExpressionImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getMultExpression()
     * @generated
     */
    EClass MULT_EXPRESSION = eINSTANCE.getMultExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.DivExpressionImpl <em>Div Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.DivExpressionImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getDivExpression()
     * @generated
     */
    EClass DIV_EXPRESSION = eINSTANCE.getDivExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.PlusExpressionImpl <em>Plus Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.PlusExpressionImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getPlusExpression()
     * @generated
     */
    EClass PLUS_EXPRESSION = eINSTANCE.getPlusExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.MinusExpressionImpl <em>Minus Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.MinusExpressionImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getMinusExpression()
     * @generated
     */
    EClass MINUS_EXPRESSION = eINSTANCE.getMinusExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.BracketExpressionImpl <em>Bracket Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.BracketExpressionImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getBracketExpression()
     * @generated
     */
    EClass BRACKET_EXPRESSION = eINSTANCE.getBracketExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.NegExpressionImpl <em>Neg Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.NegExpressionImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getNegExpression()
     * @generated
     */
    EClass NEG_EXPRESSION = eINSTANCE.getNegExpression();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.IntOperandImpl <em>Int Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.IntOperandImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getIntOperand()
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
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.impl.AttOperandImpl <em>Att Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.impl.AttOperandImpl
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getAttOperand()
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
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.Attribute <em>Attribute</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.Attribute
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getAttribute()
     * @generated
     */
    EEnum ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.Shape <em>Shape</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.Shape
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getShape()
     * @generated
     */
    EEnum SHAPE = eINSTANCE.getShape();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.DamageEffectType <em>Damage Effect Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.DamageEffectType
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getDamageEffectType()
     * @generated
     */
    EEnum DAMAGE_EFFECT_TYPE = eINSTANCE.getDamageEffectType();

    /**
     * The meta object literal for the '{@link org.alia4j.language.ballandpaddle.TargetType <em>Target Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alia4j.language.ballandpaddle.TargetType
     * @see org.alia4j.language.ballandpaddle.impl.BallandpaddlePackageImpl#getTargetType()
     * @generated
     */
    EEnum TARGET_TYPE = eINSTANCE.getTargetType();

  }

} //BallandpaddlePackage
