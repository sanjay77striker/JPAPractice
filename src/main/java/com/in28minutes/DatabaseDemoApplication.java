package com.in28minutes;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.entity.Course;
import com.in28minutes.entity.Passport;
import com.in28minutes.entity.Person;
import com.in28minutes.entity.Review;
import com.in28minutes.jdbc.PersonJdbcDao;
import com.in28minutes.jpa.JpaRepository;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {
    @Autowired
	PersonJdbcDao pd;
    
    @Autowired
    JpaRepository jr;
    
    private Logger logger=LoggerFactory.getLogger(this.getClass()); 
	
	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*//logger.info("all persons -> {}",pd.findAllPersons());
		//logger.info("person -> {}",pd.findById(1003));
		logger.info("person -> {}",jr.findById(1003));
		Passport pass=new Passport("SAN@#");
		jr.insertPassport(pass);
		logger.info("insert -> {}",jr.insertPerson(new Person(1,"Sanjay","vnb",new Date(),pass)));
		//jr.deleteById(1003);
		logger.info("list -> {}",jr.findall());
		Course c=new Course("SQL");
		Review r=new Review("mass");
		r.setCourse(c);
		c.setReviewlist(r);
		jr.courseDetails(c);
		jr.reviewDetails(r);*/
		Passport passport=jr.findPassport(103);
		Person p=new Person(66,"Sanjay","vnb",new Date(),passport);
		jr.insertPerson(p);
		
		
	}

}
