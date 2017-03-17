/**
 */
package com.sii.restaurant.restaurant.util;

import com.sii.restaurant.restaurant.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.sii.restaurant.restaurant.MRestaurantPackage
 * @generated
 */
public class RestaurantAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MRestaurantPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestaurantAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MRestaurantPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestaurantSwitch<Adapter> modelSwitch =
		new RestaurantSwitch<Adapter>() {
			@Override
			public Adapter caseRestaurant(MRestaurant object) {
				return createRestaurantAdapter();
			}
			@Override
			public Adapter caseMenus(MMenus object) {
				return createMenusAdapter();
			}
			@Override
			public Adapter caseSalariés(MSalariés object) {
				return createSalariésAdapter();
			}
			@Override
			public Adapter caseRéservations(MRéservations object) {
				return createRéservationsAdapter();
			}
			@Override
			public Adapter caseClients(MClients object) {
				return createClientsAdapter();
			}
			@Override
			public Adapter casePlats(MPlats object) {
				return createPlatsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.sii.restaurant.restaurant.MRestaurant <em>Restaurant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sii.restaurant.restaurant.MRestaurant
	 * @generated
	 */
	public Adapter createRestaurantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sii.restaurant.restaurant.MMenus <em>Menus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sii.restaurant.restaurant.MMenus
	 * @generated
	 */
	public Adapter createMenusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sii.restaurant.restaurant.MSalariés <em>Salariés</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sii.restaurant.restaurant.MSalariés
	 * @generated
	 */
	public Adapter createSalariésAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sii.restaurant.restaurant.MRéservations <em>Réservations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sii.restaurant.restaurant.MRéservations
	 * @generated
	 */
	public Adapter createRéservationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sii.restaurant.restaurant.MClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sii.restaurant.restaurant.MClients
	 * @generated
	 */
	public Adapter createClientsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sii.restaurant.restaurant.MPlats <em>Plats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sii.restaurant.restaurant.MPlats
	 * @generated
	 */
	public Adapter createPlatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RestaurantAdapterFactory
