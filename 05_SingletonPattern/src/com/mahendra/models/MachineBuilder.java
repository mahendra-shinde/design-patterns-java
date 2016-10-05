package com.mahendra.models;

import java.util.Properties;

/**
 * A Singleton class, only one instance is available
 * Builder to build a system [Machine] using 'User-Preferences'
 * @author Mahendra Shinde
 *
 */
public class MachineBuilder {
	private Properties props = null;
	private static final String PROCESSOR_TYPE = "cheap";
	private static final String HARDDISK_TYPE = "cheap";
	private static final String MONITOR_TYPE = "cheap";

	private static MachineBuilder instance = null;
	
	public static MachineBuilder getInstance(Properties props){
		if(instance == null){
			instance = new MachineBuilder(props);
		}
		return instance;
	}
	
	private MachineBuilder(Properties props) {
		super();
		this.props = new Properties();
		validateProps(props);
	}
	
	
	private void validateProps(Properties props){
		if(props == null){
			props = new Properties();
		}
		this.props.put("PROCESSOR", props.getOrDefault("PROCESSOR",PROCESSOR_TYPE));
		this.props.put("MONITOR",props.getOrDefault("MONITOR", MONITOR_TYPE));
		this.props.put("HARDDISK", props.getOrDefault("HARDDISK", HARDDISK_TYPE));
	}
	
	public Machine build(){
		Machine machine = null;
		Processor cpu = null;
		HardDisk disk = null;
		Monitor monitor = null;
		if(props.get("PROCESSOR").equals("cheap"))
			cpu = new CheapProcessor();
		else if(props.get("PROCESSOR").equals("expensive"))
			cpu = new ExpensiveProcessor();
		
		if(props.get("MONITOR").equals("cheap"))
			monitor = new CheapMonitor();
		else if(props.get("MONITOR").equals("expensive"))
			monitor = new ExpensiveMonitor();
		
		if(props.get("HARDDISK").equals("cheap"))
			disk = new CheapHardDisk();
		else if(props.get("HARDDisk").equals("expensive"))
			disk = new ExpensiveHardDisk();
		
		machine = new Machine(cpu,monitor,disk);
		return machine;
	}
}
