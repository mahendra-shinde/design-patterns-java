package com.mahendra.factories;

import com.mahendra.models.CreditCard;
import com.mahendra.models.GoldCreditCard;
import com.mahendra.models.SilverCreditCard;

/**
 * A Factory to create an instances of {@link SilverCreditCard}.
 * @author Mahendra Shinde
 */
public class SilverCreditCardFactory extends BaseCreditCardFactory {

	@Override
	public CreditCard createCreditCard() {
		SilverCreditCard card = new SilverCreditCard();
		card.silverOperations();
		return card;
	}

}
