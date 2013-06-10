/**
 */
package org.alia4j.language.ballandpaddle.tests;

import junit.textui.TestRunner;

import org.alia4j.language.ballandpaddle.BallandpaddleFactory;
import org.alia4j.language.ballandpaddle.NonDamageEffect;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Non Damage Effect</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NonDamageEffectTest extends EffectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NonDamageEffectTest.class);
	}

	/**
	 * Constructs a new Non Damage Effect test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonDamageEffectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Non Damage Effect test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NonDamageEffect getFixture() {
		return (NonDamageEffect)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BallandpaddleFactory.eINSTANCE.createNonDamageEffect());
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

} //NonDamageEffectTest
