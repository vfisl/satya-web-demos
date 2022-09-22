<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="com.healthapp.model.Plan"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--<%Plan plan=(Plan)request.getAttribute("plan"); --%>
<%--PlanName<%=plan.getPlanName() %><br>
Category<%=plan.getCategory()%><br>
Brand<%=plan.getBrand() %><br>
SumInsured<%=plan.getSumInsured() %><br>
Coverage<%=plan.getCoverage() %>--%>
<h1>Using Expression language</h1>
PlanName ${plan.planName}<br>
Category ${plan.category}<br>
Brand ${plan.brand}<br>
Coverage ${plan.coverage}<br>
</body>
</html>