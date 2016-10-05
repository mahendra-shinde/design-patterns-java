package com.mahendra;

/**
 * Adapter to work with Third-party Media Players 
 * @author Mahendra Shinde
 *
 */
public class MediaAdapter implements MediaPlayer {

	ThirdPartyMediaPlayer player;
	
	@Override
	public void play(String mediaType, String filePath) {
		if(mediaType.equalsIgnoreCase("avi"))
			player = new VLCPlayer();
		else if(mediaType.equalsIgnoreCase("rm"))
			player = new RealPlayer();
		
		player.playMedia(filePath);
	}

}
