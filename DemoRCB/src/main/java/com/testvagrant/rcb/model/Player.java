package com.testvagrant.rcb.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {
	@Id
	private String name;
	private String country;
	private String role;
	private String price_in_crores;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPrice_in_crores() {
		return price_in_crores;
	}
	public void setPrice_in_crores(String price_in_crores) {
		this.price_in_crores = price_in_crores;
	}
	public Player(String name, String country, String role, String price_in_crores) {
		super();
		this.name = name;
		this.country = country;
		this.role = role;
		this.price_in_crores = price_in_crores;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
