<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>here</title>
</head>
<body>
hh
	<form:form method="POST" commandName="user" action="checkUser"   >
		<fieldset>
			<form:label path="name">username</form:label>
			<form:input path="name"/>
			
			<form:label path="pass">userpass</form:label>
			<form:input path="pass"/>
		</fieldset>
		
		<input type="submit" value="send"/>
		
		
	</form:form>
	
</body>
</html>