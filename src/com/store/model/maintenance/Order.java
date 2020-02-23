package com.store.model.maintenance;

public class Order extends OrderInfo {
	public Order(long orderID) {
		super(orderID);
		
	}
	
	public long getOrderCost(long orderCost) {
		this.orderCost = orderCost;
		return orderCost;
	}
	
	
}
