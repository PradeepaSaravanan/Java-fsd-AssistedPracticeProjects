<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="marks" scope="session" value="${230}" />
<c:choose>
<c:when test="${marks>=400}">
	grade="A"
</c:when>
<c:when test="${marks>=300}">
	grade="B"
</c:when>
<c:otherwise>
	grade="fail"
</c:otherwise>
</c:choose>

<br>
</body>
</html>