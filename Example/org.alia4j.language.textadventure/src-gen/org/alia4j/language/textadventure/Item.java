/**
 */
package org.alia4j.language.textadventure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.textadventure.Item#getName <em>Name</em>}</li>
 *   <li>{@link org.alia4j.language.textadventure.Item#getEffects <em>Effects</em>}</li>
 *   <li>{@link org.alia4j.language.textadventure.Item#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.textadventure.TextadventurePackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject
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
   * @see org.alia4j.language.textadventure.TextadventurePackage#getItem_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.alia4j.language.textadventure.Item#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Effects</b></em>' containment reference list.
   * The list contents are of type {@link org.alia4j.language.textadventure.Effect}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Effects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Effects</em>' containment reference list.
   * @see org.alia4j.language.textadventure.TextadventurePackage#getItem_Effects()
   * @model containment="true"
   * @generated
   */
  EList<Effect> getEffects();

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
   * @see org.alia4j.language.textadventure.TextadventurePackage#getItem_Location()
   * @model
   * @generated
   */
  Tile getLocation();

  /**
   * Sets the value of the '{@link org.alia4j.language.textadventure.Item#getLocation <em>Location</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' reference.
   * @see #getLocation()
   * @generated
   */
  void setLocation(Tile value);

} // Item
