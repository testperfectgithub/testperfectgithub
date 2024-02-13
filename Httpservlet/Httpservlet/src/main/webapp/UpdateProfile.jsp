<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.jsp.expensetracker.entity.User"%>
<%@page import="com.jsp.expensetracker.dao.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
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

#update
{
width:60%;
height:60%;
}
#updatecon{
width: 100%;
height: 88vh;
background: #FFFFE0;
display: flex;
align-items: center;
justify-content: center;
}
.update{
width:40%;
height: 95%;
background-color: #afeeee;
display: flex;
flex-direction:column;
justify-content:space-around;
padding-left:5%;
box-shadow:0px 0px 15px black;
border-radius: 3%;
}
.update input
{
width:80%;
height:6%;
font-size:20px;
text-align: center;
color: black;
}
.update label
{

font-size: 20px;
}
.update button
{
width:81%;
height:6%;
background-color:blue;
border: none;
outline: none;
box-shadow: 0px 0px 5px black;
color: white;
border-radius: 10px;
text-transform: capitalize;
letter-spacing: 2px;
font-size: 18px;
font-weight: bold;
}
.update input
{
border: none;
outline: none;
background-color:#f8f8ff;
border-radius: 10px;
}
.update h1{
text-align: center;}

#fileInput{
background-color: transparent;
}
</style>
</head>
<body>
	<form action="UpdateProfile" method="post" enctype="multipart/form-data">
	<div id="header">
	    <div id="titlecon">
	    <img alt="" src="logo.png" id="abc"> <label id="heading">Spring
			Expenses Tracker</label>
	    </div>
		<div id="homecon">
		 <a href="Home.jsp"><img alt="" src="home.png" id="home"></a>
		</div> 
		<div id="iconcon">
		<img src="settings.png" alt="" list="subl" id="settingsimg">
		<datalist id="subl">
			<option><a href="#">Update Profile</a></option>
			<option><a href="#">About Us</a></option>
			<option><a href="#">Contact Us</a></option>
			<option><a href="Logout">Logout</a></option>
		</datalist>
		</div>
	</div>
 
	<%
		HttpSession hsession=request.getSession();
		User user=(User) hsession.getAttribute("userInfo");
		UserDao userdao=new UserDaoImpl();
		User user1=userdao.findUserById(user.getUserid());
	%>
<div id="updatecon">
	<div class="update">
		 <h1>Update Your Profile</h1>
		<label>Username</label> <input type="text" name="username" value="<%=user1.getUsername()%>">
		 <label>Fullname</label> <input type="text"name="fullname" value="<%=user1.getFullname()%>">
		 <label>Email</label> <input type="email"name="email" value="<%=user1.getEmail()%>">
		 <label>Mobile</label> <input type="number"name="mobile" value="<%=user1.getMobile()%>">
		 <label>password</label> <input type="password"name="password" value="<%=user1.getPassword()%>">
		 <label>Profile Photo</label> 
		 <input  type="file"id="fileInput" accept="/image/" name="image"> 
		 <img id="displayImage">
		


			<label>userid</label>
        	<input type="number" name="id" value="<%=user1.getUserid()%>">
        	<button>Update Profile</button>
	</div>
</div>	
	


</body>
</html>