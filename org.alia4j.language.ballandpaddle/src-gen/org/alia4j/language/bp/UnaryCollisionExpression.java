/**
 */
package org.alia4j.language.bp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Collision Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.bp.UnaryCollisionExpression#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.bp.BpPackage#getUnaryCollisionExpression()
 * @model abstract="true"
 * @generated
 */
public interface UnaryCollisionExpression extends CollisionExpression
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(CollisionExpression)
   * @see org.alia4j.language.bp.BpPackage#getUnaryCollisionExpression_Body()
   * @model containment="true" required="true"
   * @generated
   */
  CollisionExpression getBody();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.UnaryCollisionExpression#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(CollisionExpression value);

} // UnaryCollisionExpression
