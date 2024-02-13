package com.jsp.expensetracker.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.jsp.expensetracker.entity.*;
import com.jsp.expensetracker.service.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Registration")
public class Registration extends HttpServlet{
	private UserService userservice=new UserServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//super.doPost(req, resp);
		String fullname=req.getParameter("fullname");
		String username=req.getParameter("username");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String pass=req.getParameter("pass");
		String cpass=req.getParameter("cpass");
		User user=new User();
		user.setFullname(fullname);
		user.setUsername(username);
		user.setEmail(email);
		user.setMobile(mobile);
		user.setPassword(pass);
		
		int userid=userservice.register(user,cpass);
		
		PrintWriter writer=resp.getWriter();
		

		if(userid!=0)
		{
			RequestDispatcher dispatcher=req.getRequestDispatcher("Login.jsp");
			dispatcher.include(req, resp);
			writer.print("<h1><center>Registration succeful..</h1></center>");
			
		}
		else
		{
			RequestDispatcher dispatcher=req.getRequestDispatcher("Register.jsp");
			dispatcher.include(req, resp);
			writer.print("<h1><center>Please Enter Valid Details</center></h1>");
		}
	}
}
