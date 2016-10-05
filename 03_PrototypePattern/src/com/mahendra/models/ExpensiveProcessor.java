package com.mahendra.models;

/**
 * 
 * @author Mahendra Shinde
 *
 */
public class ExpensiveProcessor implements Processor {

	@Override
	public void performOperation() {
		System.out.println("Quick Processing...");
	}

}
