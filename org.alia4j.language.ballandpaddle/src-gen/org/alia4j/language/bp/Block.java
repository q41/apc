/**
 */
package org.alia4j.language.bp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.bp.Block#getHardness <em>Hardness</em>}</li>
 *   <li>{@link org.alia4j.language.bp.Block#getResistance <em>Resistance</em>}</li>
 *   <li>{@link org.alia4j.language.bp.Block#getPower <em>Power</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.bp.BpPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends BPObject
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
   * @see org.alia4j.language.bp.BpPackage#getBlock_Hardness()
   * @model required="true"
   * @generated
   */
  int getHardness();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.Block#getHardness <em>Hardness</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hardness</em>' attribute.
   * @see #getHardness()
   * @generated
   */
  void setHardness(int value);

  /**
   * Returns the value of the '<em><b>Resistance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resistance</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resistance</em>' attribute.
   * @see #setResistance(int)
   * @see org.alia4j.language.bp.BpPackage#getBlock_Resistance()
   * @model
   * @generated
   */
  int getResistance();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.Block#getResistance <em>Resistance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resistance</em>' attribute.
   * @see #getResistance()
   * @generated
   */
  void setResistance(int value);

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
   * @see org.alia4j.language.bp.BpPackage#getBlock_Power()
   * @model
   * @generated
   */
  Power getPower();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.Block#getPower <em>Power</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Power</em>' reference.
   * @see #getPower()
   * @generated
   */
  void setPower(Power value);

} // Block
