<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Directive Demo</title>
</head>
<%@page import="java.util.Date" %>
<%@page isErrorPage="true" %>
<%@page info = "Just for demo"%>
<%@page session="true"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <!-- Third party tags -->
<body>
<h1>Directive demo</h1>
<hr>
<h2>
Todays date:<%= new Date() %></h2>
Exception  :  <%= exception %><br>
Information:<%= getServletInfo() %><br>
Session id :<%= session.getId() %>
<hr>
<%@include file="login.html" %>
<%@include file="Demo.jsp" %>
<c:catch></c:catch><!-- Third party tags -->
</body>
</html>