/**
 */
package org.alia4j.language.ballandpaddle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.alia4j.language.ballandpaddle.Level#getId <em>Id</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.Level#getPowerSpawnChance <em>Power Spawn Chance</em>}</li>
 *   <li>{@link org.alia4j.language.ballandpaddle.Level#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getLevel()
 * @model
 * @generated
 */
public interface Level extends EObject
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
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getLevel_Id()
   * @model required="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.alia4j.language.ballandpaddle.Level#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

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
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getLevel_PowerSpawnChance()
   * @model
   * @generated
   */
  float getPowerSpawnChance();

  /**
   * Sets the value of the '{@link org.alia4j.language.ballandpaddle.Level#getPowerSpawnChance <em>Power Spawn Chance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Power Spawn Chance</em>' attribute.
   * @see #getPowerSpawnChance()
   * @generated
   */
  void setPowerSpawnChance(float value);

  /**
   * Returns the value of the '<em><b>Blocks</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Blocks</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blocks</em>' attribute list.
   * @see org.alia4j.language.ballandpaddle.BallandpaddlePackage#getLevel_Blocks()
   * @model
   * @generated
   */
  EList<String> getBlocks();

} // Level
