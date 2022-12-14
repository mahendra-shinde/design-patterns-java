package com.mahendra;

import java.util.Date;

public class AccountFactory {

	private static AccountFactory factory = new AccountFactory();
	
	private AccountFactory() {
		
	}
	
	public static AccountFactory getInstance() {
		return factory;
	}
	private static int savingCounter = 10001;
	private static int currentCounter = 10001;
	
	public Account openAccount(String type, String custName) {
		Account acc = null;
		switch(type) {
		case "SB":
			savingCounter++;
			 acc = new SavingAccount("SB"+savingCounter, custName, new Date(), 100);
			break;
		case "CB":
			currentCounter++;
			acc = new CurrentAccount("CB"+currentCounter, custName,new Date(), 5000);
			break;
		}
		return acc;
	}
}
