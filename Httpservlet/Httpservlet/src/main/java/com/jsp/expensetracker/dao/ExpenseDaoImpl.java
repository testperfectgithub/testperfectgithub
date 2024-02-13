package com.jsp.expensetracker.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.expensetracker.entity.Expense;
import com.jsp.expensetracker.utility.SingletonClass;

public class ExpenseDaoImpl  implements ExpenseDao{
	private Connection conn=SingletonClass.getSingletonClassObject().getConnection();
	private PreparedStatement pstmt;
	

	@Override
	public int addExpense(Expense expense,int userid) throws SQLException {
		String query="insert into expenses(amount,category,description,date,userid)"
				+"values(?,?,?,?,?)";
		
		
			pstmt=conn.prepareStatement(query);
			pstmt.setDouble(1, expense.getAmount());
			pstmt.setString(2, expense.getCategory());
			pstmt.setString(3, expense.getDescription());
			pstmt.setDate(4, expense.getDate());
			pstmt.setInt(5, userid);
			int status=pstmt.executeUpdate();
			if(status!=0)
			{
				String selectQuery="select Last_Insert_Id()";
				pstmt=conn.prepareStatement(selectQuery);
				ResultSet rs=pstmt.executeQuery();
				if(rs.isBeforeFirst())
				{
					rs.next();
					int expenseId=rs.getInt(1);
					return expenseId;
				}
			}
		
		
		return 0;
	}


	@Override
	public List<Expense> viewExpense(int userid) throws Exception {
		String query="select * from expenses where userid=?";
		pstmt=conn.prepareStatement(query);
		pstmt.setInt(1, userid);
		ResultSet rs=pstmt.executeQuery();
		List<Expense> expenseList=new ArrayList<Expense>();
		if(rs.isBeforeFirst())
		{
			System.out.println("records found");
			
			while(rs.next())
			{
				Expense expense=new Expense();
				expense.setAmount(rs.getDouble("amount"));
				expense.setCategory(rs.getString("category"));
				expense.setDate(rs.getDate("date"));
				expense.setDescription(rs.getString("description"));
				expense.setExpenseid(rs.getInt("expenseid"));
				expenseList.add(expense);
				System.out.println(expenseList);
				
				
			}
			return expenseList;
		}
		return null;
	}


	@Override
	public Expense findExpenseById(int expenseid) throws Exception {
		String query="select * from expenses where expenseid=?";
		pstmt=conn.prepareStatement(query);
		pstmt.setInt(1, expenseid);
		ResultSet rs=pstmt.executeQuery();
		if(rs.isBeforeFirst())
		{
			rs.next();
			Expense expense=new Expense();
			expense.setAmount(rs.getDouble("amount"));
			expense.setCategory(rs.getString("category"));
			expense.setDate(rs.getDate("date"));
			expense.setDescription(rs.getString("description"));
			expense.setExpenseid(rs.getInt("expenseid"));
			return expense;
		}
		return null;
	}


	@Override
	public int updateExpense(Expense expense, int expenseid) throws Exception {
		String query="update expenses set amount=?,description=?,date=?,category=?  where expenseid=?";
		pstmt=conn.prepareStatement(query);
		pstmt.setDouble(1, expense.getAmount());
		pstmt.setString(2, expense.getDescription());
		pstmt.setDate(3, expense.getDate());
		pstmt.setString(4, expense.getCategory());
		pstmt.setInt(5, expenseid);
		int status=pstmt.executeUpdate();
		return status;
	}


	@Override
	public int deleteExpenseById(int expenseid) throws Exception {
		String query="delete from expenses where expenseid=?";
		pstmt=conn.prepareStatement(query);
		pstmt.setInt(1, expenseid);
		int status=pstmt.executeUpdate();
		return status;
	}


	@Override
	public double caluclateTotalExpenses(Date startDate, Date endDate, int userId) throws Exception {
		String query="select * from expenses where date>=?  and  date<=? and  userid=?";
		pstmt=conn.prepareStatement(query);
		pstmt.setDate(1,startDate);
		pstmt.setDate(2, endDate);
		pstmt.setInt(3, userId);
		double sum=0.0;
		ResultSet res=pstmt.executeQuery();
		if(res.isBeforeFirst())
		{
			while(res.next())
			{
			sum+=res.getDouble("amount");

			}
		}
		return sum;
	}


	


}
