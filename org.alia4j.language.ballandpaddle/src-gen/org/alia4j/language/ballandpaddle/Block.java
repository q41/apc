/**
 */
package org.alia4j.language.ballandpaddle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.ballandpaddle.Block#getHardness <em>Hardness</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.Block#getNormalRes <em>Normal Res</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.Block#getFireRes <em>Fire Res</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.Block#getColdRes <em>Cold Res</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.Block#getShockRes <em>Shock Res</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.Block#getPower <em>Power</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends BAPObject
{
  /**
   * Returns the value of the '<em><b>Hardness</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hardness</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hardness</em>' attribute.
   * @see #setHardness(int)
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getBlock_Hardness()
   * @model required="true"
   * @generated
   */
  int getHardness();

  /**
   * Sets the value of the '{@link org.alia4j.language.ballandpaddle.Block#getHardness <em>Hardness</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hardness</em>' attribute.
   * @see #getHardness()
   * @generated
   */
  void setHardness(int value);

  /**
   * Returns the value of the '<em><b>Normal Res</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Normal Res</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Normal Res</em>' attribute.
   * @see #setNormalRes(int)
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getBlock_NormalRes()
   * @model
   * @generated
   */
  int getNormalRes();

  /**
   * Sets the value of the '{@link org.alia4j.language.ballandpaddle.Block#getNormalRes <em>Normal Res</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Normal Res</em>' attribute.
   * @see #getNormalRes()
   * @generated
   */
  void setNormalRes(int value);

  /**
   * Returns the value of the '<em><b>Fire Res</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fire Res</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fire Res</em>' attribute.
   * @see #setFireRes(int)
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getBlock_FireRes()
   * @model
   * @generated
   */
  int getFireRes();

  /**
   * Sets the value of the '{@link org.alia4j.language.ballandpaddle.Block#getFireRes <em>Fire Res</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fire Res</em>' attribute.
   * @see #getFireRes()
   * @generated
   */
  void setFireRes(int value);

  /**
   * Returns the value of the '<em><b>Cold Res</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cold Res</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cold Res</em>' attribute.
   * @see #setColdRes(int)
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getBlock_ColdRes()
   * @model
   * @generated
   */
  int getColdRes();

  /**
   * Sets the value of the '{@link org.alia4j.language.ballandpaddle.Block#getColdRes <em>Cold Res</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cold Res</em>' attribute.
   * @see #getColdRes()
   * @generated
   */
  void setColdRes(int value);

  /**
   * Returns the value of the '<em><b>Shock Res</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shock Res</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shock Res</em>' attribute.
   * @see #setShockRes(int)
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getBlock_ShockRes()
   * @model
   * @generated
   */
  int getShockRes();

  /**
   * Sets the value of the '{@link org.alia4j.language.ballandpaddle.Block#getShockRes <em>Shock Res</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shock Res</em>' attribute.
   * @see #getShockRes()
   * @generated
   */
  void setShockRes(int value);

  /**
   * Returns the value of the '<em><b>Power</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Power</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Power</em>' reference.
   * @see #setPower(Power)
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getBlock_Power()
   * @model
   * @generated
   */
  Power getPower();

  /**
   * Sets the value of the '{@link org.alia4j.language.ballandpaddle.Block#getPower <em>Power</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Power</em>' reference.
   * @see #getPower()
   * @generated
   */
  void setPower(Power value);

} // Block
