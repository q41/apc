/**
 */
package org.alia4j.language.textadventure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.textadventure.Tile#getX <em>X</em>}</li>
 *   <li>{@link org.alia4j.language.textadventure.Tile#getY <em>Y</em>}</li>
 *   <li>{@link org.alia4j.language.textadventure.Tile#getDescription <em>Description</em>}</li>
 *   <li>{@link org.alia4j.language.textadventure.Tile#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.textadventure.TextadventurePackage#getTile()
 * @model
 * @generated
 */
public interface Tile extends EObject
{
  /**
   * Returns the value of the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>X</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>X</em>' attribute.
   * @see #setX(int)
   * @see org.alia4j.language.textadventure.TextadventurePackage#getTile_X()
   * @model required="true"
   * @generated
   */
  int getX();

  /**
   * Sets the value of the '{@link org.alia4j.language.textadventure.Tile#getX <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X</em>' attribute.
   * @see #getX()
   * @generated
   */
  void setX(int value);

  /**
   * Returns the value of the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Y</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y</em>' attribute.
   * @see #setY(int)
   * @see org.alia4j.language.textadventure.TextadventurePackage#getTile_Y()
   * @model required="true"
   * @generated
   */
  int getY();

  /**
   * Sets the value of the '{@link org.alia4j.language.textadventure.Tile#getY <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y</em>' attribute.
   * @see #getY()
   * @generated
   */
  void setY(int value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.alia4j.language.textadventure.TextadventurePackage#getTile_Description()
   * @model required="true"
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.alia4j.language.textadventure.Tile#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

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
   * @see org.alia4j.language.textadventure.TextadventurePackage#getTile_Id()
   * @model required="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.alia4j.language.textadventure.Tile#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // Tile
