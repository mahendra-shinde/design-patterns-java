package com.mahendra.models;

/**
 * 
 * @author Mahendra Shinde
 *
 */
public class CheapHardDisk implements HardDisk {

	@Override
	public void storeData() {
		System.out.println("Low storage :(");
	}

}
