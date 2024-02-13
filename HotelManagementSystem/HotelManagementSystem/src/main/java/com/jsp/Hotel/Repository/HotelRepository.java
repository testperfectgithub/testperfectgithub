package com.jsp.Hotel.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.jsp.Hotel.Entity.HotelInformationn;

public interface HotelRepository extends JpaRepository<HotelInformationn, Integer>{
	@Query("select hotel from HotelInformationn hotel where hotel.city like %?1% or hotel.address like %?1%")
List<HotelInformationn>findByCity(String city);
}
