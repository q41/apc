/**
 */
package org.alia4j.language.bp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.bp.EffectBody#getOp <em>Op</em>}</li>
 *   <li>{@link org.alia4j.language.bp.EffectBody#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.bp.BpPackage#getEffectBody()
 * @model abstract="true"
 * @generated
 */
public interface EffectBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link org.alia4j.language.bp.AdjustmentOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see org.alia4j.language.bp.AdjustmentOperator
   * @see #setOp(AdjustmentOperator)
   * @see org.alia4j.language.bp.BpPackage#getEffectBody_Op()
   * @model required="true"
   * @generated
   */
  AdjustmentOperator getOp();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.EffectBody#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see org.alia4j.language.bp.AdjustmentOperator
   * @see #getOp()
   * @generated
   */
  void setOp(AdjustmentOperator value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The literals are from the enumeration {@link org.alia4j.language.bp.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see org.alia4j.language.bp.Attribute
   * @see #setName(Attribute)
   * @see org.alia4j.language.bp.BpPackage#getEffectBody_Name()
   * @model required="true"
   * @generated
   */
  Attribute getName();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.EffectBody#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see org.alia4j.language.bp.Attribute
   * @see #getName()
   * @generated
   */
  void setName(Attribute value);

} // EffectBody
