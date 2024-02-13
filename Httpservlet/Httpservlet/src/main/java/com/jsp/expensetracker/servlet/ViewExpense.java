package com.jsp.expensetracker.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.expensetracker.entity.Expense;
import com.jsp.expensetracker.entity.User;
import com.jsp.expensetracker.service.ExpenseService;
import com.jsp.expensetracker.service.ExpenseServiceImpl;


@WebServlet("/ViewExpense")
public class ViewExpense extends HttpServlet {
	private ExpenseService expenseservice=new ExpenseServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("dopost");
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("userInfo");
		System.out.println(user.getUserid());
		List<Expense> listOfExpense=expenseservice.viewExpense(user.getUserid());
		System.out.println(listOfExpense);
		request.setAttribute("list", listOfExpense);
		RequestDispatcher dispatcher=request.getRequestDispatcher("viewExpenses.jsp");
		dispatcher.include(request, response);
		
	}

	

}
