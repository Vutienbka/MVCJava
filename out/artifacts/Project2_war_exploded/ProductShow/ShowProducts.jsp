<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vutienbka
  Date: 2/27/20
  Time: 9:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Title</title>
</head>
<body>
<h1>The list of Products:</h1>
<ul>
    <c:forEach items="${product}" var="productname">
        <li><c:out value="${productname}"></c:out></li>
    </c:forEach>
</ul>
</body>
</html>
