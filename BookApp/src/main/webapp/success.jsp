<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- java code inside html is jsp- -->
<%
    String title= (String)request.getAttribute("title");
    out.print("Title is : "+title+"<br>");
    out.print("author  :"+ request.getAttribute("author")+"<br>");
    out.print("Book ID  :"+ request.getAttribute("bookId")+"<br>");
    out.print("category  :"+ request.getAttribute("category")+"<br>");
    out.print("price  :"+ request.getAttribute("price")+"<br>");
    
%>
</body>
</html>