package com.jsp.expensetracker.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.expensetracker.entity.User;
import com.jsp.expensetracker.service.UserService;
import com.jsp.expensetracker.service.UserServiceImpl;
import com.mysql.cj.Session;


@WebServlet("/Login")
public class Login extends HttpServlet {
	
	private UserService userservice=new UserServiceImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		User user=userservice.login(username,password);
		PrintWriter writer=response.getWriter();
		//Acesssession object
		HttpSession session=request.getSession();
		if(user!=null)
		{
			//request.setAttribute("userInfo", user);
			//transfer data with the help of session
			session.setAttribute("userInfo", user);
			request.setAttribute("msg", "LOGIN SUCESSFULL!!");
			RequestDispatcher dispatcher=request.getRequestDispatcher("Home.jsp");
			dispatcher.include(request, response);
			
		}
		else
		{
			request.setAttribute("msg","PLEASE ENTER VALID CREDENTIALS");
			RequestDispatcher dispatcher=request.getRequestDispatcher("Login.jsp");
			dispatcher.include(request, response);
			
		}
	}

}
