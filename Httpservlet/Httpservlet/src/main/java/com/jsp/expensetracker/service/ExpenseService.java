package com.jsp.expensetracker.service;

import java.sql.Date;
import java.util.List;

import com.jsp.expensetracker.entity.Expense;

public interface ExpenseService {
	int addExpense(Expense expense,int userid);
	List<Expense> viewExpense(int userid);
	int deleteExpenseById(int expenseid);
	Expense findExpenseById(int expenseid);
	int updateExpense(Expense expense,int expenseid);
	double caluclateTotalExpenses(Date startDate, Date endDate, int userId);
	List<Expense> filterExpenseByCategory(String category, int userid);
	List<Expense> filterExpenseByAmountRange(int start, int end, int userId);
}
