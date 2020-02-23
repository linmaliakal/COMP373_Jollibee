package com.store.model.maintenance;

import java.util.ArrayList;
import java.util.HashMap;

public class Order extends OrderInfo {
	public Order(int orderId, long date, long time, long orderCost) {
		super(orderId, date, time, orderCost);	
	}

	public void setOrderCost(long orderCost) {
		//AKA sets the cost of an order
		this.orderCost = orderCost;
	}
	
	public String getOrderDetails() {
		//AKA gets the details of the order
		return orderDetails;
	}
	public void setOrderDetails(String orderDetails) {
		this.orderDetails = orderDetails;
	}
	
	
}
