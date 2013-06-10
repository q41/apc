/**
 */
package org.alia4j.language.ballandpaddle.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.alia4j.language.ballandpaddle.BallandpaddleFactory;
import org.alia4j.language.ballandpaddle.Power;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Power</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PowerTest extends TestCase {

	/**
	 * The fixture for this Power test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Power fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PowerTest.class);
	}

	/**
	 * Constructs a new Power test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Power test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Power fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Power test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Power getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BallandpaddleFactory.eINSTANCE.createPower());
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

} //PowerTest
