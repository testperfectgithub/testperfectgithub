package com.jsp.Hotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Hotel.Entity.UserInformation;

public interface UserRepository extends JpaRepository<UserInformation, Integer> {

	UserInformation findByEmailidAndPassword(String emailid, String password);

	

}
