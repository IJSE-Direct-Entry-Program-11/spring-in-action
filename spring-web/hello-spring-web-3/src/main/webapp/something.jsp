<%--
  Created by IntelliJ IDEA.
  User: ranjith-suranga
  Date: 11/15/23
  Time: 7:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Hello JSP</title>
</head>
<body>
    <h1>Hello! I am a JSP</h1>
    <h2>Customers Count: ${count}</h2>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="customer" items="${customerList}">
                <tr>
                    <td>${customer.id}</td>
                    <td>${customer.name}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
