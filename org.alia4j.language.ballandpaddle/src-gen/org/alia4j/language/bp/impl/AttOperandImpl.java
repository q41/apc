/**
 */
package org.alia4j.language.bp.impl;

import org.alia4j.language.bp.AttOperand;
import org.alia4j.language.bp.Attribute;
import org.alia4j.language.bp.BpPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Att Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.alia4j.language.bp.impl.AttOperandImpl#getAtt <em>Att</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttOperandImpl extends ExpressionImpl implements AttOperand
{
  /**
   * The default value of the '{@link #getAtt() <em>Att</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtt()
   * @generated
   * @ordered
   */
  protected static final Attribute ATT_EDEFAULT = Attribute.SIZE;

  /**
   * The cached value of the '{@link #getAtt() <em>Att</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtt()
   * @generated
   * @ordered
   */
  protected Attribute att = ATT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttOperandImpl()
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
    return BpPackage.Literals.ATT_OPERAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getAtt()
  {
    return att;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtt(Attribute newAtt)
  {
    Attribute oldAtt = att;
    att = newAtt == null ? ATT_EDEFAULT : newAtt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BpPackage.ATT_OPERAND__ATT, oldAtt, att));
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
      case BpPackage.ATT_OPERAND__ATT:
        return getAtt();
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
      case BpPackage.ATT_OPERAND__ATT:
        setAtt((Attribute)newValue);
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
      case BpPackage.ATT_OPERAND__ATT:
        setAtt(ATT_EDEFAULT);
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
      case BpPackage.ATT_OPERAND__ATT:
        return att != ATT_EDEFAULT;
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
    result.append(" (att: ");
    result.append(att);
    result.append(')');
    return result.toString();
  }

} //AttOperandImpl
