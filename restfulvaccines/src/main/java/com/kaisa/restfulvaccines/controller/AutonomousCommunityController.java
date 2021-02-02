package com.kaisa.restfulvaccines.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.kaisa.restfulvaccines.model.AutonomousCommunity;
import com.kaisa.restfulvaccines.service.AutonomousCommunityService;

@RestController
@RequestMapping("/vaccines")
public class AutonomousCommunityController {
	@Autowired
	AutonomousCommunityService autonomousCommunityService;
	
	@GetMapping("")
	public List<AutonomousCommunity> list () {
		System.out.println("Doin' the gettin' all");
		return autonomousCommunityService.getAllAutonomousCommunityData();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<AutonomousCommunity> get (@PathVariable("id") Integer autonomousCommunityId) {
		try {
			System.out.println("Doin' the gettin'");
			AutonomousCommunity autonomousCommunity = autonomousCommunityService.getAutonomousCommunity(autonomousCommunityId);
			return new ResponseEntity<AutonomousCommunity>(autonomousCommunity, HttpStatus.OK);
		}
		catch (NoSuchElementException ex) {
			return new ResponseEntity<AutonomousCommunity>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add (@RequestBody AutonomousCommunity autonomousCommunity) {
		System.out.println("Doin' the postin'");
		autonomousCommunityService.saveAutonomousCommunity(autonomousCommunity);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update (@RequestBody AutonomousCommunity autonomousCommunity, @PathVariable("id") Integer autonomousCommunityId) {
		System.out.println("Doin' the puttin'");
		try {
			@SuppressWarnings("unused")
			AutonomousCommunity dbAutonomousCommunity = autonomousCommunityService.getAutonomousCommunity(autonomousCommunityId);
			autonomousCommunity.setId(autonomousCommunityId);
			autonomousCommunityService.saveAutonomousCommunity(autonomousCommunity);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (NoSuchElementException ex) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable("id") Integer autonomousCommunityId) {
		System.out.println("Doin' the deletin'");
		autonomousCommunityService.deleteAutonomousCommunity(autonomousCommunityId);
	}
}
