/**
 */
package org.alia4j.language.textadventure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>World</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.textadventure.World#getItems <em>Items</em>}</li>
 *   <li>{@link org.alia4j.language.textadventure.World#getPersons <em>Persons</em>}</li>
 *   <li>{@link org.alia4j.language.textadventure.World#getTiles <em>Tiles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.textadventure.TextadventurePackage#getWorld()
 * @model
 * @generated
 */
public interface World extends EObject
{
  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link org.alia4j.language.textadventure.Item}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see org.alia4j.language.textadventure.TextadventurePackage#getWorld_Items()
   * @model containment="true"
   * @generated
   */
  EList<Item> getItems();

  /**
   * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
   * The list contents are of type {@link org.alia4j.language.textadventure.Person}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Persons</em>' containment reference list.
   * @see org.alia4j.language.textadventure.TextadventurePackage#getWorld_Persons()
   * @model containment="true"
   * @generated
   */
  EList<Person> getPersons();

  /**
   * Returns the value of the '<em><b>Tiles</b></em>' containment reference list.
   * The list contents are of type {@link org.alia4j.language.textadventure.Tile}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tiles</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tiles</em>' containment reference list.
   * @see org.alia4j.language.textadventure.TextadventurePackage#getWorld_Tiles()
   * @model containment="true"
   * @generated
   */
  EList<Tile> getTiles();

} // World
