package com.mahendra;

public class Printer {
	private Account account;
	
	public Printer(Account account) {
		this.account = account;
	}
	
	public String toString() {
		return	String.format("\n%15s | %-20s | %s", account.getAccNumber() , account.getHolderName() ,account.getOpeningDate());
	}
}
