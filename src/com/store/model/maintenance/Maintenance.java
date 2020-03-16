package com.store.model.maintenance;

import java.util.ArrayList;
import java.util.HashMap;


public class Maintenance extends Order implements IMaintenance {
	public Maintenance(int orderId) {
		super(orderId);
	}
	
	@Override
	public void listInspections() {
		getInspections();
	}

	@Override
	public void listMaintRequests() {
		// listing the Maintenance Requests currently being done for Facility
		getRequestList();
	}

	@Override
	public void listMaintenance() {
		// listing Maintenance already done for Facility
		getOrderList();
	}

	public void makeFacilityMaintRequest(int orderId) {
		
//		CODE OLD
//		RequestList.add(orderDetail);
//		return ("Request order number " + orderId + " is a request to maintain " + orderDetail);
	}
	
	public void scheduleMaintenance(int orderId) {
		// Add maintenance request to schedule via id.
		OrderList.add(orderId);
	}
		
 }