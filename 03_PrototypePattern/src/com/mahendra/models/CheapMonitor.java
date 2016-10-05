package com.mahendra.models;

/**
 * 
 * @author Mahendra Shinde
 *
 */
public class CheapMonitor implements Monitor {

	@Override
	public void displayPicture() {
		System.out.println("Low resolution picture... :(");
	}

}
