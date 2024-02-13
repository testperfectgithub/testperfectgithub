package com.jsp.expensetracker.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//the class for which programmer can create only one object
//to establish the connection
public class SingletonClass {

	private static SingletonClass stc;
	private Connection conn;
	private SingletonClass()
	{
		
	}
	
	public static SingletonClass getSingletonClassObject()
	{
		if(stc==null)
		{
			//create object of SingletonClass
			
			stc=new SingletonClass();
			System.out.println("object created...");
			return stc;
		}
		return stc;
	}
	public Connection getConnection()
	{
		String url="jdbc:mysql://localhost:3306/expensetracker?user=root&password=12345";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			System.out.println("connecton established..........");
			return conn;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}
}
