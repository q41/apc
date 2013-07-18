/**
 */
package org.alia4j.language.bp.impl;

import java.util.Collection;

import org.alia4j.language.bp.BpPackage;
import org.alia4j.language.bp.Effect;
import org.alia4j.language.bp.Power;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link org.alia4j.language.bp.impl.PowerImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.alia4j.language.bp.impl.PowerImpl#getEffects <em>Effects</em>}</li>
 *   <li>{@link org.alia4j.language.bp.impl.PowerImpl#getPowerSpawnChance <em>Power Spawn Chance</em>}</li>
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
    return BpPackage.Literals.POWER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, BpPackage.POWER__ID, oldId, id));
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
      effects = new EObjectResolvingEList<Effect>(Effect.class, this, BpPackage.POWER__EFFECTS);
    }
    return effects;
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
      eNotify(new ENotificationImpl(this, Notification.SET, BpPackage.POWER__POWER_SPAWN_CHANCE, oldPowerSpawnChance, powerSpawnChance));
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
      case BpPackage.POWER__ID:
        return getId();
      case BpPackage.POWER__EFFECTS:
        return getEffects();
      case BpPackage.POWER__POWER_SPAWN_CHANCE:
        return getPowerSpawnChance();
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
      case BpPackage.POWER__ID:
        setId((String)newValue);
        return;
      case BpPackage.POWER__EFFECTS:
        getEffects().clear();
        getEffects().addAll((Collection<? extends Effect>)newValue);
        return;
      case BpPackage.POWER__POWER_SPAWN_CHANCE:
        setPowerSpawnChance((Float)newValue);
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
      case BpPackage.POWER__ID:
        setId(ID_EDEFAULT);
        return;
      case BpPackage.POWER__EFFECTS:
        getEffects().clear();
        return;
      case BpPackage.POWER__POWER_SPAWN_CHANCE:
        setPowerSpawnChance(POWER_SPAWN_CHANCE_EDEFAULT);
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
      case BpPackage.POWER__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case BpPackage.POWER__EFFECTS:
        return effects != null && !effects.isEmpty();
      case BpPackage.POWER__POWER_SPAWN_CHANCE:
        return powerSpawnChance != POWER_SPAWN_CHANCE_EDEFAULT;
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
    result.append(", powerSpawnChance: ");
    result.append(powerSpawnChance);
    result.append(')');
    return result.toString();
  }

} //PowerImpl
