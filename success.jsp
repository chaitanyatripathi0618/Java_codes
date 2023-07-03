<%@page import="com.lpu.service.ProductServ"%>
<%@page import="com.lpu.service.Product"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
if( request.getMethod().equalsIgnoreCase("POST") && session.getAttribute("un") != null ){
String username = (String) session.getAttribute("un");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="Styles/style.css">
<title>success</title>
</head>
<body>
<h2>Welcome - <%= username %></h2>
<h2>Products</h2>
<%
ProductServ productServ = new ProductServ();
ArrayList<Product> products = productServ.findAll();
productServ.close();
%>
<table>
<tr>
<th>ID</th>
<th>Name</th>
<th>Price</th>
<th>Modify</th>
</tr>
<%
for(Product product : products){
%>
<tr>
<td><%= product.getId() %></td>
<td><%= product.getName() %></td>
<td><%= product.getPrice() %></td>
<td><a href="EditProduct.jsp?id=<%=product.getId()%>">Edit</a>| <a href="#">Delete</a></td>
</tr>
<%
}
%>
</table>
<br><br>
<a href="#">Add</a> new Product.<br>

<br><br>
Click <a href="signoutServelrt">here</a> for signout.
</body>
</html>
<%
}
else{
response.sendRedirect("index.jsp");
}
%>
