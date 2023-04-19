<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
hello from jsp
<%
String un = request.getParameter("t1");
out.println("take = "+un);
String un1 = request.getParameter("t2");
out.println("get = "+un1);
String un2 = request.getParameter("t3");
out.println("execute = "+un2);
%>
</body>
</html>