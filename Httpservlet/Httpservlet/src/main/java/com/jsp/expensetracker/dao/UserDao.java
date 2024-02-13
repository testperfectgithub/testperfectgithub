package com.jsp.expensetracker.dao;

import java.io.InputStream;

import com.jsp.expensetracker.entity.User;
//all database operation on user table
//data acess object
public interface UserDao {
	int register(User user) throws Exception;// return id of user after insertion data
	User login(String username,String password) throws Exception;
	User findUserById(int id) throws Exception;
	String forgotPassword(String email) throws Exception;
	int UpdateUserProfile(User user,InputStream is) throws Exception;
	int updatePassword(String email, String pass)throws Exception;
	
}
