package com.mahendra;

import java.io.File;

/**
 * A Proxy that uses Same interface {@link Image} used by {@link RealImage }.  
 * @author Mahendra Shinde
 *
 */
public class ImageProxy implements Image {

	private RealImage image;
	private String filePath;

	private static final String DIRECTORY = "/home/mahendra/Pictures/";	
	
	public ImageProxy(String filename) {
		super();
		this.filePath = DIRECTORY + filename;
	}

	@Override
	public void show() {
		if(image == null)
			image = new RealImage(filePath);
		
		if(new File(filePath).canRead())
			image.show();
		else
			throw new RuntimeException("Inaccessible file!");
	}

}
