package com.mahendra.demo;

import java.util.Properties;

import com.mahendra.models.Machine;
import com.mahendra.models.MachineBuilder;

/**
 * A Demo Application for Design Pattern {@code Builder}
 * @author Mahendra Shinde
 *
 */
public class DemoApp {

	public static void main(String[] args) {
		Machine myMachine = null;
		
		Properties props = new Properties();
		props.put("PROCESSOR", "expensive");
		props.put("HARDDISK", "cheap");
		props.put("MONITOR", "cheap");
		MachineBuilder builder = new MachineBuilder(props);

		myMachine = builder.build();
		
		System.out.println(myMachine.getHardDisk().getClass().getCanonicalName());
		System.out.println(myMachine.getProcessor().getClass().getCanonicalName());
	}

}
