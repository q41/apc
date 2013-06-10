/**
 */
package org.alia4j.language.ballandpaddle.impl;

import java.util.Collection;

import org.alia4j.language.ballandpaddle.BallandpaddlePackage;
import org.alia4j.language.ballandpaddle.Effect;
import org.alia4j.language.ballandpaddle.Power;
import org.alia4j.language.ballandpaddle.Target;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.PowerImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.PowerImpl#getEffects <em>Effects</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.PowerImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.PowerImpl#getPowerSpawnChance <em>Power Spawn Chance</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.PowerImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PowerImpl extends EObjectImpl implements Power
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getEffects() <em>Effects</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffects()
   * @generated
   * @ordered
   */
  protected EList<Effect> effects;

  /**
   * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected static final int DURATION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected int duration = DURATION_EDEFAULT;

  /**
   * The default value of the '{@link #getPowerSpawnChance() <em>Power Spawn Chance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPowerSpawnChance()
   * @generated
   * @ordered
   */
  protected static final float POWER_SPAWN_CHANCE_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getPowerSpawnChance() <em>Power Spawn Chance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPowerSpawnChance()
   * @generated
   * @ordered
   */
  protected float powerSpawnChance = POWER_SPAWN_CHANCE_EDEFAULT;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected Target target;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PowerImpl()
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
    return BallandpaddlePackage.Literals.POWER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.POWER__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Effect> getEffects()
  {
    if (effects == null)
    {
      effects = new EObjectResolvingEList<Effect>(Effect.class, this, BallandpaddlePackage.POWER__EFFECTS);
    }
    return effects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDuration()
  {
    return duration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDuration(int newDuration)
  {
    int oldDuration = duration;
    duration = newDuration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.POWER__DURATION, oldDuration, duration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getPowerSpawnChance()
  {
    return powerSpawnChance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPowerSpawnChance(float newPowerSpawnChance)
  {
    float oldPowerSpawnChance = powerSpawnChance;
    powerSpawnChance = newPowerSpawnChance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.POWER__POWER_SPAWN_CHANCE, oldPowerSpawnChance, powerSpawnChance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Target getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(Target newTarget, NotificationChain msgs)
  {
    Target oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.POWER__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(Target newTarget)
  {
    if (newTarget != target)
    {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BallandpaddlePackage.POWER__TARGET, null, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BallandpaddlePackage.POWER__TARGET, null, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.POWER__TARGET, newTarget, newTarget));
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
      case BallandpaddlePackage.POWER__TARGET:
        return basicSetTarget(null, msgs);
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
      case BallandpaddlePackage.POWER__ID:
        return getId();
      case BallandpaddlePackage.POWER__EFFECTS:
        return getEffects();
      case BallandpaddlePackage.POWER__DURATION:
        return getDuration();
      case BallandpaddlePackage.POWER__POWER_SPAWN_CHANCE:
        return getPowerSpawnChance();
      case BallandpaddlePackage.POWER__TARGET:
        return getTarget();
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
      case BallandpaddlePackage.POWER__ID:
        setId((String)newValue);
        return;
      case BallandpaddlePackage.POWER__EFFECTS:
        getEffects().clear();
        getEffects().addAll((Collection<? extends Effect>)newValue);
        return;
      case BallandpaddlePackage.POWER__DURATION:
        setDuration((Integer)newValue);
        return;
      case BallandpaddlePackage.POWER__POWER_SPAWN_CHANCE:
        setPowerSpawnChance((Float)newValue);
        return;
      case BallandpaddlePackage.POWER__TARGET:
        setTarget((Target)newValue);
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
      case BallandpaddlePackage.POWER__ID:
        setId(ID_EDEFAULT);
        return;
      case BallandpaddlePackage.POWER__EFFECTS:
        getEffects().clear();
        return;
      case BallandpaddlePackage.POWER__DURATION:
        setDuration(DURATION_EDEFAULT);
        return;
      case BallandpaddlePackage.POWER__POWER_SPAWN_CHANCE:
        setPowerSpawnChance(POWER_SPAWN_CHANCE_EDEFAULT);
        return;
      case BallandpaddlePackage.POWER__TARGET:
        setTarget((Target)null);
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
      case BallandpaddlePackage.POWER__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case BallandpaddlePackage.POWER__EFFECTS:
        return effects != null && !effects.isEmpty();
      case BallandpaddlePackage.POWER__DURATION:
        return duration != DURATION_EDEFAULT;
      case BallandpaddlePackage.POWER__POWER_SPAWN_CHANCE:
        return powerSpawnChance != POWER_SPAWN_CHANCE_EDEFAULT;
      case BallandpaddlePackage.POWER__TARGET:
        return target != null;
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
    result.append(" (id: ");
    result.append(id);
    result.append(", duration: ");
    result.append(duration);
    result.append(", powerSpawnChance: ");
    result.append(powerSpawnChance);
    result.append(')');
    return result.toString();
  }

} //PowerImpl
