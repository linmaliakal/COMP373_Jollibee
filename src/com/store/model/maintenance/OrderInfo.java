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
	HashMap<Integer, String> OrderDetails = new HashMap<Integer, String>();
	//AKA the information for request for maintenance
	HashMap<Integer, String> MaintRequestList = new HashMap<Integer, String>();
	//AKA the list of maintenance REQUESTS with orderId and OrderDetails
	int inspections;
	HashMap<Integer, Long> RequestDate = new HashMap<Integer, Long>();
	//AKA date of request
	HashMap<Integer, Long> RequestTime = new HashMap<Integer, Long>();
	//AKA time of request
	HashMap<Integer, Long> RequestCost = new HashMap<Integer, Long>();
	//AKA cost of request
	
	public OrderInfo() {

	}
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public HashMap<Integer, Long> getRequestDate() {
		return RequestDate;
	}

	public void setRequestDate(HashMap<Integer, Long> requestDate) {
		RequestDate = requestDate;
	}

	public HashMap<Integer, Long> getRequestTime() {
		return RequestTime;
	}

	public void setRequestTime(HashMap<Integer, Long> requestTime) {
		RequestTime = requestTime;
	}

	public HashMap<Integer, Long> getRequestCost() {
		return RequestCost;
	}

	public void setRequestCost(HashMap<Integer, Long> requestCost) {
		RequestCost = requestCost;
	}
	
	public ArrayList<Order> getOrderList() {
		return OrderList;
	}

	public void setOrderList(ArrayList<Order> orderList) {
		OrderList = orderList;
	}

	public HashMap<Integer, String> getMaintRequestList() {
		return MaintRequestList;
	}

	public void setMaintRequestList(HashMap<Integer, String> requestList) {
		MaintRequestList = requestList;
	}

	
	public HashMap<Integer, String> addOrderDetails(Integer orderId, String addNewDetail) {
		//TODO ask user for input for the new detail. MAKE THIS A HASHMAP
		OrderDetails.put(orderId, addNewDetail);
		return OrderDetails;
	}

	public void deleteOrderDetails(Integer orderIndex) {
		// TODO use the given id to remove a facility from FacilityList
		OrderDetails.remove(orderIndex);
	}
	
	public void setOrderDetails(int orderIndex, String orderDetails) {
		OrderDetails.put(orderIndex,orderDetails);
	}
	public String getOrderDetails(int orderIndex) {
		return OrderDetails.get(orderIndex);
	}
	
}
