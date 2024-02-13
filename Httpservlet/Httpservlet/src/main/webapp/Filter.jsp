<%@page import="com.jsp.expensetracker.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="https://kit.fontawesome.com/c51795afff.js" crossorigin="anonymous"></script>
<link rel="icon" href="logo.png">
<title>Expenses Tracker</title>
<style>
* {
	margin: 0%;
	padding: 0%;
}
body
{
background-color: darkgray;
}
.header {
	margin: 0px;
	padding: 0px;
	height: 90px;
	width: 100%;
	background-color: rgba(153, 50, 204, 0.6);
}

div b {
	position: absolute;
	top: 5%;
	left: 8%;
	font-size: 25px;
}


.mab {
	margin-top: 20px;
	width: 70%;
	border-radius: 10px;
	height: 550px;
	border: 5px solid #afeeee;
	
}


h3, i {
	font-weight: 24px;
	letter-spacing: 9px;
	font-size: 38px;
	padding-top: 7px;
}

input, select {
	height: 40px;
	width: 50%;
	border-radius: 10px;
	padding: 8px;
	color: blueviolet;
	font-size: 25px;
	font-style: oblique;
	border-style: none;
	background-color:white;
	outline:none;
	text-align:center;
}

input::placeholder {
	color: blueviolet;
	font-style: oblique;
	padding-left: 20px;
	
}
input:hover,select:hover
{
	border:5px solid blue;
}
h4 {
	font-size: 20px;
}
select
{
height:50px;
}
.bttt {
	height: 46px;
	width: 120px;
	background-color: blue;
	color: white;
	font-size: large;
	font-weight: bold;
	letter-spacing: 2px;
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
</style>
</head>
<form method="get" action="FilterExpenses">
<body style="overflow: hidden;">
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
		<div id="iconcon"></div>
	</div>
	<center>
		<div class="mab">
			<h3>
				<i class="fa-solid fa-filter" style="color: grey;"></i>Filter
				Expenses
			</h3>
			<br> <br>
			
				<label><h2>Select Date</h2></label><br> <input type="date"
					required placeholder="dd-mm-yyyy" name="date" class="input"> <br> <br>
				<label><h2>Select Category</h2></label><br> <input type="text"
					list="sub" name="category" placeholder="category" class="input">
				<datalist id="sub">
					<option>Utilities</option>
					<option>Transportation</option>
					<option>Groceries</option>
					<option>Dining out</option>
					<option>Entertainment</option>
					<option>HealthCare</option>
					<option>Education</option>
					<option>PersonalCare</option>
					<option>Clothing</option>
					<option>HomeMaintainance</option>
					<option>Gifts&Donations</option>
					<option>Saving&investments</option>
					<option>Tax</option>
					<option>Others</option>
				</datalist>
				<br> <br> <label><h2>Select Amount</h2></label><br> <select
					name="amount" class="input">
					<option>-Select-</option>
					<option>100-500</option>
					<option>500-1500</option>
					<option>1500-2500</option>
					<option>2500-4000</option>
				</select> <br> <br> 
				<input type="submit" value="Filter" class="bttt">&nbsp;&nbsp;&nbsp;&nbsp; 
				<input type="reset" value="Reset" class="bttt">
			
		</div>
	</center>
</form>
</body>

</html>