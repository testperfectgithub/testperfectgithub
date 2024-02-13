<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@page import="com.jsp.expensetracker.entity.Expense"%>
<%@page import="com.jsp.expensetracker.entity.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://kit.fontawesome.com/c51795afff.js" crossorigin="anonymous"></script>
<style>
@charset "ISO-8859-1";

* {
	margin: 0px;
	padding: 0px;
}

#header {
	width: 100%;
	height: 100px;
	background-color: orchid;
	display: flex;
	align-items: center;
	justify-content: space-evenly;
}

#titlecon {
	width: 40%;
	height: 100%;
	display: flex;
	align-items: center;
	justify-content: start;
}
#titlecon label
{
	text-decoration:none;
}
#homecon {
	width: 30%;
	height: 100%;
	display: flex;
	align-items: center;
	justify-content: center;
}

#iconcon {
	width: 30%;
	height: 100%;
	display: flex;
	align-items: center;
	justify-content: space-around;
}

#abc, #home, #settingsimg {
	width: 70px;
	height: 70px;
}

#settingsimg {
	position: relative;
	left: 120px;
}

#abc {
	position: relative;
	left: 50px;
}

#heading {
	position: relative;
	left: 50px;
	font-size: 30px;
	font-weight: bold;
}

.table {
	width: 1100px;
	position: absolute;
	left: 250px;
	top: 150px;
}

table {
	width: 1100px;
	background-color:pink;
	border: 2px;
	text-align: center;
}

th{
	padding: 10px;
	border:3px solid lightgrey;
}
td
{
	background-color:rgba(15, 50, 204,0.6);
	align:center;
	color:white;
	letter-spacing:1px;
	font-size:20px;
	padding: 10px; 
	border:3px solid lightgrey; 
}

tr:hover {
	background-color: yellow;
	border: 2px;
}

#heading {
	font-size: 30px;
	text-shadow: 2px 2px 2px 2px red;
	text-decoration: underline;
	text-align: center;
}

button {
	border-style: none;
	color: white;
	height: 30px;
	width: 90px;
	border-radius: 20px;
	font-size: 15px;
}
#meg, #mega, #meeg {
	margin-top: 20px;
	color: gray;
	text-align:center;
}
.dropdown {
	position: relative;
	display: inline-block;
}

/* Dropdown Content (Hidden by Default) */
.dropdown-content {
	display: none;
	position: absolute;
	background-color: #f1f1f1;
	min-width: 160px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
	left: 1300px;
	top: 70px;
}

/* Links inside the dropdown */
.dropdown-content a {
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
}

/* Change color of dropdown links on hover */
.dropdown-content a:hover {
	background-color: #ddd;
}

/* Show the dropdown menu on hover */
.dropdown:hover .dropdown-content {
	display: block;
}
</style>
</head>
<body>

	<%
	User user = (User) session.getAttribute("userInfo");
	
	%>
	<div id="header">
		<div id="titlecon">
			<img alt="" src="logo.png" id="abc"> <label id="heading">Spring
				Expenses Tracker</label>
		</div>
		<div id="homecon">
			<a href="Home.jsp"><img alt="" src="home.png" id="home"></a>
		</div>
		<div id="iconcon">
			
		</div>
	</div>
	
			<a href="addExpense.jsp"
				style="text-decoration: none; color: white;">+ ADD EXPENSE
				DETAILS</a>
		</button>
	<center>
		<label id="heading">Expenses Details</label>
	</center>
	<div class="table">
		
		<table cellspacing="0px" border="2px" id="table">
			<tr>
				<th>Sr.No</th>
				<th>Date</th>
				<th>Amount</th>
				<th>Category</th>
				<th>Description</th>
				<th>Action</th>
			</tr>
			<%
			int count = 0;
			List<Expense> listOfExpenses = (List) request.getAttribute("list");
			System.out.println("expense"+listOfExpenses);
			
			if (listOfExpenses != null && !listOfExpenses.isEmpty()) {
				System.out.println("hello");
				int n = 0;
				for (Expense e : listOfExpenses) {
					count++;
			%>
			<tr>
				<td><b><%=++n%></b></td>
				<td><i><%=e.getDate()%></i></td>
				<td><b>&#8377;<%=e.getAmount()%></b></td>
				<td><%=e.getCategory()%></td>
				<td><%=e.getDescription()%></td>
				<td><center>
						<button type="submit" class="ud"
							style="background-color: rgba(0, 0, 255, 0.7);">
							<i class="fa-solid fa-pencil "></i> <a
								href="updateExpense.jsp?exId=<%=e.getExpenseid()%>"
								style="text-decoration: none; color: white;">Update</a>
						</button>
						&nbsp; &nbsp;&nbsp;
						<form method="post" action="DeleteExpense"
							style="display: inline;">
							<input value=<%=e.getExpenseid()%> hidden=true name="exId">
							<button type="submit" class="de"
								style="background-color: rgba(255, 0, 0, 0.7);">
								<i class="fa-solid fa-trash"></i> Delete
							</button>
						</form>
					</center></td>
			</tr>
			
			<%
			}
				%>	</table><%
				if(request.getAttribute("sucess")!=null)
				{
					%><h3 style="color:green;"><center><%=request.getAttribute("sucess") %></center></h3><%
				}
				
			} 
			else {
			%>
			<script>
			document.getElementById("table").style.display="none";
			</script>
		<h2 id="meg">
			Hello
			<%=user.getUsername()%>
			, It seems that you don't have added any expense details between
			given dates
		</h2>
		<h4 id="mega" style="padding: 8px;">CLICK BELOW BUTTON TO ADD ANY
			EXPENSE DETAILS</h4>
		<button
			style="color: white;margin-left:40%; background-color: rgba(0, 0, 255, 0.6); height: 38px; width: 210px;"
			id="meeg">
			<a href="addExpense.jsp"
				style="text-decoration: none; color: white;">+ ADD EXPENSE
				DETAILS</a></button>
		<%
		
		}
		%>

	</div>
	<div id="footer"></div>

</body>
</html>