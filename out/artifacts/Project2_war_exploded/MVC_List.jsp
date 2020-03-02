<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vutienbka
  Date: 3/1/20
  Time: 9:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List customer satisfy a condition</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="/src/css/bootstrap.css">
    <script src="/src/js/jquery.js"></script>
    <script src="/src/js/bootstrap.js"></script>
    <style>
        tr{
            text-align: center;
        }
        .container{
            margin-top: 20px;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Customer List</h2>
    <p><a href="${pageContext.request.contextPath}?action=create">Create New Customer</a></p>
<%--    <p><a href="customer?action=create">Create New Customer</a></p>--%>
    <table class="table table-striped table-bordered">
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
            <th>View</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach items="${customerList}" var="customer">
            <tr>
                <td> <c:out value="${customer.getName()}"></c:out></td>
                <td> <c:out value="${customer.getEmail()}"></c:out></td>
                <td><c:out value="${customer.getAddress()}"></c:out></td>
                <td><a href="${pageContext.request.contextPath}?action=view&Id=${customer.getId()}">View</a></td>
                <td><a href="${pageContext.request.contextPath}?action=edit&Id=${customer.getId()}">Edit</a></td>
                <td><a href="${pageContext.request.contextPath}?action=delete&Id=${customer.getId()}">Delete</a></td>
            </tr>
        </c:forEach>

    </table>
</div>
</body>
</html>
