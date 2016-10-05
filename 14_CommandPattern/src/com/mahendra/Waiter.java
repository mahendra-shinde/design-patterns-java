package com.mahendra;

import java.util.HashMap;
/**
 * The Broker object. One that receives all commands.
 * @author Mahendra Shinde
 *
 */

public class Waiter {
	private HashMap<String, FoodOrder> requests;
	
	public Waiter(){
		requests = new HashMap<String, FoodOrder>(10);
	}
	
	public void takeOrder(String table, FoodOrder order){
		requests.put(table, order);
		System.out.printf("Order received from [%s] for %s [%s]%n", table,order.getName(), (order.isVeg()?"VEG":"NON-VEG") );
	}
	
	public void placeOrders(){
		System.out.println("Hey Mr. Shef, I got few orders for you!");
		for(FoodOrder order : requests.values()){
			order.execute();
		}
	}
}
