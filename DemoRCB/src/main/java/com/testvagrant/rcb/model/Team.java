package com.testvagrant.rcb.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToOne;
@Entity
public class Team {
	@Id
	private String name;
	private String location;
	@OneToOne(cascade = CascadeType.ALL)
	private Player player;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Team(String name, String location,Player player) {
		super();
		this.name = name;
		this.location = location;
		this.player = player;
	}
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
