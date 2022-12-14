package com.mahendra;

import java.util.Date;

public class SavingAccount extends Account {
	
	private int transactionLimit = 10;

	public SavingAccount(String accNumber, String holderName, Date openingDate, int trLimits) {
		super(accNumber, holderName, openingDate);
		this.setTransactionLimit(trLimits);
	}

	public int getTransactionLimit() {
		return transactionLimit;
	}

	public void setTransactionLimit(int transactionLimit) {
		this.transactionLimit = transactionLimit;
	}

}
