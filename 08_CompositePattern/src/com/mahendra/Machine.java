package com.mahendra;


/**
 * A Model class for @{link ComputerLab }
 * @author Mahendra Shinde
 *
 */
public class Machine {
	protected Processor processor;
	protected Monitor monitor;
	protected HardDisk hardDisk;

	public Machine() {		
		processor = new Processor();
		monitor = new Monitor();
		hardDisk = new HardDisk();
	}
	
	public Processor getProcessor() {
		return processor;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public HardDisk getHardDisk() {
		return hardDisk;
	}

}
