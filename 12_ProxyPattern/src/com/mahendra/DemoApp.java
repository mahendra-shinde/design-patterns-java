package com.mahendra;

/**
 * A Demo Application for Design pattern {@code ProxyPattern} 
 * @author Mahendra Shinde
 *
 */
public class DemoApp {

	public static void main(String[] args) {
		Image image = new ImageProxy("1.png");
		
		image.show();
	}

}
