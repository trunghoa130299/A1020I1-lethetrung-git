<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit product</title>
</head>
<body>
<h1>Edit product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/users">Back to user list</a>
</p>
<form method="post">
    <fieldset>
        <legend>User information</legend>
        <table>
            <tr>
                <td>Id:</td>
                <td><input type="hidden" name="id" value="${requestScope["user"].getId()}"></td>
            </tr>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name" value="${requestScope["user"].getName()}"></td>
            </tr>
            <tr>
                <td>Email: </td>
                <td><input type="text" name="email" id="email" value="${requestScope["user"].getEmail()}"></td>
            </tr>
            <tr>
                <td>Country: </td>
                <td><input type="text" name="country" id="country" value="${requestScope["user"].getCountry()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update user"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>


