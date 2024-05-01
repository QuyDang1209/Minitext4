<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 4/30/2024
  Time: 8:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="k" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh sách kính</title>
    <style>
        .image-frame{
            width: 200px;
            height: 200px;
            overflow: hidden;
        }
    </style>
</head>
<body>
<h1>DANH MỤC KÍNH</h1>
<div>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>CODE</th>
            <th>PRICE</th>
            <th>DECRIPTION</th>
            <th>INMAGE</th>
        </tr>
        <c:forEach  items="${dsk}" var="k">
            <tr>
                <td>${k.getId()}</td>
                <td>${k.getCode()}</td>
                <td>${k.getPrice()}</td>
                <td>${k.getDecription()}</td>
                <td><img src="${k.getImg()}" alt="" class="image-frame"></td>
                </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
