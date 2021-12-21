package com.bridgelabz.AdvJavaWorkshop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;




public class HotelReservation {
	List<Hotel> list = new ArrayList<Hotel>();	
	public boolean addHotelwithRegularRates(Hotel hotel) {
		list.add(hotel);
		if(list.isEmpty()) {
			System.out.println("Hotel Not found..");
			return false;
		}else {
			System.out.println("Hotel added successfully..");
			return true;
		}
	}
	public static void main(String[] args) {

		HotelReservation hotelResrv = new HotelReservation();

		System.out.println("Welcome to Hotel Reservation Program");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Hotel Name : ");
		String hotelName = sc.next();
		System.out.print("Enter rates for regular Customer : ");
		double regularCustRate = sc.nextDouble();
		hotelResrv.addHotelwithRegularRates(new Hotel(hotelName, regularCustRate));
	}

}
