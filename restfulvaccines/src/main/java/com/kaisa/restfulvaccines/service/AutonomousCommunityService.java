package com.kaisa.restfulvaccines.service;

import java.util.List;

import javax.transaction.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaisa.restfulvaccines.model.AutonomousCommunity;
import com.kaisa.restfulvaccines.repository.AutonomousCommunityRepository;

// I may as well use this: https://projects.haykranen.nl/java/
@Service
@Transactional
public class AutonomousCommunityService {
	@Autowired
	private AutonomousCommunityRepository autonomousCommunityRepository;
	
	public List<AutonomousCommunity> getAllAutonomousCommunityData () {
		return autonomousCommunityRepository.findAll();
		//return (AutonomousCommunity[]) autonomousCommunityRepository.findAll().toArray();

	}
	
	public void saveAutonomousCommunity (AutonomousCommunity autonomousCommunity) {
		autonomousCommunityRepository.save(autonomousCommunity);
	}
	
	public AutonomousCommunity getAutonomousCommunity (Integer id) {
		return autonomousCommunityRepository.findById(id).get();
	}
	
	public void deleteAutonomousCommunity (Integer id) {
		autonomousCommunityRepository.deleteById(id);
	}
}
