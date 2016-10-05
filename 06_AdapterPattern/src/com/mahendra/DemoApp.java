package com.mahendra;

/**
 * A Demo Application for Design pattern {@code Adapter}
 * @author Mahendra Shinde
 *
 */
public class DemoApp {

	public static void main(String[] args) {
		MediaPlayer player = new MediaAdapter();
		player.play("avi", "aye mera sona re.avi");

	}

}
