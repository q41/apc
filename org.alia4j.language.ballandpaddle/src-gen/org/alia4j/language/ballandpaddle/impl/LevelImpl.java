/**
 */
package org.alia4j.language.ballandpaddle.impl;

import java.util.Collection;

import org.alia4j.language.ballandpaddle.BallandpaddlePackage;
import org.alia4j.language.ballandpaddle.Level;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.LevelImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.LevelImpl#getPowerSpawnChance <em>Power Spawn Chance</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.LevelImpl#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LevelImpl extends EObjectImpl implements Level
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
   * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocks()
   * @generated
   * @ordered
   */
  protected EList<String> blocks;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LevelImpl()
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
    return BallandpaddlePackage.Literals.LEVEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.LEVEL__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.LEVEL__POWER_SPAWN_CHANCE, oldPowerSpawnChance, powerSpawnChance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getBlocks()
  {
    if (blocks == null)
    {
      blocks = new EDataTypeUniqueEList<String>(String.class, this, BallandpaddlePackage.LEVEL__BLOCKS);
    }
    return blocks;
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
      case BallandpaddlePackage.LEVEL__ID:
        return getId();
      case BallandpaddlePackage.LEVEL__POWER_SPAWN_CHANCE:
        return getPowerSpawnChance();
      case BallandpaddlePackage.LEVEL__BLOCKS:
        return getBlocks();
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
      case BallandpaddlePackage.LEVEL__ID:
        setId((String)newValue);
        return;
      case BallandpaddlePackage.LEVEL__POWER_SPAWN_CHANCE:
        setPowerSpawnChance((Float)newValue);
        return;
      case BallandpaddlePackage.LEVEL__BLOCKS:
        getBlocks().clear();
        getBlocks().addAll((Collection<? extends String>)newValue);
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
      case BallandpaddlePackage.LEVEL__ID:
        setId(ID_EDEFAULT);
        return;
      case BallandpaddlePackage.LEVEL__POWER_SPAWN_CHANCE:
        setPowerSpawnChance(POWER_SPAWN_CHANCE_EDEFAULT);
        return;
      case BallandpaddlePackage.LEVEL__BLOCKS:
        getBlocks().clear();
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
      case BallandpaddlePackage.LEVEL__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case BallandpaddlePackage.LEVEL__POWER_SPAWN_CHANCE:
        return powerSpawnChance != POWER_SPAWN_CHANCE_EDEFAULT;
      case BallandpaddlePackage.LEVEL__BLOCKS:
        return blocks != null && !blocks.isEmpty();
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
    result.append(", blocks: ");
    result.append(blocks);
    result.append(')');
    return result.toString();
  }

} //LevelImpl
