/**
 */
package org.alia4j.language.bp.impl;

import java.util.Collection;

import org.alia4j.language.bp.Ball;
import org.alia4j.language.bp.Block;
import org.alia4j.language.bp.BpPackage;
import org.alia4j.language.bp.Effect;
import org.alia4j.language.bp.Level;
import org.alia4j.language.bp.Paddle;
import org.alia4j.language.bp.Power;
import org.alia4j.language.bp.Root;

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
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.alia4j.language.bp.impl.RootImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.alia4j.language.bp.impl.RootImpl#getPaddles <em>Paddles</em>}</li>
 *   <li>{@link org.alia4j.language.bp.impl.RootImpl#getBalls <em>Balls</em>}</li>
 *   <li>{@link org.alia4j.language.bp.impl.RootImpl#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link org.alia4j.language.bp.impl.RootImpl#getEffects <em>Effects</em>}</li>
 *   <li>{@link org.alia4j.language.bp.impl.RootImpl#getPowers <em>Powers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootImpl extends EObjectImpl implements Root
{
  /**
   * The cached value of the '{@link #getLevel() <em>Level</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected Level level;

  /**
   * The cached value of the '{@link #getPaddles() <em>Paddles</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPaddles()
   * @generated
   * @ordered
   */
  protected EList<Paddle> paddles;

  /**
   * The cached value of the '{@link #getBalls() <em>Balls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBalls()
   * @generated
   * @ordered
   */
  protected EList<Ball> balls;

  /**
   * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocks()
   * @generated
   * @ordered
   */
  protected EList<Block> blocks;

  /**
   * The cached value of the '{@link #getEffects() <em>Effects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffects()
   * @generated
   * @ordered
   */
  protected EList<Effect> effects;

  /**
   * The cached value of the '{@link #getPowers() <em>Powers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPowers()
   * @generated
   * @ordered
   */
  protected EList<Power> powers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RootImpl()
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
    return BpPackage.Literals.ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Level getLevel()
  {
    return level;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLevel(Level newLevel, NotificationChain msgs)
  {
    Level oldLevel = level;
    level = newLevel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpPackage.ROOT__LEVEL, oldLevel, newLevel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLevel(Level newLevel)
  {
    if (newLevel != level)
    {
      NotificationChain msgs = null;
      if (level != null)
        msgs = ((InternalEObject)level).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BpPackage.ROOT__LEVEL, null, msgs);
      if (newLevel != null)
        msgs = ((InternalEObject)newLevel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BpPackage.ROOT__LEVEL, null, msgs);
      msgs = basicSetLevel(newLevel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BpPackage.ROOT__LEVEL, newLevel, newLevel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Paddle> getPaddles()
  {
    if (paddles == null)
    {
      paddles = new EObjectContainmentEList<Paddle>(Paddle.class, this, BpPackage.ROOT__PADDLES);
    }
    return paddles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Ball> getBalls()
  {
    if (balls == null)
    {
      balls = new EObjectContainmentEList<Ball>(Ball.class, this, BpPackage.ROOT__BALLS);
    }
    return balls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Block> getBlocks()
  {
    if (blocks == null)
    {
      blocks = new EObjectContainmentEList<Block>(Block.class, this, BpPackage.ROOT__BLOCKS);
    }
    return blocks;
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
      effects = new EObjectContainmentEList<Effect>(Effect.class, this, BpPackage.ROOT__EFFECTS);
    }
    return effects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Power> getPowers()
  {
    if (powers == null)
    {
      powers = new EObjectContainmentEList<Power>(Power.class, this, BpPackage.ROOT__POWERS);
    }
    return powers;
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
      case BpPackage.ROOT__LEVEL:
        return basicSetLevel(null, msgs);
      case BpPackage.ROOT__PADDLES:
        return ((InternalEList<?>)getPaddles()).basicRemove(otherEnd, msgs);
      case BpPackage.ROOT__BALLS:
        return ((InternalEList<?>)getBalls()).basicRemove(otherEnd, msgs);
      case BpPackage.ROOT__BLOCKS:
        return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
      case BpPackage.ROOT__EFFECTS:
        return ((InternalEList<?>)getEffects()).basicRemove(otherEnd, msgs);
      case BpPackage.ROOT__POWERS:
        return ((InternalEList<?>)getPowers()).basicRemove(otherEnd, msgs);
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
      case BpPackage.ROOT__LEVEL:
        return getLevel();
      case BpPackage.ROOT__PADDLES:
        return getPaddles();
      case BpPackage.ROOT__BALLS:
        return getBalls();
      case BpPackage.ROOT__BLOCKS:
        return getBlocks();
      case BpPackage.ROOT__EFFECTS:
        return getEffects();
      case BpPackage.ROOT__POWERS:
        return getPowers();
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
      case BpPackage.ROOT__LEVEL:
        setLevel((Level)newValue);
        return;
      case BpPackage.ROOT__PADDLES:
        getPaddles().clear();
        getPaddles().addAll((Collection<? extends Paddle>)newValue);
        return;
      case BpPackage.ROOT__BALLS:
        getBalls().clear();
        getBalls().addAll((Collection<? extends Ball>)newValue);
        return;
      case BpPackage.ROOT__BLOCKS:
        getBlocks().clear();
        getBlocks().addAll((Collection<? extends Block>)newValue);
        return;
      case BpPackage.ROOT__EFFECTS:
        getEffects().clear();
        getEffects().addAll((Collection<? extends Effect>)newValue);
        return;
      case BpPackage.ROOT__POWERS:
        getPowers().clear();
        getPowers().addAll((Collection<? extends Power>)newValue);
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
      case BpPackage.ROOT__LEVEL:
        setLevel((Level)null);
        return;
      case BpPackage.ROOT__PADDLES:
        getPaddles().clear();
        return;
      case BpPackage.ROOT__BALLS:
        getBalls().clear();
        return;
      case BpPackage.ROOT__BLOCKS:
        getBlocks().clear();
        return;
      case BpPackage.ROOT__EFFECTS:
        getEffects().clear();
        return;
      case BpPackage.ROOT__POWERS:
        getPowers().clear();
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
      case BpPackage.ROOT__LEVEL:
        return level != null;
      case BpPackage.ROOT__PADDLES:
        return paddles != null && !paddles.isEmpty();
      case BpPackage.ROOT__BALLS:
        return balls != null && !balls.isEmpty();
      case BpPackage.ROOT__BLOCKS:
        return blocks != null && !blocks.isEmpty();
      case BpPackage.ROOT__EFFECTS:
        return effects != null && !effects.isEmpty();
      case BpPackage.ROOT__POWERS:
        return powers != null && !powers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RootImpl
