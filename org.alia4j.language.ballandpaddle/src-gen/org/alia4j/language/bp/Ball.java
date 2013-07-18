/**
 */
package org.alia4j.language.bp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ball</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.bp.Ball#getX <em>X</em>}</li>
 *   <li>{@link org.alia4j.language.bp.Ball#getY <em>Y</em>}</li>
 *   <li>{@link org.alia4j.language.bp.Ball#getSize <em>Size</em>}</li>
 *   <li>{@link org.alia4j.language.bp.Ball#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.alia4j.language.bp.Ball#getDamage <em>Damage</em>}</li>
 *   <li>{@link org.alia4j.language.bp.Ball#getSpeed <em>Speed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.bp.BpPackage#getBall()
 * @model
 * @generated
 */
public interface Ball extends BPObject
{
  /**
   * Returns the value of the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>X</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>X</em>' attribute.
   * @see #setX(double)
   * @see org.alia4j.language.bp.BpPackage#getBall_X()
   * @model required="true"
   * @generated
   */
  double getX();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.Ball#getX <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X</em>' attribute.
   * @see #getX()
   * @generated
   */
  void setX(double value);

  /**
   * Returns the value of the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Y</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y</em>' attribute.
   * @see #setY(double)
   * @see org.alia4j.language.bp.BpPackage#getBall_Y()
   * @model required="true"
   * @generated
   */
  double getY();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.Ball#getY <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y</em>' attribute.
   * @see #getY()
   * @generated
   */
  void setY(double value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see #setSize(int)
   * @see org.alia4j.language.bp.BpPackage#getBall_Size()
   * @model
   * @generated
   */
  int getSize();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.Ball#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
  void setSize(int value);

  /**
   * Returns the value of the '<em><b>Orientation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orientation</em>' attribute.
   * @see #setOrientation(int)
   * @see org.alia4j.language.bp.BpPackage#getBall_Orientation()
   * @model
   * @generated
   */
  int getOrientation();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.Ball#getOrientation <em>Orientation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orientation</em>' attribute.
   * @see #getOrientation()
   * @generated
   */
  void setOrientation(int value);

  /**
   * Returns the value of the '<em><b>Damage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Damage</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Damage</em>' attribute.
   * @see #setDamage(int)
   * @see org.alia4j.language.bp.BpPackage#getBall_Damage()
   * @model
   * @generated
   */
  int getDamage();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.Ball#getDamage <em>Damage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Damage</em>' attribute.
   * @see #getDamage()
   * @generated
   */
  void setDamage(int value);

  /**
   * Returns the value of the '<em><b>Speed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Speed</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Speed</em>' attribute.
   * @see #setSpeed(int)
   * @see org.alia4j.language.bp.BpPackage#getBall_Speed()
   * @model
   * @generated
   */
  int getSpeed();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.Ball#getSpeed <em>Speed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Speed</em>' attribute.
   * @see #getSpeed()
   * @generated
   */
  void setSpeed(int value);

} // Ball
