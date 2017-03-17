package com.sii.restaurant.restaurant;

import com.sii.restaurant.restaurant.impl.RestaurantFactoryImpl;

/** This factory  overrides the generated factory and returns the new generated interfaces */
public interface RestaurantFactory extends MRestaurantFactory 
{
	
	/** Specialize the eINSTANCE initialization with the new interface type 
	  * (overridden in the override_factory extension)
	*/
	RestaurantFactory eINSTANCE = RestaurantFactoryImpl.init();
				
	public Restaurant createRestaurant();
	public Menus createMenus();
	public Salariés createSalariés();
	public Réservations createRéservations();
	public Clients createClients();
	public Plats createPlats();
}
