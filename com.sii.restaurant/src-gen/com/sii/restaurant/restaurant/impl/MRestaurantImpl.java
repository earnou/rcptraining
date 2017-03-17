/**
 */
package com.sii.restaurant.restaurant.impl;

import com.sii.restaurant.restaurant.Menus;
import com.sii.restaurant.restaurant.Restaurant;
import com.sii.restaurant.restaurant.RestaurantPackage;
import com.sii.restaurant.restaurant.MRestaurantPackage;
import com.sii.restaurant.restaurant.Réservations;
import com.sii.restaurant.restaurant.Salariés;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restaurant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sii.restaurant.restaurant.impl.MRestaurantImpl#getMenu <em>Menu</em>}</li>
 *   <li>{@link com.sii.restaurant.restaurant.impl.MRestaurantImpl#getRéservations <em>Réservations</em>}</li>
 *   <li>{@link com.sii.restaurant.restaurant.impl.MRestaurantImpl#getSalarié <em>Salarié</em>}</li>
 *   <li>{@link com.sii.restaurant.restaurant.impl.MRestaurantImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sii.restaurant.restaurant.impl.MRestaurantImpl#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 public class MRestaurantImpl extends MinimalEObjectImpl.Container implements Restaurant {
	/**
	 * The cached value of the '{@link #getMenu() <em>Menu</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenu()
	 * @generated
	 * @ordered
	 */
	protected EList<Menus> menu;

	/**
	 * The cached value of the '{@link #getRéservations() <em>Réservations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRéservations()
	 * @generated
	 * @ordered
	 */
	protected EList<Réservations> réservations;

	/**
	 * The cached value of the '{@link #getSalarié() <em>Salarié</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalarié()
	 * @generated
	 * @ordered
	 */
	protected EList<Salariés> salarié;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MRestaurantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRestaurantPackage.Literals.RESTAURANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Menus> getMenu() {
		if (menu == null) {
			menu = new EObjectContainmentEList<Menus>(Menus.class, this, RestaurantPackage.RESTAURANT__MENU);
		}
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Réservations> getRéservations() {
		if (réservations == null) {
			réservations = new EObjectContainmentEList<Réservations>(Réservations.class, this, RestaurantPackage.RESTAURANT__RÉSERVATIONS);
		}
		return réservations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Salariés> getSalarié() {
		if (salarié == null) {
			salarié = new EObjectContainmentEList<Salariés>(Salariés.class, this, RestaurantPackage.RESTAURANT__SALARIÉ);
		}
		return salarié;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRestaurantPackage.RESTAURANT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRestaurantPackage.RESTAURANT__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MRestaurantPackage.RESTAURANT__MENU:
				return ((InternalEList<?>)getMenu()).basicRemove(otherEnd, msgs);
			case MRestaurantPackage.RESTAURANT__RÉSERVATIONS:
				return ((InternalEList<?>)getRéservations()).basicRemove(otherEnd, msgs);
			case MRestaurantPackage.RESTAURANT__SALARIÉ:
				return ((InternalEList<?>)getSalarié()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MRestaurantPackage.RESTAURANT__MENU:
				return getMenu();
			case MRestaurantPackage.RESTAURANT__RÉSERVATIONS:
				return getRéservations();
			case MRestaurantPackage.RESTAURANT__SALARIÉ:
				return getSalarié();
			case MRestaurantPackage.RESTAURANT__NAME:
				return getName();
			case MRestaurantPackage.RESTAURANT__ADDRESS:
				return getAddress();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MRestaurantPackage.RESTAURANT__MENU:
				getMenu().clear();
				getMenu().addAll((Collection<? extends Menus>)newValue);
				return;
			case MRestaurantPackage.RESTAURANT__RÉSERVATIONS:
				getRéservations().clear();
				getRéservations().addAll((Collection<? extends Réservations>)newValue);
				return;
			case MRestaurantPackage.RESTAURANT__SALARIÉ:
				getSalarié().clear();
				getSalarié().addAll((Collection<? extends Salariés>)newValue);
				return;
			case MRestaurantPackage.RESTAURANT__NAME:
				setName((String)newValue);
				return;
			case MRestaurantPackage.RESTAURANT__ADDRESS:
				setAddress((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MRestaurantPackage.RESTAURANT__MENU:
				getMenu().clear();
				return;
			case MRestaurantPackage.RESTAURANT__RÉSERVATIONS:
				getRéservations().clear();
				return;
			case MRestaurantPackage.RESTAURANT__SALARIÉ:
				getSalarié().clear();
				return;
			case MRestaurantPackage.RESTAURANT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MRestaurantPackage.RESTAURANT__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MRestaurantPackage.RESTAURANT__MENU:
				return menu != null && !menu.isEmpty();
			case MRestaurantPackage.RESTAURANT__RÉSERVATIONS:
				return réservations != null && !réservations.isEmpty();
			case MRestaurantPackage.RESTAURANT__SALARIÉ:
				return salarié != null && !salarié.isEmpty();
			case MRestaurantPackage.RESTAURANT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MRestaurantPackage.RESTAURANT__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", address: ");
		result.append(address);
		result.append(')');
		return result.toString();
	}

} //MRestaurantImpl
