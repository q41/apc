/**
 */
package org.alia4j.language.bp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collision Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.bp.CollisionEffect#getLeftTarget <em>Left Target</em>}</li>
 *   <li>{@link org.alia4j.language.bp.CollisionEffect#getLeftFilter <em>Left Filter</em>}</li>
 *   <li>{@link org.alia4j.language.bp.CollisionEffect#getRightTarget <em>Right Target</em>}</li>
 *   <li>{@link org.alia4j.language.bp.CollisionEffect#getRightFilter <em>Right Filter</em>}</li>
 *   <li>{@link org.alia4j.language.bp.CollisionEffect#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.bp.BpPackage#getCollisionEffect()
 * @model
 * @generated
 */
public interface CollisionEffect extends Effect
{
  /**
   * Returns the value of the '<em><b>Left Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Target</em>' containment reference.
   * @see #setLeftTarget(Target)
   * @see org.alia4j.language.bp.BpPackage#getCollisionEffect_LeftTarget()
   * @model containment="true" required="true"
   * @generated
   */
  Target getLeftTarget();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.CollisionEffect#getLeftTarget <em>Left Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Target</em>' containment reference.
   * @see #getLeftTarget()
   * @generated
   */
  void setLeftTarget(Target value);

  /**
   * Returns the value of the '<em><b>Left Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Filter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Filter</em>' containment reference.
   * @see #setLeftFilter(Expression)
   * @see org.alia4j.language.bp.BpPackage#getCollisionEffect_LeftFilter()
   * @model containment="true"
   * @generated
   */
  Expression getLeftFilter();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.CollisionEffect#getLeftFilter <em>Left Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Filter</em>' containment reference.
   * @see #getLeftFilter()
   * @generated
   */
  void setLeftFilter(Expression value);

  /**
   * Returns the value of the '<em><b>Right Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Target</em>' containment reference.
   * @see #setRightTarget(Target)
   * @see org.alia4j.language.bp.BpPackage#getCollisionEffect_RightTarget()
   * @model containment="true" required="true"
   * @generated
   */
  Target getRightTarget();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.CollisionEffect#getRightTarget <em>Right Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Target</em>' containment reference.
   * @see #getRightTarget()
   * @generated
   */
  void setRightTarget(Target value);

  /**
   * Returns the value of the '<em><b>Right Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Filter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Filter</em>' containment reference.
   * @see #setRightFilter(Expression)
   * @see org.alia4j.language.bp.BpPackage#getCollisionEffect_RightFilter()
   * @model containment="true"
   * @generated
   */
  Expression getRightFilter();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.CollisionEffect#getRightFilter <em>Right Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Filter</em>' containment reference.
   * @see #getRightFilter()
   * @generated
   */
  void setRightFilter(Expression value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(CollisionEffectBody)
   * @see org.alia4j.language.bp.BpPackage#getCollisionEffect_Body()
   * @model containment="true" required="true"
   * @generated
   */
  CollisionEffectBody getBody();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.CollisionEffect#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(CollisionEffectBody value);

} // CollisionEffect
