/**
 */
package org.alia4j.language.bp.impl;

import org.alia4j.language.bp.AttCollisionOperand;
import org.alia4j.language.bp.Attribute;
import org.alia4j.language.bp.BpPackage;
import org.alia4j.language.bp.Target;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Att Collision Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.alia4j.language.bp.impl.AttCollisionOperandImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.alia4j.language.bp.impl.AttCollisionOperandImpl#getAtt <em>Att</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttCollisionOperandImpl extends CollisionExpressionImpl implements AttCollisionOperand
{
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
  protected AttCollisionOperandImpl()
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
    return BpPackage.Literals.ATT_COLLISION_OPERAND;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpPackage.ATT_COLLISION_OPERAND__TARGET, oldTarget, newTarget);
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
        msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BpPackage.ATT_COLLISION_OPERAND__TARGET, null, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BpPackage.ATT_COLLISION_OPERAND__TARGET, null, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BpPackage.ATT_COLLISION_OPERAND__TARGET, newTarget, newTarget));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BpPackage.ATT_COLLISION_OPERAND__ATT, oldAtt, att));
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
      case BpPackage.ATT_COLLISION_OPERAND__TARGET:
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
      case BpPackage.ATT_COLLISION_OPERAND__TARGET:
        return getTarget();
      case BpPackage.ATT_COLLISION_OPERAND__ATT:
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
      case BpPackage.ATT_COLLISION_OPERAND__TARGET:
        setTarget((Target)newValue);
        return;
      case BpPackage.ATT_COLLISION_OPERAND__ATT:
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
      case BpPackage.ATT_COLLISION_OPERAND__TARGET:
        setTarget((Target)null);
        return;
      case BpPackage.ATT_COLLISION_OPERAND__ATT:
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
      case BpPackage.ATT_COLLISION_OPERAND__TARGET:
        return target != null;
      case BpPackage.ATT_COLLISION_OPERAND__ATT:
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

} //AttCollisionOperandImpl
