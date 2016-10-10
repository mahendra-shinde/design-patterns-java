package com.mahendra;

public class DemoApp {

	public static void main(String[] args) {
		BorderDecorator decorator = new BorderDecorator(new TextField(20));
		decorator.draw();
	}

}
