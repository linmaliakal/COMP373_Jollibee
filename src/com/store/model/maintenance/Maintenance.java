package com.store.model.maintenance;

import java.util.HashMap;


public class Maintenance extends Order implements IMaintenance {
	public Maintenance(int orderId, long date, long time, long orderCost) {
		super(orderId, date, time, orderCost);
	}
	@Override
	public void listInspections() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listMaintRequests() {
		// TODO Auto-generated method stub
		for(int i=0;i<RequestList.size();i++) {
			System.out.println(RequestList.get(i));
		}
	}

	@Override
	public void listMaintenance() {
		// TODO Auto-generated method stub
		for(int i=0;i<OrderList.size();i++) {
			System.out.println(OrderList.get(i));
		}
	} 
	
	public HashMap<Integer, String> setMaintenanceInfo(int orderId, String order){
		//TODO this is the list of orders
		RequestList.put(orderId, order);
		return RequestList;
	}
	
	public Order makeFacilityMaintenanceRequest(Order order) {
		this.request = order;
		return request;
	}
	
	public String getMaintenanceInfo(int orderId){
		return RequestList.get(orderId);
	}
	
	public void scheduleMaintenance() {
		 
	}
		
 }