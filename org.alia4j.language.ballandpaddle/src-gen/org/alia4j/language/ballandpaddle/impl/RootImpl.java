/**
 */
package org.alia4j.language.ballandpaddle.impl;

import java.util.Collection;

import org.alia4j.language.ballandpaddle.Ball;
import org.alia4j.language.ballandpaddle.BallandpaddlePackage;
import org.alia4j.language.ballandpaddle.Block;
import org.alia4j.language.ballandpaddle.Effect;
import org.alia4j.language.ballandpaddle.Level;
import org.alia4j.language.ballandpaddle.Paddle;
import org.alia4j.language.ballandpaddle.Power;
import org.alia4j.language.ballandpaddle.Root;

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
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.RootImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.RootImpl#getPaddles <em>Paddles</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.RootImpl#getBalls <em>Balls</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.RootImpl#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.RootImpl#getEffects <em>Effects</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.RootImpl#getPowers <em>Powers</em>}</li>
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
    return BallandpaddlePackage.Literals.ROOT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.ROOT__LEVEL, oldLevel, newLevel);
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
        msgs = ((InternalEObject)level).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BallandpaddlePackage.ROOT__LEVEL, null, msgs);
      if (newLevel != null)
        msgs = ((InternalEObject)newLevel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BallandpaddlePackage.ROOT__LEVEL, null, msgs);
      msgs = basicSetLevel(newLevel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.ROOT__LEVEL, newLevel, newLevel));
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
      paddles = new EObjectContainmentEList<Paddle>(Paddle.class, this, BallandpaddlePackage.ROOT__PADDLES);
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
      balls = new EObjectContainmentEList<Ball>(Ball.class, this, BallandpaddlePackage.ROOT__BALLS);
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
      blocks = new EObjectContainmentEList<Block>(Block.class, this, BallandpaddlePackage.ROOT__BLOCKS);
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
      effects = new EObjectContainmentEList<Effect>(Effect.class, this, BallandpaddlePackage.ROOT__EFFECTS);
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
      powers = new EObjectContainmentEList<Power>(Power.class, this, BallandpaddlePackage.ROOT__POWERS);
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
      case BallandpaddlePackage.ROOT__LEVEL:
        return basicSetLevel(null, msgs);
      case BallandpaddlePackage.ROOT__PADDLES:
        return ((InternalEList<?>)getPaddles()).basicRemove(otherEnd, msgs);
      case BallandpaddlePackage.ROOT__BALLS:
        return ((InternalEList<?>)getBalls()).basicRemove(otherEnd, msgs);
      case BallandpaddlePackage.ROOT__BLOCKS:
        return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
      case BallandpaddlePackage.ROOT__EFFECTS:
        return ((InternalEList<?>)getEffects()).basicRemove(otherEnd, msgs);
      case BallandpaddlePackage.ROOT__POWERS:
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
      case BallandpaddlePackage.ROOT__LEVEL:
        return getLevel();
      case BallandpaddlePackage.ROOT__PADDLES:
        return getPaddles();
      case BallandpaddlePackage.ROOT__BALLS:
        return getBalls();
      case BallandpaddlePackage.ROOT__BLOCKS:
        return getBlocks();
      case BallandpaddlePackage.ROOT__EFFECTS:
        return getEffects();
      case BallandpaddlePackage.ROOT__POWERS:
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
      case BallandpaddlePackage.ROOT__LEVEL:
        setLevel((Level)newValue);
        return;
      case BallandpaddlePackage.ROOT__PADDLES:
        getPaddles().clear();
        getPaddles().addAll((Collection<? extends Paddle>)newValue);
        return;
      case BallandpaddlePackage.ROOT__BALLS:
        getBalls().clear();
        getBalls().addAll((Collection<? extends Ball>)newValue);
        return;
      case BallandpaddlePackage.ROOT__BLOCKS:
        getBlocks().clear();
        getBlocks().addAll((Collection<? extends Block>)newValue);
        return;
      case BallandpaddlePackage.ROOT__EFFECTS:
        getEffects().clear();
        getEffects().addAll((Collection<? extends Effect>)newValue);
        return;
      case BallandpaddlePackage.ROOT__POWERS:
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
      case BallandpaddlePackage.ROOT__LEVEL:
        setLevel((Level)null);
        return;
      case BallandpaddlePackage.ROOT__PADDLES:
        getPaddles().clear();
        return;
      case BallandpaddlePackage.ROOT__BALLS:
        getBalls().clear();
        return;
      case BallandpaddlePackage.ROOT__BLOCKS:
        getBlocks().clear();
        return;
      case BallandpaddlePackage.ROOT__EFFECTS:
        getEffects().clear();
        return;
      case BallandpaddlePackage.ROOT__POWERS:
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
      case BallandpaddlePackage.ROOT__LEVEL:
        return level != null;
      case BallandpaddlePackage.ROOT__PADDLES:
        return paddles != null && !paddles.isEmpty();
      case BallandpaddlePackage.ROOT__BALLS:
        return balls != null && !balls.isEmpty();
      case BallandpaddlePackage.ROOT__BLOCKS:
        return blocks != null && !blocks.isEmpty();
      case BallandpaddlePackage.ROOT__EFFECTS:
        return effects != null && !effects.isEmpty();
      case BallandpaddlePackage.ROOT__POWERS:
        return powers != null && !powers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RootImpl
