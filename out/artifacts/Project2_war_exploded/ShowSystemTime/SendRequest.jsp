<%--
  Created by IntelliJ IDEA.
  User: vutienbka
  Date: 2/28/20
  Time: 9:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Send show system time request</title>
</head>
<body>
<form action="ShowSystemTime" method="get">
    <h2>Current Time:</h2> <input name="currentTime" type="text"  value="${currentDate}"
                         style="width: 500px; height: 45px; font-size: 30px; font-weight: bolder"><br>
    <input type="submit" name="sendRequest" value="Send Request"
           style="height: 30px; width: 200px;font-weight: bolder">
</form>
</body>
</html>
