package com.mahendra.models;

/**
 * 
 * @author Mahendra Shinde
 *
 */
public class CheapProcessor implements Processor {

	@Override
	public void performOperation() {
		System.out.println("Slooow proocessinng...");
	}

}
