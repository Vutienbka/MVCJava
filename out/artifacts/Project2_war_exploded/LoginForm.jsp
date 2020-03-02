<%--
  Created by IntelliJ IDEA.
  User: vutienbka
  Date: 2/28/20
  Time: 10:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LoginForm</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="/src/css/bootstrap.css">
    <link href="https://use.fontawesome.com/releases/v5.0.4/css/all.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js">
    </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js">
    </script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    <script src="/src/js/jquery.js"></script>
    <script src="/src/js/bootstrap.js"></script>
    <style>
        .LoginFormBound{
            margin: 20px;
        }
        .form-control{
            width: 460px;
        }
    </style>
</head>
<body>
<div class="LoginFormBound">
    <div class="container-fluid">
        <h2>Login Form</h2>
        <div class="row" style="width:500px; height: 450px; border: 1px solid #cccccc;background: #f2f2f2">
            <form style="margin: 20px" action="Login" method="get">
                <div class="form-group">
                    <label>Email</label>
                    <input class="form-control" type="text" name="Email" placeholder="Email">
                </div>
                <div class="form-group">
                    <label> UserName</label>
                    <input  class="form-control" type="text" name="UserName" placeholder="UserName">
                </div>
                <div class="form-group">
                    <label> PassWord</label>
                    <input  class="form-control" type="PassWord" name="Password" placeholder="Password">
                </div>
                <div class="checkbox">
                    <label><input type="checkbox">Remember</label>
                </div>
                <input class="btn btn-success" type="submit" name="submit" value="Login" style="width: 100px">
            </form>
        </div>
    </div>
</div>
</body>
</html>
