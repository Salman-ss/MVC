<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String name = (String)request.getAttribute("name");
	java.util.List<String> crush = (java.util.List<String>) request.getAttribute("c");
%>
<h1>Name: <%=name %></h1>
<h2>Crushes of Salman:</h2>
<%
for(String s:crush){
	out.println(s+"<br>");
}
%>

</body>
</html>