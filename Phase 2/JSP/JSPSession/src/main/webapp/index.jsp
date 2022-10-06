<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   import="java.util.Date" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="index.jsp">
Enter name: <input type="text" name="name">
<input type="submit">
</form>
<%
	String uname = request.getParameter("name");
	Date createTime = new Date(session.getCreationTime());
	if (uname != null)
		session.setAttribute("username", uname);
	session.setAttribute("date", createTime);
	%>
<a href="display.jsp">display</a>
</body>
</html>