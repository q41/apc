/**
 */
package org.alia4j.language.ballandpaddle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BAP Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.ballandpaddle.BAPObject#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getBAPObject()
 * @model abstract="true"
 * @generated
 */
public interface BAPObject extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getBAPObject_Id()
   * @model required="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.alia4j.language.ballandpaddle.BAPObject#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // BAPObject
