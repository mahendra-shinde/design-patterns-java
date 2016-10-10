package com.mahendra.app;

import com.mahendra.factories.BaseCreditCardFactory;
import com.mahendra.factories.GoldCreditCardFactory;
import com.mahendra.models.CreditCard;

/**
 * A Demo Application for <i>Design Pattern</i> <b>{@code Factory Method}</b>
 * @author Mahendra Shinde
 *
 */
public class DemoApp {

	public static void main(String[] args) {
		BaseCreditCardFactory factory = new GoldCreditCardFactory();
		CreditCard myGoldCard= factory.getCreditCard();
	}

}
