package com.jsp.expensetracker.service;

import java.io.InputStream;

import com.jsp.expensetracker.dao.UserDao;
import com.jsp.expensetracker.dao.UserDaoImpl;
import com.jsp.expensetracker.entity.User;

public class UserServiceImpl implements UserService{
	
	private UserDao userdao=new UserDaoImpl();//upcasting
	@Override
	public int register(User user, String cpassword) {
		//System.out.println("user Srvice");
		if(user.getPassword().equals(cpassword))
		{
			//System.out.println("if executed");
			try {
				int userid=userdao.register(user);
				System.out.println("service layer userid="+userid);
				return userid;
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
		return 0;
	}
	@Override
	public User login(String username, String password) {
		System.out.println("userservice");
		try {
			return userdao.login(username, password);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public String forgotPassword(String email) {
		try {
			return userdao.forgotPassword(email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public User findUserById(int id) {
		try {
			return userdao.findUserById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public int UpdateUserProfile(User user, InputStream is)  {
		try {
			return userdao.UpdateUserProfile(user, is);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	@Override
	public int updatedpassword(String email, String pass) {
		try {
			return userdao.updatePassword(email, pass);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return 0;
	}

}
