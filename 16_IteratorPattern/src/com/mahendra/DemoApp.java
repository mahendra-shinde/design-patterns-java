package com.mahendra;

public class DemoApp {

	public static void main(String[] args) {
		IndianStates states = new IndianStates();
		
		Iterator iterator = states.getIterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
