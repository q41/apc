/**
 */
package org.alia4j.language.ballandpaddle.impl;

import org.alia4j.language.ballandpaddle.BallandpaddlePackage;
import org.alia4j.language.ballandpaddle.Paddle;
import org.alia4j.language.ballandpaddle.Shape;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paddle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.PaddleImpl#getX <em>X</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.PaddleImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.PaddleImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.PaddleImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.impl.PaddleImpl#getOrientation <em>Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PaddleImpl extends BAPObjectImpl implements Paddle
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
   * The default value of the '{@link #getShape() <em>Shape</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShape()
   * @generated
   * @ordered
   */
  protected static final Shape SHAPE_EDEFAULT = Shape.CIRCLE;

  /**
   * The cached value of the '{@link #getShape() <em>Shape</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShape()
   * @generated
   * @ordered
   */
  protected Shape shape = SHAPE_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PaddleImpl()
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
    return BallandpaddlePackage.Literals.PADDLE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.PADDLE__X, oldX, x));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.PADDLE__Y, oldY, y));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Shape getShape()
  {
    return shape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShape(Shape newShape)
  {
    Shape oldShape = shape;
    shape = newShape == null ? SHAPE_EDEFAULT : newShape;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.PADDLE__SHAPE, oldShape, shape));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.PADDLE__SIZE, oldSize, size));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BallandpaddlePackage.PADDLE__ORIENTATION, oldOrientation, orientation));
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
      case BallandpaddlePackage.PADDLE__X:
        return getX();
      case BallandpaddlePackage.PADDLE__Y:
        return getY();
      case BallandpaddlePackage.PADDLE__SHAPE:
        return getShape();
      case BallandpaddlePackage.PADDLE__SIZE:
        return getSize();
      case BallandpaddlePackage.PADDLE__ORIENTATION:
        return getOrientation();
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
      case BallandpaddlePackage.PADDLE__X:
        setX((Integer)newValue);
        return;
      case BallandpaddlePackage.PADDLE__Y:
        setY((Integer)newValue);
        return;
      case BallandpaddlePackage.PADDLE__SHAPE:
        setShape((Shape)newValue);
        return;
      case BallandpaddlePackage.PADDLE__SIZE:
        setSize((Integer)newValue);
        return;
      case BallandpaddlePackage.PADDLE__ORIENTATION:
        setOrientation((Integer)newValue);
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
      case BallandpaddlePackage.PADDLE__X:
        setX(X_EDEFAULT);
        return;
      case BallandpaddlePackage.PADDLE__Y:
        setY(Y_EDEFAULT);
        return;
      case BallandpaddlePackage.PADDLE__SHAPE:
        setShape(SHAPE_EDEFAULT);
        return;
      case BallandpaddlePackage.PADDLE__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case BallandpaddlePackage.PADDLE__ORIENTATION:
        setOrientation(ORIENTATION_EDEFAULT);
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
      case BallandpaddlePackage.PADDLE__X:
        return x != X_EDEFAULT;
      case BallandpaddlePackage.PADDLE__Y:
        return y != Y_EDEFAULT;
      case BallandpaddlePackage.PADDLE__SHAPE:
        return shape != SHAPE_EDEFAULT;
      case BallandpaddlePackage.PADDLE__SIZE:
        return size != SIZE_EDEFAULT;
      case BallandpaddlePackage.PADDLE__ORIENTATION:
        return orientation != ORIENTATION_EDEFAULT;
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
    result.append(", shape: ");
    result.append(shape);
    result.append(", size: ");
    result.append(size);
    result.append(", orientation: ");
    result.append(orientation);
    result.append(')');
    return result.toString();
  }

} //PaddleImpl
