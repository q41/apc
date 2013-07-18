/**
 */
package org.alia4j.language.bp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>BP Class Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.alia4j.language.bp.BpPackage#getBPClassType()
 * @model
 * @generated
 */
public enum BPClassType implements Enumerator
{
  /**
   * The '<em><b>Block</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BLOCK_VALUE
   * @generated
   * @ordered
   */
  BLOCK(0, "Block", "block"),

  /**
   * The '<em><b>Paddle</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PADDLE_VALUE
   * @generated
   * @ordered
   */
  PADDLE(1, "Paddle", "paddle"),

  /**
   * The '<em><b>Ball</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BALL_VALUE
   * @generated
   * @ordered
   */
  BALL(2, "Ball", "ball");

  /**
   * The '<em><b>Block</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Block</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BLOCK
   * @model name="Block" literal="block"
   * @generated
   * @ordered
   */
  public static final int BLOCK_VALUE = 0;

  /**
   * The '<em><b>Paddle</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Paddle</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PADDLE
   * @model name="Paddle" literal="paddle"
   * @generated
   * @ordered
   */
  public static final int PADDLE_VALUE = 1;

  /**
   * The '<em><b>Ball</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ball</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BALL
   * @model name="Ball" literal="ball"
   * @generated
   * @ordered
   */
  public static final int BALL_VALUE = 2;

  /**
   * An array of all the '<em><b>BP Class Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final BPClassType[] VALUES_ARRAY =
    new BPClassType[]
    {
      BLOCK,
      PADDLE,
      BALL,
    };

  /**
   * A public read-only list of all the '<em><b>BP Class Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<BPClassType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>BP Class Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BPClassType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BPClassType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>BP Class Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BPClassType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BPClassType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>BP Class Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BPClassType get(int value)
  {
    switch (value)
    {
      case BLOCK_VALUE: return BLOCK;
      case PADDLE_VALUE: return PADDLE;
      case BALL_VALUE: return BALL;
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
  private BPClassType(int value, String name, String literal)
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
  
} //BPClassType
