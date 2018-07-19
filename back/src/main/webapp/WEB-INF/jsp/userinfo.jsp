<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>title2</title>
</head>
<body>
	<p>Hello ${user.name}!</p>
	<p>your password: ${user.pass}</p>
	
	<form method="post" enctype="multipart/form-data"
        action="/upload">
		<input type="text" name="text"/>		
		<input type="file" name="file"/>
		<input type="submit" value="send">
	</form>
</body>
</html>