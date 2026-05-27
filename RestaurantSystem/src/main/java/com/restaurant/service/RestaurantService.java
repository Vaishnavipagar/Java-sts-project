package com.restaurant.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.model.Restaurant;
import com.restaurant.repository.ResturantRepository;


@Service
public class RestaurantService {
	@Autowired
	private ResturantRepository resturantrepository;
	
	public List<Restaurant> getAllResturant() {
        return resturantrepository.findAll();
    }

 
    public Optional<Restaurant> getResturantById(long id) {
        return resturantrepository.findById(id);
    }

    public Restaurant saveResturant(Restaurant resturant) {
        return resturantrepository.save(resturant);
    }

   
    public void deleteResturantById(long id) {
    	resturantrepository.deleteById(id);
    }
	
	
}
