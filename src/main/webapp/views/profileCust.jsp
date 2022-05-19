<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to modoc</title>

<link rel="stylesheet" href="../bootstrap/css/bootstrap.min.css" type="text/css" />

    <link rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
<script src="../bootstrap/js/jquery-3.1.1.min.js"type="text/javascript"></script>

   <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
   <script src="../bootstrap/js/bootstrap.min.js" type="text/javascript"></script>




<%@include file="header.jsp" %>
 <div style="color:white;">

<h4 style="text-align: center;">Log In with these Credentials</h4>
<h3>Welcome to Modoc</h3>
<h5> your Username is ${username }</h5>
<h5>your email is ${email }</h5>
<h5>your password is ${password }</h5>

</div  >

<div style="margin-left:40%; width:20%;">
    <button type="submit" class="btn" >
<a href="login">Login</a>
</button>
</div>

 

 <div style="position:fix; bottom:0%;">
        
  <%@include file="footer.jsp" %>
  </div>
 
 
  
</head>
<body>

</body>
</html>