package com.store.model.maintenance;

import java.util.ArrayList;

public class OrderInfo {
	long orderId;
	ArrayList<Order> OrderList = new ArrayList();
	String orderDetails;
	long date;
	long time;
	long orderCost;
	
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

	
	
	public OrderInfo(long orderId) {
		
	}
	
}
