/**
 */
package org.alia4j.language.textadventure.impl;

import org.alia4j.language.textadventure.Binding;
import org.alia4j.language.textadventure.List;
import org.alia4j.language.textadventure.RemoveAction;
import org.alia4j.language.textadventure.TextadventurePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.alia4j.language.textadventure.impl.RemoveActionImpl#getWhat <em>What</em>}</li>
 *   <li>{@link org.alia4j.language.textadventure.impl.RemoveActionImpl#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoveActionImpl extends ActionImpl implements RemoveAction
{
  /**
   * The cached value of the '{@link #getWhat() <em>What</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhat()
   * @generated
   * @ordered
   */
  protected Binding what;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected List from;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RemoveActionImpl()
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
    return TextadventurePackage.Literals.REMOVE_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding getWhat()
  {
    if (what != null && what.eIsProxy())
    {
      InternalEObject oldWhat = (InternalEObject)what;
      what = (Binding)eResolveProxy(oldWhat);
      if (what != oldWhat)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TextadventurePackage.REMOVE_ACTION__WHAT, oldWhat, what));
      }
    }
    return what;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding basicGetWhat()
  {
    return what;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhat(Binding newWhat)
  {
    Binding oldWhat = what;
    what = newWhat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextadventurePackage.REMOVE_ACTION__WHAT, oldWhat, what));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List getFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFrom(List newFrom, NotificationChain msgs)
  {
    List oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextadventurePackage.REMOVE_ACTION__FROM, oldFrom, newFrom);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(List newFrom)
  {
    if (newFrom != from)
    {
      NotificationChain msgs = null;
      if (from != null)
        msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextadventurePackage.REMOVE_ACTION__FROM, null, msgs);
      if (newFrom != null)
        msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextadventurePackage.REMOVE_ACTION__FROM, null, msgs);
      msgs = basicSetFrom(newFrom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextadventurePackage.REMOVE_ACTION__FROM, newFrom, newFrom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TextadventurePackage.REMOVE_ACTION__FROM:
        return basicSetFrom(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case TextadventurePackage.REMOVE_ACTION__WHAT:
        if (resolve) return getWhat();
        return basicGetWhat();
      case TextadventurePackage.REMOVE_ACTION__FROM:
        return getFrom();
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
      case TextadventurePackage.REMOVE_ACTION__WHAT:
        setWhat((Binding)newValue);
        return;
      case TextadventurePackage.REMOVE_ACTION__FROM:
        setFrom((List)newValue);
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
      case TextadventurePackage.REMOVE_ACTION__WHAT:
        setWhat((Binding)null);
        return;
      case TextadventurePackage.REMOVE_ACTION__FROM:
        setFrom((List)null);
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
      case TextadventurePackage.REMOVE_ACTION__WHAT:
        return what != null;
      case TextadventurePackage.REMOVE_ACTION__FROM:
        return from != null;
    }
    return super.eIsSet(featureID);
  }

} //RemoveActionImpl
