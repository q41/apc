/**
 */
package org.alia4j.language.ballandpaddle.tests;

import junit.textui.TestRunner;

import org.alia4j.language.ballandpaddle.Ball;
import org.alia4j.language.ballandpaddle.BallandpaddleFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ball</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BallTest extends BAPObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BallTest.class);
	}

	/**
	 * Constructs a new Ball test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BallTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ball test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Ball getFixture() {
		return (Ball)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BallandpaddleFactory.eINSTANCE.createBall());
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

} //BallTest
