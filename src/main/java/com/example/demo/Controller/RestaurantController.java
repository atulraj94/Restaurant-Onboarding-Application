package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Restaurant;
import com.example.demo.Service.RestaurantService;

@RestController
@RequestMapping("/api/restaurant")
public class RestaurantController {
	
	 @Autowired
	    private RestaurantService restaurantService;

	   //onboarding restaurant 
	    @PostMapping("")
	    public ResponseEntity<?> saveRestaurant(@RequestBody Restaurant restaurant) {
	        Restaurant savedRestaurant = restaurantService.saveRestaurant(restaurant);
	        return new ResponseEntity<>(savedRestaurant, HttpStatus.CREATED);
	    }
	    
	    
	    //getting all restaurant
	    
	    @GetMapping("")
	    public List<Restaurant> getAllRestaurant()
	    {
			return restaurantService.getAllRestaurant();
	    	
	    }

}
