<%@page import="com.controller.EmpDao"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.beans.factory.BeanFactory"%>
<%@page import="com.controller.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
<h2>Check details then update</h2>
<%
	out.println("Employee Details :");
	out.println("ID : <input type='text' name='id' value='"+request.getAttribute("eid") +"'/>");
	out.println("Name : <input type='text' name='a' value='"+request.getAttribute("ename") +"'/>");
	out.println("Age : <input type='number' name='b' value='"+request.getAttribute("eage") +"'/>");
	out.println("Password : <input type='password' name='c' value='"+request.getAttribute("pwd") +"'/>");
	out.println("Role : <input type='text' name='d' value='"+request.getAttribute("erole") +"'/>");
	out.println("<input type = 'button' name='b1' value='UPDATE EMPLOYEE' onclick='window.location.href='AdminUpServlet' />");
%>
</body>
</html>