package com.mahendra.demo;

import com.mahendra.models.Planet;
import com.mahendra.models.PlanetFactory;


/**
 * A Demo Application for Design Patter {@code Flyweight}
 * @author Mahendra Shinde
 *
 */
public class DemoApp {

	public static void main(String[] args) {
		PlanetFactory factory = new PlanetFactory();
		
		Planet earth = factory.getPlanet("terra", 1, 1);
		earth.draw();
		
		Planet mars = factory.getPlanet("terra", .67F, .4F);		
		mars.draw();
		
		System.out.println("Shocking !!!!!");
		System.out.println("Are they same ? "+ (earth==mars));
	}
}
