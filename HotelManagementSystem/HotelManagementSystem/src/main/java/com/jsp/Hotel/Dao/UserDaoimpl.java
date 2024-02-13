package com.jsp.Hotel.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.Hotel.Entity.UserInformation;
import com.jsp.Hotel.Repository.HotelRepository;
import com.jsp.Hotel.Repository.UserRepository;

@Component
public  class UserDaoimpl implements UserDao {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private HotelRepository hotelRepository;
	@Override
	public UserInformation userRegistration(UserInformation userinformation) {
		// TODO Auto-generated method stub
		return userRepository.save(userinformation);
	}
	@Override
	public UserInformation userLogin(String emailid, String password) {
		// TODO Auto-generated method stub
		return userRepository.findByEmailidAndPassword(emailid, password);
	}

	
	

	
		
	}