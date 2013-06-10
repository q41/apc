/**
 */
package org.alia4j.language.ballandpaddle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.ballandpaddle.Effect#getId <em>Id</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.Effect#getTarget <em>Target</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.Effect#getType <em>Type</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.Effect#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getEffect()
 * @model
 * @generated
 */
public interface Effect extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getEffect_Id()
   * @model required="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.alia4j.language.ballandpaddle.Effect#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(Target)
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getEffect_Target()
   * @model containment="true"
   * @generated
   */
  Target getTarget();

  /**
   * Sets the value of the '{@link org.alia4j.language.ballandpaddle.Effect#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Target value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.alia4j.language.ballandpaddle.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.alia4j.language.ballandpaddle.Attribute
   * @see #setType(Attribute)
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getEffect_Type()
   * @model required="true"
   * @generated
   */
  Attribute getType();

  /**
   * Sets the value of the '{@link org.alia4j.language.ballandpaddle.Effect#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.alia4j.language.ballandpaddle.Attribute
   * @see #getType()
   * @generated
   */
  void setType(Attribute value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getEffect_Expression()
   * @model containment="true" required="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.alia4j.language.ballandpaddle.Effect#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // Effect
