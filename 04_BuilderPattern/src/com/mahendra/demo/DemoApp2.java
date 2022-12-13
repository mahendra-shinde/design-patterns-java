package com.mahendra.demo;

import com.mahendra.models.Machine;
import com.mahendra.models.MachineBuilder2;

/**
 * A Demo Application for Design Pattern {@code Builder}
 * 
 * @author Mahendra Shinde
 *
 */
public class DemoApp2 {

	public static void main(String[] args) {
		Machine myMachine = null;

		MachineBuilder2 builder = new MachineBuilder2();

		myMachine = builder.setProcessor("cheap")
						.setHardDisk("expensive")
						.setMonitor("cheap")
						.build();
		


		System.out.println(myMachine.getHardDisk().getClass().getCanonicalName());
		System.out.println(myMachine.getProcessor().getClass().getCanonicalName());
	}

}
