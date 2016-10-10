/**
 * 
 */
package com.mahendra;

/**
 * @author mahendra
 *
 */
public class DemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 User mahendra = new User("Mahendra");
	      User dakshata = new User("Dakshata");

	      mahendra.sendMessage("Hi! Princess!");
	      dakshata.sendMessage("Hello! Baba!");

	}

}
