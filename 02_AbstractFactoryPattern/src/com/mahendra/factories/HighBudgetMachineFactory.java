package com.mahendra.factories;

import com.mahendra.models.ExpensiveHardDisk;
import com.mahendra.models.ExpensiveMonitor;
import com.mahendra.models.ExpensiveProcessor;
import com.mahendra.models.HardDisk;
import com.mahendra.models.Monitor;
import com.mahendra.models.Processor;

/**
 * A Factory to build High Budget Machines
 * @author Mahendra Shinde
 *
 */
public class HighBudgetMachineFactory implements MachineFactory {

	@Override
	public Processor getProcessor() {
		return new ExpensiveProcessor();
	}

	@Override
	public Monitor getMonitor() {
		// TODO Auto-generated method stub
		return new ExpensiveMonitor();
	}

	@Override
	public HardDisk getHardDisk() {
		// TODO Auto-generated method stub
		return new ExpensiveHardDisk();
	}

}
