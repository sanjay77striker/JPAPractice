package com.in28minutes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.entity.Person;
import com.in28minutes.jpa.JpaRepository;

@RestController
public class UserController {
	
	@Autowired
    JpaRepository jr;
	
	@GetMapping("/person/{id}")
	public Person getPerson(@PathVariable int id) {
		return jr.findById(id);
	}
	
	@PostMapping("/person")
    public void createPerson(@RequestBody Person person) {
    	jr.insertPerson(person);
    }

	
}
