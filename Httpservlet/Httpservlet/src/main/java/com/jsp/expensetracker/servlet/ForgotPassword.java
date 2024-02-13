package com.jsp.expensetracker.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.expensetracker.service.UserService;
import com.jsp.expensetracker.service.UserServiceImpl;


@WebServlet("/ForgotPassword")
public class ForgotPassword extends HttpServlet {
	UserService service=new UserServiceImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String pass=request.getParameter("password");
		String cpass=request.getParameter("cpassword");
		if(pass==null && cpass==null)
		{
			String password = service.forgotPassword(email);
			if(password!=null)
			{
				request.setAttribute("msg", password);
				RequestDispatcher dispatcher=request.getRequestDispatcher("password.jsp");
				dispatcher.include(request, response);
			}
			else
			{
				request.setAttribute("msg", "Enter Correct Email Id");
				RequestDispatcher dispatcher=request.getRequestDispatcher("password.jsp");
				dispatcher.include(request, response);
			}
		}
		else
		{
			System.out.println("Entered");
			if(pass.equals(cpass))
			{
				System.out.println("same password");
				int status=service.updatedpassword(email,pass);
				if(status!=0)
				{
					request.setAttribute("msg", "password Updated Sucessfully");
					RequestDispatcher dispatcher=request.getRequestDispatcher("password.jsp");
					dispatcher.include(request, response);
				}
			}
			else
			{
				request.setAttribute("msg","Enter Both the Password Correctly");
				RequestDispatcher dispatcher=request.getRequestDispatcher("password.jsp");
				dispatcher.include(request, response);
			}
					
			
		}
	}

}
