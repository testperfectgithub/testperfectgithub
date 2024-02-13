package com.jsp.Hotel.Dao;

import com.jsp.Hotel.Entity.UserInformation;

public interface UserDao {
	UserInformation userRegistration(UserInformation userinformation);
	UserInformation userLogin(String emailid,String password);
	

}
