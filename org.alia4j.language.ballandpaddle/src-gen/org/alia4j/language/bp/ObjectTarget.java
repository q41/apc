/**
 */
package org.alia4j.language.bp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.bp.ObjectTarget#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.bp.BpPackage#getObjectTarget()
 * @model
 * @generated
 */
public interface ObjectTarget extends Target
{
  /**
   * Returns the value of the '<em><b>Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object</em>' reference.
   * @see #setObject(BPObject)
   * @see org.alia4j.language.bp.BpPackage#getObjectTarget_Object()
   * @model required="true"
   * @generated
   */
  BPObject getObject();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.ObjectTarget#getObject <em>Object</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object</em>' reference.
   * @see #getObject()
   * @generated
   */
  void setObject(BPObject value);

} // ObjectTarget
