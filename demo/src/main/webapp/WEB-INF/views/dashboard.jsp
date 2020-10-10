<%--
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Welcome</title>
</head>
<body>

<h3>Dashboard</h3>

<%
    if(session.getAttribute("username") == null){
        response.sendRedirect("login");
    }else {%>
        Welcome ${sessionScope.username}
    <%
    }
%>
<a href="${pageContext.request.contextPath }/logout">Logout</a>
<br>

</body>
</html>
