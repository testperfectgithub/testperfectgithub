package com.jsp.expensetracker.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.expensetracker.entity.User;
import com.jsp.expensetracker.service.ExpenseService;
import com.jsp.expensetracker.service.ExpenseServiceImpl;


@WebServlet("/DeleteExpense")
public class DeleteExpense extends HttpServlet {
	
	private ExpenseService expenseService=new ExpenseServiceImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String eid=request.getParameter("exId");
		if(eid!=null) {
		int expenseId=Integer.parseInt(eid);
		int res=expenseService.deleteExpenseById(expenseId);
		
		if(res!=0)
		{
			request.setAttribute("sucess", "RECORD DELETED SUCCESSFULLY...");
			HttpSession session = request.getSession();
			User user =(User)session.getAttribute("userInfo");
			request.setAttribute("list", expenseService.viewExpense(user.getUserid()));
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("viewExpenses.jsp");
			dispatcher.include(request, response);
		}
		}
	}

}
