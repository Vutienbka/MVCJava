<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vutienbka
  Date: 3/1/20
  Time: 2:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display Customer</title>
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
        form{
            margin-top: 15px;
        }
    </style>
</head>
<body>
<div class="container">
    <form action="Display" method="get">
        <div class="row">
            <div class="form-group">
                <label>Display list of customer</label>
                <input class="btn btn-success form-control " type="submit" value="Display">
            </div>
        </div>
    </form>
    <table class="table table-bordered table-hover " style="border: 1px solid #cccccc">
        <tr class="thead-light">
            <th>Name</th>
            <th>DateOfBirth</th>
            <th>Address</th>
            <th><img src="">Image</th>
        </tr>
        <c:forEach items="${customerList}" var="customer">
            <tr>
                <td><c:out value="${customer.getName()}"></c:out> </td>
                <td><c:out value="${customer.getDateOfBirth()}"></c:out> </td>
                <td><c:out value="${customer.getAddress()}"></c:out> </td>
                <td><img src = "<c:out value="${customer.getImage()}"></c:out>" alt="Image Not Found"
                         style="width: 50px; height: 50px; border: 1px solid #cccccc"> </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
