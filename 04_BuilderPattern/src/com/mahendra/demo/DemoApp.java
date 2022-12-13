package com.mahendra.demo;

import java.io.FileReader;
import java.io.IOException;
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
		
		try {
			// Find the file "preferences.txt" next to DemoApp class (ClassPath)
			props.load(DemoApp.class.getResourceAsStream("/preferences.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		props.put("PROCESSOR", "expensive");
//		props.put("HARDDISK", "cheap");
//		props.put("MONITOR", "cheap");
		MachineBuilder builder = new MachineBuilder(props);

		myMachine = builder.build();
		
		System.out.println(myMachine.getHardDisk().getClass().getCanonicalName());
		System.out.println(myMachine.getProcessor().getClass().getCanonicalName());
	}

}
