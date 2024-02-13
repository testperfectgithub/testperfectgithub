<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="com.jsp.expensetracker.entity.User" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
    <link rel="stylesheet" href="home.css">
    <style>
    @charset "ISO-8859-1";
*{
    margin: 0px;
    padding: 0px;
   
}
#con{
    width: 100%;
    height: 100vh;
    background-color: blueviolet;
    display: flex;
    flex-direction: column;
}
#header{
    width: 100%;
    height: 13%;
    background-color:orchid;
}
#body{
    width: 100%;
    height: 80%;
    background-image: radial-gradient(
    farthest-corner at 40px 40px,
    #f35 0%,
    #43e 100% 
  );
   display: flex; 
    justify-content: center;
    align-items: center;
    overflow:hidden;
}
#footer{
    width: 100%;
    height: 10%;
    background-color: black;
}
#textcon{
    width: 60%;
    height: 80%;
   
    display: flex;
    flex-wrap: wrap;
    align-content: space-between;
    justify-content: space-between;
   align-items: end;
}
.text{
    width: 44%;
    height: 30%;
    font-size: 40px;
    font-weight: 500;
    position: relative;
    color:white;
    
}
.text a
{
	text-decoration:none;
	color:white;
}
#user{
    width: 40%;
    height: 30%;
    margin-left: 30%;
    color:white;
    display: flex;
    justify-content: center;
    align-items: center;
    font-size: 30px;
}


#header label
{
	
    font-size: 30px;
    font-weight: bold;
    position: absolute;
    left:70px;
    top:30px;
}
#abc
{
	
	position:relative;
	top:60px;
	left:100px;
}
#abc1
{
	position:relative;
	top:60px;
	left:60px;
}
#abc2
{
	position:relative;
	
	left:100px;
}
#abc3
{
	position:relative;
	
	left:60px;
}
#a1{
    width:50px;
    height:50px;
    position: absolute;
    left:1450px;
    top:20px;
}
#a
	{
		width:50px;
		height:50px;
		position: absolute;
		left:25px;
		top:20px;
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
  text-align:center;
  min-width:160px;
  box-shadow:0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index:1;
  left:1350px;
  top:72px;
  border-radius:10px;
}

/* Links inside the dropdown */
.dropdown-content a {
  color:black;
  padding:12px 16px;
  text-decoration:none;
  display:block;
}

/* Change color of dropdown links on hover */
.dropdown-content a:hover {background-color:black;border-radius:10px;color:white;}

/* Show the dropdown menu on hover */
.dropdown:hover .dropdown-content {display:block;}
</style>
</head>
<body>
    <div id="con">
        <div id="header">
        	<img alt="" src="logo.png" id="a">
            <label>Spring Expenses Tracker</label>
            <div class="dropdown">
            	<img src="settings.png" alt="" class="dropdown-img" id="a1">
            	<div class="dropdown-content">
            		<a href="UpdateProfile.jsp">Update Profile</a>
            		<a href="#">About Us</a>
            		<a href="#">Contact Us</a>
            		<a href="Logout">Logout</a>
            	</div>
            </div>
            
        </div>
        <div id="body">
            <div id="textcon">
                <div class="text">
                    <a href="addExpense.jsp" id="abc">Add Expences</a>
                </div>
                <div class="text">
                    
                    <a href="ViewExpense" id="abc1">View Expenses</a>
                </div>
                <%
                	String message=(String) request.getAttribute("msg");
                	//User user =(User) request.getAttribute("userInfo");
                	User user=(User) session.getAttribute("userInfo");
                	if(message!=null)
                	{
                %>
                	<script>alert("<%= message%>");</script>
                
                	<div id="user" ><h3>welcome <%=user.getUsername() %></h3></div>
                	<%
                	}
                %>
                
                <div class="text">
                    <a id="abc2" href="TotalExpenses.jsp">Total Expences</a>
                </div>
                <div class="text">
                    <a  id="abc3" href="Filter.jsp">Filter Expences</a>
                </div>
            </div>
        </div>
        <div id="footer"></div>
    </div>
</body>
</html>