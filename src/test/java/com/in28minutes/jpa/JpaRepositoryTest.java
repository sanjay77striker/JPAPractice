package com.in28minutes.jpa;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.in28minutes.DatabaseDemoApplication;
import com.in28minutes.entity.Person;

@SpringBootTest(classes=DatabaseDemoApplication.class)
class JpaRepositoryTest {

	@Autowired
    JpaRepository jr;
	
	
	
	@Test
	void contextLoads() {
		Person por=jr.findById(1003);
		assertEquals(por.getName(),"Leo");
	}


}
