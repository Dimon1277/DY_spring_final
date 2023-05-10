<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>New Spring Student</h3>
<form:form action="removecar.jsp" method="GET" modelAttribute="car">
	<form:hidden path="id"/>
	Make : <form:input path="make"/><br/>
	Model : <form:input path="model"/><br/>
	<input type="submit" value="Save"/>
</form:form>

</body>
</html>