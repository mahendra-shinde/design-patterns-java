package com.mahendra.models;

public class CheapProcessor implements Processor {

	@Override
	public void performOperation() {
		System.out.println("Slooow proocessinng...");
	}

}
