/**
 * 
 */
package com.mahendra;

import java.util.Date;

/**
 * @author mahendra
 *
 */
public class ChatRoom {
	 public static void showMessage(User user, String message){
	      System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
	   }
}
