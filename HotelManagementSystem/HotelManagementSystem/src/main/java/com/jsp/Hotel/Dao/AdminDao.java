package com.jsp.Hotel.Dao;

import java.util.List;

import com.jsp.Hotel.Entity.Admin;
import com.jsp.Hotel.Entity.UserInformation;

public interface AdminDao {
Admin adminLogin(String emailid,String password);
List<UserInformation> getAllUser();
UserInformation getUserById(int id);
UserInformation getAllUsersById(int id);
UserInformation updateUserDetails(UserInformation information);
     



}
