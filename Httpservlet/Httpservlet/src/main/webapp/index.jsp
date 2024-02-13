<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
<script src="https://kit.fontawesome.com/c51795afff.js"
	crossorigin="anonymous"></script>
<style>

.header {
	margin: 0px;
	padding: 0px;
	height: 90px;
	width: 100%;
	background-color: orchid;
}

* {
	margin: 0px;
	padding: 0px;
}

b {
	position: absolute;
	top: 5%;
	left: 8%;
	font-size: 25px;
}

#ima {
	width:500px;
	height:500px;
	float: left;
	margin-left: 100px;
	margin-top: 34px;
}

#mt {
	height: 200px;
	width: 390px;
	font-size: 22px;
	float: right;
	margin-right: 270px;
	margin-top: 150px;
}

.sm {
	word-spacing: 8px;
}
</style>
</head>
<body>
	<div class="header">
		<img src="logo.png"
			style="height: 51px; width: 50px; padding: 22px; margin-left: 33px;">
		<b>Spring Expenses Tracker</b> <a href="Login.jsp"> <img
			src="user.png" height="40px" width="40px"
			style="position: absolute; right: 3%; top: 5%;"></a>

	</div>


	<br>
	<br>
	<img src="robo.gif" id="ima" >


	<div id="mt">
		<i class="sm">Expense Tracker simplify your personal reimbursement
			management</i><br>
		<br>
		<br> <i class="sm">Expense Tracker is used by user's to
			record their daily routine expenses in a digital and hassle-free way
			as opposed to the conventional manual documentation of expenses</i>
	</div>
</body>
</html>