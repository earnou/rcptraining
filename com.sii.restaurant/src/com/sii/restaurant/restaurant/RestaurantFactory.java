/**
 */
package com.sii.restaurant.restaurant;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.sii.restaurant.restaurant.RestaurantPackage
 * @generated
 */
public interface RestaurantFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RestaurantFactory eINSTANCE = com.sii.restaurant.restaurant.impl.RestaurantFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Restaurant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restaurant</em>'.
	 * @generated
	 */
	Restaurant createRestaurant();

	/**
	 * Returns a new object of class '<em>Menus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menus</em>'.
	 * @generated
	 */
	Menus createMenus();

	/**
	 * Returns a new object of class '<em>Salariés</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Salariés</em>'.
	 * @generated
	 */
	Salariés createSalariés();

	/**
	 * Returns a new object of class '<em>Réservations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Réservations</em>'.
	 * @generated
	 */
	Réservations createRéservations();

	/**
	 * Returns a new object of class '<em>Clients</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clients</em>'.
	 * @generated
	 */
	Clients createClients();

	/**
	 * Returns a new object of class '<em>Plats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plats</em>'.
	 * @generated
	 */
	Plats createPlats();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RestaurantPackage getRestaurantPackage();

} //RestaurantFactory
