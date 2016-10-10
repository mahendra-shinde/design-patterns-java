package com.mahendra;

public class TextField implements Widget {
private int maxLength;

	public TextField(int maxLength) {
	super();
	this.maxLength = maxLength;
}

	@Override
	public void draw() {
		System.out.println("TextField of size: "+maxLength);
	}


}
