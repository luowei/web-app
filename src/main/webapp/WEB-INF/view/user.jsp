<%--
  Created by IntelliJ IDEA.
  User: luowei
  Date: 12-12-27
  Time: 下午4:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
    <table border="1">
        <c:forEach items="${userList}" var="user" varStatus="st">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td>${user.sex}</td>
                <td>${user.age}</td>
                <td>${user.address}</td>
                <td>${user.profile}</td>
            </tr>
        </c:forEach>

    </table>
</body>
</html>