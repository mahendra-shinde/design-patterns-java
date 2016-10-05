package com.mahendra.models;

import java.util.HashMap;

/**
 * A Factory providing ready to use instances of few KIND of planets
 * @author Mahendra Shinde
 *
 */
public class PlanetFactory {
	private HashMap<String, Planet> planetMap = null;
	
	public PlanetFactory(){
		populate();
	}
	
	private void populate(){
		planetMap = new HashMap<String,Planet>();
		Planet terra = new Planet("Terrastrial","carbon, silica");
		Planet ice = new Planet("Ice Giant","various ices");
		Planet gas = new Planet("Gas Giant","helium, hydrogen");
		
		planetMap.put("terra",terra);
		planetMap.put("ice",ice);
		planetMap.put("gas",gas);
	}
	
	public Planet getPlanet(String kind, float radius, float mass){
		kind = kind.toLowerCase();
		Planet planet = planetMap.get(kind);
		planet.setRadius(radius);
		planet.setMass(mass);
		return planet;
	}
	
}
