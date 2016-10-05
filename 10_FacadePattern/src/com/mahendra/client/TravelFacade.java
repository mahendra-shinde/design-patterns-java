package com.mahendra.client;

import java.util.ArrayList;
import java.util.Date;



import com.mahendra.models.*;
import com.mahendra.service.*;


/**
 * A Facade class to provide a service to client, while hiding the other services like {@link HotelBooker} and {@link FlightBooker}
 * @author Mahendra Shinde
 *
 */
public class TravelFacade {
	private HotelBooker hotelBooker;
	private FlightBooker flightBooker;
	
	

	public TravelFacade() {
		super();
		hotelBooker = new HotelBooker();
		flightBooker = new FlightBooker();
	}

	public void getFlightsAndHotels(Date from, Date to) {
		ArrayList<Flight> flights = flightBooker.getFlightsFor(from, to);
		ArrayList<Hotel> hotels = hotelBooker.getHotelNamesFor(from, to);
	// process and return 
	}
}
