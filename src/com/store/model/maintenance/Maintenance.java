package com.store.model.maintenance;

import java.util.HashMap;


public class Maintenance extends Order implements IMaintenance {
	public Maintenance() {

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
	
	public HashMap<Integer, String> setMaintenanceInfo(int orderId, long date, long time, long cost) {
		setOrderId(orderId);
		RequestDate.put(orderId, date);
		RequestTime.put(orderId, time);
		OrderCost.put(orderId, cost);
		OrderList.add(orderId);
		return RequestList;
	}
	
	public int makeFacilityMaintenanceRequest(int orderId, long date, long time, long cost) {
		setOrderId(orderId);
		RequestDate.put(orderId, date);
		RequestTime.put(orderId, time);
		OrderCost.put(orderId, cost);
		OrderList.add(orderId);
		return getOrderId();
	}
	
	public String getMaintenanceInfo(int orderId){
		
		return System.out.println("The time of the request is: "+);
	}
	
	public void scheduleMaintenance() {
		 
	}
		
 }