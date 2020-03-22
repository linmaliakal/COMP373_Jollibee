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
		facility.createFacility();
		facility.createFacility();
		assertEquals(2, facility.getFacilityList().size());
	}
	
	@Test
	void testRemoveFacility() {
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
		int useInterval = facility.isInUseDuringInterval();
		assertEquals(36, useInterval);
	}
}
