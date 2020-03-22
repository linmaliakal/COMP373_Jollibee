package com.store.tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.store.model.use.Staff;

class useTest {
	
	Staff staff = new Staff();

	@BeforeEach
	void setUp() throws Exception {
		staff.ListAllStaff();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetName() {
		staff.setName("Charlie Chaplin");
		assertEquals("Charlie Chaplin", staff.getName());
	}
	
	@Test
	void testGetBirthdate() {
		staff.setBirthdate("04/25/1996");
		assertEquals("04/25/1996", staff.getBirthdate());
	}
	
	@Test
	void testGetAddress() {
		staff.setAddress("6301 N Broadway, Chicago, IL 60660");
		assertEquals("6301 N Broadway, Chicago, IL 60660", staff.getAddress());
	}
	
	@Test
	void testGetPhoneNumber() {
		staff.setPhoneNumber(8474019292l);
		assertEquals(8474019292l, staff.getPhoneNumber());
	}
	
	@Test
	void testGetPosition() {
		staff.setPosition("Manager");
		assertEquals("Manager", staff.getPosition());
	}

}
