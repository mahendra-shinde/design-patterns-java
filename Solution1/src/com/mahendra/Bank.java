package com.mahendra;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Bank {
	private List<Account> accounts = new LinkedList<>();
	
	public Bank() {
		
	}
	
	public void addAccount(Account acc) {
		accounts.add(acc);
	}
	
	public void printAccounts() {
		Iterator<Account> it = accounts.iterator();
		System.out.printf("%15s | %-20s | %s\n", "Acc Number", "Customer Name", "Opening Date/Time");
		while(it.hasNext()) {
			Account acc = it.next();
			System.out.println(new Printer(acc));
		}
	}
	
	void performTransaction(Command command) {
		command.execute();
	}
}
