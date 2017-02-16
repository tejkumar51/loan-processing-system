<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User</title>
</head>
<body>
	<f:form commandName="user">
User name: 
	<f:input path="userName" />
		<br />

Password:
<f:input path="password" />
		<br> 

Mobile:
<f:input path="mobile" />
		<br />

email:
<f:input path="email" />
		<br />

User type:
<f:input path="userType" />
		<br>

		<input type="submit" value="Add User" />
	</f:form>
</body>
</html>