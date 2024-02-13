<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="CSS/Register.css">
<style>
body
{
margin:0px;
padding:0px;
background: radial-gradient(circle, rgba(17,224,61,1) 0%, rgba(239,213,7,1) 77%);
}
#header{
    	width: 100%;
    	height: 100px;
    	background-color:orchid;
	}
	#header label
	{
	
    	font-size: 30px;
    	font-weight: bold;
    	position: absolute;
    	left:70px;
    	top:30px;
	}
	.main{
		width:500px;
		background: linear-gradient(90deg, rgba(20,216,26,1) 28%, rgba(10,197,185,1) 63%);
		text-align:center;
		border-radius:20px;
		padding-top:10px;
		padding-bottom:3px;
		margin-left:500px;
		margin-top:20px;
		
	}
	input
	{
		width:450px;
		height:40px;
		padding-left:20px;
		border:0;
		outline:0px;
		border-radius:10px;
		font-size:20px;
		font-weight:bold;
	}
	#header img
	{
		width:50px;
		height:50px;
		position: absolute;
		left:25px;
		top:20px;
	}
</style>
</head>
<body>
	<form action="Registration" method="post">
		<div id="header">
		<img alt="" src="logo.png">
            <label>Spring Expenses Tracker</label>
            
        </div>
        <center><h2>CREATE ACCOUNT</h2></center>
		<div class="main">
			
			<input type="text" placeholder="Your Name" name="fullname" required><br><br>
			<input type="text" placeholder="Your Username" name="username" required><br><br>
			<input type="email" placeholder="Your Email" name="email" required><br><br>
			<input type="text" placeholder="your Mobile" name="mobile" required><br><br>
			<input type="password" placeholder="password" name="pass" required><br><br>
			<input type="password" placeholder="Repeat Your Password" name="cpass" required><br><br>
			<input type="submit" value="SIGN UP"><br>
			<h5>Have already an account?<a href="Login.jsp">Login here</a></h5>
		</div>
	</form>
</body>
</html>