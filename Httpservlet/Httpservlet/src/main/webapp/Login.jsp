<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	body
	{
		margin:0px;
		padding:0px;
		background: rgb(215,215,225);
		
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
	.main
	{
		width:400px;
		height:450px;
		border-radius:10px;
		position:relative;
		padding:10px 0px 10px 40px;
		align-items:center;
		background-color:white;
		left:500px;
		top:100px;
	}
	.parta
	{
		position: absolute;
		width:350px;
		height:80px;
		display:flex;
		
	}
	.partb
	{	
		position: absolute;
		width:350px;
		top:180px;
	}
	
	.partb input
	{
		width:330px;
		height:40px;
		margin-top:10px;
		border-radius:10px;
		outline:0px;
		border:0px;
		font-weight: bold;
		background-color: rgb(222, 225, 228);
	}
	.partb button
	{
		width:340px;
		height:40px;
		margin-top:10px;
		border-radius:10px;
		border:0px;
		background-color:black;
		color:white;
		font-weight: bold;
	}
	.parta div
	{
		width:150px;
		height:60px;
		border-radius:8px;
		
		
	}
	.last
	{
		position: absolute;
		top:400px;
		left:120px;
	}
	.main h1
	{
		margin-left:80px;
	}
	.part a
	{
		top:40px;
	}
	#abc
	{	
		margin-left:20px;
		backgroundcolor:white;
		
		position:relative;
		border:3px solid rgba(222, 225, 228,0.4);
		
	}
	#abc1
	{
		background-color: darkblue;
		position:relative;
	}
	#abc a,#abc1 a
	{
		position:absolute;
		left:45%;
		top:30%;
		color:black;
		font-weight: 500;
	}
	#abc1 a
	{
		color:white;
	}
	#abc img
	{
		width:30px;
		height:30px;
		position:absolute;
		left:25px;
		top:12px;
		text-decoration: none;
	}
	#abc1 img
	{
		width:50px;
		height:50px;
		position:absolute;
		left:25px;
		top:5px;
		text-decoration: none;
	}
	small
	{
	font-weight: bold;
	}
	small a
	{
		color:#afeeee;
	}
	.last a
	{
		
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
	<form method="post" action="Login">
		<div id="header">
		<img alt="" src="logo.png">
        <label>Spring Expenses Tracker</label>
            
        </div>
		<div class="main">
			<h1>Sign In With</h1>
			<div class="parta">
			<div id="abc1"><img alt="" src="facebook.png"><a href="#">Facebook</a></div>
			<div id="abc"><img alt="" src="google.png"><a href="#">Google</a></div>
			</div>
			<div class="partb">
			<small>Username</small>
			<div><input type="text" name="username" placeholder="Your Username"><br></div>
				<small>Password <a href="password.jsp">Forget?</a></small>
				<input type="password" name="password" placeholder=" Your Password">
				<button>Sign In</button>
			</div>
			<small class="last">Noa a member?<a href="Register.jsp">Signup now</a></small>
			<%
				String message=(String)request.getAttribute("msg");
			if(message!=null && message.equals("PLEASE ENTER VALID CREDENTIALS"))
			{
				 %><h3 style="margin-top:370px;color:red;"><center><%=message %></center></h3><% 
			}
			else if(message!=null)
			{
				%>
				<h4><%= message %></h4>
				<script>alert('<%=message%>')</script>
				<br>
				<%
			}
			%>
		</div>
	</form>
</body>
</html>