<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! String name="sadik"; %>
<%="welceom "+name %>
<%! int count=0; %>
you are visitor number<%=count++ %>
<br>
<%!String greet()
{
	return "welcome back"+count;
}
%>
<%=greet() %>
</body>
</html>