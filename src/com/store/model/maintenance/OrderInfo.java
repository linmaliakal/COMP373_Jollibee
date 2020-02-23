package com.store.model.maintenance;

import java.util.ArrayList;
import java.util.HashMap;
import com.store.model.facility.Facility;

public class OrderInfo {
	int orderId;
	ArrayList<Order> OrderList = new ArrayList();
	//AKA the list of performed MAINTENANCE
	String orderDetails;
	//AKA details of the actual order
	ArrayList<String> OrderDetails = new ArrayList();
	//AKA the information for request for maintenance
	HashMap<Integer, String> RequestList = new HashMap<Integer, String>();
	//AKA the list of maintenance REQUESTS with orderId and OrderDetails
	Order request;
	int inspections = 0;
	
	public OrderInfo(int orderId, long date, long time, long orderCost) {
		this.orderId = orderId;
		this.date = date;
		this.time = time;
		this.orderCost = orderCost;
	}
	
	public String getOrderDetails(int orderId) {
		return RequestList.get(orderId);
	}

	public void setOrderDetails(int orderId, String orderDetails) {
		RequestList.put(orderId, orderDetails);
	}
	

	long date;
	long time;
	long orderCost = 400;
	
	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public long getOrderCost() {
		return orderCost;
	}

	public void setOrderCost(long orderCost) {
		this.orderCost = orderCost;
	}
	
	
	public ArrayList<String> addOrderDetails() {
		//TODO ask user for input for the new detail. MAKE THIS A HASHMAP
		String newDetail = "The New Detail";
		OrderDetails.add(newDetail);
		return OrderDetails;
	}

	public void deleteOrderDetails(String orderDetail) {
		// TODO use the given id to remove a facility from FacilityList
		OrderDetails.remove(orderDetail);
	}
	
}
