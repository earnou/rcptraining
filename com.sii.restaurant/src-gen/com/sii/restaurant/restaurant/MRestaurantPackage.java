/**
 */
package com.sii.restaurant.restaurant;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.sii.restaurant.restaurant.MRestaurantFactory
 * @model kind="package"
 * @generated
 */
public interface MRestaurantPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "restaurant";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.sii/restaurant/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "restaurant";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MRestaurantPackage eINSTANCE = com.sii.restaurant.restaurant.impl.MRestaurantPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.sii.restaurant.restaurant.impl.MRestaurantImpl <em>Restaurant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.restaurant.restaurant.impl.MRestaurantImpl
	 * @see com.sii.restaurant.restaurant.impl.MRestaurantPackageImpl#getRestaurant()
	 * @generated
	 */
	int RESTAURANT = 0;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__MENU = 0;

	/**
	 * The feature id for the '<em><b>R�servations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__R�SERVATIONS = 1;

	/**
	 * The feature id for the '<em><b>Salari�</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__SALARI� = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__NAME = 3;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__ADDRESS = 4;

	/**
	 * The number of structural features of the '<em>Restaurant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Restaurant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.restaurant.restaurant.impl.MMenusImpl <em>Menus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.restaurant.restaurant.impl.MMenusImpl
	 * @see com.sii.restaurant.restaurant.impl.MRestaurantPackageImpl#getMenus()
	 * @generated
	 */
	int MENUS = 1;

	/**
	 * The feature id for the '<em><b>Plat</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENUS__PLAT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENUS__NAME = 1;

	/**
	 * The number of structural features of the '<em>Menus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENUS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Menus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.restaurant.restaurant.impl.MSalari�sImpl <em>Salari�s</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.restaurant.restaurant.impl.MSalari�sImpl
	 * @see com.sii.restaurant.restaurant.impl.MRestaurantPackageImpl#getSalari�s()
	 * @generated
	 */
	int SALARI�S = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARI�S__NAME = 0;

	/**
	 * The number of structural features of the '<em>Salari�s</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARI�S_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Salari�s</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARI�S_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.restaurant.restaurant.impl.MR�servationsImpl <em>R�servations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.restaurant.restaurant.impl.MR�servationsImpl
	 * @see com.sii.restaurant.restaurant.impl.MRestaurantPackageImpl#getR�servations()
	 * @generated
	 */
	int R�SERVATIONS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R�SERVATIONS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R�SERVATIONS__DATE = 1;

	/**
	 * The feature id for the '<em><b>Clients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R�SERVATIONS__CLIENTS = 2;

	/**
	 * The number of structural features of the '<em>R�servations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R�SERVATIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>R�servations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R�SERVATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.restaurant.restaurant.impl.MClientsImpl <em>Clients</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.restaurant.restaurant.impl.MClientsImpl
	 * @see com.sii.restaurant.restaurant.impl.MRestaurantPackageImpl#getClients()
	 * @generated
	 */
	int CLIENTS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Clients</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Clients</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.restaurant.restaurant.impl.MPlatsImpl <em>Plats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.restaurant.restaurant.impl.MPlatsImpl
	 * @see com.sii.restaurant.restaurant.impl.MRestaurantPackageImpl#getPlats()
	 * @generated
	 */
	int PLATS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Plats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Plats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.sii.restaurant.restaurant.MRestaurant <em>Restaurant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restaurant</em>'.
	 * @see com.sii.restaurant.restaurant.MRestaurant
	 * @generated
	 */
	EClass getRestaurant();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.restaurant.restaurant.MRestaurant#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Menu</em>'.
	 * @see com.sii.restaurant.restaurant.MRestaurant#getMenu()
	 * @see #getRestaurant()
	 * @generated
	 */
	EReference getRestaurant_Menu();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.restaurant.restaurant.MRestaurant#getR�servations <em>R�servations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>R�servations</em>'.
	 * @see com.sii.restaurant.restaurant.MRestaurant#getR�servations()
	 * @see #getRestaurant()
	 * @generated
	 */
	EReference getRestaurant_R�servations();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.restaurant.restaurant.MRestaurant#getSalari� <em>Salari�</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Salari�</em>'.
	 * @see com.sii.restaurant.restaurant.MRestaurant#getSalari�()
	 * @see #getRestaurant()
	 * @generated
	 */
	EReference getRestaurant_Salari�();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.restaurant.restaurant.MRestaurant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sii.restaurant.restaurant.MRestaurant#getName()
	 * @see #getRestaurant()
	 * @generated
	 */
	EAttribute getRestaurant_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.restaurant.restaurant.MRestaurant#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see com.sii.restaurant.restaurant.MRestaurant#getAddress()
	 * @see #getRestaurant()
	 * @generated
	 */
	EAttribute getRestaurant_Address();

	/**
	 * Returns the meta object for class '{@link com.sii.restaurant.restaurant.MMenus <em>Menus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menus</em>'.
	 * @see com.sii.restaurant.restaurant.MMenus
	 * @generated
	 */
	EClass getMenus();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.restaurant.restaurant.MMenus#getPlat <em>Plat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plat</em>'.
	 * @see com.sii.restaurant.restaurant.MMenus#getPlat()
	 * @see #getMenus()
	 * @generated
	 */
	EReference getMenus_Plat();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.restaurant.restaurant.MMenus#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sii.restaurant.restaurant.MMenus#getName()
	 * @see #getMenus()
	 * @generated
	 */
	EAttribute getMenus_Name();

	/**
	 * Returns the meta object for class '{@link com.sii.restaurant.restaurant.MSalari�s <em>Salari�s</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salari�s</em>'.
	 * @see com.sii.restaurant.restaurant.MSalari�s
	 * @generated
	 */
	EClass getSalari�s();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.restaurant.restaurant.MSalari�s#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sii.restaurant.restaurant.MSalari�s#getName()
	 * @see #getSalari�s()
	 * @generated
	 */
	EAttribute getSalari�s_Name();

	/**
	 * Returns the meta object for class '{@link com.sii.restaurant.restaurant.MR�servations <em>R�servations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>R�servations</em>'.
	 * @see com.sii.restaurant.restaurant.MR�servations
	 * @generated
	 */
	EClass getR�servations();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.restaurant.restaurant.MR�servations#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sii.restaurant.restaurant.MR�servations#getName()
	 * @see #getR�servations()
	 * @generated
	 */
	EAttribute getR�servations_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.restaurant.restaurant.MR�servations#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see com.sii.restaurant.restaurant.MR�servations#getDate()
	 * @see #getR�servations()
	 * @generated
	 */
	EAttribute getR�servations_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.restaurant.restaurant.MR�servations#getClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clients</em>'.
	 * @see com.sii.restaurant.restaurant.MR�servations#getClients()
	 * @see #getR�servations()
	 * @generated
	 */
	EReference getR�servations_Clients();

	/**
	 * Returns the meta object for class '{@link com.sii.restaurant.restaurant.MClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clients</em>'.
	 * @see com.sii.restaurant.restaurant.MClients
	 * @generated
	 */
	EClass getClients();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.restaurant.restaurant.MClients#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sii.restaurant.restaurant.MClients#getName()
	 * @see #getClients()
	 * @generated
	 */
	EAttribute getClients_Name();

	/**
	 * Returns the meta object for class '{@link com.sii.restaurant.restaurant.MPlats <em>Plats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plats</em>'.
	 * @see com.sii.restaurant.restaurant.MPlats
	 * @generated
	 */
	EClass getPlats();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.restaurant.restaurant.MPlats#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sii.restaurant.restaurant.MPlats#getName()
	 * @see #getPlats()
	 * @generated
	 */
	EAttribute getPlats_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MRestaurantFactory getRestaurantFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.sii.restaurant.restaurant.impl.MRestaurantImpl <em>Restaurant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.restaurant.restaurant.impl.MRestaurantImpl
		 * @see com.sii.restaurant.restaurant.impl.MRestaurantPackageImpl#getRestaurant()
		 * @generated
		 */
		EClass RESTAURANT = eINSTANCE.getRestaurant();

		/**
		 * The meta object literal for the '<em><b>Menu</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTAURANT__MENU = eINSTANCE.getRestaurant_Menu();

		/**
		 * The meta object literal for the '<em><b>R�servations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTAURANT__R�SERVATIONS = eINSTANCE.getRestaurant_R�servations();

		/**
		 * The meta object literal for the '<em><b>Salari�</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTAURANT__SALARI� = eINSTANCE.getRestaurant_Salari�();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTAURANT__NAME = eINSTANCE.getRestaurant_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTAURANT__ADDRESS = eINSTANCE.getRestaurant_Address();

		/**
		 * The meta object literal for the '{@link com.sii.restaurant.restaurant.impl.MMenusImpl <em>Menus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.restaurant.restaurant.impl.MMenusImpl
		 * @see com.sii.restaurant.restaurant.impl.MRestaurantPackageImpl#getMenus()
		 * @generated
		 */
		EClass MENUS = eINSTANCE.getMenus();

		/**
		 * The meta object literal for the '<em><b>Plat</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENUS__PLAT = eINSTANCE.getMenus_Plat();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENUS__NAME = eINSTANCE.getMenus_Name();

		/**
		 * The meta object literal for the '{@link com.sii.restaurant.restaurant.impl.MSalari�sImpl <em>Salari�s</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.restaurant.restaurant.impl.MSalari�sImpl
		 * @see com.sii.restaurant.restaurant.impl.MRestaurantPackageImpl#getSalari�s()
		 * @generated
		 */
		EClass SALARI�S = eINSTANCE.getSalari�s();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALARI�S__NAME = eINSTANCE.getSalari�s_Name();

		/**
		 * The meta object literal for the '{@link com.sii.restaurant.restaurant.impl.MR�servationsImpl <em>R�servations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.restaurant.restaurant.impl.MR�servationsImpl
		 * @see com.sii.restaurant.restaurant.impl.MRestaurantPackageImpl#getR�servations()
		 * @generated
		 */
		EClass R�SERVATIONS = eINSTANCE.getR�servations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute R�SERVATIONS__NAME = eINSTANCE.getR�servations_Name();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute R�SERVATIONS__DATE = eINSTANCE.getR�servations_Date();

		/**
		 * The meta object literal for the '<em><b>Clients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference R�SERVATIONS__CLIENTS = eINSTANCE.getR�servations_Clients();

		/**
		 * The meta object literal for the '{@link com.sii.restaurant.restaurant.impl.MClientsImpl <em>Clients</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.restaurant.restaurant.impl.MClientsImpl
		 * @see com.sii.restaurant.restaurant.impl.MRestaurantPackageImpl#getClients()
		 * @generated
		 */
		EClass CLIENTS = eINSTANCE.getClients();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTS__NAME = eINSTANCE.getClients_Name();

		/**
		 * The meta object literal for the '{@link com.sii.restaurant.restaurant.impl.MPlatsImpl <em>Plats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.restaurant.restaurant.impl.MPlatsImpl
		 * @see com.sii.restaurant.restaurant.impl.MRestaurantPackageImpl#getPlats()
		 * @generated
		 */
		EClass PLATS = eINSTANCE.getPlats();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATS__NAME = eINSTANCE.getPlats_Name();

	}

} //MRestaurantPackage
