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
public class MRestaurantFactoryImpl extends EFactoryImpl implements MRestaurantFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MRestaurantFactory init() {
		try {
			MRestaurantFactory theRestaurantFactory = (MRestaurantFactory)EPackage.Registry.INSTANCE.getEFactory(MRestaurantPackage.eNS_URI);
			if (theRestaurantFactory != null) {
				return theRestaurantFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MRestaurantFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRestaurantFactoryImpl() {
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
			case MRestaurantPackage.RESTAURANT: return createRestaurant();
			case MRestaurantPackage.MENUS: return createMenus();
			case MRestaurantPackage.SALARIÉS: return createSalariés();
			case MRestaurantPackage.RÉSERVATIONS: return createRéservations();
			case MRestaurantPackage.CLIENTS: return createClients();
			case MRestaurantPackage.PLATS: return createPlats();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRestaurant createRestaurant() {
		MRestaurantImpl restaurant = new MRestaurantImpl();
		return restaurant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMenus createMenus() {
		MMenusImpl menus = new MMenusImpl();
		return menus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSalariés createSalariés() {
		MSalariésImpl salariés = new MSalariésImpl();
		return salariés;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRéservations createRéservations() {
		MRéservationsImpl réservations = new MRéservationsImpl();
		return réservations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MClients createClients() {
		MClientsImpl clients = new MClientsImpl();
		return clients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPlats createPlats() {
		MPlatsImpl plats = new MPlatsImpl();
		return plats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRestaurantPackage getRestaurantPackage() {
		return (MRestaurantPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MRestaurantPackage getPackage() {
		return MRestaurantPackage.eINSTANCE;
	}

} //MRestaurantFactoryImpl
