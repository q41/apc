/**
 */
package org.alia4j.language.textadventure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.textadventure.Person#getName <em>Name</em>}</li>
 *   <li>{@link org.alia4j.language.textadventure.Person#getAbilities <em>Abilities</em>}</li>
 *   <li>{@link org.alia4j.language.textadventure.Person#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.textadventure.TextadventurePackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.alia4j.language.textadventure.TextadventurePackage#getPerson_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.alia4j.language.textadventure.Person#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Abilities</b></em>' containment reference list.
   * The list contents are of type {@link org.alia4j.language.textadventure.Ability}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abilities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abilities</em>' containment reference list.
   * @see org.alia4j.language.textadventure.TextadventurePackage#getPerson_Abilities()
   * @model containment="true"
   * @generated
   */
  EList<Ability> getAbilities();

  /**
   * Returns the value of the '<em><b>Location</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' reference.
   * @see #setLocation(Tile)
   * @see org.alia4j.language.textadventure.TextadventurePackage#getPerson_Location()
   * @model required="true"
   * @generated
   */
  Tile getLocation();

  /**
   * Sets the value of the '{@link org.alia4j.language.textadventure.Person#getLocation <em>Location</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' reference.
   * @see #getLocation()
   * @generated
   */
  void setLocation(Tile value);

} // Person
