/**
 */
package org.alia4j.language.textadventure.impl;

import org.alia4j.language.textadventure.IgnoreItemAbility;
import org.alia4j.language.textadventure.Item;
import org.alia4j.language.textadventure.TextadventurePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ignore Item Ability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.alia4j.language.textadventure.impl.IgnoreItemAbilityImpl#getIgnoredItem <em>Ignored Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IgnoreItemAbilityImpl extends AbilityImpl implements IgnoreItemAbility
{
  /**
   * The cached value of the '{@link #getIgnoredItem() <em>Ignored Item</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIgnoredItem()
   * @generated
   * @ordered
   */
  protected Item ignoredItem;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IgnoreItemAbilityImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TextadventurePackage.Literals.IGNORE_ITEM_ABILITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Item getIgnoredItem()
  {
    if (ignoredItem != null && ignoredItem.eIsProxy())
    {
      InternalEObject oldIgnoredItem = (InternalEObject)ignoredItem;
      ignoredItem = (Item)eResolveProxy(oldIgnoredItem);
      if (ignoredItem != oldIgnoredItem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TextadventurePackage.IGNORE_ITEM_ABILITY__IGNORED_ITEM, oldIgnoredItem, ignoredItem));
      }
    }
    return ignoredItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Item basicGetIgnoredItem()
  {
    return ignoredItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIgnoredItem(Item newIgnoredItem)
  {
    Item oldIgnoredItem = ignoredItem;
    ignoredItem = newIgnoredItem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextadventurePackage.IGNORE_ITEM_ABILITY__IGNORED_ITEM, oldIgnoredItem, ignoredItem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TextadventurePackage.IGNORE_ITEM_ABILITY__IGNORED_ITEM:
        if (resolve) return getIgnoredItem();
        return basicGetIgnoredItem();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TextadventurePackage.IGNORE_ITEM_ABILITY__IGNORED_ITEM:
        setIgnoredItem((Item)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TextadventurePackage.IGNORE_ITEM_ABILITY__IGNORED_ITEM:
        setIgnoredItem((Item)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TextadventurePackage.IGNORE_ITEM_ABILITY__IGNORED_ITEM:
        return ignoredItem != null;
    }
    return super.eIsSet(featureID);
  }

} //IgnoreItemAbilityImpl
