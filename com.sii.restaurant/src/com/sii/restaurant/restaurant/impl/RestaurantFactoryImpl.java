/**
 */
package com.sii.restaurant.restaurant.impl;

import com.sii.restaurant.restaurant.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestaurantFactoryImpl extends EFactoryImpl implements RestaurantFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RestaurantFactory init() {
		try {
			RestaurantFactory theRestaurantFactory = (RestaurantFactory)EPackage.Registry.INSTANCE.getEFactory(RestaurantPackage.eNS_URI);
			if (theRestaurantFactory != null) {
				return theRestaurantFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RestaurantFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestaurantFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RestaurantPackage.RESTAURANT: return createRestaurant();
			case RestaurantPackage.MENUS: return createMenus();
			case RestaurantPackage.SALARIÉS: return createSalariés();
			case RestaurantPackage.RÉSERVATIONS: return createRéservations();
			case RestaurantPackage.CLIENTS: return createClients();
			case RestaurantPackage.PLATS: return createPlats();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Restaurant createRestaurant() {
		RestaurantImpl restaurant = new RestaurantImpl();
		return restaurant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menus createMenus() {
		MenusImpl menus = new MenusImpl();
		return menus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Salariés createSalariés() {
		SalariésImpl salariés = new SalariésImpl();
		return salariés;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Réservations createRéservations() {
		RéservationsImpl réservations = new RéservationsImpl();
		return réservations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clients createClients() {
		ClientsImpl clients = new ClientsImpl();
		return clients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plats createPlats() {
		PlatsImpl plats = new PlatsImpl();
		return plats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestaurantPackage getRestaurantPackage() {
		return (RestaurantPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RestaurantPackage getPackage() {
		return RestaurantPackage.eINSTANCE;
	}

} //RestaurantFactoryImpl
