<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	border: 0px;
	margin: 0px;
	background-color: lightgray;
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

.main {
	width: 70%;
	height: 70%;
	border: 10px solid #afeeee;
	position: relative;
	top: 100px;
	left: 300px;
	text-align: center;
	border-radius:20px;
}

input {
	width: 50%;
	height: 60px;
	text-align: center;
	font-size:20px;
	font-weight:bold;
	background-color:white;
	border:0px;
	outline:0px;
	border-radius:10px;
}
button
{
	width:30%;
	height:40px;
	text-align:center;
	background-color:blue;
	border-radius:10px;
	border:none;
	outline:none;
	margin-top:10px;
	color:white;
	font-size:20px;
	font-weight:bold;
}
input:hover
{
	border: 5px solid blue;
}

</style>
</head>
<body>
	<form method="post" action="TotalExpense">
		<div id="header">
	    <div id="titlecon">
	    <img alt="" src="logo.png" id="abc"> <label id="heading">Spring
			Expenses Tracker</label>
	    </div>
		<div id="homecon">
		 <a href="Home.jsp"><img alt="" src="home.png" id="home"></a>
		</div> 
		<div id="iconcon" >
			
		</div>
		</div>
		<div class="main">
			<h1>Total Expenses Counter</h1>
			<h2>Start Date</h2>
			<input type="date" name="sd"><br>
			<br>
			<h2>End Date</h2>
			<input type="date" name="ed"><br>
			<br>
			<button>Submit</button>
		</div>
	</form>
</body>
</html>