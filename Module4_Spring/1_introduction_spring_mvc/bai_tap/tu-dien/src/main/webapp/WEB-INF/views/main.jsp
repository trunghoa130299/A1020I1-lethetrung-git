<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<h2>Vietnamese Dictionary</h2>
<form method="post" action="">
    <input type="text" name="search" placeholder="Enter your word: "/>
    <input type="submit" id="submit" value="Search"/>
</form>
<c:if test="${result != null}">
    <p>${search} : <span>${result}</span></p>
</c:if>
<p><c:if test='${msg != null}'>
    <span>${msg}</span>
</c:if></p>
</body>
</html>
