/**
 */
package org.alia4j.language.ballandpaddle.tests;

import junit.textui.TestRunner;

import org.alia4j.language.ballandpaddle.BallandpaddleFactory;
import org.alia4j.language.ballandpaddle.DamageEffect;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Damage Effect</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DamageEffectTest extends EffectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DamageEffectTest.class);
	}

	/**
	 * Constructs a new Damage Effect test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DamageEffectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Damage Effect test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DamageEffect getFixture() {
		return (DamageEffect)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BallandpaddleFactory.eINSTANCE.createDamageEffect());
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

} //DamageEffectTest
