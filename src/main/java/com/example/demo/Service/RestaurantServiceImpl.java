package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Restaurant;
import com.example.demo.Repository.RestaurantRepository;


@Service
public class RestaurantServiceImpl implements RestaurantService {
	
	 @Autowired
	    private RestaurantRepository restaurantRepository;

	    @Override
	    public Restaurant saveRestaurant(Restaurant restaurant) {
	        return restaurantRepository.save(restaurant);
	    }

}
