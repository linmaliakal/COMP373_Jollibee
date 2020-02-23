package com.store.model.maintenance;

import java.util.ArrayList;
import java.util.HashMap;

public class Order{
	public Order() {
	
	}

	int orderId;
	
	ArrayList<Integer> OrderList = new ArrayList();
	//AKA the list of performed MAINTENANCE
	ArrayList<String> OrderDetails = new ArrayList();

	//AKA details of the actual order
	HashMap<Integer, ArrayList<String>> RequestOrderDetails = new HashMap<Integer, ArrayList<String>>();
	//AKA the information for request for maintenance
	HashMap<Integer, String> RequestList = new HashMap<Integer, String>();
	//AKA the list of maintenance REQUESTS with orderId and OrderDetails
	int inspections;
	HashMap<Integer, Long> RequestDate = new HashMap<Integer, Long>();
	//AKA date of request
	HashMap<Integer, Long> RequestTime = new HashMap<Integer, Long>();
	//AKA time of request
	HashMap<Integer, Long> OrderCost = new HashMap<Integer, Long>();
	//AKA cost of request
	

	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
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

	
	public ArrayList addOrderDetails(String addNewDetail) {
		//TODO ask user for input for the new detail. MAKE THIS A HASHMAP
		OrderDetails.add(addNewDetail);
		return OrderDetails;
	}

	public void deleteOrderDetails(Integer orderIndex) {
		// TODO use the given id to remove a facility from FacilityList
		OrderDetails.remove(orderIndex);
	}
	
	public void setOrderDetails(int orderIndex, String orderDetails) {
		OrderDetails.set(orderIndex,orderDetails);
	}
	public ArrayList<String> getRequestOrderDetails() {
		return getOrderDetails();
	}
	public void setRequestOrderDetails(ArrayList<String> orderDetails) {
		setOrderDetails(orderDetails);
	}
	public void setRequestOrderDetails(HashMap<Integer, ArrayList<String>> requestOrderDetails) {
		RequestOrderDetails = requestOrderDetails;
	}

	public String getOrderDetails(int orderIndex) {
		return OrderDetails.get(orderIndex);
	}
	
	public ArrayList<String> getOrderDetails() {
		return OrderDetails;
	}

	public void setOrderDetails(ArrayList<String> orderDetails) {
		OrderDetails = orderDetails;
	}
	
	


	

	

	
}
