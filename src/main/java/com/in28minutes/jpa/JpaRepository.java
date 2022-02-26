package com.in28minutes.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in28minutes.entity.Course;
import com.in28minutes.entity.Passport;
import com.in28minutes.entity.Person;
import com.in28minutes.entity.Review;

@Repository
@Transactional
public class JpaRepository {
	@Autowired
	EntityManager em;
	
	public Person findById(int id){
		return em.find(Person.class, id);
	}
	
	public Passport findPassport(int id) {
		return em.find(Passport.class,id);
	}

	public Person insertPerson(Person person) {
		
		return em.merge(person);
	}
	
	public void insertPassport(Passport passport) {
		 em.persist(passport);
	}
	
	public void deleteById(int id) {
		Person p=findById(id);
		em.remove(p);
	}
	
	public List<Person> findall(){
		TypedQuery<Person> tq=em.createNamedQuery("find_all",Person.class);
		return tq.getResultList();
	}
	
	public void courseDetails(Course course) {
		em.persist(course);
	}
	
	public void reviewDetails(Review r) {
		em.persist(r);
	}
	

}
