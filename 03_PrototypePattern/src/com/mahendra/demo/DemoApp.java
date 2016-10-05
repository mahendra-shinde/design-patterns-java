package com.mahendra.demo;

import com.mahendra.models.BaseMachine;
import com.mahendra.models.CheapMachine;

/**
 * A Demo Application for Design Pattern <b>{@code Prototype}</b>
 * @author Mahendra Shinde
 *
 */
public class DemoApp {

	public static void main(String[] args) {
		
		MachinePrototype prototype = new MachinePrototype();
		//Every new instance of CHEAP machine is actually a CLONE of existing cheap machine in cache
		BaseMachine machine = prototype.getMachine("cheap");
		System.out.println(machine.getHardDisk().getClass().getCanonicalName());
		
	}

}
