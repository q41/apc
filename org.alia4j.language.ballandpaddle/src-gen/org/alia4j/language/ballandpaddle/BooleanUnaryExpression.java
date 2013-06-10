/**
 */
package org.alia4j.language.ballandpaddle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.ballandpaddle.BooleanUnaryExpression#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getBooleanUnaryExpression()
 * @model abstract="true"
 * @generated
 */
public interface BooleanUnaryExpression extends BooleanExpression
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
   * @see #setBody(BooleanExpression)
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getBooleanUnaryExpression_Body()
   * @model containment="true" required="true"
   * @generated
   */
  BooleanExpression getBody();

  /**
   * Sets the value of the '{@link org.alia4j.language.ballandpaddle.BooleanUnaryExpression#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(BooleanExpression value);

} // BooleanUnaryExpression
