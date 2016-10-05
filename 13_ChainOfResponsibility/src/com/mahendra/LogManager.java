package com.mahendra;


/**
 * A Proxy logger that receives all [log] requests and then uses root-logger chain to process messages.
 * @author Mahendra Shinde
 *
 */
public class LogManager implements Logger {
	private AbstractLogger rootLogger = null;

	public LogManager() {
		super();
		rootLogger = new ConsoleLogger(AbstractLogger.ERROR);
		AbstractLogger childLogger1 = new FileLogger(AbstractLogger.DEBUG, "/home/mahendra/mylog");
		rootLogger.setNextLogger(childLogger1);
		AbstractLogger childLogger2 = new ConsoleLogger(AbstractLogger.INFO);
		childLogger1.setNextLogger(childLogger2);
	}

	@Override
	public void logMessage(int level, String message) {
		rootLogger.logMessage(level, message);
	}

	
}
