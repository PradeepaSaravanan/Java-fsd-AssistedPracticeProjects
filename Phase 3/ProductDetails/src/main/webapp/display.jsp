<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>PRODUCT DETAILS!!</h3>
<table  border=1 cellspacing=0 cellpadding=10>
	
<tr>	
<th> Product Name</th> 
<th> Product Price</th>
<th>Price</th>
<th>Quantity</th>
</tr>
<tr>


<td><%=session.getAttribute("prod_id")%></td>
<td><%= session.getAttribute("prod_name")%></td>
<td><%= session.getAttribute("Price")%></td>
<td> <%= session.getAttribute("Quantity")%></td>
</tr>
</table>
</body>
</html>