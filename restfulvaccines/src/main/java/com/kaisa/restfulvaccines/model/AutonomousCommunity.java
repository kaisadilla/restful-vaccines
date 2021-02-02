package com.kaisa.restfulvaccines.model;

import javax.persistence.*;

// this name is great because business java always has awfully long names.
@Entity
@Table(name = "vaccines")
public class AutonomousCommunity {
	private int id;
	private String name;
	private long vaccinesPfizer;
	private long vaccinesModerna;
	private long vaccinesUsed;
	private int peopleTotal;
	
	public AutonomousCommunity () {}

	public AutonomousCommunity(int id, String name, long vaccinesPfizer, long vaccinesModerna, long vaccinesUsed,
			int peopleTotal) {
		super();
		this.id = id;
		this.name = name;
		this.vaccinesPfizer = vaccinesPfizer;
		this.vaccinesModerna = vaccinesModerna;
		this.vaccinesUsed = vaccinesUsed;
		this.peopleTotal = peopleTotal;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getVaccinesPfizer() {
		return vaccinesPfizer;
	}

	public void setVaccinesPfizer(long vaccinesPfizer) {
		this.vaccinesPfizer = vaccinesPfizer;
	}

	public long getVaccinesModerna() {
		return vaccinesModerna;
	}

	public void setVaccinesModerna(long vaccinesModerna) {
		this.vaccinesModerna = vaccinesModerna;
	}

	public long getVaccinesUsed() {
		return vaccinesUsed;
	}

	public void setVaccinesUsed(long vaccinesUsed) {
		this.vaccinesUsed = vaccinesUsed;
	}

	public int getPeopleTotal() {
		return peopleTotal;
	}

	public void setPeopleTotal(int peopleTotal) {
		this.peopleTotal = peopleTotal;
	}
	
	
}
