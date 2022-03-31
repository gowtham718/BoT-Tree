<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>
<body style="background-color:silver;">
now time is:
<%=new java.util.Date() %></p>
<c:set var="mystr" value="welcome to intern Session"/>

<c:if test="${fn:contains(mystr, 'Session')}">  
   <p>yes.....String contains the word session<p>  
</c:if>  

<c:if test="${fn:contains(mystr, 'welcome')}">  
   <p>yes.....String contains the word welcome also<p>  
</c:if> 
<h2> adding product </h2>
<c:out value="${'<h2> adding product </h2>'}"/>
<c:out value="${'welcome to the page'}"/>

<c:forEach var="j" begin ="1" end="3"> Item
<c:out value="${j}"/>
</c:forEach>

<!-- implicit objects: out,request,application,page,config,exception -->
<% 

out.println(request.getClass());
out.println("\n<h5>"+application.getContextPath()+"\n</h5>");
out.println("\n<h5>"+page.getClass()+"\n from </h5>");
out.println("\n<h5>"+config.getClass()+"\n from config </h5>");
String s=page.toString();
int hashc=page.hashCode();

String a1=application.getServerInfo();
out.println("\n getServerInfo() :"+a1+"\n");
out.println("getSessionTimeout()"+application.getSessionTimeout()+"\n from application");

%>
<a href ="<c:url value ="/welcome.jsp"/>">click here</a>

</body>
</html>