<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 4/28/2021
  Time: 9:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/discount" method="post">
    <p>List Price :</p>
    <input type="text" name="listprice"\>
    <p>Discount Percent</p>
    <input type="text" name="discountpercent"\>
    <input type="submit" value="da" \>
    <h1><%= request.getAttribute("discountamount")%></h1>
  </form>
  </body>
</html>
