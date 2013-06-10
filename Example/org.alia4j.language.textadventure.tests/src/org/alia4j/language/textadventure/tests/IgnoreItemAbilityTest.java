/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.alia4j.language.textadventure.tests;

import junit.textui.TestRunner;

import org.alia4j.language.textadventure.IgnoreItemAbility;
import org.alia4j.language.textadventure.TextadventureFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ignore Item Ability</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IgnoreItemAbilityTest extends AbilityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IgnoreItemAbilityTest.class);
	}

	/**
	 * Constructs a new Ignore Item Ability test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IgnoreItemAbilityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ignore Item Ability test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IgnoreItemAbility getFixture() {
		return (IgnoreItemAbility)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TextadventureFactory.eINSTANCE.createIgnoreItemAbility());
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

} //IgnoreItemAbilityTest
