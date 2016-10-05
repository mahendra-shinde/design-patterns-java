package com.mahendra.models;

/**
 * 
 * @author Mahendra Shinde
 *
 */
public class Machine {
	protected Processor processor;
	protected Monitor monitor;
	protected HardDisk hardDisk;

		
	protected Machine(Processor processor, Monitor monitor, HardDisk hardDisk) {
		super();
		this.processor = processor;
		this.monitor = monitor;
		this.hardDisk = hardDisk;
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
