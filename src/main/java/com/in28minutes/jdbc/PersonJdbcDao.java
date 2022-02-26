package com.in28minutes.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28minutes.entity.Person;

@Repository
public class PersonJdbcDao {
	@Autowired
	JdbcTemplate jt;

	public List<Person> findAllPersons() {
		return jt.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));

	}

	public Person findById(int id){
		return jt.queryForObject("select * from person where id=?",new Object[] {id}, new BeanPropertyRowMapper<Person>(Person.class));
	}

}
