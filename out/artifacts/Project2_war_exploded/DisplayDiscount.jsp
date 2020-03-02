<%@ page import= "ProductDiscount.Product"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vutienbka
  Date: 2/29/20
  Time: 6:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display Discount</title>
</head>
<boy>
Discount Amount:
<%
    Product products;
    products = (Product)request.getAttribute("products");
    out.println(String.valueOf(products.getDiscountAmount()));
   %>
</boy>

</html>
