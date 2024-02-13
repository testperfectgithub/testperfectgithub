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


@WebServlet("/UpdateExpense")
public class UpdateExpense extends HttpServlet {
	private ExpenseService expenseService=new ExpenseServiceImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int expenseid=Integer.parseInt(request.getParameter("eId"));
		Expense expense=new Expense();
		expense.setAmount(Double.parseDouble(request.getParameter("amount")));
		expense.setCategory(request.getParameter("category"));
		expense.setDate(Date.valueOf(request.getParameter("date")));
		expense.setDescription(request.getParameter("description"));
		
		int status=expenseService.updateExpense(expense, expenseid);
		if(status!=0)
		{
			HttpSession session=request.getSession();
			User user=(User) session.getAttribute("userInfo");
			List<Expense> list=expenseService.viewExpense(user.getUserid());
			request.setAttribute("list", list);
			request.setAttribute("sucess", "Updated Sucessfully..");
			RequestDispatcher dispatcher=request.getRequestDispatcher("viewExpenses.jsp");
			dispatcher.include(request, response);
		}
		else
		{
			request.setAttribute("msg", "PLEASE ENTER VALID DETAILS");
			RequestDispatcher dispatcher=request.getRequestDispatcher("updateExpense.jsp");
			dispatcher.include(request, response);
		}

	}

	

}
