package com.store.tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.store.model.facility.Facility;

class facilityTest {
	
		Facility facility = new Facility(0);
	@BeforeEach
	void setUp() throws Exception {
		facility.getFacilityList();
		facility.setFacilityId(1);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCreateFacility() {
	//test to create a facility.
		facility.createFacility();
		facility.createFacility();
		assertEquals(2, facility.getFacilityList().size());
	}
	
	@Test
	void testRemoveFacility() {
	//test to remove a facility.
		facility.createFacility();
		facility.removeFacility(0);;
		assertEquals(0, facility.getFacilityList().size());
	}
	
	@Test
	void testListFacilities() {
	//test showing that each individual facility created
		facility.createFacility();
		assertEquals(1, facility.getFacilityList().size());
	}

	@Test
	void testInUseDuring() {
	//test showing the use interval for a facility
		int useInterval = facility.isInUseDuringInterval();
		assertEquals(36, useInterval);
	}
	@Test
	void testFacilityFood() {
	//test what type of food a facility is.
		facility.setTypeOfFood("Chinese");
		assertEquals("Chinese", facility.getTypeOfFood());
	}
	@Test
	void testInUse() {
	//test whether a facility is in use.
		facility.setInUse(true);
		assertEquals(true, facility.isInUse());
	}
	
	void testDownTime() {
	//test the downtime for a facility should be 6 months.
		assertEquals(6,facility.calcDownTimeForFacility());
	}
	
	void testInUseDuringInterval() {
	//test how long a lease for a facility is
		assertEquals(36, facility.isInUseDuringInterval());
	}
}
