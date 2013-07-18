/**
 */
package org.alia4j.language.bp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.bp.Root#getLevel <em>Level</em>}</li>
 *   <li>{@link org.alia4j.language.bp.Root#getPaddles <em>Paddles</em>}</li>
 *   <li>{@link org.alia4j.language.bp.Root#getBalls <em>Balls</em>}</li>
 *   <li>{@link org.alia4j.language.bp.Root#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link org.alia4j.language.bp.Root#getEffects <em>Effects</em>}</li>
 *   <li>{@link org.alia4j.language.bp.Root#getPowers <em>Powers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.bp.BpPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject
{
  /**
   * Returns the value of the '<em><b>Level</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' containment reference.
   * @see #setLevel(Level)
   * @see org.alia4j.language.bp.BpPackage#getRoot_Level()
   * @model containment="true" required="true"
   * @generated
   */
  Level getLevel();

  /**
   * Sets the value of the '{@link org.alia4j.language.bp.Root#getLevel <em>Level</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' containment reference.
   * @see #getLevel()
   * @generated
   */
  void setLevel(Level value);

  /**
   * Returns the value of the '<em><b>Paddles</b></em>' containment reference list.
   * The list contents are of type {@link org.alia4j.language.bp.Paddle}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Paddles</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paddles</em>' containment reference list.
   * @see org.alia4j.language.bp.BpPackage#getRoot_Paddles()
   * @model containment="true" required="true"
   * @generated
   */
  EList<Paddle> getPaddles();

  /**
   * Returns the value of the '<em><b>Balls</b></em>' containment reference list.
   * The list contents are of type {@link org.alia4j.language.bp.Ball}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Balls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Balls</em>' containment reference list.
   * @see org.alia4j.language.bp.BpPackage#getRoot_Balls()
   * @model containment="true" required="true"
   * @generated
   */
  EList<Ball> getBalls();

  /**
   * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
   * The list contents are of type {@link org.alia4j.language.bp.Block}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blocks</em>' containment reference list.
   * @see org.alia4j.language.bp.BpPackage#getRoot_Blocks()
   * @model containment="true"
   * @generated
   */
  EList<Block> getBlocks();

  /**
   * Returns the value of the '<em><b>Effects</b></em>' containment reference list.
   * The list contents are of type {@link org.alia4j.language.bp.Effect}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Effects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Effects</em>' containment reference list.
   * @see org.alia4j.language.bp.BpPackage#getRoot_Effects()
   * @model containment="true"
   * @generated
   */
  EList<Effect> getEffects();

  /**
   * Returns the value of the '<em><b>Powers</b></em>' containment reference list.
   * The list contents are of type {@link org.alia4j.language.bp.Power}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Powers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Powers</em>' containment reference list.
   * @see org.alia4j.language.bp.BpPackage#getRoot_Powers()
   * @model containment="true"
   * @generated
   */
  EList<Power> getPowers();

} // Root
