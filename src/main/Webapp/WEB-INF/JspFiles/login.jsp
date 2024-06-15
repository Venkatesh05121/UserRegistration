<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
 <body style="background-color: #FF0066;">

        <h2>User  Login</h2>
        <form action="user/login" method="post">
        <br>
            Username   :  <input type="text"  name="username" required><br>
            <br>
            Password   :  <input type="password"  name="password" required><br>
            <br>          
            <input type="submit" name ="Login">
        </form>

</body>
</html>