package com.mahendra.factories;

import com.mahendra.models.CreditCard;
import com.mahendra.models.GoldCreditCard;

/**
 * A Factory to create an instances of {@link GoldCreditCard}.
 * @author Mahendra Shinde
 */
public class GoldCreditCardFactory extends BaseCreditCardFactory {

	@Override
	public CreditCard createCreditCard() {
		GoldCreditCard card = new GoldCreditCard();
		card.goldOperations();
		return card;
	}

}
