package com.mahendra.models;

import java.util.Properties;

/**
 * Builder to build a system [Machine] using 'User-Preferences'
 * @author Mahendra Shinde
 *
 */
public class MachineBuilder2 {
	private Properties props = null;
	
	private static final String PROCESSOR_TYPE = "cheap";
	private static final String HARDDISK_TYPE = "cheap";
	private static final String MONITOR_TYPE = "cheap";

	public MachineBuilder2() {
		super();
		this.props = new Properties();
		validateProps(props);
	}
	
	
	public MachineBuilder2 setProcessor(String processor) {
		// 1 Validation
		if(processor.equals("cheap") || processor.equals("expensive")) {
			this.props.setProperty(PROCESSOR_TYPE, processor);
		}
		return this;
	}
	public MachineBuilder2 setHardDisk(String disk) {
		// 1 Validation
		if(disk.equals("cheap") || disk.equals("expensive")) {
			this.props.setProperty(HARDDISK_TYPE, disk);
		}
		return this;
	}
	
	public MachineBuilder2 setMonitor(String monitor) {
		// 1 Validation
		if(monitor.equals("cheap") || monitor.equals("expensive")) {
			this.props.setProperty(MONITOR_TYPE, monitor);
		}
		return this;
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
		else if(props.get("HARDDISK").equals("expensive"))
			disk = new ExpensiveHardDisk();
		
		machine = new Machine(cpu,monitor,disk);
		return machine;
	}
}
