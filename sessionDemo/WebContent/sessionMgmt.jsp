<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Session Demo</h1>
<hr>
<h3>
Session ID: <%= session.getId() %><br>
Created at :<%= new Date(session.getCreationTime())%><br>
Current time :<%= new Date()%><br>
Last Accessed time :<%= new Date(session.getLastAccessedTime())%><br>
Session is new:<%= session.isNew()%><br>
<% 
	//session.invalidate();
	session.setMaxInactiveInterval(10);
%>
<br>
</h3> <!-- Time in milliseconds 1970 jan1 -->
</body>
</html>