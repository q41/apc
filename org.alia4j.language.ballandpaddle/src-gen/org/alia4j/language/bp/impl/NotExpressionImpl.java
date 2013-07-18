/**
 */
package org.alia4j.language.bp.impl;

import org.alia4j.language.bp.BpPackage;
import org.alia4j.language.bp.NotExpression;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NotExpressionImpl extends UnaryExpressionImpl implements NotExpression
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NotExpressionImpl()
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
    return BpPackage.Literals.NOT_EXPRESSION;
  }

} //NotExpressionImpl
