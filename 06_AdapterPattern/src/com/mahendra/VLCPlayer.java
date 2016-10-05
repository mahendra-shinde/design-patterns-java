package com.mahendra;


/**
 * Sample Third-party media player
 * @author Mahendra Shinde
 *
 */
public class VLCPlayer implements ThirdPartyMediaPlayer {

	@Override
	public void playMedia(String filename) {
	System.out.println("VLC Player Playing \""+filename+"\". " );	
	}

	

}
