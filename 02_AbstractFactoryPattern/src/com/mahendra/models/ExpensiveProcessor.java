package com.mahendra.models;

public class ExpensiveProcessor implements Processor {

	@Override
	public void performOperation() {
		System.out.println("Quick Processing...");
	}

}
