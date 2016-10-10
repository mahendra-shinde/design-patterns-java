package com.mahendra.factories;

import com.mahendra.models.CreditCard;

/**
 * A Factory base to create instances of CreditCards
 * @author Mahendra Shinde
 */
public abstract class BaseCreditCardFactory {
	public CreditCard getCreditCard(){
		
		CreditCard creditCard = this.createCreditCard();
		creditCard.addDiscounts();
		creditCard.addPoints();
		
		return creditCard;
	}
	
	public abstract CreditCard createCreditCard();
}
