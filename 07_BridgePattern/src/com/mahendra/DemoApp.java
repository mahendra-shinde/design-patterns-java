package com.mahendra;

/**
 * A Demo Application for Design Pattern {@code Bridge }
 * @author Mahendra Shinde
 *
 */
public class DemoApp {

	public static void main(String[] args) {
		Sony sonyTv = new Sony();
		Philips philipsTv = new Philips();

		ConcreteRemote universalRemote = new ConcreteRemote(sonyTv);
		universalRemote.on();
		universalRemote.nextChannel();
		
	}

}
