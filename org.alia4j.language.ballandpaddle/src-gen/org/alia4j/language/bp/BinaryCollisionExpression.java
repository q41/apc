/**
 */
package org.alia4j.language.bp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Collision Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.bp.BinaryCollisionExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link org.alia4j.language.bp.BinaryCollisionExpression#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.bp.BpPackage#getBinaryCollisionExpression()
 * @model abstract="true"
 * @generated
 */
public interface BinaryCollisionExpression extends CollisionExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(CollisionExpression)
   * @see org.alia4j.language.bp.BpPackage#getBinaryCollisionExpression_Left()
   * @model containment="true" required="true"
   * @generated
   */
  CollisionExpression getLeft();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.BinaryCollisionExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(CollisionExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(CollisionExpression)
   * @see org.alia4j.language.bp.BpPackage#getBinaryCollisionExpression_Right()
   * @model containment="true" required="true"
   * @generated
   */
  CollisionExpression getRight();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.BinaryCollisionExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(CollisionExpression value);

} // BinaryCollisionExpression
