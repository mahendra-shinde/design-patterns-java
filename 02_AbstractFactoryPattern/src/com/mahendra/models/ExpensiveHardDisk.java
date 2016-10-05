package com.mahendra.models;

public class ExpensiveHardDisk implements HardDisk {

	@Override
	public void storeData() {
		System.out.println("Huge storage :)");
	}

}
