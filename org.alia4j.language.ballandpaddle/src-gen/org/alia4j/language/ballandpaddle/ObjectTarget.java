/**
 */
package org.alia4j.language.ballandpaddle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.ballandpaddle.ObjectTarget#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getObjectTarget()
 * @model
 * @generated
 */
public interface ObjectTarget extends Target
{
  /**
   * Returns the value of the '<em><b>Item</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Item</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item</em>' reference.
   * @see #setItem(BAPObject)
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getObjectTarget_Item()
   * @model required="true"
   * @generated
   */
  BAPObject getItem();

  /**
   * Sets the value of the '{@link org.alia4j.language.ballandpaddle.ObjectTarget#getItem <em>Item</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Item</em>' reference.
   * @see #getItem()
   * @generated
   */
  void setItem(BAPObject value);

} // ObjectTarget
