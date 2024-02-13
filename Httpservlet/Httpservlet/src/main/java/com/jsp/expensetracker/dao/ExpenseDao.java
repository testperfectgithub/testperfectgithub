package com.jsp.expensetracker.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.jsp.expensetracker.entity.Expense;

public interface ExpenseDao {
	
	int addExpense(Expense expense,int userid) throws SQLException;
	List<Expense> viewExpense(int userid) throws Exception;
	int deleteExpenseById(int expenseid) throws Exception;
	Expense findExpenseById(int expenseid)throws Exception;
	int updateExpense(Expense expense,int expenseid)throws Exception;
	double caluclateTotalExpenses(Date startDate,Date endDate,int userId) throws Exception;
	
	
}
