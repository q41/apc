/**
 */
package org.alia4j.language.textadventure.impl;

import java.util.Collection;

import org.alia4j.language.textadventure.Action;
import org.alia4j.language.textadventure.Binding;
import org.alia4j.language.textadventure.Condition;
import org.alia4j.language.textadventure.Effect;
import org.alia4j.language.textadventure.TextadventurePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.alia4j.language.textadventure.impl.EffectImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.alia4j.language.textadventure.impl.EffectImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.alia4j.language.textadventure.impl.EffectImpl#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EffectImpl extends EObjectImpl implements Effect
{
  /**
   * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected static final Condition CONDITION_EDEFAULT = Condition.USED;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Condition condition = CONDITION_EDEFAULT;

  /**
   * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinding()
   * @generated
   * @ordered
   */
  protected EList<Binding> binding;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected EList<Action> action;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EffectImpl()
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
    return TextadventurePackage.Literals.EFFECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(Condition newCondition)
  {
    Condition oldCondition = condition;
    condition = newCondition == null ? CONDITION_EDEFAULT : newCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextadventurePackage.EFFECT__CONDITION, oldCondition, condition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Binding> getBinding()
  {
    if (binding == null)
    {
      binding = new EObjectContainmentEList<Binding>(Binding.class, this, TextadventurePackage.EFFECT__BINDING);
    }
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getAction()
  {
    if (action == null)
    {
      action = new EObjectContainmentEList<Action>(Action.class, this, TextadventurePackage.EFFECT__ACTION);
    }
    return action;
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
      case TextadventurePackage.EFFECT__BINDING:
        return ((InternalEList<?>)getBinding()).basicRemove(otherEnd, msgs);
      case TextadventurePackage.EFFECT__ACTION:
        return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
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
      case TextadventurePackage.EFFECT__CONDITION:
        return getCondition();
      case TextadventurePackage.EFFECT__BINDING:
        return getBinding();
      case TextadventurePackage.EFFECT__ACTION:
        return getAction();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TextadventurePackage.EFFECT__CONDITION:
        setCondition((Condition)newValue);
        return;
      case TextadventurePackage.EFFECT__BINDING:
        getBinding().clear();
        getBinding().addAll((Collection<? extends Binding>)newValue);
        return;
      case TextadventurePackage.EFFECT__ACTION:
        getAction().clear();
        getAction().addAll((Collection<? extends Action>)newValue);
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
      case TextadventurePackage.EFFECT__CONDITION:
        setCondition(CONDITION_EDEFAULT);
        return;
      case TextadventurePackage.EFFECT__BINDING:
        getBinding().clear();
        return;
      case TextadventurePackage.EFFECT__ACTION:
        getAction().clear();
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
      case TextadventurePackage.EFFECT__CONDITION:
        return condition != CONDITION_EDEFAULT;
      case TextadventurePackage.EFFECT__BINDING:
        return binding != null && !binding.isEmpty();
      case TextadventurePackage.EFFECT__ACTION:
        return action != null && !action.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (condition: ");
    result.append(condition);
    result.append(')');
    return result.toString();
  }

} //EffectImpl
