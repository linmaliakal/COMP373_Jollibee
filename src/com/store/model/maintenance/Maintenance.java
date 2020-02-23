package com.store.model.maintenance;

import java.util.ArrayList;
import java.util.HashMap;


public class Maintenance extends Order implements IMaintenance {
	public Maintenance(int orderId) {
		super(orderId);
	}
	
	@Override
	public void listInspections() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listMaintRequests() {
		// TODO Auto-generated method stub
		RequestList.entrySet().forEach(entry->{
		    System.out.println("Request Number: " + entry.getKey() + " is for: " + entry.getValue());  
		 });
	}

	@Override
	public void listMaintenance() {
		// TODO Auto-generated method stub
		for(int i=0;i<OrderList.size();i++) {
			System.out.println(OrderList.get(i));
		}
	} 
	

	public String makeFacilityMaintRequest(int orderId, String orderDetail) {
		RequestList.put(orderId,orderDetail);
		return ("Request order number " + orderId + " is a request to maintain " + orderDetail);
	}
	
	public void scheduleMaintenance(int orderId) {
		// Add maintenance request to schedule via id.
		OrderList.add(orderId);
		System.out.println("Maintenance request " + orderId + " scheduled on " + getRequestDate(12));
		
	}
		
 }