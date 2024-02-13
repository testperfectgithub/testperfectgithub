package com.jsp.Hotel.Dao;

import java.util.List;
import java.util.Optional;

import com.jsp.Hotel.Entity.HotelInformationn;



public interface HotelDao {
	List<HotelInformationn> getAllHoteldetails();

	List<HotelInformationn> getHotelDetailsByCity(String city);

	HotelInformationn getHotelById(int hotelid);
	//HotelInformationn hotelRegistration(HotelInformationn hotelInformationn);

	HotelInformationn hotelRegistration(HotelInformationn hotelInformationn);

List<HotelInformationn>	getAllHotel();

	//Optional<HotelInformationn> getHotelById(int hotelid);

	//HotelInformationn getHotelById(int hotelid);

	

//	List<HotelInformationn> getHotelDetailsByCity(String city);

	

	
	
	
}
