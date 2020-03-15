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
<<<<<<< HEAD
//		RequestList.entrySet().forEach(entry->{
//		    System.out.println("Request Number: " + entry.getKey() + " is for: " + entry.getValue());  
//		 });
=======
		RequestList.entrySet().forEach(entry->{
		    System.out.println("\tRequest Number: " + entry.getKey() + " is for: " + entry.getValue());  
		 });
>>>>>>> 07d881d62cba0d1e1d6ff64caac52c80d13bb7a1
	}

	@Override
	public void listMaintenance() {
		// TODO Auto-generated method stub
<<<<<<< HEAD
//		RequestDate.entrySet().forEach(entry->{
//		    System.out.println("Request Number: " + entry.getKey() + " was performed on: " + entry.getValue());  
//		 });
		getListMaint();
=======
		RequestDate.entrySet().forEach(entry->{
		    System.out.println("\tRequest Number: " + entry.getKey() + " was performed on: " + entry.getValue());  
		 });
>>>>>>> 07d881d62cba0d1e1d6ff64caac52c80d13bb7a1
		}

	public void makeFacilityMaintRequest(int orderId) {
		
//		CODE OLD
//		RequestList.add(orderDetail);
//		return ("Request order number " + orderId + " is a request to maintain " + orderDetail);
	}
	
	public void scheduleMaintenance(int orderId) {
		// Add maintenance request to schedule via id.
		OrderList.add(orderId);
<<<<<<< HEAD
=======
		System.out.println("\tMaintenance request " + orderId + " scheduled on " + getRequestDate(orderId));
		
>>>>>>> 07d881d62cba0d1e1d6ff64caac52c80d13bb7a1
	}
		
 }