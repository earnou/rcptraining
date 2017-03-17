/**
 */
package com.sii.restaurant.restaurant;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.sii.restaurant.restaurant.MRestaurantPackage
 * @generated
 */
public interface MRestaurantFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MRestaurantFactory eINSTANCE = com.sii.restaurant.restaurant.impl.MRestaurantFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Restaurant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restaurant</em>'.
	 * @generated
	 */
	MRestaurant createRestaurant();

	/**
	 * Returns a new object of class '<em>Menus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menus</em>'.
	 * @generated
	 */
	MMenus createMenus();

	/**
	 * Returns a new object of class '<em>Salariés</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Salariés</em>'.
	 * @generated
	 */
	MSalariés createSalariés();

	/**
	 * Returns a new object of class '<em>Réservations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Réservations</em>'.
	 * @generated
	 */
	MRéservations createRéservations();

	/**
	 * Returns a new object of class '<em>Clients</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clients</em>'.
	 * @generated
	 */
	MClients createClients();

	/**
	 * Returns a new object of class '<em>Plats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plats</em>'.
	 * @generated
	 */
	MPlats createPlats();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MRestaurantPackage getRestaurantPackage();

} //MRestaurantFactory
