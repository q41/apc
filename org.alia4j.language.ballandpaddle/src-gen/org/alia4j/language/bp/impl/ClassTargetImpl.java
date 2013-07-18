/**
 */
package org.alia4j.language.bp.impl;

import org.alia4j.language.bp.BPClassType;
import org.alia4j.language.bp.BpPackage;
import org.alia4j.language.bp.ClassTarget;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.alia4j.language.bp.impl.ClassTargetImpl#getClassType <em>Class Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassTargetImpl extends TargetImpl implements ClassTarget
{
  /**
   * The default value of the '{@link #getClassType() <em>Class Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassType()
   * @generated
   * @ordered
   */
  protected static final BPClassType CLASS_TYPE_EDEFAULT = BPClassType.BLOCK;

  /**
   * The cached value of the '{@link #getClassType() <em>Class Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassType()
   * @generated
   * @ordered
   */
  protected BPClassType classType = CLASS_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassTargetImpl()
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
    return BpPackage.Literals.CLASS_TARGET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BPClassType getClassType()
  {
    return classType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassType(BPClassType newClassType)
  {
    BPClassType oldClassType = classType;
    classType = newClassType == null ? CLASS_TYPE_EDEFAULT : newClassType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BpPackage.CLASS_TARGET__CLASS_TYPE, oldClassType, classType));
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
      case BpPackage.CLASS_TARGET__CLASS_TYPE:
        return getClassType();
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
      case BpPackage.CLASS_TARGET__CLASS_TYPE:
        setClassType((BPClassType)newValue);
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
      case BpPackage.CLASS_TARGET__CLASS_TYPE:
        setClassType(CLASS_TYPE_EDEFAULT);
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
      case BpPackage.CLASS_TARGET__CLASS_TYPE:
        return classType != CLASS_TYPE_EDEFAULT;
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
    result.append(" (classType: ");
    result.append(classType);
    result.append(')');
    return result.toString();
  }

} //ClassTargetImpl
