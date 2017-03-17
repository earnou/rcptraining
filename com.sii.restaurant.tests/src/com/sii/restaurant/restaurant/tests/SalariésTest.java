/**
 */
package com.sii.restaurant.restaurant.tests;

import com.sii.restaurant.restaurant.RestaurantFactory;
import com.sii.restaurant.restaurant.Salariés;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Salariés</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SalariésTest extends TestCase {

	/**
	 * The fixture for this Salariés test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Salariés fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SalariésTest.class);
	}

	/**
	 * Constructs a new Salariés test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalariésTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Salariés test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Salariés fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Salariés test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Salariés getFixture() {
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
		setFixture(RestaurantFactory.eINSTANCE.createSalariés());
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

} //SalariésTest
