package com.jsp.Hotel.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.Hotel.Entity.HotelInformationn;
import com.jsp.Hotel.Repository.HotelRepository;


@Component
public class HotelDaoImpl implements HotelDao {
@Autowired
	private HotelRepository hotelRepository;
	@Override
	public List<HotelInformationn> getAllHoteldetails() {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}
	@Override
	public List<HotelInformationn> getHotelDetailsByCity(String city) {
		// TODO Auto-generated method stub
		return hotelRepository.findByCity(city);
	}
	@Override
	public HotelInformationn getHotelById(int hotelid) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(hotelid).get();
	}
	
public HotelInformationn hotelRegistration(HotelInformationn hotelInformationn) {
	return hotelRepository.save(hotelInformationn);
	
}
@Override
public List<HotelInformationn> getAllHotel() {
	// TODO Auto-generated method stub
	return hotelRepository.findAll();
}
	

	
	

}