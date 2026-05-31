package com.thymeleafbasic.model;

public class Songs {
	 private int id;
	 private String name;
	 private String movie;
	 private String singer;
	 public Songs() {
		
	 }
	 public Songs(int id, String name, String movie, String singer) {
		
		this.id = id;
		this.name = name;
		this.movie = movie;
		this.singer = singer;
	 }
	 public int getId() {
		 return id;
	 }
	 public void setId(int id) {
		 this.id = id;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getMovie() {
		 return movie;
	 }
	 public void setMovie(String movie) {
		 this.movie = movie;
	 }
	 public String getSinger() {
		 return singer;
	 }
	 public void setSinger(String singer) {
		 this.singer = singer;
	 }
	 
	 

}
