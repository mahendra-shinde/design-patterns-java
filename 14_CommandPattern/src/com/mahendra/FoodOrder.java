package com.mahendra;

/**
 * The implementation of Command, the request that needs to be processed,
 * @author Mahendra Shinde
 *
 */
public class FoodOrder implements Command {

	private String name;
	private boolean veg;
	
	public FoodOrder(String name, boolean veg) {
		super();
		this.name = name;
		this.veg = veg;
	}

	public String getName() {
		return name;
	}

	public boolean isVeg() {
		return veg;
	}

	@Override
	public void execute() {
		System.out.println(" preparing "+name);	
	}

}
