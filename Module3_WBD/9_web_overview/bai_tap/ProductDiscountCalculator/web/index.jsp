<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/discount" method="post">
    <p>Mô Tả</p>
    <input type="text" \>
    <p>List Price :</p>
    <input type="text" name="listprice"\>
    <p>Discount Percent</p>
    <input type="text" name="discountpercent"\>
    <input type="submit" value="Discount Amount" \>
    <h1><%= request.getAttribute("discountamount")%></h1>
  </form>
  </body>
</html>
