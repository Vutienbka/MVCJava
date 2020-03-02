<%--
  Created by IntelliJ IDEA.
  User: vutienbka
  Date: 2/29/20
  Time: 9:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="/src/css/bootstrap.css">
    <script src="/src/js/jquery.js"></script>
    <script src="/src/js/bootstrap.js"></script>
    <style>
        .decorate{
            width: 350px;
            height: 600px;
            margin-left: 50px;
        }
    </style>
</head>
<body>
<div class="container-fluid">
    <h3>Currency Converter</h3>
    <div class="decorate">
        <div class="row" style="border: 1px solid black; padding: 20px">
            <form action="converter" method="get">
                <div class="form-group">
                    <label>Rate</label>
                    <input class="col-12 form-control" type="text" name="rate" id="rate" value="${rate}">
                </div>
                <div class="form-group">
                    <label>USD</label>
                    <input class="col-12 form-control" type="text" name="usd" id="usd" value="${usd}">
                </div>
                <div class="form-group">
                    <label>VND</label>
                    <input class="col-12 form-control" type="text" name="vnd"value="${vnd}">
                </div>
                <input type="submit" width="120px" class="btn btn-success" value="Convert" style="width: 150px">
            </form>
        </div>
    </div>
</div>
</body>
</html>
