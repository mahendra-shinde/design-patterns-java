package com.mahendra.factories;

import com.mahendra.models.*;

/**
 * A Factory to build Low Budget Machines
 * @author Mahendra Shinde
 *
 */
public class LowBudgetMachineFactory implements MachineFactory {

	@Override
	public Processor getProcessor() {
		return new CheapProcessor();
	}

	@Override
	public Monitor getMonitor() {
		// TODO Auto-generated method stub
		return new CheapMonitor();
	}

	@Override
	public HardDisk getHardDisk() {
		// TODO Auto-generated method stub
		return new CheapHardDisk();
	}

}
