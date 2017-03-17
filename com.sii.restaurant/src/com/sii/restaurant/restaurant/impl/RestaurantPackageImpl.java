/**
 */
package com.sii.restaurant.restaurant.impl;

import com.sii.restaurant.restaurant.Clients;
import com.sii.restaurant.restaurant.Menus;
import com.sii.restaurant.restaurant.Plats;
import com.sii.restaurant.restaurant.Restaurant;
import com.sii.restaurant.restaurant.RestaurantFactory;
import com.sii.restaurant.restaurant.RestaurantPackage;
import com.sii.restaurant.restaurant.R�servations;
import com.sii.restaurant.restaurant.Salari�s;

import com.sii.restaurant.restaurant.util.RestaurantValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestaurantPackageImpl extends EPackageImpl implements RestaurantPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restaurantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salari�sEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass r�servationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platsEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.sii.restaurant.restaurant.RestaurantPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RestaurantPackageImpl() {
		super(eNS_URI, RestaurantFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RestaurantPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RestaurantPackage init() {
		if (isInited) return (RestaurantPackage)EPackage.Registry.INSTANCE.getEPackage(RestaurantPackage.eNS_URI);

		// Obtain or create and register package
		RestaurantPackageImpl theRestaurantPackage = (RestaurantPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RestaurantPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RestaurantPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRestaurantPackage.createPackageContents();

		// Initialize created meta-data
		theRestaurantPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRestaurantPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return RestaurantValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRestaurantPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RestaurantPackage.eNS_URI, theRestaurantPackage);
		return theRestaurantPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestaurant() {
		return restaurantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestaurant_Menu() {
		return (EReference)restaurantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestaurant_R�servations() {
		return (EReference)restaurantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestaurant_Salari�() {
		return (EReference)restaurantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestaurant_Name() {
		return (EAttribute)restaurantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestaurant_Address() {
		return (EAttribute)restaurantEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenus() {
		return menusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenus_Plat() {
		return (EReference)menusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenus_Name() {
		return (EAttribute)menusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSalari�s() {
		return salari�sEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSalari�s_Name() {
		return (EAttribute)salari�sEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getR�servations() {
		return r�servationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR�servations_Name() {
		return (EAttribute)r�servationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getR�servations_Date() {
		return (EAttribute)r�servationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getR�servations_Clients() {
		return (EReference)r�servationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClients() {
		return clientsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClients_Name() {
		return (EAttribute)clientsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlats() {
		return platsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlats_Name() {
		return (EAttribute)platsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestaurantFactory getRestaurantFactory() {
		return (RestaurantFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		restaurantEClass = createEClass(RESTAURANT);
		createEReference(restaurantEClass, RESTAURANT__MENU);
		createEReference(restaurantEClass, RESTAURANT__R�SERVATIONS);
		createEReference(restaurantEClass, RESTAURANT__SALARI�);
		createEAttribute(restaurantEClass, RESTAURANT__NAME);
		createEAttribute(restaurantEClass, RESTAURANT__ADDRESS);

		menusEClass = createEClass(MENUS);
		createEReference(menusEClass, MENUS__PLAT);
		createEAttribute(menusEClass, MENUS__NAME);

		salari�sEClass = createEClass(SALARI�S);
		createEAttribute(salari�sEClass, SALARI�S__NAME);

		r�servationsEClass = createEClass(R�SERVATIONS);
		createEAttribute(r�servationsEClass, R�SERVATIONS__NAME);
		createEAttribute(r�servationsEClass, R�SERVATIONS__DATE);
		createEReference(r�servationsEClass, R�SERVATIONS__CLIENTS);

		clientsEClass = createEClass(CLIENTS);
		createEAttribute(clientsEClass, CLIENTS__NAME);

		platsEClass = createEClass(PLATS);
		createEAttribute(platsEClass, PLATS__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(restaurantEClass, Restaurant.class, "Restaurant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRestaurant_Menu(), this.getMenus(), null, "menu", null, 0, -1, Restaurant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestaurant_R�servations(), this.getR�servations(), null, "R�servations", null, 0, -1, Restaurant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestaurant_Salari�(), this.getSalari�s(), null, "salari�", null, 0, -1, Restaurant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestaurant_Name(), ecorePackage.getEString(), "name", null, 0, 1, Restaurant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestaurant_Address(), ecorePackage.getEString(), "address", null, 0, 1, Restaurant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menusEClass, Menus.class, "Menus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenus_Plat(), this.getPlats(), null, "plat", null, 0, -1, Menus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenus_Name(), ecorePackage.getEString(), "name", null, 0, 1, Menus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(salari�sEClass, Salari�s.class, "Salari�s", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalari�s_Name(), ecorePackage.getEString(), "name", null, 0, 1, Salari�s.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(r�servationsEClass, R�servations.class, "R�servations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getR�servations_Name(), ecorePackage.getEString(), "name", null, 0, 1, R�servations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getR�servations_Date(), ecorePackage.getEDate(), "date", null, 0, 1, R�servations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getR�servations_Clients(), this.getClients(), null, "clients", null, 0, -1, R�servations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clientsEClass, Clients.class, "Clients", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClients_Name(), ecorePackage.getEString(), "name", null, 0, 1, Clients.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platsEClass, Plats.class, "Plats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlats_Name(), ecorePackage.getEString(), "name", null, 0, 1, Plats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (restaurantEClass, 
		   source, 
		   new String[] {
			 "constraints", "checkName"
		   });
	}

} //RestaurantPackageImpl
