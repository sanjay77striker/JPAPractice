package com.in28minutes.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@NamedQuery(name="find_all",query="select p from Person p")
public class Person {
    
	@GeneratedValue
	@Id
	private int id;
	private String name;
	private String location;
	private Date birth_date;
	
	@OneToOne
	private Passport passport;

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public Person() {

	}

	public Person(int id, String name, String location, Date birth_date, Passport passport) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birth_date = birth_date;
		this.passport = passport;
	}

	

	public Person(String name, String location, Date birth_date, Passport passport) {
		super();
		this.name = name;
		this.location = location;
		this.birth_date = birth_date;
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + ", location=" + location + ", birth_date=" + birth_date
				+ ", passport=" + passport + "]";
	}

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getbirth_date() {
		return birth_date;
	}

	public void setbirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

}
