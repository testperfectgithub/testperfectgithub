<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
* {
	padding: 0;
	margin: 0;
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

#settingsimg {
	width: 50px;
	height: 50px;
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

.main {
	position:absolute;
	top:30%;
	left:35%;
	width: 30%;
	border: 2px solid green;
	display: flex;
	flex-direction: column;
	justify-content: center;
	border-radius:20px;
	padding:30px;
}
input
{
	width:90%;
	height:40px;
	background-color:silver;
	border-radius:10px;
	border:none;
	outline:none;
	justify-content: center;
	text-align:center;
	font-size:20px;
	font-weight:bold;
}
.btn
{
	width:40%;
	height:40px;
	text-align:center;
	background-color:blue;
	border-radius:10px;
	border:none;
	outline:none;
	margin-left:25%;
	margin-top:10px;
	color:white;
	font-size:20px;
	font-weight:bold;
}
label
{
	font-size:20px;
}
</style>
<body>
	<form action="ForgotPassword" method="post">
		<div id="header">
			<div id="titlecon">
				<img alt="" src="logo.png" id="abc"> <label id="heading">Spring
					Expenses Tracker</label>
			</div>
			<div id="homecon">
				
			</div>
			<div id="iconcon">
			<a href="Login.jsp"> <img
			src="user.png" id="settingsimg"></a>
			</div>
		</div>
		
			<center><h1 style="margin-top:5%;">Forgot Password</h1></center>
			<div class="main">
				
				<label>Email Id</label> <input type="email" name="email">

				<%
				if (request.getAttribute("msg") == null) {

				} else if (request.getAttribute("msg") == "Enter Correct Email Id") {
				%>
				<h4 style="color: red"><%=request.getAttribute("msg")%></h4>
				<%
				} else {
				%>
				<div>
					<label>New Password</label> <input type="password" name="password">
					<label>Confirm password</label> <input type="password"
						name="cpassword">
				</div>
				<% 
				if(request.getAttribute("msg").equals("Enter Both the Password Correctly")||request.getAttribute("msg").equals("password Updated Sucessfully"))
				{
					
				%>
				<h4 ><%=request.getAttribute("msg")%></h4>
				<%
				}
				}
				%>
				<input type="submit" class="btn">
			</div>
		
	</form>
</body>
</html>