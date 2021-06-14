<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View product</title>
</head>
<body>
<h1>Product details</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table>
    <tr>
        <td>Name: </td>
        <td>${requestScope["product"].getName()}</td>
    </tr>
    <tr>
        <td>Amount: </td>
        <td>${requestScope["product"].getAmount()}</td>
    </tr>
    <tr>
        <td>Image: </td>
        <td>${requestScope["product"].getPrice()}</td>
    </tr>
</table>
</body>
</html>
