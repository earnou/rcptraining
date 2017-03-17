package com.sii.restaurant.restaurant.impl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.sii.restaurant.restaurant.Restaurant;
import com.sii.restaurant.restaurant.Menus;
import com.sii.restaurant.restaurant.Salariés;
import com.sii.restaurant.restaurant.Réservations;
import com.sii.restaurant.restaurant.Clients;
import com.sii.restaurant.restaurant.Plats;
import com.sii.restaurant.restaurant.RestaurantFactory;


// This factory  overrides the generated factory and returns the new generated interfaces
public class RestaurantFactoryImpl extends MRestaurantFactoryImpl implements RestaurantFactory
{
	
	public static RestaurantFactory init() {
		
		try {
			Object fact = MRestaurantFactoryImpl.init();
			if ((fact != null) && (fact instanceof RestaurantFactory))
					return (RestaurantFactory) fact;
			}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RestaurantFactoryImpl(); 
		 }
	
	public Restaurant createRestaurant()
	{
		Restaurant result = new RestaurantImpl();
		return result;
	}
	public Menus createMenus()
	{
		Menus result = new MenusImpl();
		return result;
	}
	public Salariés createSalariés()
	{
		Salariés result = new SalariésImpl();
		return result;
	}
	public Réservations createRéservations()
	{
		Réservations result = new RéservationsImpl();
		return result;
	}
	public Clients createClients()
	{
		Clients result = new ClientsImpl();
		return result;
	}
	public Plats createPlats()
	{
		Plats result = new PlatsImpl();
		return result;
	}
}
