package com.bridgelabz.AdvJavaWorkshop;

public class Hotel {
	private String hotelName;
	private double regularCustRate;
	public Hotel(String hotelName, double regularCustRate) {
		this.hotelName = hotelName;
		this.regularCustRate = regularCustRate;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public double getRegularCustRate() {
		return regularCustRate;
	}
	public void setRegularCustRate(double regularCustRate) {
		this.regularCustRate = regularCustRate;
	}
	
}
