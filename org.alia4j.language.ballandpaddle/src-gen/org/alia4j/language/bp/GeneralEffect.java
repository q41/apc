/**
 */
package org.alia4j.language.bp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.bp.GeneralEffect#getTarget <em>Target</em>}</li>
 *   <li>{@link org.alia4j.language.bp.GeneralEffect#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.alia4j.language.bp.GeneralEffect#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.bp.BpPackage#getGeneralEffect()
 * @model
 * @generated
 */
public interface GeneralEffect extends Effect
{
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
   * @see org.alia4j.language.bp.BpPackage#getGeneralEffect_Target()
   * @model containment="true" required="true"
   * @generated
   */
  Target getTarget();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.GeneralEffect#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Target value);

  /**
   * Returns the value of the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter</em>' containment reference.
   * @see #setFilter(Expression)
   * @see org.alia4j.language.bp.BpPackage#getGeneralEffect_Filter()
   * @model containment="true"
   * @generated
   */
  Expression getFilter();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.GeneralEffect#getFilter <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' containment reference.
   * @see #getFilter()
   * @generated
   */
  void setFilter(Expression value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(GeneralEffectBody)
   * @see org.alia4j.language.bp.BpPackage#getGeneralEffect_Body()
   * @model containment="true" required="true"
   * @generated
   */
  GeneralEffectBody getBody();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.GeneralEffect#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(GeneralEffectBody value);

} // GeneralEffect
