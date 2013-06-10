/**
 */
package org.alia4j.language.ballandpaddle.tests;

import junit.textui.TestRunner;

import org.alia4j.language.ballandpaddle.BallandpaddleFactory;
import org.alia4j.language.ballandpaddle.Paddle;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Paddle</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PaddleTest extends BAPObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PaddleTest.class);
	}

	/**
	 * Constructs a new Paddle test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaddleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Paddle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Paddle getFixture() {
		return (Paddle)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BallandpaddleFactory.eINSTANCE.createPaddle());
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

} //PaddleTest
