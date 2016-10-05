package com.mahendra;

/**
 * 
 * @author Mahendra Shinde
 *
 */
public class DemoApp {

	public static void main(String[] args) {
		
		Waiter waiter = new Waiter(); //The Broker object
		
		waiter.takeOrder("Table A", new FoodOrder("Misal Pav", true));
		waiter.takeOrder("Table B", new FoodOrder("Pav Bhaji", true));
		waiter.takeOrder("Table C", new FoodOrder("Chicken Lolipop", false));
		
		waiter.placeOrders();
	}

}
