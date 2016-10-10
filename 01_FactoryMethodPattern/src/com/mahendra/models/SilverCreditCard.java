package com.mahendra.models;

/**
 * 
 * @author <u>Mahendra Shinde</u>
 *
 */
public class SilverCreditCard implements CreditCard {

	@Override
	public void addPoints() {
		System.out.println("Points added for Silver Customer");

	}

	@Override
	public void addDiscounts() {
		System.out.println("Discount added for Silver Customer");
	}

	public void silverOperations(){
		System.out.println("Few freebies for Silver card customers");
	}
}
