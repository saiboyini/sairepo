package com.testvagrant.rcb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.testvagrant.rcb.model.Team;
import com.testvagrant.rcb.service.TeamService;

@RestController
public class TeamController {
	
	@Autowired 
	TeamService ts;
	
	@GetMapping("/map")
	public void getmap()
	{
		System.out.println("Check Mapping");
	}
	
	@PostMapping("/team")
	public void addTeam(@RequestBody Team team)
	{
		int count=0;
		if(team.getPlayer().getCountry()=="India") {
			count++;
		}
		if(count>=7) {
		ts.add(team);
		}
		else {
			System.out.println("Maximum 4 foreign players are allowed");
		}
	}
	
	
}
	
	


