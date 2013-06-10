/**
 */
package org.alia4j.language.ballandpaddle.impl;

import org.alia4j.language.ballandpaddle.BAPObject;
import org.alia4j.language.ballandpaddle.BallandpaddlePackage;
import org.alia4j.language.ballandpaddle.ObjectTarget;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.ObjectTargetImpl#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectTargetImpl extends TargetImpl implements ObjectTarget
{
  /**
   * The cached value of the '{@link #getItem() <em>Item</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItem()
   * @generated
   * @ordered
   */
  protected BAPObject item;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectTargetImpl()
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
    return BallandpaddlePackage.Literals.OBJECT_TARGET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BAPObject getItem()
  {
    if (item != null && item.eIsProxy())
    {
      InternalEObject oldItem = (InternalEObject)item;
      item = (BAPObject)eResolveProxy(oldItem);
      if (item != oldItem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BallandpaddlePackage.OBJECT_TARGET__ITEM, oldItem, item));
      }
    }
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BAPObject basicGetItem()
  {
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setItem(BAPObject newItem)
  {
    BAPObject oldItem = item;
    item = newItem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.OBJECT_TARGET__ITEM, oldItem, item));
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
      case BallandpaddlePackage.OBJECT_TARGET__ITEM:
        if (resolve) return getItem();
        return basicGetItem();
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
      case BallandpaddlePackage.OBJECT_TARGET__ITEM:
        setItem((BAPObject)newValue);
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
      case BallandpaddlePackage.OBJECT_TARGET__ITEM:
        setItem((BAPObject)null);
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
      case BallandpaddlePackage.OBJECT_TARGET__ITEM:
        return item != null;
    }
    return super.eIsSet(featureID);
  }

} //ObjectTargetImpl
