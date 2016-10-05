package com.mahendra.models;

/**
 * 
 * @author Mahendra Shinde
 *
 */
public class ExpensiveHardDisk implements HardDisk {

	@Override
	public void storeData() {
		System.out.println("Huge storage :)");
	}

}
