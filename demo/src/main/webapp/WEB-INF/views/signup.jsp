<%--
  Created by IntelliJ IDEA.
  User: Zahid
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login Page</title>
</head>
<body>

<h3>Signup</h3>

<form:form method="post" modelAttribute="user">
    <%--<form:input path="userName"></form:input>--%>
    <%--<input type="submit" value="signup"/>--%>

    <table border="0" cellpadding="2" cellspacing="2">
        <tr>
            <td>Username:</td>
            <td><form:input path="userName"/>  <form:errors path="userName" /> </td>
        </tr>
        <tr>
            <td>First Name:</td>
            <td><form:input path="firstName"/> <form:errors path="firstName" /> </td>
        </tr>
        <tr>
            <td>Last Name:</td>
            <td><form:input path="lastName"/> <form:errors path="lastName" /> </td>
        </tr>
        <tr>
            <td>Gender:</td>
            <td><form:checkbox path="gender" value="M"/>Male</td>
            <td><form:checkbox path="gender" value="F"/>Female</td>
        </tr>
        <tr><td><form:errors path="gender" /></td></tr>

        <tr>
            <td>Email:</td>
            <td><form:input path="email"/> <form:errors path="email" /> </td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit" /></td>
        </tr>
    </table>

</form:form>

</body>
</html>
