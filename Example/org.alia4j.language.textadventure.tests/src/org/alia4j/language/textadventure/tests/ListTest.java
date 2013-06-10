/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.alia4j.language.textadventure.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.alia4j.language.textadventure.List;
import org.alia4j.language.textadventure.TextadventureFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ListTest extends TestCase {

	/**
	 * The fixture for this List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected List fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ListTest.class);
	}

	/**
	 * Constructs a new List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(List fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected List getFixture() {
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
		setFixture(TextadventureFactory.eINSTANCE.createList());
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

} //ListTest
