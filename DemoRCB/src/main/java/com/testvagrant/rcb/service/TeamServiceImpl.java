package com.testvagrant.rcb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testvagrant.rcb.model.Team;
import com.testvagrant.rcb.repository.TeamRepository;
@Service
public class TeamServiceImpl implements TeamService{
	
	@Autowired 
	TeamRepository tr;
	
	@Override
	public void add(Team team) 
	{
		tr.save(team);
		
	}

}
