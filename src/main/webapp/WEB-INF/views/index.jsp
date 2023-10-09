<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello All This Home Controller</h1>
	<%
		
		Integer id = (Integer)request.getAttribute("id");
		String name = (String)request.getAttribute("name");
		String email = (String)request.getAttribute("email");
		String address = (String) request.getAttribute("address");
		
		List<String> fList =(List<String>)request.getAttribute("friends");

	
	%>
	
<h1> My id is <%=id%> </h1>
<h1> My name is <%=name%> </h1>
<h1> My email is <%=email%> </h1>
<h1> My address is <%=address %></h1>
<h1> My Friends are <%
	for(String s: fList){
		out.println(s);
	}

%>

</h1>

</body>
</html>