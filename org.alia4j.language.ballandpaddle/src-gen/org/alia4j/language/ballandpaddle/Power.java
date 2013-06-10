/**
 */
package org.alia4j.language.ballandpaddle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.ballandpaddle.Power#getId <em>Id</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.Power#getEffects <em>Effects</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.Power#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.Power#getPowerSpawnChance <em>Power Spawn Chance</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.Power#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getPower()
 * @model
 * @generated
 */
public interface Power extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getPower_Id()
   * @model required="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.alia4j.language.ballandpaddle.Power#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Effects</b></em>' reference list.
   * The list contents are of type {@link org.alia4j.language.ballandpaddle.Effect}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Effects</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Effects</em>' reference list.
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getPower_Effects()
   * @model required="true"
   * @generated
   */
  EList<Effect> getEffects();

  /**
   * Returns the value of the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' attribute.
   * @see #setDuration(int)
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getPower_Duration()
   * @model required="true"
   * @generated
   */
  int getDuration();

  /**
   * Sets the value of the '{@link org.alia4j.language.ballandpaddle.Power#getDuration <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' attribute.
   * @see #getDuration()
   * @generated
   */
  void setDuration(int value);

  /**
   * Returns the value of the '<em><b>Power Spawn Chance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Power Spawn Chance</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Power Spawn Chance</em>' attribute.
   * @see #setPowerSpawnChance(float)
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getPower_PowerSpawnChance()
   * @model
   * @generated
   */
  float getPowerSpawnChance();

  /**
   * Sets the value of the '{@link org.alia4j.language.ballandpaddle.Power#getPowerSpawnChance <em>Power Spawn Chance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Power Spawn Chance</em>' attribute.
   * @see #getPowerSpawnChance()
   * @generated
   */
  void setPowerSpawnChance(float value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(Target)
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getPower_Target()
   * @model containment="true" required="true"
   * @generated
   */
  Target getTarget();

  /**
   * Sets the value of the '{@link org.alia4j.language.ballandpaddle.Power#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Target value);

} // Power
