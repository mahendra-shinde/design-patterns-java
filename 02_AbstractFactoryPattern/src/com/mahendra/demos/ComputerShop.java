package com.mahendra.demos;

import com.mahendra.factories.MachineFactory;
import com.mahendra.models.HardDisk;
import com.mahendra.models.Monitor;
import com.mahendra.models.Processor;

/**
 * A sample class to use Factory to build a machine
 * @author Mahendra Shinde
 *
 */
public class ComputerShop {
	private MachineFactory factory;

	public ComputerShop(MachineFactory factory) {
		super();
		this.factory = factory;
	}
	
	public void assembleMachine(){
		Processor cpu = factory.getProcessor();
		HardDisk disk = factory.getHardDisk();
		Monitor display = factory.getMonitor();
		
		System.out.println("Lets test our configuration...");
		cpu.performOperation();
		disk.storeData();
		display.displayPicture();
	}
}
