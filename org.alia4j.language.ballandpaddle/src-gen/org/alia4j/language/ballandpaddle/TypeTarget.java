/**
 */
package org.alia4j.language.ballandpaddle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.ballandpaddle.TypeTarget#getType <em>Type</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.TypeTarget#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getTypeTarget()
 * @model
 * @generated
 */
public interface TypeTarget extends Target
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.alia4j.language.ballandpaddle.TargetType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.alia4j.language.ballandpaddle.TargetType
   * @see #setType(TargetType)
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getTypeTarget_Type()
   * @model required="true"
   * @generated
   */
  TargetType getType();

  /**
   * Sets the value of the '{@link org.alia4j.language.ballandpaddle.TypeTarget#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.alia4j.language.ballandpaddle.TargetType
   * @see #getType()
   * @generated
   */
  void setType(TargetType value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference.
   * @see #setParams(BooleanExpression)
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getTypeTarget_Params()
   * @model containment="true" required="true"
   * @generated
   */
  BooleanExpression getParams();

  /**
   * Sets the value of the '{@link org.alia4j.language.ballandpaddle.TypeTarget#getParams <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params</em>' containment reference.
   * @see #getParams()
   * @generated
   */
  void setParams(BooleanExpression value);

} // TypeTarget
