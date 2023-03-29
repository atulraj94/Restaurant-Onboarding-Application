package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Restaurant;

public interface RestaurantService {

	public Restaurant saveRestaurant(Restaurant restaurant);
	
	public List<Restaurant> getAllRestaurant();

}
