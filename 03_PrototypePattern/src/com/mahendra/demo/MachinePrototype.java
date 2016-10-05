package com.mahendra.demo;

import java.util.HashMap;

import com.mahendra.models.BaseMachine;
import com.mahendra.models.CheapMachine;
import com.mahendra.models.ExpensiveMachine;

/**
 * A Prototype builder to prepare several prototypes to be used later.
 * @author Mahendra Shinde
 *
 */
public class MachinePrototype {

	private HashMap<String, BaseMachine> machineCache =new HashMap<>();
	
	public MachinePrototype(){
		machineCache.put("cheap", new CheapMachine());
		machineCache.put("expensive", new ExpensiveMachine());
	}
	
	public BaseMachine getMachine(String type){
		if(type.equalsIgnoreCase("expensive")){
			return (BaseMachine) machineCache.get("expensive").clone();
		}else if(type.equalsIgnoreCase("cheap")){
			return (BaseMachine) machineCache.get("cheap").clone();
		}
		else
			return null;
	}
}
