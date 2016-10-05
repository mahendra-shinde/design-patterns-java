package com.mahendra.models;


/**
 * 
 * @author Mahendra Shinde
 *
 */
public class CheapMachine extends BaseMachine {

	public CheapMachine() {
		super();
		processor = new CheapProcessor();
		hardDisk = new CheapHardDisk();
		monitor = new CheapMonitor();
	}
	
}
