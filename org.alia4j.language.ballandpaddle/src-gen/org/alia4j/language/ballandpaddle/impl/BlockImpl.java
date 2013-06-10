/**
 */
package org.alia4j.language.ballandpaddle.impl;

import org.alia4j.language.ballandpaddle.BallandpaddlePackage;
import org.alia4j.language.ballandpaddle.Block;
import org.alia4j.language.ballandpaddle.Power;

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
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.BlockImpl#getHardness <em>Hardness</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.BlockImpl#getNormalRes <em>Normal Res</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.BlockImpl#getFireRes <em>Fire Res</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.BlockImpl#getColdRes <em>Cold Res</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.BlockImpl#getShockRes <em>Shock Res</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.BlockImpl#getPower <em>Power</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockImpl extends BAPObjectImpl implements Block
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
   * The default value of the '{@link #getNormalRes() <em>Normal Res</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNormalRes()
   * @generated
   * @ordered
   */
  protected static final int NORMAL_RES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNormalRes() <em>Normal Res</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNormalRes()
   * @generated
   * @ordered
   */
  protected int normalRes = NORMAL_RES_EDEFAULT;

  /**
   * The default value of the '{@link #getFireRes() <em>Fire Res</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFireRes()
   * @generated
   * @ordered
   */
  protected static final int FIRE_RES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFireRes() <em>Fire Res</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFireRes()
   * @generated
   * @ordered
   */
  protected int fireRes = FIRE_RES_EDEFAULT;

  /**
   * The default value of the '{@link #getColdRes() <em>Cold Res</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColdRes()
   * @generated
   * @ordered
   */
  protected static final int COLD_RES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getColdRes() <em>Cold Res</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColdRes()
   * @generated
   * @ordered
   */
  protected int coldRes = COLD_RES_EDEFAULT;

  /**
   * The default value of the '{@link #getShockRes() <em>Shock Res</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShockRes()
   * @generated
   * @ordered
   */
  protected static final int SHOCK_RES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getShockRes() <em>Shock Res</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShockRes()
   * @generated
   * @ordered
   */
  protected int shockRes = SHOCK_RES_EDEFAULT;

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
    return BallandpaddlePackage.Literals.BLOCK;
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
      eNotify(new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.BLOCK__HARDNESS, oldHardness, hardness));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNormalRes()
  {
    return normalRes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNormalRes(int newNormalRes)
  {
    int oldNormalRes = normalRes;
    normalRes = newNormalRes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.BLOCK__NORMAL_RES, oldNormalRes, normalRes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFireRes()
  {
    return fireRes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFireRes(int newFireRes)
  {
    int oldFireRes = fireRes;
    fireRes = newFireRes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.BLOCK__FIRE_RES, oldFireRes, fireRes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getColdRes()
  {
    return coldRes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColdRes(int newColdRes)
  {
    int oldColdRes = coldRes;
    coldRes = newColdRes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.BLOCK__COLD_RES, oldColdRes, coldRes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getShockRes()
  {
    return shockRes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShockRes(int newShockRes)
  {
    int oldShockRes = shockRes;
    shockRes = newShockRes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.BLOCK__SHOCK_RES, oldShockRes, shockRes));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BallandpaddlePackage.BLOCK__POWER, oldPower, power));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.BLOCK__POWER, oldPower, power));
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
      case BallandpaddlePackage.BLOCK__HARDNESS:
        return getHardness();
      case BallandpaddlePackage.BLOCK__NORMAL_RES:
        return getNormalRes();
      case BallandpaddlePackage.BLOCK__FIRE_RES:
        return getFireRes();
      case BallandpaddlePackage.BLOCK__COLD_RES:
        return getColdRes();
      case BallandpaddlePackage.BLOCK__SHOCK_RES:
        return getShockRes();
      case BallandpaddlePackage.BLOCK__POWER:
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
      case BallandpaddlePackage.BLOCK__HARDNESS:
        setHardness((Integer)newValue);
        return;
      case BallandpaddlePackage.BLOCK__NORMAL_RES:
        setNormalRes((Integer)newValue);
        return;
      case BallandpaddlePackage.BLOCK__FIRE_RES:
        setFireRes((Integer)newValue);
        return;
      case BallandpaddlePackage.BLOCK__COLD_RES:
        setColdRes((Integer)newValue);
        return;
      case BallandpaddlePackage.BLOCK__SHOCK_RES:
        setShockRes((Integer)newValue);
        return;
      case BallandpaddlePackage.BLOCK__POWER:
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
      case BallandpaddlePackage.BLOCK__HARDNESS:
        setHardness(HARDNESS_EDEFAULT);
        return;
      case BallandpaddlePackage.BLOCK__NORMAL_RES:
        setNormalRes(NORMAL_RES_EDEFAULT);
        return;
      case BallandpaddlePackage.BLOCK__FIRE_RES:
        setFireRes(FIRE_RES_EDEFAULT);
        return;
      case BallandpaddlePackage.BLOCK__COLD_RES:
        setColdRes(COLD_RES_EDEFAULT);
        return;
      case BallandpaddlePackage.BLOCK__SHOCK_RES:
        setShockRes(SHOCK_RES_EDEFAULT);
        return;
      case BallandpaddlePackage.BLOCK__POWER:
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
      case BallandpaddlePackage.BLOCK__HARDNESS:
        return hardness != HARDNESS_EDEFAULT;
      case BallandpaddlePackage.BLOCK__NORMAL_RES:
        return normalRes != NORMAL_RES_EDEFAULT;
      case BallandpaddlePackage.BLOCK__FIRE_RES:
        return fireRes != FIRE_RES_EDEFAULT;
      case BallandpaddlePackage.BLOCK__COLD_RES:
        return coldRes != COLD_RES_EDEFAULT;
      case BallandpaddlePackage.BLOCK__SHOCK_RES:
        return shockRes != SHOCK_RES_EDEFAULT;
      case BallandpaddlePackage.BLOCK__POWER:
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
    result.append(", normalRes: ");
    result.append(normalRes);
    result.append(", fireRes: ");
    result.append(fireRes);
    result.append(", coldRes: ");
    result.append(coldRes);
    result.append(", shockRes: ");
    result.append(shockRes);
    result.append(')');
    return result.toString();
  }

} //BlockImpl
