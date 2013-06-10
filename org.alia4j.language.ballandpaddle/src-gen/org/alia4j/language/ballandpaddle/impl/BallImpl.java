/**
 */
package org.alia4j.language.ballandpaddle.impl;

import org.alia4j.language.ballandpaddle.Ball;
import org.alia4j.language.ballandpaddle.BallandpaddlePackage;

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
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.BallImpl#getX <em>X</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.BallImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.BallImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.BallImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.BallImpl#getSpeed <em>Speed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BallImpl extends BAPObjectImpl implements Ball
{
  /**
   * The default value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected static final int X_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected int x = X_EDEFAULT;

  /**
   * The default value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected static final int Y_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected int y = Y_EDEFAULT;

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
   * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected static final int DIRECTION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected int direction = DIRECTION_EDEFAULT;

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
    return BallandpaddlePackage.Literals.BALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getX()
  {
    return x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setX(int newX)
  {
    int oldX = x;
    x = newX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.BALL__X, oldX, x));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getY()
  {
    return y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setY(int newY)
  {
    int oldY = y;
    y = newY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.BALL__Y, oldY, y));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.BALL__SIZE, oldSize, size));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDirection()
  {
    return direction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirection(int newDirection)
  {
    int oldDirection = direction;
    direction = newDirection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.BALL__DIRECTION, oldDirection, direction));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.BALL__SPEED, oldSpeed, speed));
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
      case BallandpaddlePackage.BALL__X:
        return getX();
      case BallandpaddlePackage.BALL__Y:
        return getY();
      case BallandpaddlePackage.BALL__SIZE:
        return getSize();
      case BallandpaddlePackage.BALL__DIRECTION:
        return getDirection();
      case BallandpaddlePackage.BALL__SPEED:
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
      case BallandpaddlePackage.BALL__X:
        setX((Integer)newValue);
        return;
      case BallandpaddlePackage.BALL__Y:
        setY((Integer)newValue);
        return;
      case BallandpaddlePackage.BALL__SIZE:
        setSize((Integer)newValue);
        return;
      case BallandpaddlePackage.BALL__DIRECTION:
        setDirection((Integer)newValue);
        return;
      case BallandpaddlePackage.BALL__SPEED:
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
      case BallandpaddlePackage.BALL__X:
        setX(X_EDEFAULT);
        return;
      case BallandpaddlePackage.BALL__Y:
        setY(Y_EDEFAULT);
        return;
      case BallandpaddlePackage.BALL__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case BallandpaddlePackage.BALL__DIRECTION:
        setDirection(DIRECTION_EDEFAULT);
        return;
      case BallandpaddlePackage.BALL__SPEED:
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
      case BallandpaddlePackage.BALL__X:
        return x != X_EDEFAULT;
      case BallandpaddlePackage.BALL__Y:
        return y != Y_EDEFAULT;
      case BallandpaddlePackage.BALL__SIZE:
        return size != SIZE_EDEFAULT;
      case BallandpaddlePackage.BALL__DIRECTION:
        return direction != DIRECTION_EDEFAULT;
      case BallandpaddlePackage.BALL__SPEED:
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
    result.append(", direction: ");
    result.append(direction);
    result.append(", speed: ");
    result.append(speed);
    result.append(')');
    return result.toString();
  }

} //BallImpl
