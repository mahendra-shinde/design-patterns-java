package com.mahendra;

/**
 * An Object, representing an Image. Client will use a proxy instead {@link ImageProxy} 
 * @author Mahendra Shinde
 *
 */
public class RealImage implements Image {

	private String filename;
		
	public RealImage(String filename) {
		super();
		this.filename = filename;
	}


	@Override
	public void show() {
		System.out.println("Now Showing "+filename);
	}

}
