<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>


	<body>
	   <%----Accepting user Name and Generating response that greets this user --%>
	   <%
	       String userFullName = request.getParameter("fullName");
	       String responseText = "<h2>Hello " + userFullName + "</h2>";
	       out.println(responseText);
	   
	   %>
	</body>
</html>