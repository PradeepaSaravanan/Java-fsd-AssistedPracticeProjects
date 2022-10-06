<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="studentbeans.Student" scope="session"></jsp:useBean>

<table border=1>
<tr>
 <td><jsp:getProperty property="sname" name="obj"/></td>
 <td><jsp:getProperty property="address" name="obj"/></tr>
<tr>
</table>
</body>
</html>