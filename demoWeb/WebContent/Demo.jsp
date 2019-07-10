<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Scripting Elements</h1>
<hr>
<h2>
<%!
	int a = 10;
	int b = 40;
	int i=1;
%>
<%
	int sum = a+b;
%>
The value of a is :<%=a %><br>
The value of b is :<%=b %><br>
The value of sum is :<%=sum %><br><br>
You visited <%= i++ %> time 
</h2>
</body>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
</html>