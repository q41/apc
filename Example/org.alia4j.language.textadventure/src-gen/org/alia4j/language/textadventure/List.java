/**
 */
package org.alia4j.language.textadventure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.textadventure.List#getPosition <em>Position</em>}</li>
 *   <li>{@link org.alia4j.language.textadventure.List#getTarget <em>Target</em>}</li>
 *   <li>{@link org.alia4j.language.textadventure.List#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.textadventure.TextadventurePackage#getList()
 * @model
 * @generated
 */
public interface List extends EObject
{
  /**
   * Returns the value of the '<em><b>Position</b></em>' attribute.
   * The literals are from the enumeration {@link org.alia4j.language.textadventure.Position}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Position</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Position</em>' attribute.
   * @see org.alia4j.language.textadventure.Position
   * @see #setPosition(Position)
   * @see org.alia4j.language.textadventure.TextadventurePackage#getList_Position()
   * @model required="true"
   * @generated
   */
  Position getPosition();

  /**
   * Sets the value of the '{@link org.alia4j.language.textadventure.List#getPosition <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' attribute.
   * @see org.alia4j.language.textadventure.Position
   * @see #getPosition()
   * @generated
   */
  void setPosition(Position value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * The literals are from the enumeration {@link org.alia4j.language.textadventure.Target}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see org.alia4j.language.textadventure.Target
   * @see #setTarget(Target)
   * @see org.alia4j.language.textadventure.TextadventurePackage#getList_Target()
   * @model required="true"
   * @generated
   */
  Target getTarget();

  /**
   * Sets the value of the '{@link org.alia4j.language.textadventure.List#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see org.alia4j.language.textadventure.Target
   * @see #getTarget()
   * @generated
   */
  void setTarget(Target value);

  /**
   * Returns the value of the '<em><b>Property</b></em>' attribute.
   * The literals are from the enumeration {@link org.alia4j.language.textadventure.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' attribute.
   * @see org.alia4j.language.textadventure.Property
   * @see #setProperty(Property)
   * @see org.alia4j.language.textadventure.TextadventurePackage#getList_Property()
   * @model required="true"
   * @generated
   */
  Property getProperty();

  /**
   * Sets the value of the '{@link org.alia4j.language.textadventure.List#getProperty <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' attribute.
   * @see org.alia4j.language.textadventure.Property
   * @see #getProperty()
   * @generated
   */
  void setProperty(Property value);

} // List
