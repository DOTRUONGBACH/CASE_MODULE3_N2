<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 1/4/2023
  Time: 11:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Xóa</title>
  <form method="post" action="/delete">
    <input name="idmu" placeholder="nhập id "><br>

    <button type="submit">Xóa</button>
  </form>

</head>
<body>
<table>
<c:forEach var="p" items="${hats}">
    <tr>
        <td>${p.hatId}</td>
        <td>${p.hatName}</td>
    </tr>

</c:forEach>
</table>
</body>
</html>
