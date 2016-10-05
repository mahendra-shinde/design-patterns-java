package com.mahendra.factories;

import com.mahendra.models.*;

/**
 * An interface which should create family of related or dependent objects
 * @author Mahendra Shinde
 *
 */
public interface MachineFactory {
	
	Processor getProcessor();
	
	Monitor getMonitor();
	
	HardDisk getHardDisk();
}
