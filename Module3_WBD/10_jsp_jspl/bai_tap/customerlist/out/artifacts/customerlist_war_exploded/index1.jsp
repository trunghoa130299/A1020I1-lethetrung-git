<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<h3>Danh Sách Khách Hàng</h3>
<table border="1">
  <tr>
    <th>Tên</th>
    <th>Ngày Sinh</th>
    <th>Địa Chỉ</th>
    <th>Ảnh</th>
  </tr>
  <c:forEach var="customer" items="${list}">
    <tr>
      <td><c:out value="${customer.name}"/></td>
      <td><c:out value="${customer.dayOfBirth}"/></td>
      <td><c:out value="${customer.address}"/></td>
      <td><img src="anh/trunghoa.jpg" style="width: 50px; height: 50px;"/></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>

