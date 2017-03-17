/**
 */
package com.sii.restaurant.restaurant;

import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Réservations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sii.restaurant.restaurant.MRéservations#getName <em>Name</em>}</li>
 *   <li>{@link com.sii.restaurant.restaurant.MRéservations#getDate <em>Date</em>}</li>
 *   <li>{@link com.sii.restaurant.restaurant.MRéservations#getClients <em>Clients</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sii.restaurant.restaurant.MRestaurantPackage#getRéservations()
 * @model
 * @generated
 */
public interface MRéservations extends EObject {
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
	 * @see com.sii.restaurant.restaurant.MRestaurantPackage#getRéservations_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.sii.restaurant.restaurant.MRéservations#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see com.sii.restaurant.restaurant.MRestaurantPackage#getRéservations_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link com.sii.restaurant.restaurant.MRéservations#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Clients</b></em>' containment reference list.

	 
	 * The list contents are of type {@link com.sii.restaurant.restaurant.MClients}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clients</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clients</em>' containment reference list.
	 * @see com.sii.restaurant.restaurant.MRestaurantPackage#getRéservations_Clients()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clients> getClients();

} // MRéservations
