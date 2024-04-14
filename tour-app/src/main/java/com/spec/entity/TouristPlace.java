package com.spec.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TouristPlace {
	
	@Id
	private String name;
	private String city;
	private String imgURL;
	
	
	public TouristPlace() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TouristPlace(String name, String city, String imgURL) {
		super();
		this.name = name;
		this.city = city;
		this.imgURL = imgURL;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getImgURL() {
		return imgURL;
	}


	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}
	

}
