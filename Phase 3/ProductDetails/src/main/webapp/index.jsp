<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product details</title>
</head>
<body>
<h1>Enter Product Details!!!
</h1>
<form action="ProductDetails" method="get">
Enter Product id: <input type="number" name="prod_id"><br><br>
Enter Product name: <input type="text" name="prod_name"><br><br>
Enter Quantity: <input type="number" name="Quantity"><br><br>
Enter Price:  <input type="number" name="Price"><br><br>
<input type="submit" value="save">
</form>
</body>
</html>