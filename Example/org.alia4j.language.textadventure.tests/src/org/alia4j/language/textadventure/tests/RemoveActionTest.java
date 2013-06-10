/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.alia4j.language.textadventure.tests;

import junit.textui.TestRunner;

import org.alia4j.language.textadventure.RemoveAction;
import org.alia4j.language.textadventure.TextadventureFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Remove Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RemoveActionTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RemoveActionTest.class);
	}

	/**
	 * Constructs a new Remove Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Remove Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RemoveAction getFixture() {
		return (RemoveAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TextadventureFactory.eINSTANCE.createRemoveAction());
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

} //RemoveActionTest
