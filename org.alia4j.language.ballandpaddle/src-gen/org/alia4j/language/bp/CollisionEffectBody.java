/**
 */
package org.alia4j.language.bp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collision Effect Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.bp.CollisionEffectBody#getTarget <em>Target</em>}</li>
 *   <li>{@link org.alia4j.language.bp.CollisionEffectBody#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.bp.BpPackage#getCollisionEffectBody()
 * @model
 * @generated
 */
public interface CollisionEffectBody extends EffectBody
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
   * @see org.alia4j.language.bp.BpPackage#getCollisionEffectBody_Target()
   * @model containment="true" required="true"
   * @generated
   */
  Target getTarget();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.CollisionEffectBody#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Target value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(CollisionExpression)
   * @see org.alia4j.language.bp.BpPackage#getCollisionEffectBody_Expression()
   * @model containment="true" required="true"
   * @generated
   */
  CollisionExpression getExpression();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.CollisionEffectBody#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(CollisionExpression value);

} // CollisionEffectBody
