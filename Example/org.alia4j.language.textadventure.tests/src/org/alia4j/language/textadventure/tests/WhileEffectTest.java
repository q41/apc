/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.alia4j.language.textadventure.tests;

import junit.textui.TestRunner;

import org.alia4j.language.textadventure.TextadventureFactory;
import org.alia4j.language.textadventure.WhileEffect;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>While Effect</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WhileEffectTest extends EffectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WhileEffectTest.class);
	}

	/**
	 * Constructs a new While Effect test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileEffectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this While Effect test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WhileEffect getFixture() {
		return (WhileEffect)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TextadventureFactory.eINSTANCE.createWhileEffect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //WhileEffectTest
