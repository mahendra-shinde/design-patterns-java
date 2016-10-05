package com.mahendra;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Simple implementation of AbstractLogger which shall print message to a log file
 * @author Mahendra Shinde
 *
 */
public class FileLogger extends AbstractLogger {

	private String logFile = null;
	private String lineEnding;
	
	public FileLogger(int level,String logFile) {
		this.level = level;
		this.logFile = logFile;
		lineEnding = System.getProperty("line.separator");
	}
	
	@Override
	protected void write(String message) {
		
		try(FileWriter file = new FileWriter(logFile,true)){
	
			file.write(message+lineEnding);
			
		}catch(IOException ex){
			throw new RuntimeException("Unable to write log to file",ex);
		}
	}

}
