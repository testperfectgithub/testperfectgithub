package com.jsp.expensetracker.servlet;

import java.io.IOException;
import java.sql.Date;
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

@WebServlet("/AddExpense")
public class AddExpense extends HttpServlet {
	private ExpenseService expenseservice=new ExpenseServiceImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Expense expense=new Expense();
		expense.setAmount(Double.parseDouble(request.getParameter("amount")));
		expense.setCategory(request.getParameter("category"));
		expense.setDate(Date.valueOf(request.getParameter("date")));
		expense.setDescription(request.getParameter("description"));
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("userInfo");
		int expenseId=expenseservice.addExpense(expense,user.getUserid());
		//PrintWriter writer=response.getWriter();
		//writer.print("<h1>Expense Added Successfully,ExpenseId="+expenseId+"</h1>");
		if(expenseId!=0)
		{
			List<Expense> list=expenseservice.viewExpense(user.getUserid());
			//System.out.println(user.getUserid());
			request.setAttribute("list", list);
			request.setAttribute("sucess", "Details Added Sucessfully..");
			RequestDispatcher dispatcher=request.getRequestDispatcher("viewExpenses.jsp");
			dispatcher.include(request, response);
		}
		else
		{
			request.setAttribute("msg", "Enter valid Details");
			RequestDispatcher dispatcher=request.getRequestDispatcher("addExpense.jsp");
			dispatcher.include(request, response);
		}
	}

	

}
