<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import= "java.time.LocalDateTime" %>
<%@page isELIgnored="false" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	/*String name = (String)request.getAttribute("name");
	LocalDateTime time = (LocalDateTime)request.getAttribute("time");*/
%>
<h1>Name: ${name}</h1>
<h1>Time: ${time}</h1>
<h1>Time: ${c}</h1>
<c:forEach var="item" items="${c}">
	<h1>${item }</h1>
</c:forEach>
</body>
</html>