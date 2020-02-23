package com.store.model.maintenance;

import java.util.*;

public class Order{
	public int orderId;
	//identifier for each order
	public Order(int orderId) {
	
	}
		
	public ArrayList<Integer> OrderList = new ArrayList();
	//AKA the list of performed MAINTENANCE

	public HashMap<Integer, String> OrderDetails = new HashMap<Integer, String>();
	//AKA DETAILS of the order. the TYPE of order. can be INSPECTION, FOOD, MACHINE, or CLEAN

	//AKA the information for request for maintenance
	public HashMap<Integer, String> RequestList = new HashMap<Integer, String>();
	//AKA the list of maintenance REQUESTS with orderId and OrderDetails
	public int inspections = 0;
	public HashMap<Integer, Long> RequestDate = new HashMap<Integer, Long>();
	//AKA date of request
	public HashMap<Integer, Long> RequestTime = new HashMap<Integer, Long>();
	//AKA time of request
	public HashMap<Integer, Long> OrderCost = new HashMap<Integer, Long>();
	//AKA cost of request
	

	
	public int getOrderId() {
		//return the id of order
		return orderId;
	}

	public void setOrderId(int orderId) {
		//set the id of order
		this.orderId = orderId;
	}
	
	public Long getRequestDate(int orderId) {
		return RequestDate.get(orderId);
	}

	public void setRequestDate(int orderId, Long requestDate) {
		RequestDate.put(orderId, requestDate);
	}

	public Long getRequestTime(int orderId) {
		return RequestTime.get(orderId);
	}

	public void setRequestTime(int orderId, Long requestTime) {
		RequestTime.put(orderId, requestTime);
	}

	public Long getOrderCost(int orderId) {
		return OrderCost.get(orderId);
	}

	public void setOrderCost(int orderId, Long requestCost) {
		OrderCost.put(orderId, requestCost);
	}
	
	public ArrayList<Integer> getOrderList() {
		return OrderList;
	}

	public void setOrderList(ArrayList<Integer> orderList) {
		OrderList = orderList;
	}

	public HashMap<Integer, String> getRequestList() {
		return RequestList;
	}

	public void setRequestList(HashMap<Integer, String> requestList) {
		RequestList = requestList;
	}
	

	public String getOrderDetails(int orderIndex) {
		return OrderDetails.get(orderIndex);
	}
	
	
	public int getInspections() {
		return inspections;
	}
	public int setOrderDetails(int orderId, String detail) {
		if (detail.equals("INSPECTION")) {
			inspections++;
		}
		OrderDetails.put(orderId, detail);
		return inspections;
	}
	
	
	
}
