<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>

<%@page import="com.jsp.expensetracker.entity.Expense"%>
<%@page import="com.jsp.expensetracker.entity.User"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Total Expenses</title>
<script src="https://kit.fontawesome.com/c51795afff.js"
	crossorigin="anonymous"></script>
<link rel="icon" href="media/expenses-removebg-preview (1).png">
<style>
table {
	margin-top: 90px;
	background-color: pink;
	border-style: none;
	border: 3px solid lightgrey;
}

td {
	text-align: center;
	background-color: white;
	border: 3px solid lightgrey;
	padding: 10px;
	border-top-color: rgba(153, 50, 204, 0.6);
	border-bottom-color: rgba(153, 50, 204, 0.6);
}

thead tr {
	border: 3px solid lightgrey;
	background-color: rgba(15, 50, 204, 0.6);
	align: center;
	color: white;
	letter-spacing: 1px;
	font-size: 20px;
	height: 40px;
	border-top-color: rgba(153, 50, 204, 0.6);
	border-bottom-color: rgba(153, 50, 204, 0.6);
}

body {
	background-image: url(media/bg.png);
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-position: center;
	background-size: cover;
}

* {
	margin: 0%;
	padding: 0%;
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

#abc, #home {
	width: 70px;
	height: 70px;
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

button {
	border-style: none;
	color: white;
	height: 30px;
	width: 90px;
	border-radius: 20px;
	font-size: 15px;
}

#ima {
	height: 200px;
	width: 300px;
	margin-top: 100px;
	display: none;
}

#meg, #mega, #meeg {
	margin-top: 20px;
	color: gray;
}

#bck {
	height: 40px;
	width: 300px;
	background-color: rgba(0, 0, 255, 0.8);
	color: white;
	border-radius: 20px;
	font-size: medium;
	font-weight: bold;
	letter-spacing: 1px;
}

#bck:hover {
	width: 340px;
	background-color: blue;
	box-shadow: 3px 3px 2px 2px white;
}
</style>
</head>
<body>
	<div id="header">
		<div id="titlecon">
			<img alt="" src="logo.png" id="abc"> <label id="heading">Spring
				Expenses Tracker</label>
		</div>
		<div id="homecon">
			<a href="Home.jsp"><img alt="" src="home.png" id="home"></a>
		</div>
		<div id="iconcon"></div>
	</div>
	<%
	User user = (User) session.getAttribute("userInfo");
	%>
	<center>
		<%
		String popup = (String) request.getAttribute("processMsg");
		Double result = (Double) request.getAttribute("result");
		if (popup != null && result != null) {
		%>
		<script>alert('CALUCLATION IN PROGRES !!');
</script>
		<%
		}
		%>

		<%
		Date startDate = (Date) request.getAttribute("startdate");
		Date endDate = (Date) request.getAttribute("enddate");
		%>
		
		

		<table width="1100px" id="tbl">
			<thead>
				<tr>
					<th colspan="6"><b><%=user.getUsername()%> Expenses
							Details</b></th>
				</tr>
				<tr>

					<th colspan="6" align="center">START DATE : <%=startDate%>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; END DATE :
						<%=endDate%></th>
				</tr>


				<tr>
					<th>SNO</th>
					<th>DATE</th>
					<th>AMOUNT</th>
					<th>CATEGORY</th>
					<th>DESCRIPTION</th>
					<th>ACTION</th>
				</tr>
			</thead>

			<tbody>
				<%
				System.out.println("sd" + startDate);
				System.out.println("ed" + endDate);
				int count = 0;
				List<Expense> listOfExpenses = (List) request.getAttribute("list");
				System.out.println("vte " + listOfExpenses);
				if (listOfExpenses != null) {
					int n = 0;
					for (Expense e : listOfExpenses) {
						System.out.println(e.getDate());
						if (e.getDate().after(startDate) && e.getDate().before(endDate) ||e.getDate().equals(startDate)||e.getDate().equals(endDate)) {
					count++;
				%>
				<tr>
					<td><b><%=++n%></b></td>
					<td><i><%=e.getDate()%></i></td>
					<td><b>&#8377; <%=e.getAmount()%></b></td>
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

				</tr><%
				}
				}
				}
				if(count==0)
				{%>
					<h2 id="meg">
					Hello
					<%=user.getUsername()%>
					, It seems that you don't have added any expense details between
					given dates
				</h2>
				<h4 id="mega" style="padding: 8px;">CLICK BELOW BUTTON TO ADD ANY
					EXPENSE DETAILS</h4>
				<button
					style="color: white; background-color: rgba(0, 0, 255, 0.6); height: 38px; width: 210px;"
					id="meeg">
					<a href="addExpense.jsp"
						style="text-decoration: none; color: white;">+ ADD EXPENSE
						DETAILS</a>
				</button>
				<script>
 			document.getElementById("tbl").style.display="none";
 			
			document.getElementById("output").style.display="none";
 		</script>
				<% }
				if (result != null) {
				%>
				<tr>
					<td colspan="6"><b id="output"
						style="color: blue; font-size: 21px;"><%=popup%><%=result%></b></td>
				</tr>
				<%
				}
				%>
				</tbody>
		</table>
		
		<button id="bck">
			<a href="ViewExpense" style="text-decoration: none; color: white;"><i
				class="fa fa-solid fa-eye" type="button"></i> VIEW ALL EXPENSES</a>
		</button>
	</center>

	<%
	String alm = (String) request.getAttribute("mess");
	if (alm != null) {
	%>
	<script>alert('<%=alm%>
		')
		window.location.href = "TotalExpense";
	</script>
	<%
	}
	%>




</body>
</html>