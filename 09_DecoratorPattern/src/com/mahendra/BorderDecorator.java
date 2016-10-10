package com.mahendra;

public class BorderDecorator extends Decorator {

	public BorderDecorator(Widget widget) {
		super(widget);
	}

	@Override
	public void draw() {
		drawLine();
		super.draw();
		drawLine();
	}
	
	public void drawLine(){
		System.out.println("---------------------------");
	}

}
