package com.mahendra.demos;

import com.mahendra.factories.LowBudgetMachineFactory;
import com.mahendra.factories.MachineFactory;

/**
 * A Demo Application for design pattern <b>{@code Abstract Factory}</b>
 * @author Mahendra Shinde
 *
 */
public class DemoApp {

	public static void main(String[] args) {
		MachineFactory factory = new LowBudgetMachineFactory();
		ComputerShop shop = new ComputerShop(factory);
		shop.assembleMachine();
	}
}
