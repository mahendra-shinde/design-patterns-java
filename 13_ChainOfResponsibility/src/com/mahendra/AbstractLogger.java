package com.mahendra;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * The AbstractLogger which takes request to add log message and then delegates 
 * responsibility of actual message to one of it's derived classes.
 * @author Mahendra Shinde
 *
 */
public abstract class AbstractLogger implements Logger{
	protected int level;
	
	protected AbstractLogger nextLogger;
	
	public void setNextLogger(AbstractLogger logger){
		this.nextLogger=logger;
	}
	
	public void logMessage(int level, String message){
		if(this.level <= level ){
			write(String.format(" [%s]-%s", getTimeStamp(),message));
		}
		if(nextLogger != null){
			nextLogger.logMessage(level, message);
		}
	}
	
	protected abstract void write(String message);
	
	private String getTimeStamp(){
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.FULL);
		return df.format(new Date());
	}
}
