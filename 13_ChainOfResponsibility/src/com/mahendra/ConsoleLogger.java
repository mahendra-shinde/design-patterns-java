package com.mahendra;

/**
 * Simple implementation of AbstractLogger which shall print message on console [Screen]
 * @author Mahendra Shinde
 *
 */
public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		super();
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Console : " + message);
	}

}
