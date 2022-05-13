<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        img {
            width: 50px;
            height: 50px;
        }
        table,tr,td,th {
            border: 1px solid black;
            border-collapse: collapse;
            padding: 10px;
            text-align: center;
        }
        td, th {
            width: 200px;
        }

    </style>
</head>
<body>
<h1>Danh sách khách hàng</h1>
<table>
    <tr>
        <th>Name</th>
        <th>Ngày sinh</th>
        <th>Quê quán</th>
        <th>Ảnh</th>
    </tr>

    <c:forEach items = '${customer}' var="a">
        <tr >
            <td>${a.name}</td>
            <td>${a.birthday}</td>
            <td>${a.address}</td>
            <td><img src="${a.image}" alt=""></td>

        </tr>
    </c:forEach>
</table>
</body>
</html>