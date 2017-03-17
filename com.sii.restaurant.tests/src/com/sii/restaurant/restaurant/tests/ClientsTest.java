/**
 */
package com.sii.restaurant.restaurant.tests;

import com.sii.restaurant.restaurant.Clients;
import com.sii.restaurant.restaurant.RestaurantFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Clients</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClientsTest extends TestCase {

	/**
	 * The fixture for this Clients test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Clients fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClientsTest.class);
	}

	/**
	 * Constructs a new Clients test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Clients test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Clients fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Clients test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Clients getFixture() {
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
		setFixture(RestaurantFactory.eINSTANCE.createClients());
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

} //ClientsTest
