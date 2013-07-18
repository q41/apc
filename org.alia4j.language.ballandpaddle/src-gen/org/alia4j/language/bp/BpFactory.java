/**
 */
package org.alia4j.language.bp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.alia4j.language.bp.BpPackage
 * @generated
 */
public interface BpFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BpFactory eINSTANCE = org.alia4j.language.bp.impl.BpFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Root</em>'.
   * @generated
   */
  Root createRoot();

  /**
   * Returns a new object of class '<em>Level</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Level</em>'.
   * @generated
   */
  Level createLevel();

  /**
   * Returns a new object of class '<em>Paddle</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Paddle</em>'.
   * @generated
   */
  Paddle createPaddle();

  /**
   * Returns a new object of class '<em>Ball</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ball</em>'.
   * @generated
   */
  Ball createBall();

  /**
   * Returns a new object of class '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block</em>'.
   * @generated
   */
  Block createBlock();

  /**
   * Returns a new object of class '<em>Power</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Power</em>'.
   * @generated
   */
  Power createPower();

  /**
   * Returns a new object of class '<em>Object Target</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Target</em>'.
   * @generated
   */
  ObjectTarget createObjectTarget();

  /**
   * Returns a new object of class '<em>Class Target</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Target</em>'.
   * @generated
   */
  ClassTarget createClassTarget();

  /**
   * Returns a new object of class '<em>General Effect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>General Effect</em>'.
   * @generated
   */
  GeneralEffect createGeneralEffect();

  /**
   * Returns a new object of class '<em>Collision Effect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collision Effect</em>'.
   * @generated
   */
  CollisionEffect createCollisionEffect();

  /**
   * Returns a new object of class '<em>General Effect Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>General Effect Body</em>'.
   * @generated
   */
  GeneralEffectBody createGeneralEffectBody();

  /**
   * Returns a new object of class '<em>Collision Effect Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collision Effect Body</em>'.
   * @generated
   */
  CollisionEffectBody createCollisionEffectBody();

  /**
   * Returns a new object of class '<em>Eq Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Eq Collision Expression</em>'.
   * @generated
   */
  EqCollisionExpression createEqCollisionExpression();

  /**
   * Returns a new object of class '<em>Smth Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Smth Collision Expression</em>'.
   * @generated
   */
  SmthCollisionExpression createSmthCollisionExpression();

  /**
   * Returns a new object of class '<em>Seq Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Seq Collision Expression</em>'.
   * @generated
   */
  SeqCollisionExpression createSeqCollisionExpression();

  /**
   * Returns a new object of class '<em>Lth Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lth Collision Expression</em>'.
   * @generated
   */
  LthCollisionExpression createLthCollisionExpression();

  /**
   * Returns a new object of class '<em>Leq Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Leq Collision Expression</em>'.
   * @generated
   */
  LeqCollisionExpression createLeqCollisionExpression();

  /**
   * Returns a new object of class '<em>Neq Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Neq Collision Expression</em>'.
   * @generated
   */
  NeqCollisionExpression createNeqCollisionExpression();

  /**
   * Returns a new object of class '<em>Or Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Collision Expression</em>'.
   * @generated
   */
  OrCollisionExpression createOrCollisionExpression();

  /**
   * Returns a new object of class '<em>And Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Collision Expression</em>'.
   * @generated
   */
  AndCollisionExpression createAndCollisionExpression();

  /**
   * Returns a new object of class '<em>Mult Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mult Collision Expression</em>'.
   * @generated
   */
  MultCollisionExpression createMultCollisionExpression();

  /**
   * Returns a new object of class '<em>Div Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Div Collision Expression</em>'.
   * @generated
   */
  DivCollisionExpression createDivCollisionExpression();

  /**
   * Returns a new object of class '<em>Plus Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus Collision Expression</em>'.
   * @generated
   */
  PlusCollisionExpression createPlusCollisionExpression();

  /**
   * Returns a new object of class '<em>Minus Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Minus Collision Expression</em>'.
   * @generated
   */
  MinusCollisionExpression createMinusCollisionExpression();

  /**
   * Returns a new object of class '<em>Bracket Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bracket Collision Expression</em>'.
   * @generated
   */
  BracketCollisionExpression createBracketCollisionExpression();

  /**
   * Returns a new object of class '<em>Neg Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Neg Collision Expression</em>'.
   * @generated
   */
  NegCollisionExpression createNegCollisionExpression();

  /**
   * Returns a new object of class '<em>Not Collision Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Collision Expression</em>'.
   * @generated
   */
  NotCollisionExpression createNotCollisionExpression();

  /**
   * Returns a new object of class '<em>Int Collision Operand</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Collision Operand</em>'.
   * @generated
   */
  IntCollisionOperand createIntCollisionOperand();

  /**
   * Returns a new object of class '<em>Double Collision Operand</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Double Collision Operand</em>'.
   * @generated
   */
  DoubleCollisionOperand createDoubleCollisionOperand();

  /**
   * Returns a new object of class '<em>Bool Collision Operand</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Collision Operand</em>'.
   * @generated
   */
  BoolCollisionOperand createBoolCollisionOperand();

  /**
   * Returns a new object of class '<em>Att Collision Operand</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Att Collision Operand</em>'.
   * @generated
   */
  AttCollisionOperand createAttCollisionOperand();

  /**
   * Returns a new object of class '<em>Eq Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Eq Expression</em>'.
   * @generated
   */
  EqExpression createEqExpression();

  /**
   * Returns a new object of class '<em>Smth Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Smth Expression</em>'.
   * @generated
   */
  SmthExpression createSmthExpression();

  /**
   * Returns a new object of class '<em>Seq Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Seq Expression</em>'.
   * @generated
   */
  SeqExpression createSeqExpression();

  /**
   * Returns a new object of class '<em>Lth Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lth Expression</em>'.
   * @generated
   */
  LthExpression createLthExpression();

  /**
   * Returns a new object of class '<em>Leq Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Leq Expression</em>'.
   * @generated
   */
  LeqExpression createLeqExpression();

  /**
   * Returns a new object of class '<em>Neq Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Neq Expression</em>'.
   * @generated
   */
  NeqExpression createNeqExpression();

  /**
   * Returns a new object of class '<em>Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Expression</em>'.
   * @generated
   */
  OrExpression createOrExpression();

  /**
   * Returns a new object of class '<em>And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Expression</em>'.
   * @generated
   */
  AndExpression createAndExpression();

  /**
   * Returns a new object of class '<em>Mult Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mult Expression</em>'.
   * @generated
   */
  MultExpression createMultExpression();

  /**
   * Returns a new object of class '<em>Div Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Div Expression</em>'.
   * @generated
   */
  DivExpression createDivExpression();

  /**
   * Returns a new object of class '<em>Plus Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus Expression</em>'.
   * @generated
   */
  PlusExpression createPlusExpression();

  /**
   * Returns a new object of class '<em>Minus Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Minus Expression</em>'.
   * @generated
   */
  MinusExpression createMinusExpression();

  /**
   * Returns a new object of class '<em>Bracket Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bracket Expression</em>'.
   * @generated
   */
  BracketExpression createBracketExpression();

  /**
   * Returns a new object of class '<em>Neg Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Neg Expression</em>'.
   * @generated
   */
  NegExpression createNegExpression();

  /**
   * Returns a new object of class '<em>Not Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Expression</em>'.
   * @generated
   */
  NotExpression createNotExpression();

  /**
   * Returns a new object of class '<em>Att Operand</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Att Operand</em>'.
   * @generated
   */
  AttOperand createAttOperand();

  /**
   * Returns a new object of class '<em>Int Operand</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Operand</em>'.
   * @generated
   */
  IntOperand createIntOperand();

  /**
   * Returns a new object of class '<em>Double Operand</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Double Operand</em>'.
   * @generated
   */
  DoubleOperand createDoubleOperand();

  /**
   * Returns a new object of class '<em>Boolean Operand</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Operand</em>'.
   * @generated
   */
  BooleanOperand createBooleanOperand();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  BpPackage getBpPackage();

} //BpFactory
