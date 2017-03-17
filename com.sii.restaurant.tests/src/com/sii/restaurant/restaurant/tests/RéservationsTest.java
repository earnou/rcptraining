/**
 */
package com.sii.restaurant.restaurant.tests;

import com.sii.restaurant.restaurant.RestaurantFactory;
import com.sii.restaurant.restaurant.Réservations;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Réservations</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RéservationsTest extends TestCase {

	/**
	 * The fixture for this Réservations test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Réservations fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RéservationsTest.class);
	}

	/**
	 * Constructs a new Réservations test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RéservationsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Réservations test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Réservations fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Réservations test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Réservations getFixture() {
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
		setFixture(RestaurantFactory.eINSTANCE.createRéservations());
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

} //RéservationsTest
