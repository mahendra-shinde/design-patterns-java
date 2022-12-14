package com.mahendra;

public class DemoApp {

	public static void main(String[] args) {
		
		AccountFactory factory = AccountFactory.getInstance();
		
		Bank bank = new Bank();
		Account ac1 = factory.openAccount("SB", "Rajiv Bhatia");
		bank.addAccount(ac1);
		bank.addAccount(factory.openAccount("CB", "Rajiv Bhatia"));
		bank.addAccount(factory.openAccount("SB", "Ajay sigh deol"));
		
		bank.printAccounts();
		
		Command cmd = new WithdrawalCommand(ac1, 2000D);
		bank.performTransaction(cmd);

	}

}
