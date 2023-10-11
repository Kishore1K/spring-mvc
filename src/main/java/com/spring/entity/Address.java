package com.spring.entity;

public class Address {
	
	private String street;
	
	
	private String city;
	
	private String state;


	@Override
	public String toString() {
		return "Address [stree=" + street + ", city=" + city + ", state=" + state + "]";
	}



	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}

}
