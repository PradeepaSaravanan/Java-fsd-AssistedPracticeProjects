<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Front page of website</h1>


<!-- we can also forward to display result in next page -->
<jsp:include page="printHello.jsp">
<jsp:param value="Java" name="course"/>
</jsp:include>
</body>
</html>