package com.jsp.expensetracker.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.expensetracker.entity.User;
import com.jsp.expensetracker.utility.SingletonClass;

public class UserDaoImpl implements UserDao{
	private Connection conn=SingletonClass.getSingletonClassObject().getConnection();
	private PreparedStatement pstmt;
	@Override
	public int register(User user) throws Exception {
			System.out.println("user registration");
			String  insert="insert into user"+"(username,fullname,email,mobileno,password)"+ "values(?,?,?,?,?)";
			pstmt=conn.prepareStatement(insert);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getFullname());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getMobile());
			pstmt.setString(5, user.getPassword());
			int status=pstmt.executeUpdate();
			System.out.println("user status :"+status);
			if(status!=0)
			{
				String  select="select userid from user where email=?";
				pstmt=conn.prepareStatement(select);
				pstmt.setString(1, user.getEmail());
				ResultSet rs = pstmt.executeQuery();
				if(rs.isBeforeFirst())
				{
					rs.next();
					System.out.println("user id ="+rs.getInt("userid"));
					return rs.getInt("userid");
				}
				
			}
		
		
		return 0;
	}
	@Override
	public User login(String username, String password) throws Exception {
		System.out.println("user login");
		String query="select * from user where username=? and password=?";
		pstmt=conn.prepareStatement(query);
		pstmt.setString(1, username);
		pstmt.setString(2, password);
		ResultSet rs=pstmt.executeQuery();
		if(rs.isBeforeFirst())
		{
			rs.next();
			String un=rs.getString("username");
			String email=rs.getString("email");
			String mobile=rs.getString("mobileno");
			String fullname=rs.getString("fullname");
			String pwd=rs.getString("password");
			int id=rs.getInt("userid");
			User user=new User();
			user.setUsername(un);
			user.setEmail(email);
			user.setFullname(fullname);
			user.setMobile(mobile);
			user.setPassword(pwd);
			user.setUserid(id);
			return user;
		}
		return null;
	}
	@Override
	public User findUserById(int id) throws Exception {
		String query="select * from user where userid=?";
		pstmt=conn.prepareStatement(query);
		pstmt.setInt(1, id);
		ResultSet rs=pstmt.executeQuery();
		if(rs.isBeforeFirst())
		{
			rs.next();
			User user=new User();
			user.setEmail(rs.getString("email"));
			user.setFullname(rs.getString("fullname"));
			user.setMobile(rs.getString("mobileno"));
			user.setPassword(rs.getString("password"));
			user.setUsername(rs.getString("username"));
			user.setUserid(rs.getInt("userid"));
			return user;
			
		}
		return null;
	}
	@Override
	public String forgotPassword(String email) throws Exception {
		String query="select password from user where email=?";
		pstmt=conn.prepareStatement(query);
		pstmt.setString(1,email);
		ResultSet rs=pstmt.executeQuery();
		if(rs.isBeforeFirst())
		{
			rs.next();
			return rs.getString("password");
		}
		return null;
	}
	@Override
	public int UpdateUserProfile(User user, InputStream is) throws Exception {
		String query="update user set fullname=?,username=?,mobileno=?,email=?,password=?,image=? where userid=?";
		pstmt=conn.prepareStatement(query);
		pstmt.setString(1,user.getFullname());
		pstmt.setString(2,user.getUsername());
		pstmt.setString(3,user.getMobile());
		pstmt.setString(4,user.getEmail());
		pstmt.setString(5,user.getPassword());
		pstmt.setBlob(6,is);
		pstmt.setInt(7,user.getUserid());
		int status=pstmt.executeUpdate();
		System.out.println(status);
		return status;
	}
	@Override
	public int updatePassword(String email, String pass)throws Exception {
		String query="update user set password=? where email=?";
		pstmt=conn.prepareStatement(query);
		pstmt.setString(1,pass);
		pstmt.setString(2, email);
		int status=pstmt.executeUpdate();
		return status;
	}
	

}
