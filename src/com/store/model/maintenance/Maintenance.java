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
		// TODO Auto-generated method stub
//		RequestList.entrySet().forEach(entry->{
//		    System.out.println("Request Number: " + entry.getKey() + " is for: " + entry.getValue());  
//		 });

	}

	@Override
	public void listMaintenance() {
		// TODO Auto-generated method stub
//		RequestDate.entrySet().forEach(entry->{
//		    System.out.println("Request Number: " + entry.getKey() + " was performed on: " + entry.getValue());  
//		 });
		getListMaint();
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