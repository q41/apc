/**
 */
package org.alia4j.language.bp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.bp.ClassTarget#getClassType <em>Class Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.bp.BpPackage#getClassTarget()
 * @model
 * @generated
 */
public interface ClassTarget extends Target
{
  /**
   * Returns the value of the '<em><b>Class Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.alia4j.language.bp.BPClassType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Type</em>' attribute.
   * @see org.alia4j.language.bp.BPClassType
   * @see #setClassType(BPClassType)
   * @see org.alia4j.language.bp.BpPackage#getClassTarget_ClassType()
   * @model required="true"
   * @generated
   */
  BPClassType getClassType();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.ClassTarget#getClassType <em>Class Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Type</em>' attribute.
   * @see org.alia4j.language.bp.BPClassType
   * @see #getClassType()
   * @generated
   */
  void setClassType(BPClassType value);

} // ClassTarget
