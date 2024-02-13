package com.jsp.Hotel.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.Hotel.Entity.Admin;
import com.jsp.Hotel.Entity.UserInformation;
import com.jsp.Hotel.Repository.AdminRepository;
import com.jsp.Hotel.Repository.UserRepository;

@Component
public class AdminDaoImpl implements AdminDao {
	@Autowired
	private AdminRepository adminRepository;
	@Autowired
	private UserRepository userRepository;

	@Override
	public Admin adminLogin(String emailid, String password) {
		// TODO Auto-generated method stub
		return adminRepository.findByAdminemailidAndAdminpassword(emailid, password);

	}

	@Override
	public List<UserInformation> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public UserInformation getUserById(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).orElse(new UserInformation());
	}

	@Override
	public UserInformation getAllUsersById(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).orElse(new UserInformation());
	}

	@Override
	public UserInformation updateUserDetails(UserInformation information) {
		// TODO Auto-generated method stub
		return userRepository.save(information);
	}

}
