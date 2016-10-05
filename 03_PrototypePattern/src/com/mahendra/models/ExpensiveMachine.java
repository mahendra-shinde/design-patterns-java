package com.mahendra.models;

/**
 * 
 * @author Mahendra Shinde
 *
 */
public class ExpensiveMachine extends BaseMachine {

	public ExpensiveMachine() {
		super();
		processor = new ExpensiveProcessor();
		hardDisk = new ExpensiveHardDisk();
		monitor = new ExpensiveMonitor();
	}
	
}
