package com.mahendra.client;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/**
 * A Demo Application for Design Patter {@code Facade}
 * @author Mahendra Shinde
 *
 */
public class DemoApp {

	public static void main(String[] args) {
		TravelFacade travel = new TravelFacade();
		travel.getFlightsAndHotels(convertDateFromString("05/05/2016"), 
										convertDateFromString("12/05/2016"));
	}
	
	private static Date convertDateFromString(String str){	
		DateFormat sdf = DateFormat.getDateInstance(DateFormat.SHORT,Locale.UK);	
		try {
			return sdf.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}		
	}
}