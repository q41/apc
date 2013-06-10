/**
 */
package org.alia4j.language.ballandpaddle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Shape</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getShape()
 * @model
 * @generated
 */
public enum Shape implements Enumerator
{
  /**
   * The '<em><b>Circle</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CIRCLE_VALUE
   * @generated
   * @ordered
   */
  CIRCLE(0, "Circle", "circle"),

  /**
   * The '<em><b>Triangle</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TRIANGLE_VALUE
   * @generated
   * @ordered
   */
  TRIANGLE(1, "Triangle", "triangle"),

  /**
   * The '<em><b>Square</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SQUARE_VALUE
   * @generated
   * @ordered
   */
  SQUARE(2, "Square", "square"),

  /**
   * The '<em><b>Rectangle</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RECTANGLE_VALUE
   * @generated
   * @ordered
   */
  RECTANGLE(3, "Rectangle", "rectangle");

  /**
   * The '<em><b>Circle</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Circle</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CIRCLE
   * @model name="Circle" literal="circle"
   * @generated
   * @ordered
   */
  public static final int CIRCLE_VALUE = 0;

  /**
   * The '<em><b>Triangle</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Triangle</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TRIANGLE
   * @model name="Triangle" literal="triangle"
   * @generated
   * @ordered
   */
  public static final int TRIANGLE_VALUE = 1;

  /**
   * The '<em><b>Square</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Square</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SQUARE
   * @model name="Square" literal="square"
   * @generated
   * @ordered
   */
  public static final int SQUARE_VALUE = 2;

  /**
   * The '<em><b>Rectangle</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Rectangle</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RECTANGLE
   * @model name="Rectangle" literal="rectangle"
   * @generated
   * @ordered
   */
  public static final int RECTANGLE_VALUE = 3;

  /**
   * An array of all the '<em><b>Shape</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Shape[] VALUES_ARRAY =
    new Shape[]
    {
      CIRCLE,
      TRIANGLE,
      SQUARE,
      RECTANGLE,
    };

  /**
   * A public read-only list of all the '<em><b>Shape</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Shape> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Shape</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Shape get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Shape result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Shape</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Shape getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Shape result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Shape</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Shape get(int value)
  {
    switch (value)
    {
      case CIRCLE_VALUE: return CIRCLE;
      case TRIANGLE_VALUE: return TRIANGLE;
      case SQUARE_VALUE: return SQUARE;
      case RECTANGLE_VALUE: return RECTANGLE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Shape(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Shape
