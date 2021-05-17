<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 5/13/2021
  Time: 12:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create new User</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<a href="/users">Back to user list</a>
<form method="post">
    <fieldset>
        <legend>User information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td>Email: </td>
                <td><input type="text" name="email" id="email"></td>
            </tr>
            <tr>
                <td>Country: </td>
                <td><input type="text" name="country" id="country"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create user"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
