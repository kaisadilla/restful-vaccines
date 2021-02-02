package com.kaisa.restfulvaccines.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kaisa.restfulvaccines.model.AutonomousCommunity;

// this name's even better!
public interface AutonomousCommunityRepository extends JpaRepository<AutonomousCommunity, Integer> {

}
