/**
 * 
 */
package com.mahendra;

/**
 * @author mahendra
 *
 */
public class DemoApp {
	public static void main(String[] args) {
		DocumentEditor editor = new DocumentEditor("Hello World!");
		
		waitFor(2);		
		editor.replaceContent("This will replace old contents");
		waitFor(3);
		editor.replaceContent("This will be the last content!");
		waitFor(2);
		
		editor.printContents();
		System.out.println("*** Lets look at History");
		editor.printHistory();
		System.out.println(" *** After ONE UNDO ");
		editor.undo();
		editor.printContents();
	}
	
	
	static void waitFor(int seconds){
		seconds *= 1000;
		
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
