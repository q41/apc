/**
 */
package org.alia4j.language.textadventure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.textadventure.Effect#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.alia4j.language.textadventure.Effect#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.alia4j.language.textadventure.Effect#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.textadventure.TextadventurePackage#getEffect()
 * @model abstract="true"
 * @generated
 */
public interface Effect extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' attribute.
   * The literals are from the enumeration {@link org.alia4j.language.textadventure.Condition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' attribute.
   * @see org.alia4j.language.textadventure.Condition
   * @see #setCondition(Condition)
   * @see org.alia4j.language.textadventure.TextadventurePackage#getEffect_Condition()
   * @model required="true"
   * @generated
   */
  Condition getCondition();

  /**
   * Sets the value of the '{@link org.alia4j.language.textadventure.Effect#getCondition <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' attribute.
   * @see org.alia4j.language.textadventure.Condition
   * @see #getCondition()
   * @generated
   */
  void setCondition(Condition value);

  /**
   * Returns the value of the '<em><b>Binding</b></em>' containment reference list.
   * The list contents are of type {@link org.alia4j.language.textadventure.Binding}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binding</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binding</em>' containment reference list.
   * @see org.alia4j.language.textadventure.TextadventurePackage#getEffect_Binding()
   * @model containment="true" required="true"
   * @generated
   */
  EList<Binding> getBinding();

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference list.
   * The list contents are of type {@link org.alia4j.language.textadventure.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference list.
   * @see org.alia4j.language.textadventure.TextadventurePackage#getEffect_Action()
   * @model containment="true" required="true"
   * @generated
   */
  EList<Action> getAction();

} // Effect
