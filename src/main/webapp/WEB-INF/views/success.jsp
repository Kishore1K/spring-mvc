<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>${Success}</h1>
  <div class="contatiner  text-center" >  
	  <h1>Name 		: ${user.userName }</h1>
	  <h1>Email 	: ${user.userEmail }</h1>
	  <h1>Password  : ${user.userPassword }</h1>
  </div>

</body>
</html>