package com.mahendra;

/**
 * Sample Third-party media player
 * @author Mahendra Shinde
 *
 */
public class RealPlayer implements ThirdPartyMediaPlayer {

	@Override
	public void playMedia(String filename) {
System.out.println("RealPlayer currently playing : "+filename);		
	}

}
