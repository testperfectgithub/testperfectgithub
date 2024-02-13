package com.jsp.expensetracker.servlet;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.jsp.expensetracker.entity.User;
import com.jsp.expensetracker.service.UserService;
import com.jsp.expensetracker.service.UserServiceImpl;


@WebServlet("/UpdateProfile")
@MultipartConfig(maxFileSize = 16177215)
public class UpdateProfile extends HttpServlet {
	private UserService userService=new UserServiceImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String password=request.getParameter("password");
		User user=new User();
		user.setUsername(request.getParameter("username"));
		user.setFullname(request.getParameter("fullname"));
		user.setEmail(request.getParameter("email"));
		user.setMobile(request.getParameter("mobile"));
		user.setPassword(request.getParameter("password"));
		user.setUserid(Integer.parseInt(request.getParameter("id")));
		//to get image data
		Part part=request.getPart("image");
		System.out.println(part.getName());
		System.out.println(part.getSize());
		System.out.println(part.getContentType());
		
		InputStream is=part.getInputStream();
		int status=userService.UpdateUserProfile(user, is);
		System.out.println(status);
		
	}

}
