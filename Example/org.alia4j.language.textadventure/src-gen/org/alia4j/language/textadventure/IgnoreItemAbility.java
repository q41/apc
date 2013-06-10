/**
 */
package org.alia4j.language.textadventure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ignore Item Ability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.textadventure.IgnoreItemAbility#getIgnoredItem <em>Ignored Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.textadventure.TextadventurePackage#getIgnoreItemAbility()
 * @model
 * @generated
 */
public interface IgnoreItemAbility extends Ability
{
  /**
   * Returns the value of the '<em><b>Ignored Item</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ignored Item</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ignored Item</em>' reference.
   * @see #setIgnoredItem(Item)
   * @see org.alia4j.language.textadventure.TextadventurePackage#getIgnoreItemAbility_IgnoredItem()
   * @model required="true"
   * @generated
   */
  Item getIgnoredItem();

  /**
   * Sets the value of the '{@link org.alia4j.language.textadventure.IgnoreItemAbility#getIgnoredItem <em>Ignored Item</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ignored Item</em>' reference.
   * @see #getIgnoredItem()
   * @generated
   */
  void setIgnoredItem(Item value);

} // IgnoreItemAbility
