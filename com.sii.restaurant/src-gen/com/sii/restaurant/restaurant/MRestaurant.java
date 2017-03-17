/**
 */
package com.sii.restaurant.restaurant;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restaurant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sii.restaurant.restaurant.MRestaurant#getMenu <em>Menu</em>}</li>
 *   <li>{@link com.sii.restaurant.restaurant.MRestaurant#getR�servations <em>R�servations</em>}</li>
 *   <li>{@link com.sii.restaurant.restaurant.MRestaurant#getSalari� <em>Salari�</em>}</li>
 *   <li>{@link com.sii.restaurant.restaurant.MRestaurant#getName <em>Name</em>}</li>
 *   <li>{@link com.sii.restaurant.restaurant.MRestaurant#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sii.restaurant.restaurant.MRestaurantPackage#getRestaurant()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='checkName'"
 * @generated
 */
public interface MRestaurant extends EObject {
	/**
	 * Returns the value of the '<em><b>Menu</b></em>' containment reference list.

	 
	 * The list contents are of type {@link com.sii.restaurant.restaurant.MMenus}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu</em>' containment reference list.
	 * @see com.sii.restaurant.restaurant.MRestaurantPackage#getRestaurant_Menu()
	 * @model containment="true"
	 * @generated
	 */
	EList<Menus> getMenu();

	/**
	 * Returns the value of the '<em><b>R�servations</b></em>' containment reference list.

	 
	 * The list contents are of type {@link com.sii.restaurant.restaurant.MR�servations}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R�servations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R�servations</em>' containment reference list.
	 * @see com.sii.restaurant.restaurant.MRestaurantPackage#getRestaurant_R�servations()
	 * @model containment="true"
	 * @generated
	 */
	EList<R�servations> getR�servations();

	/**
	 * Returns the value of the '<em><b>Salari�</b></em>' containment reference list.

	 
	 * The list contents are of type {@link com.sii.restaurant.restaurant.MSalari�s}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salari�</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salari�</em>' containment reference list.
	 * @see com.sii.restaurant.restaurant.MRestaurantPackage#getRestaurant_Salari�()
	 * @model containment="true"
	 * @generated
	 */
	EList<Salari�s> getSalari�();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.sii.restaurant.restaurant.MRestaurantPackage#getRestaurant_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.sii.restaurant.restaurant.MRestaurant#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see com.sii.restaurant.restaurant.MRestaurantPackage#getRestaurant_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link com.sii.restaurant.restaurant.MRestaurant#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

} // MRestaurant
