package com.mahendra;


/**
 * An interface used by Real loggers and the proxy one.
 * @author Mahendra Shinde
 *
 */
public interface Logger {
	
	int INFO = 1;
	int DEBUG = 2;
	int ERROR = 3;
	void logMessage(int level, String message);
}
