<%--
  Created by IntelliJ IDEA.
  User: Kogeor
  Date: 12-Oct-22
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Items</title>
</head>

<body>
<h2>Items</h2>
<table>
    <tr>
        <th>id</th>
        <th>title</th>
        <th>year</th>
        <th>genre</th>
        <th>watched</th>
        <th>action</th>
    </tr>
    <c:forEach var="item" items="${itemsList}">
        <tr>
            <td>
                    ${item.id}
            </td>

            <td>
                    ${item.title}
            </td>

            <td>
                    ${item.year}
            </td>

            <td>
                    ${item.genre}
            </td>
            <td>
                    ${item.watched}
            </td>
            <td>
                <a href="/edit/${item.id}">edit</a>>
                <a href="/delete/${item.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<h2>Add</h2>
<c:url value="/add" var="add"/>
<a href="${add}">Add new item</a>
</body>
</html>
