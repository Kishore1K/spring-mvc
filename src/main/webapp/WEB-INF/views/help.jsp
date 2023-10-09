<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
<h1>Hello This is Help Page</h1>
<%-- <%

	String name = (String)request.getAttribute("name");
	Integer id = (Integer)request.getAttribute("id");
	LocalDateTime time = (LocalDateTime) request.getAttribute("time");

%>
<h1> My name is <%=name %> and my Id is <%=id %></h1>
<h1>Time is = <%=time %></h1>
 --%>
 
 <h1> My name is = ${name} and My id is ${id} </h1>
 <h1> Time = ${time}</h1>
 <h1> Marks is ${marks} </h1>
 <!-- tag libe C tage -->
  	<ol>
 <c:forEach var="item" items="${marks}">

 	<li>${item}</li>
 
 
 </c:forEach>
 	</ol>
 

</body>
</html>