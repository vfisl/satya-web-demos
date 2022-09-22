<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="text-align: right">
		<a href="login.jsp">Login as admion to Add/Delete/Update Policy </a>
	</div>
<form  action="query">
Search Policy ---<select name="policy">
<option value="Brand" >Brand</option>
<option value="Category">Category</option>
<option value="Coverage">Coverage</option>
<option value="Type">type</option>
<option value="Duration">Duration</option>
<option value=" SumInsured">sumInsured</option>
</select>
</form>

</body>
</html>