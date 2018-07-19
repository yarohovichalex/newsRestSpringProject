<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>here</title>
<script 
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js">
</script>
</head>
<body>
	<script type="text/javascript">
		function doAjax(){
			$.ajax({
				url: 'checkPass',
				data: ({pass: $('#pass').val()}),
				success: function(data){
					$('#resultValue').html(data);
				}
			});
		}
	</script>
	
<h2>${message}</h2>

	<div id="resultValue"></div>
	<form:form method="post" action="checkPass">
		<fieldset>
			<form:label path="name">login:</form:label>
			<form:input path="name"/>
			
			<form:label path="pass">password:</form:label>
			<form:password path="pass" onkeyup="doAjax()"/>
		</fieldset>		
		<input type="submit" value="register"/>		
	</form:form>
	
</body>
</html>