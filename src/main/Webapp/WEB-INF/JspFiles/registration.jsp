<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body style="background-color: #CC9999;">

        <h2>User Registration</h2>
        <form action="user/register" method="post">
        <br>
            Username   :  <input type="text"  name="username" required><br>
            <br>
            Email           :  <input type="email" name="email" required><br>
            <br>
            Password   :  <input type="password"  name="password" required><br>
            <br>
            Contact      :  <input type="number" name="contact" required><br>
            <br>
            Address      :  <input type="text" nmae="address" required><br>
            <br>
            ZipCode     :  <input type="number" name="zipcode" required> <br>   
            <br>
                  
            <input type="submit" name ="Register">
        </form>
    

</body>
</html>