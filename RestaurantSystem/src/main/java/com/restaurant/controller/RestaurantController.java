package com.restaurant.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.model.Restaurant;
import com.restaurant.service.RestaurantService;




@RestController
@RequestMapping("/resturantapi")
public class RestaurantController {
	@Autowired

	private RestaurantService resturantservice;
	
	
	@GetMapping("/allResturant")
	public List<Restaurant> fetchAllRestaurants()
	{
		return resturantservice.getAllResturant();
	}
	
	@GetMapping("/{id}")
	public Optional<Restaurant> fetchRestaurantById(@PathVariable long id)
	{
	 return Optional.ofNullable(resturantservice.getResturantById(id).orElseThrow());
	}
	
	@PostMapping("/addResturant")
	public Restaurant savingRestaurant(@RequestBody Restaurant restaurant)
	{
		return resturantservice.saveResturant(restaurant);
		
	}
	@PutMapping("/updateRestaurant/{id}")
	public Restaurant updateRestaurantById(@PathVariable long id,@RequestBody Restaurant restaurantData) {
		 Restaurant restaurant=resturantservice.getResturantById(id).orElseThrow();
		 restaurant.setName(restaurantData.getName());
		    restaurant.setAddress(restaurantData.getAddress());
		    restaurant.setBestfood(restaurantData.getBestfood());
		    restaurant.setRating(restaurantData.getRating());

		    return resturantservice.saveResturant(restaurant);
		
		
		
	}
	
	@DeleteMapping("/deleteResturant/{id}")
	public void deleteById(@PathVariable long id)
	{
		resturantservice.deleteResturantById(id);
	}


}
