package com.mahendra.models;

/**
 * 
 * @author <u>Mahendra Shinde</u>
 *
 */
public class GoldCreditCard implements CreditCard {

	@Override
	public void addPoints() {
		System.out.println("Points added for Gold card Customer");

	}

	@Override
	public void addDiscounts() {
		System.out.println("Discount added for Gold card Customer");
	}
	
	public void goldOperations(){
		System.out.println("Few freebies for Gold card customers");
	}

}
