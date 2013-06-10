/**
 */
package org.alia4j.language.textadventure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.textadventure.RemoveAction#getWhat <em>What</em>}</li>
 *   <li>{@link org.alia4j.language.textadventure.RemoveAction#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.textadventure.TextadventurePackage#getRemoveAction()
 * @model
 * @generated
 */
public interface RemoveAction extends Action
{
  /**
   * Returns the value of the '<em><b>What</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>What</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>What</em>' reference.
   * @see #setWhat(Binding)
   * @see org.alia4j.language.textadventure.TextadventurePackage#getRemoveAction_What()
   * @model required="true"
   * @generated
   */
  Binding getWhat();

  /**
   * Sets the value of the '{@link org.alia4j.language.textadventure.RemoveAction#getWhat <em>What</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>What</em>' reference.
   * @see #getWhat()
   * @generated
   */
  void setWhat(Binding value);

  /**
   * Returns the value of the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' containment reference.
   * @see #setFrom(List)
   * @see org.alia4j.language.textadventure.TextadventurePackage#getRemoveAction_From()
   * @model containment="true" required="true"
   * @generated
   */
  List getFrom();

  /**
   * Sets the value of the '{@link org.alia4j.language.textadventure.RemoveAction#getFrom <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' containment reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(List value);

} // RemoveAction
