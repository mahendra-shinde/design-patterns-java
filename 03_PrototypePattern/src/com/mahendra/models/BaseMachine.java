package com.mahendra.models;

/**
 * 
 * @author Mahendra Shinde
 *
 */
public class BaseMachine implements Cloneable{
	protected Processor processor;
	protected Monitor monitor;
	protected HardDisk hardDisk;

	public BaseMachine() {
		
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



	public Object clone(){
		
		Object clonedOne = null;
		
		try{
			clonedOne = super.clone();
			
		}catch(CloneNotSupportedException ex){
			ex.printStackTrace();
			return null;
		}
		
		return clonedOne;
	}
	
}
