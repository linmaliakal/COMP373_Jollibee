package com.store.model.maintenance;

import java.util.*;

public class Order{
	public int orderId;
	//identifier for each order
	
	
	// DETAILS FOR EACH ORDER
	int cost;
	
	
	String orderDescr; //Description of the order
	String orderRequest; // type of Request
	String requestDate; // date of the request in the format MM/DD/YYYY
	String requestTime; //time of the order request, when to be performed
	public int inspections = 0; // number of inspections made
		
	public ArrayList<Integer> OrderList = new ArrayList<Integer>();
	//AKA the list of performed MAINTENANCE
	
	public ArrayList<String> orderInfo = new ArrayList<String>();
	//AKA information for the order
	
	public ArrayList<String> RequestList = new ArrayList<String>();
	//AKA the list of maintenance REQUESTS with orderId and OrderDetails
	
	public HashMap<Integer, Integer> orderDates = new HashMap<Integer, Integer>();
	// DATES of Orders in the format MMDDYY
	
	public HashMap<Integer, String> clientOrderRequest = new HashMap<Integer, String>();

	// CLIENT HASHMAP for order requests
	public HashMap<Integer, String> clientOrderInfo = new HashMap<Integer, String>();
	// CLIENT HASHMAP for order information
	
	
	public Order(int orderId) {	
	}
	
	public int getOrderId() {
		//return the id of order
		return orderId;
	}

	public void setOrderId(int orderId) {
		//set the id of order
		this.orderId = orderId;
	}
	
	public ArrayList<Integer> getOrderList() {
		return OrderList;
	}

	public void setOrderList(ArrayList<Integer> orderList) {
		OrderList = orderList;
	}
	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}


	public String getOrderDescr() {
		return orderDescr;
	}

	public void setOrderDescr(String orderDescr) {
		this.orderDescr = orderDescr;
	}

	public String getOrderRequest() {
		return orderRequest;
	}

	public void setOrderRequest(String orderRequest) {
		this.orderRequest = orderRequest;
	}

	public String getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}

	public ArrayList<String> getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(ArrayList<String> orderInfo) {
		this.orderInfo = orderInfo;
	}

	public ArrayList<String> getRequestList() {
		return RequestList;
	}

	public void setRequestList(ArrayList<String> requestList) {
		RequestList = requestList;
	}

	public HashMap<Integer, Integer> getOrderDates() {
		return orderDates;
	}

	public void setOrderDates(HashMap<Integer, Integer> orderDates) {
		this.orderDates = orderDates;
	}

	public HashMap<Integer, String> getClientOrderRequest() {
		return clientOrderRequest;
	}

	public void setClientOrderRequest(HashMap<Integer, String> clientOrderRequest) {
		this.clientOrderRequest = clientOrderRequest;
	}

	public HashMap<Integer, String> getClientOrderInfo() {
		return clientOrderInfo;
	}

	public void setClientOrderInfo(HashMap<Integer, String> clientOrderInfo) {
		this.clientOrderInfo = clientOrderInfo;
	}
	
	public void setInspections(int inspections) {
		this.inspections = inspections;
	}
	
	public int getInspections() {
		return inspections;
	}

	public String getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}
	
	
	
}
