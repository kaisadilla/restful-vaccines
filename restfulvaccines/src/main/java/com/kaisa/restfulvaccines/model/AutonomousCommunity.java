package com.kaisa.restfulvaccines.model;

import javax.persistence.*;

// this name is great because business java always has awfully long names.
@Entity
@Table(name = "vaccines")
public class AutonomousCommunity {
	private int id;
	private String name;
	private long vaccinesTotal;
	private long vaccinesUsed;
	private int peopleTotal;
	
	public AutonomousCommunity (int id, String name, long vaccinesTotal, long vaccinesUsed, int peopleTotal) {
		this.id = id;
		this.name = name;
		this.vaccinesTotal = vaccinesTotal;
		this.vaccinesUsed = vaccinesUsed;
		this.peopleTotal = peopleTotal;
	}
	public AutonomousCommunity () {}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId () {
		return id;
	}

	public void setId (int id) {
		this.id = id;
	}

	public String getName () {
		return name;
	}

	public void setName (String name) {
		this.name = name;
	}

	public long getVaccinesTotal () {
		return vaccinesTotal;
	}

	public void setVaccinesTotal (long vaccinesTotal) {
		this.vaccinesTotal = vaccinesTotal;
	}

	public long getVaccinesUsed () {
		return vaccinesUsed;
	}

	public void setVaccinesUsed (long vaccinesUsed) {
		this.vaccinesUsed = vaccinesUsed;
	}

	public int getPeopleTotal () {
		return peopleTotal;
	}

	public void setPeopleTotal (int peopleTotal) {
		this.peopleTotal = peopleTotal;
	}
	
	
}
