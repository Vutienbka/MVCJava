<%--
  Created by IntelliJ IDEA.
  User: vutienbka
  Date: 2/28/20
  Time: 10:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head><meta charset="UTF-8"><title>c:out example</title></head>
<body>
<h2>c:out example</h2>
<c:out value="${'This is true: 10 > 1 '}" ></c:out>
<br/>
Tag: <c:out value="${'<atag> , &'}"></c:out>
<c:set scope="page" var="greeting" value="Hello"></c:set>
Greeting:
<c:out value="${greeting}"></c:out>
<c:remove scope="page" var="greeting"></c:remove><br>
After Remove:</br>
Greeting:
<c:remove var="greeting"></c:remove>
<c:out value="${greeting}"></c:out>
<h2>C:catch Example</h2>
</body>
</html>