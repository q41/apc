/**
 */
package org.alia4j.language.bp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.bp.BooleanOperand#isValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.bp.BpPackage#getBooleanOperand()
 * @model
 * @generated
 */
public interface BooleanOperand extends Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(boolean)
   * @see org.alia4j.language.bp.BpPackage#getBooleanOperand_Value()
   * @model required="true"
   * @generated
   */
  boolean isValue();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.BooleanOperand#isValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #isValue()
   * @generated
   */
  void setValue(boolean value);

} // BooleanOperand
