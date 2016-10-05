package com.mahendra;


/**
 * A Demo Application for Design Pattern {@code Chain of Responsibility}
 * @author Mahendra Shinde
 *
 */
public class DemoApp {

	public static void main(String[] args) {
		
		Logger logger = new LogManager();
	
		logger.logMessage(Logger.DEBUG, "This message is for debugging");
		logger.logMessage(Logger.INFO, "And, this one just for Info!");
	}
	

}
