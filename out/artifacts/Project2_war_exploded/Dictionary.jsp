<%--
  Created by IntelliJ IDEA.
  User: vutienbka
  Date: 3/1/20
  Time: 11:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary Application</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="/src/css/bootstrap.css">
    <script src="/src/js/jquery.js"></script>
    <script src="/src/js/bootstrap.js"></script>
    <style>
       .row{
            display: inline-table;
        }
    </style>

</head>
<body>
<div class="container">
    <h5>Dictionary Application</h5>
    <div class="row">
        <form action="search" method="get">
            <div class="form-group">
                <label>Input:</label>
                <input class="form-control" name="searchingWord" type="text" placeholder="Input searchWord" value="${searchingWord}">
                <input type="submit" class="btn btn-success" value="Search">
            </div>
        </form>
    </div>
    <div><h4>Meaning: ${mean}</h4></div>
</div>
</body>
</html>
