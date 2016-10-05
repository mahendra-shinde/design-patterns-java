package com.mahendra;

/**
 * A Demo Application for design pattern {@code Composite}
 * @author Mahendra Shinde
 *
 */
public class DemoApp {

	public static void main(String[] args) {
		ComputerLab lab1 = new ComputerLab();
		Machine machine1 = new Machine();
		lab1.add(machine1);
		
	}

}
