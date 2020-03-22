package com.store.tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.store.model.maintenance.Maintenance;
//import com.store.model.maintenance.Order;

class maintenanceTest {
	
	Maintenance maintenance = new Maintenance(0);

	@BeforeEach
	void setUp() throws Exception {
		maintenance.getOrderId();
		maintenance.setOrderId(1);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void testMakeFacilityMaintRequest() {
		maintenance.makeFacilityMaintRequest(1, "FOOD SUPPLIES");
		assertEquals(2, maintenance.RequestList.size());
	}
	
	@Test
	void testScheduleMaintenance() {
		maintenance.getOrderId();
		maintenance.setOrderId(1);
		maintenance.scheduleMaintenance(1);
		assertEquals(2, maintenance.OrderList.size());
	}
	
	@Test
	void testListMaintenanceRequests() {
		maintenance.getOrderId();
		maintenance.setOrderId(1);
		maintenance.listMaintRequests();
		assertEquals(2, maintenance.getRequestList().size());
	}
	
	@Test
	void testListMaintenance() {
		maintenance.getOrderId();
		maintenance.setOrderId(1);
		maintenance.listMaintenance();
		assertEquals(2, maintenance.getOrderList().size());
	}
	
	@Test
	void testListInspections() {
		maintenance.getOrderId();
		maintenance.setOrderId(1);
		maintenance.listInspections();
		assertEquals(2, maintenance.getInspections());
	}

}
