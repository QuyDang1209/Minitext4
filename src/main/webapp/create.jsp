<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 5/1/2024
  Time: 8:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>TẠO MỚI DANH MỤC</h1>
<span>${mess}</span>
<div>
    <table>
        <tr>
            <th>ID</th>
            <th>CODE</th>
            <th>PRICE</th>
            <th>COLOR</th>
            <th>DECRIPTION</th>
            <th>INMAGE</th>
        </tr>
    <tr>


    <form method="post">
        <td><input name="ID"></td>
        <td><input name="CODE"></td>
        <td><input name="PRICE"></td>
        <td><input name="COLOR"></td>
        <td><input name="DECRIPTION"></td>
        <td><input name="INMAGE"></td>

    </form>
    </tr>
    </table>
    <button type="submit">CREATE</button>
</div>
</body>
</html>
