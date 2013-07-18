/**
 */
package org.alia4j.language.bp.impl;

import org.alia4j.language.bp.BpPackage;
import org.alia4j.language.bp.CollisionEffect;
import org.alia4j.language.bp.CollisionEffectBody;
import org.alia4j.language.bp.Expression;
import org.alia4j.language.bp.Target;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collision Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.alia4j.language.bp.impl.CollisionEffectImpl#getLeftTarget <em>Left Target</em>}</li>
 *   <li>{@link org.alia4j.language.bp.impl.CollisionEffectImpl#getLeftFilter <em>Left Filter</em>}</li>
 *   <li>{@link org.alia4j.language.bp.impl.CollisionEffectImpl#getRightTarget <em>Right Target</em>}</li>
 *   <li>{@link org.alia4j.language.bp.impl.CollisionEffectImpl#getRightFilter <em>Right Filter</em>}</li>
 *   <li>{@link org.alia4j.language.bp.impl.CollisionEffectImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollisionEffectImpl extends EffectImpl implements CollisionEffect
{
  /**
   * The cached value of the '{@link #getLeftTarget() <em>Left Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftTarget()
   * @generated
   * @ordered
   */
  protected Target leftTarget;

  /**
   * The cached value of the '{@link #getLeftFilter() <em>Left Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftFilter()
   * @generated
   * @ordered
   */
  protected Expression leftFilter;

  /**
   * The cached value of the '{@link #getRightTarget() <em>Right Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightTarget()
   * @generated
   * @ordered
   */
  protected Target rightTarget;

  /**
   * The cached value of the '{@link #getRightFilter() <em>Right Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightFilter()
   * @generated
   * @ordered
   */
  protected Expression rightFilter;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected CollisionEffectBody body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CollisionEffectImpl()
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
    return BpPackage.Literals.COLLISION_EFFECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Target getLeftTarget()
  {
    return leftTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftTarget(Target newLeftTarget, NotificationChain msgs)
  {
    Target oldLeftTarget = leftTarget;
    leftTarget = newLeftTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpPackage.COLLISION_EFFECT__LEFT_TARGET, oldLeftTarget, newLeftTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftTarget(Target newLeftTarget)
  {
    if (newLeftTarget != leftTarget)
    {
      NotificationChain msgs = null;
      if (leftTarget != null)
        msgs = ((InternalEObject)leftTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BpPackage.COLLISION_EFFECT__LEFT_TARGET, null, msgs);
      if (newLeftTarget != null)
        msgs = ((InternalEObject)newLeftTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BpPackage.COLLISION_EFFECT__LEFT_TARGET, null, msgs);
      msgs = basicSetLeftTarget(newLeftTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BpPackage.COLLISION_EFFECT__LEFT_TARGET, newLeftTarget, newLeftTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getLeftFilter()
  {
    return leftFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftFilter(Expression newLeftFilter, NotificationChain msgs)
  {
    Expression oldLeftFilter = leftFilter;
    leftFilter = newLeftFilter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpPackage.COLLISION_EFFECT__LEFT_FILTER, oldLeftFilter, newLeftFilter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftFilter(Expression newLeftFilter)
  {
    if (newLeftFilter != leftFilter)
    {
      NotificationChain msgs = null;
      if (leftFilter != null)
        msgs = ((InternalEObject)leftFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BpPackage.COLLISION_EFFECT__LEFT_FILTER, null, msgs);
      if (newLeftFilter != null)
        msgs = ((InternalEObject)newLeftFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BpPackage.COLLISION_EFFECT__LEFT_FILTER, null, msgs);
      msgs = basicSetLeftFilter(newLeftFilter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BpPackage.COLLISION_EFFECT__LEFT_FILTER, newLeftFilter, newLeftFilter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Target getRightTarget()
  {
    return rightTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightTarget(Target newRightTarget, NotificationChain msgs)
  {
    Target oldRightTarget = rightTarget;
    rightTarget = newRightTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpPackage.COLLISION_EFFECT__RIGHT_TARGET, oldRightTarget, newRightTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightTarget(Target newRightTarget)
  {
    if (newRightTarget != rightTarget)
    {
      NotificationChain msgs = null;
      if (rightTarget != null)
        msgs = ((InternalEObject)rightTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BpPackage.COLLISION_EFFECT__RIGHT_TARGET, null, msgs);
      if (newRightTarget != null)
        msgs = ((InternalEObject)newRightTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BpPackage.COLLISION_EFFECT__RIGHT_TARGET, null, msgs);
      msgs = basicSetRightTarget(newRightTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BpPackage.COLLISION_EFFECT__RIGHT_TARGET, newRightTarget, newRightTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getRightFilter()
  {
    return rightFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightFilter(Expression newRightFilter, NotificationChain msgs)
  {
    Expression oldRightFilter = rightFilter;
    rightFilter = newRightFilter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpPackage.COLLISION_EFFECT__RIGHT_FILTER, oldRightFilter, newRightFilter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightFilter(Expression newRightFilter)
  {
    if (newRightFilter != rightFilter)
    {
      NotificationChain msgs = null;
      if (rightFilter != null)
        msgs = ((InternalEObject)rightFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BpPackage.COLLISION_EFFECT__RIGHT_FILTER, null, msgs);
      if (newRightFilter != null)
        msgs = ((InternalEObject)newRightFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BpPackage.COLLISION_EFFECT__RIGHT_FILTER, null, msgs);
      msgs = basicSetRightFilter(newRightFilter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BpPackage.COLLISION_EFFECT__RIGHT_FILTER, newRightFilter, newRightFilter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollisionEffectBody getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(CollisionEffectBody newBody, NotificationChain msgs)
  {
    CollisionEffectBody oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpPackage.COLLISION_EFFECT__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(CollisionEffectBody newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BpPackage.COLLISION_EFFECT__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BpPackage.COLLISION_EFFECT__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BpPackage.COLLISION_EFFECT__BODY, newBody, newBody));
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
      case BpPackage.COLLISION_EFFECT__LEFT_TARGET:
        return basicSetLeftTarget(null, msgs);
      case BpPackage.COLLISION_EFFECT__LEFT_FILTER:
        return basicSetLeftFilter(null, msgs);
      case BpPackage.COLLISION_EFFECT__RIGHT_TARGET:
        return basicSetRightTarget(null, msgs);
      case BpPackage.COLLISION_EFFECT__RIGHT_FILTER:
        return basicSetRightFilter(null, msgs);
      case BpPackage.COLLISION_EFFECT__BODY:
        return basicSetBody(null, msgs);
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
      case BpPackage.COLLISION_EFFECT__LEFT_TARGET:
        return getLeftTarget();
      case BpPackage.COLLISION_EFFECT__LEFT_FILTER:
        return getLeftFilter();
      case BpPackage.COLLISION_EFFECT__RIGHT_TARGET:
        return getRightTarget();
      case BpPackage.COLLISION_EFFECT__RIGHT_FILTER:
        return getRightFilter();
      case BpPackage.COLLISION_EFFECT__BODY:
        return getBody();
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
      case BpPackage.COLLISION_EFFECT__LEFT_TARGET:
        setLeftTarget((Target)newValue);
        return;
      case BpPackage.COLLISION_EFFECT__LEFT_FILTER:
        setLeftFilter((Expression)newValue);
        return;
      case BpPackage.COLLISION_EFFECT__RIGHT_TARGET:
        setRightTarget((Target)newValue);
        return;
      case BpPackage.COLLISION_EFFECT__RIGHT_FILTER:
        setRightFilter((Expression)newValue);
        return;
      case BpPackage.COLLISION_EFFECT__BODY:
        setBody((CollisionEffectBody)newValue);
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
      case BpPackage.COLLISION_EFFECT__LEFT_TARGET:
        setLeftTarget((Target)null);
        return;
      case BpPackage.COLLISION_EFFECT__LEFT_FILTER:
        setLeftFilter((Expression)null);
        return;
      case BpPackage.COLLISION_EFFECT__RIGHT_TARGET:
        setRightTarget((Target)null);
        return;
      case BpPackage.COLLISION_EFFECT__RIGHT_FILTER:
        setRightFilter((Expression)null);
        return;
      case BpPackage.COLLISION_EFFECT__BODY:
        setBody((CollisionEffectBody)null);
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
      case BpPackage.COLLISION_EFFECT__LEFT_TARGET:
        return leftTarget != null;
      case BpPackage.COLLISION_EFFECT__LEFT_FILTER:
        return leftFilter != null;
      case BpPackage.COLLISION_EFFECT__RIGHT_TARGET:
        return rightTarget != null;
      case BpPackage.COLLISION_EFFECT__RIGHT_FILTER:
        return rightFilter != null;
      case BpPackage.COLLISION_EFFECT__BODY:
        return body != null;
    }
    return super.eIsSet(featureID);
  }

} //CollisionEffectImpl
