<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<style>
    .even {
        color: red;
        font-weight:600;
    }
    
    .odd {
        color: green;
    }
</style>
<body>
<%
for(int i=0;i<10;i++){
	if(i % 2 == 0) {
		out.println("<span class='even'>" + i + "</span><br/>");
	} else {
		out.println("<span class='odd'>" + i + "</span><br/>");
	}
}
SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yy");
%>

Today: <%= sd.format(new Date()) %>

<h1>Hi User</h1>
<form action="demo_01" method="post">
    Student Id: <input type="text" name="id"><br><br>
    Student Name: <input type="text" name="name"><br><br>
    Student DOB: <input type="date" name="dob"><br><br>
    Marks Subject 1: <input type="number" name="sub1"><br><br>
    Marks Subject 2: <input type="number" name="sub2"><br><br>

    <input type="submit" value="Save">
    <br><br>
    <input type="reset" value="Cancel">
</form>

</body>
</html>
