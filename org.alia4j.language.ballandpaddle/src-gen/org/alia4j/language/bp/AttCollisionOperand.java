/**
 */
package org.alia4j.language.bp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Att Collision Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.bp.AttCollisionOperand#getTarget <em>Target</em>}</li>
 *   <li>{@link org.alia4j.language.bp.AttCollisionOperand#getAtt <em>Att</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.bp.BpPackage#getAttCollisionOperand()
 * @model
 * @generated
 */
public interface AttCollisionOperand extends CollisionExpression
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
   * @see org.alia4j.language.bp.BpPackage#getAttCollisionOperand_Target()
   * @model containment="true" required="true"
   * @generated
   */
  Target getTarget();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.AttCollisionOperand#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Target value);

  /**
   * Returns the value of the '<em><b>Att</b></em>' attribute.
   * The literals are from the enumeration {@link org.alia4j.language.bp.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Att</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Att</em>' attribute.
   * @see org.alia4j.language.bp.Attribute
   * @see #setAtt(Attribute)
   * @see org.alia4j.language.bp.BpPackage#getAttCollisionOperand_Att()
   * @model required="true"
   * @generated
   */
  Attribute getAtt();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.AttCollisionOperand#getAtt <em>Att</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Att</em>' attribute.
   * @see org.alia4j.language.bp.Attribute
   * @see #getAtt()
   * @generated
   */
  void setAtt(Attribute value);

} // AttCollisionOperand
