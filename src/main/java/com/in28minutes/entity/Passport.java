package com.in28minutes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passport {
	
	@GeneratedValue
	@Id
	private int id;

	private String number;
	
	
	public Passport() {
		
	}
	public Passport(int id, String number) {
		super();
		this.id = id;
		this.number = number;
		
	}

	public Passport(String number) {
		super();
		this.number = number;
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	
	
	@Override
	public String toString() {
		return "Passport [id=" + id + ", number=" + number +"  ]";
	}

}
	
	