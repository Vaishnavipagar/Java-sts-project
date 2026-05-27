package com.restaurant.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="restaurant_info")
public class Restaurant {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private long id;
	@Column(name="name",nullable=false)
	 private String name;
	@Column(name="address")
	 private String address;
	@Column(name="best_food")
	 private String bestfood;
	@Column(name="rating")
	private double rating;
	public Restaurant() {
		
	}
	public Restaurant(String name, String address, String bestfood, double rating) {
		
		this.name = name;
		this.address = address;
		this.bestfood = bestfood;
		this.rating = rating;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBestfood() {
		return bestfood;
	}
	public void setBestfood(String bestfood) {
		this.bestfood = bestfood;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
	
	
	

}
