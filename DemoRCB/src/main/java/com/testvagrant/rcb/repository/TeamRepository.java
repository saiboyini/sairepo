package com.testvagrant.rcb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testvagrant.rcb.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer>{

}
