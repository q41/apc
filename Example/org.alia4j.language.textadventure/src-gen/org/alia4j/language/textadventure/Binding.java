/**
 */
package org.alia4j.language.textadventure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.textadventure.Binding#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.alia4j.language.textadventure.Binding#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.textadventure.TextadventurePackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject
{
  /**
   * Returns the value of the '<em><b>Participant</b></em>' attribute.
   * The literals are from the enumeration {@link org.alia4j.language.textadventure.Participant}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Participant</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Participant</em>' attribute.
   * @see org.alia4j.language.textadventure.Participant
   * @see #setParticipant(Participant)
   * @see org.alia4j.language.textadventure.TextadventurePackage#getBinding_Participant()
   * @model required="true"
   * @generated
   */
  Participant getParticipant();

  /**
   * Sets the value of the '{@link org.alia4j.language.textadventure.Binding#getParticipant <em>Participant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Participant</em>' attribute.
   * @see org.alia4j.language.textadventure.Participant
   * @see #getParticipant()
   * @generated
   */
  void setParticipant(Participant value);

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
   * @see org.alia4j.language.textadventure.TextadventurePackage#getBinding_Id()
   * @model required="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.alia4j.language.textadventure.Binding#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // Binding
