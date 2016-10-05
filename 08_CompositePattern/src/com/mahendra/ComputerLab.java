package com.mahendra;

import java.util.LinkedList;
import java.util.List;

/**
 * A Composit class which contains a list of object of Machine type
 * @author Mahendra Shinde
 *
 */
public class ComputerLab {
	private List<Machine> machines;

	public ComputerLab() {
		super();
		machines = new LinkedList<Machine>();
	}
	
	public void add(Machine machine){
		machines.add(machine);
	}
	
	public Machine[] getAll(){
		return machines.toArray(new Machine[machines.size()]);
	}
	
}
