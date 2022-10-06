<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="Hello.jsp">
Enter name:<input type="text" name="Uname"><br><br>
Enter password: <input type="password" name="pwd"><br><br>
<input type="submit">

</form>

<%
String name=request.getParameter("Uname");
String pwd=request.getParameter("pwd");

if(name!=null && pwd!=null){
	boolean result = validate(name,pwd);

if(result==true)
	out.println("welcome  "+name);

else
	out.println("Not valid");
}
%>
<%!boolean validate(String name, String pwd)
 {
	if(name.equals("suha") && pwd.equals("Suha@123"))
		return true;
	else
		return false;
 }

%>

</body>
</html>