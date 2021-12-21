package com.bridgelabz.AdvJavaWorkshop;

import org.junit.Test;

public class HotelReservationServiceTest {
	Hotel hotel = new Hotel("Ridgewood",220);
@Test
public void addHotelwithRegularRatesTest() {
	HotelReservation obj = new HotelReservation();
	boolean result = obj.addHotelwithRegularRates(hotel);
}
}
