package com.store.model.maintenance;

import java.util.ArrayList;
import java.util.HashMap;


public class Maintenance extends Order implements IMaintenance {
	public Maintenance() {
	}
	HashMap<Integer, ArrayList<Long>> MaintenanceInfoList = new HashMap<Integer, ArrayList<Long>>();
	ArrayList<Long> MaintenanceInfo = new ArrayList();
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
	
//	public Maintenance setMaintenanceInfo() {
//		RequestDate.put(orderId, getRequestDate(orderId));
//		RequestTime.put(orderId, getRequestTime(orderId));
//		OrderCost.put(orderId, getOrderCost(orderId));
//		OrderList.add(orderId);
//		return RequestList;
//	}
	public void setMaintenanceInfo(int orderId) {
		MaintenanceInfo.set(0, getRequestDate(orderId));
		//AKA setting the date based on index 0 of maintenance info
		MaintenanceInfo.set(1, getRequestTime(orderId));
		//AKA setting the time based on index 1 of maintenance info
		MaintenanceInfo.set(2, getOrderCost(orderId));
	}
	public ArrayList<Long> getMaintenanceInfo(int orderId){
		
		return MaintenanceInfo;
	}
	public int makeFacilityMaintenanceRequest(int orderId) {
		setOrderId(orderId);
		RequestDate.put(orderId, date);
		RequestTime.put(orderId, time);
		OrderCost.put(orderId, cost);
		OrderList.add(orderId);
		return getOrderId();
	}
	
//	public String getMaintenanceInfo(int orderId){
//		return "The date of the request is: " + getRequestDate(orderId) + "The time of the request is: " + getRequestTime(orderId) + "\n The request cost is :" + getOrderCost(orderId);
//	}
	
	public void scheduleMaintenance(int orderId) {
		OrderList.add(orderId);
		 
	}
		
 }