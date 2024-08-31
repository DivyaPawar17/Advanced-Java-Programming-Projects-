<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<body>
<%--Instantiating a Java Bean of type:travel.Airline 
using some reference:airlineRef--%>

<jsp:useBean 
id="airlineRef" 
class="travel.Airline"
scope="session"
/>
<%--setting values for all the properties of the bean --%>
<jsp:setProperty property="*" name="airlineRef"/>
<h2>Airline created successfully.</h2>
<h2>To view the details please <a href="show_airline.jsp">Click Here</a> </h2>

</body>
</html>