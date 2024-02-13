<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="addExpense.css">
<style>
@charset "ISO-8859-1";
body
	{
		margin:0;
		padding:0;
		background: rgb(60,58,180);
		background: linear-gradient(90deg, rgba(60,58,180,0.8240546218487395) 0%,
		 rgba(253,29,203,1) 50%, rgba(69,252,155,1) 100%);
	}

#footer{
    	width:100%;
    	height:80px;
    	background-color:black;
    	margin-top:167px;
	}
#header {
	width: 100%;
	height: 100px;
	background-color: orchid;
	display: flex;
	align-items: center;
	justify-content: space-evenly;
}
#titlecon{
width: 40%;
height: 100%;
display: flex;
align-items: center;
justify-content: start;}

#homecon{
width: 30%;
height: 100%;
display: flex;
align-items: center;
justify-content: center;}

#iconcon{
width: 30%;
height: 100%;
display: flex;
align-items: center;
justify-content: space-around;
}

#abc,#home,#settingsimg{
width: 70px;
height: 70px;
}
#settingsimg{
position: relative;
left: 120px;}

#abc{
 position: relative;
 left: 50px;
}
#heading{
position: relative;
 left: 50px;
 font-size: 30px;
 font-weight: bold;
}
.main
	{
		
		width:1000px;
		height:400px;
		background-color:#ef07bf;
		position:relative;
		left:250px;
		top:60px;
		border-radius:20px;
		
	}
.left
	{	
		padding-top:30px;
		width:400px;
		height:450px;
		
		float:left;
	}
.right
	{
		width:400px;
		float:right;
		text-align:center;
		align-items:center;
	}
.right input
	{	
		width:300px;
		height:35px;
		border-radius:20px;
		border:0px;
		outline:0;
		font-size:20px;
		text-align:center;
}

#desc
{	
	width:300px;
	height:100px;
	border-radius:10px;
	border:0px;
	outline:0;
	font-size:20px;
	text-align:center;
}

.right button
	{	
		width:100px;
		height:40px;
		border-radius:20px;
		border:0px;
		background-color:lime;
	}
.dropdown {
  position:relative;
  display:inline-block;
}

/* Dropdown Content (Hidden by Default) */
.dropdown-content {
  display:none;
  position:absolute;
  background-color:#f1f1f1;
  min-width:160px;
  box-shadow:0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index:1;
  left:1300px;
  top:70px;
}

/* Links inside the dropdown */
.dropdown-content a {
  color:black;
  padding:12px 16px;
  text-decoration:none;
  display:block;
}

/* Change color of dropdown links on hover */
.dropdown-content a:hover {background-color:#ddd;}

/* Show the dropdown menu on hover */
.dropdown:hover .dropdown-content {display:block;}
	
</style>
</head>
<body>
	<form method="post" action="AddExpense">
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
		<div class="main">
			<div class="left">
				<img alt="" src="folder.png">
			</div>
			<div class="right">
				<h3>Add Expenses</h3>
				<input type="text" placeholder="Amount" name="amount"><br>
				<br> <input type="date" name="date"><br>
				<br> <input type="text" placeholder="Category" name="category"
					list="sub"><br>
				<br>
				<datalist id="sub">
					<option>Utilities</option>
					<option>Transportation</option>
					<option>Groceries</option>
					<option>DiningOut</option>
					<option>Entertainment</option>
					<option>HealthCare</option>
					<option>Education</option>
					<option>PersonalCare</option>
					<option>Clothing</option>
					<option>Home Maintainance</option>
					<option>Gifts&Donations</option>
					<option>Saving&investments</option>
					<option>Tax</option>
					<option>Others</option>

				</datalist>

				<textarea placeholder="Description" id="desc" name="description"></textarea>
				<button>ADD+</button>
				
			</div>
		</div>
		<div id="footer"></div>
	</form>
</body>
</html>