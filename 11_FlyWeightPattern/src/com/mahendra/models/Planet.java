package com.mahendra.models;

/**
 * A Simple class with few properties.
 * @author Mahendra Shinde
 *
 */
public class Planet {
	private String planetType;
	private String primaryElement;
	
	public Planet(String planetType, String primaryElement) {
		super();
		this.planetType = planetType;
		this.primaryElement = primaryElement;
	}
	
	public String getPlanetType() {
		return planetType;
	}
	public String getPrimaryElement() {
		return primaryElement;
	}

	private float radius;
	private float mass;

	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float getMass() {
		return mass;
	}
	public void setMass(float mass) {
		this.mass = mass;
	}
	
	public void draw(){
		System.out.println("Drawing a "+planetType+" kind of planet with radius "+ radius+ "x of earth");
	}
}
