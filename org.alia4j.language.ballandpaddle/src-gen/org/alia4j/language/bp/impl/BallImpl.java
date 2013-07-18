/**
 */
package org.alia4j.language.bp.impl;

import org.alia4j.language.bp.Ball;
import org.alia4j.language.bp.BpPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ball</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.alia4j.language.bp.impl.BallImpl#getX <em>X</em>}</li>
 *   <li>{@link org.alia4j.language.bp.impl.BallImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.alia4j.language.bp.impl.BallImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.alia4j.language.bp.impl.BallImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.alia4j.language.bp.impl.BallImpl#getDamage <em>Damage</em>}</li>
 *   <li>{@link org.alia4j.language.bp.impl.BallImpl#getSpeed <em>Speed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BallImpl extends BPObjectImpl implements Ball
{
  /**
   * The default value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected static final double X_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected double x = X_EDEFAULT;

  /**
   * The default value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected static final double Y_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected double y = Y_EDEFAULT;

  /**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected static final int SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected int size = SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrientation()
   * @generated
   * @ordered
   */
  protected static final int ORIENTATION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrientation()
   * @generated
   * @ordered
   */
  protected int orientation = ORIENTATION_EDEFAULT;

  /**
   * The default value of the '{@link #getDamage() <em>Damage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDamage()
   * @generated
   * @ordered
   */
  protected static final int DAMAGE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDamage() <em>Damage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDamage()
   * @generated
   * @ordered
   */
  protected int damage = DAMAGE_EDEFAULT;

  /**
   * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpeed()
   * @generated
   * @ordered
   */
  protected static final int SPEED_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpeed()
   * @generated
   * @ordered
   */
  protected int speed = SPEED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BallImpl()
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
    return BpPackage.Literals.BALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getX()
  {
    return x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setX(double newX)
  {
    double oldX = x;
    x = newX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BpPackage.BALL__X, oldX, x));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getY()
  {
    return y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setY(double newY)
  {
    double oldY = y;
    y = newY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BpPackage.BALL__Y, oldY, y));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(int newSize)
  {
    int oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BpPackage.BALL__SIZE, oldSize, size));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getOrientation()
  {
    return orientation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrientation(int newOrientation)
  {
    int oldOrientation = orientation;
    orientation = newOrientation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BpPackage.BALL__ORIENTATION, oldOrientation, orientation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDamage()
  {
    return damage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDamage(int newDamage)
  {
    int oldDamage = damage;
    damage = newDamage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BpPackage.BALL__DAMAGE, oldDamage, damage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSpeed()
  {
    return speed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpeed(int newSpeed)
  {
    int oldSpeed = speed;
    speed = newSpeed;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BpPackage.BALL__SPEED, oldSpeed, speed));
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
      case BpPackage.BALL__X:
        return getX();
      case BpPackage.BALL__Y:
        return getY();
      case BpPackage.BALL__SIZE:
        return getSize();
      case BpPackage.BALL__ORIENTATION:
        return getOrientation();
      case BpPackage.BALL__DAMAGE:
        return getDamage();
      case BpPackage.BALL__SPEED:
        return getSpeed();
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
      case BpPackage.BALL__X:
        setX((Double)newValue);
        return;
      case BpPackage.BALL__Y:
        setY((Double)newValue);
        return;
      case BpPackage.BALL__SIZE:
        setSize((Integer)newValue);
        return;
      case BpPackage.BALL__ORIENTATION:
        setOrientation((Integer)newValue);
        return;
      case BpPackage.BALL__DAMAGE:
        setDamage((Integer)newValue);
        return;
      case BpPackage.BALL__SPEED:
        setSpeed((Integer)newValue);
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
      case BpPackage.BALL__X:
        setX(X_EDEFAULT);
        return;
      case BpPackage.BALL__Y:
        setY(Y_EDEFAULT);
        return;
      case BpPackage.BALL__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case BpPackage.BALL__ORIENTATION:
        setOrientation(ORIENTATION_EDEFAULT);
        return;
      case BpPackage.BALL__DAMAGE:
        setDamage(DAMAGE_EDEFAULT);
        return;
      case BpPackage.BALL__SPEED:
        setSpeed(SPEED_EDEFAULT);
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
      case BpPackage.BALL__X:
        return x != X_EDEFAULT;
      case BpPackage.BALL__Y:
        return y != Y_EDEFAULT;
      case BpPackage.BALL__SIZE:
        return size != SIZE_EDEFAULT;
      case BpPackage.BALL__ORIENTATION:
        return orientation != ORIENTATION_EDEFAULT;
      case BpPackage.BALL__DAMAGE:
        return damage != DAMAGE_EDEFAULT;
      case BpPackage.BALL__SPEED:
        return speed != SPEED_EDEFAULT;
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
    result.append(" (x: ");
    result.append(x);
    result.append(", y: ");
    result.append(y);
    result.append(", size: ");
    result.append(size);
    result.append(", orientation: ");
    result.append(orientation);
    result.append(", damage: ");
    result.append(damage);
    result.append(", speed: ");
    result.append(speed);
    result.append(')');
    return result.toString();
  }

} //BallImpl
