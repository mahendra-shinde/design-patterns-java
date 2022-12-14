package com.mahendra;

import java.util.Date;

public class CurrentAccount extends Account{
	
	public CurrentAccount(String accNumber, String holderName, Date openingDate, double minBalance) {
		super(accNumber, holderName, openingDate);
		this.setMinBalance(minBalance);
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	private double minBalance;
	
	
}
