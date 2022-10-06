<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Print value 5 times</title>
</head>
<body>
<h1>Print value 5 times
</h1>
<form action="print.jsp">
Enter value:<input type="number" name="value">
<input type="submit">
</form>


<%
String sval =request.getParameter("value");
 
if(sval != null)
{
	
	int val=Integer.parseInt(sval);
    for(int i=1;i<=5;i++)
	out.println(val*i);

}

%>

</body>
</html>