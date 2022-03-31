<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>current time</title>
</head>
<body>
<h1>hello all !!!</h1>
<h2>hello all !!!</h2>
<h3>hello all !!!</h3>

today date :

<%
Date date=new Date();
out.print(date.toString());
out.print("hi");
%>
</body>
</html>