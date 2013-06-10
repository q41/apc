/**
 */
package org.alia4j.language.ballandpaddle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Att Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.ballandpaddle.AttOperand#getAtt <em>Att</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getAttOperand()
 * @model
 * @generated
 */
public interface AttOperand extends Expression
{
  /**
   * Returns the value of the '<em><b>Att</b></em>' attribute.
   * The literals are from the enumeration {@link org.alia4j.language.ballandpaddle.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Att</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Att</em>' attribute.
   * @see org.alia4j.language.ballandpaddle.Attribute
   * @see #setAtt(Attribute)
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getAttOperand_Att()
   * @model required="true"
   * @generated
   */
  Attribute getAtt();

  /**
   * Sets the value of the '{@link org.alia4j.language.ballandpaddle.AttOperand#getAtt <em>Att</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Att</em>' attribute.
   * @see org.alia4j.language.ballandpaddle.Attribute
   * @see #getAtt()
   * @generated
   */
  void setAtt(Attribute value);

} // AttOperand
