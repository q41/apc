/**
 */
package org.alia4j.language.bp.impl;

import org.alia4j.language.bp.Block;
import org.alia4j.language.bp.BpPackage;
import org.alia4j.language.bp.Power;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.alia4j.language.bp.impl.BlockImpl#getHardness <em>Hardness</em>}</li>
 *   <li>{@link org.alia4j.language.bp.impl.BlockImpl#getResistance <em>Resistance</em>}</li>
 *   <li>{@link org.alia4j.language.bp.impl.BlockImpl#getPower <em>Power</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockImpl extends BPObjectImpl implements Block
{
  /**
   * The default value of the '{@link #getHardness() <em>Hardness</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHardness()
   * @generated
   * @ordered
   */
  protected static final int HARDNESS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHardness() <em>Hardness</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHardness()
   * @generated
   * @ordered
   */
  protected int hardness = HARDNESS_EDEFAULT;

  /**
   * The default value of the '{@link #getResistance() <em>Resistance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResistance()
   * @generated
   * @ordered
   */
  protected static final int RESISTANCE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getResistance() <em>Resistance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResistance()
   * @generated
   * @ordered
   */
  protected int resistance = RESISTANCE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPower() <em>Power</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPower()
   * @generated
   * @ordered
   */
  protected Power power;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BlockImpl()
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
    return BpPackage.Literals.BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHardness()
  {
    return hardness;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHardness(int newHardness)
  {
    int oldHardness = hardness;
    hardness = newHardness;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BpPackage.BLOCK__HARDNESS, oldHardness, hardness));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getResistance()
  {
    return resistance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResistance(int newResistance)
  {
    int oldResistance = resistance;
    resistance = newResistance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BpPackage.BLOCK__RESISTANCE, oldResistance, resistance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Power getPower()
  {
    if (power != null && power.eIsProxy())
    {
      InternalEObject oldPower = (InternalEObject)power;
      power = (Power)eResolveProxy(oldPower);
      if (power != oldPower)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpPackage.BLOCK__POWER, oldPower, power));
      }
    }
    return power;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Power basicGetPower()
  {
    return power;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPower(Power newPower)
  {
    Power oldPower = power;
    power = newPower;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BpPackage.BLOCK__POWER, oldPower, power));
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
      case BpPackage.BLOCK__HARDNESS:
        return getHardness();
      case BpPackage.BLOCK__RESISTANCE:
        return getResistance();
      case BpPackage.BLOCK__POWER:
        if (resolve) return getPower();
        return basicGetPower();
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
      case BpPackage.BLOCK__HARDNESS:
        setHardness((Integer)newValue);
        return;
      case BpPackage.BLOCK__RESISTANCE:
        setResistance((Integer)newValue);
        return;
      case BpPackage.BLOCK__POWER:
        setPower((Power)newValue);
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
      case BpPackage.BLOCK__HARDNESS:
        setHardness(HARDNESS_EDEFAULT);
        return;
      case BpPackage.BLOCK__RESISTANCE:
        setResistance(RESISTANCE_EDEFAULT);
        return;
      case BpPackage.BLOCK__POWER:
        setPower((Power)null);
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
      case BpPackage.BLOCK__HARDNESS:
        return hardness != HARDNESS_EDEFAULT;
      case BpPackage.BLOCK__RESISTANCE:
        return resistance != RESISTANCE_EDEFAULT;
      case BpPackage.BLOCK__POWER:
        return power != null;
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
    result.append(" (hardness: ");
    result.append(hardness);
    result.append(", resistance: ");
    result.append(resistance);
    result.append(')');
    return result.toString();
  }

} //BlockImpl
