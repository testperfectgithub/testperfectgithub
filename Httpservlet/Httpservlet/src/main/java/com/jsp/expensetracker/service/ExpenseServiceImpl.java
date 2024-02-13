package com.jsp.expensetracker.service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

import com.jsp.expensetracker.dao.ExpenseDao;
import com.jsp.expensetracker.dao.ExpenseDaoImpl;
import com.jsp.expensetracker.entity.Expense;
public class ExpenseServiceImpl implements ExpenseService{
	private ExpenseDao expenseDao=new ExpenseDaoImpl();
	@Override
	public int addExpense(Expense expense, int userid) {
		try {
			return expenseDao.addExpense(expense,userid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	@Override
	public List<Expense> viewExpense(int userid) {
		try {
			System.out.println("hello");
			return expenseDao.viewExpense(userid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public Expense findExpenseById(int expenseid) {
		try {
			return expenseDao.findExpenseById(expenseid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public int updateExpense(Expense expense, int expenseid) {
		try {
			return expenseDao.updateExpense(expense, expenseid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	@Override
	public int deleteExpenseById(int expenseid) {
		try {
			return expenseDao.deleteExpenseById(expenseid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	@Override
	public double caluclateTotalExpenses(Date startDate, Date endDate, int userId) {
		try {
			return expenseDao.caluclateTotalExpenses(startDate, endDate, userId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	@Override
	public List<Expense> filterExpenseByCategory(String category, int userid) {
		try {
			
			return expenseDao.viewExpense(userid).stream().filter(t -> t.getCategory().equals(category))
					.collect(Collectors.toList());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public List<Expense> filterExpenseByAmountRange(int start, int end, int userId) {
		try {
			return expenseDao.viewExpense(userId).stream().filter(t -> t.getAmount() >= start && t.getAmount() <= end)
					.collect(Collectors.toList());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


}
