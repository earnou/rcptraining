/**
 */
package com.sii.restaurant.restaurant;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sii.restaurant.restaurant.MMenus#getPlat <em>Plat</em>}</li>
 *   <li>{@link com.sii.restaurant.restaurant.MMenus#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sii.restaurant.restaurant.MRestaurantPackage#getMenus()
 * @model
 * @generated
 */
public interface MMenus extends EObject {
	/**
	 * Returns the value of the '<em><b>Plat</b></em>' containment reference list.

	 
	 * The list contents are of type {@link com.sii.restaurant.restaurant.MPlats}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plat</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plat</em>' containment reference list.
	 * @see com.sii.restaurant.restaurant.MRestaurantPackage#getMenus_Plat()
	 * @model containment="true"
	 * @generated
	 */
	EList<Plats> getPlat();

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
	 * @see com.sii.restaurant.restaurant.MRestaurantPackage#getMenus_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.sii.restaurant.restaurant.MMenus#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MMenus
