/**
 */
package org.alia4j.language.ballandpaddle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.ballandpaddle.BooleanBinaryExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.BooleanBinaryExpression#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getBooleanBinaryExpression()
 * @model abstract="true"
 * @generated
 */
public interface BooleanBinaryExpression extends BooleanExpression
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
   * @see #setLeft(BooleanExpression)
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getBooleanBinaryExpression_Left()
   * @model containment="true" required="true"
   * @generated
   */
  BooleanExpression getLeft();

  /**
   * Sets the value of the '{@link org.alia4j.language.ballandpaddle.BooleanBinaryExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(BooleanExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(BooleanExpression)
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getBooleanBinaryExpression_Right()
   * @model containment="true" required="true"
   * @generated
   */
  BooleanExpression getRight();

  /**
   * Sets the value of the '{@link org.alia4j.language.ballandpaddle.BooleanBinaryExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(BooleanExpression value);

} // BooleanBinaryExpression
