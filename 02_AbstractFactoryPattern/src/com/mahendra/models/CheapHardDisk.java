package com.mahendra.models;

public class CheapHardDisk implements HardDisk {

	@Override
	public void storeData() {
		System.out.println("Low storage :(");
	}

}
