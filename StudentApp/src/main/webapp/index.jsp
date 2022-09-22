<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="register">
Enter Name <input type="text" name="studentName"><br>
 Enter StudentId <input type="text" name ="studentId"><br>
 Choose Language<select name="language">
 <option value ="select">-----select----</option>
  <option value ="Java">java</option>
   <option value ="JSP">JSP</option>
    <option value ="Spring">Spring</option>
 
 </select><br>
 Enter hobby
 <input type="checkbox" value="music" name="hobby">Music
 <input type="checkbox" value="dance" name="hobby">Dance
 <input type="checkbox" value="sports" name="hobby">Sports
 <input type="checkbox" value="reading" name="hobby">Reading
 <br>
 <input type ="submit" value="add">

</form>

</body>
</html>