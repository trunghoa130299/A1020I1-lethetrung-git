<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container">
    <div class="row">
        <div class="col-lg-2">
            <a class="nav-link" href="?action=showContract">Back</a>
        </div>
        <div class="col-lg-10">
            <form class="form-group" method="post">
                <fieldset>
                    <legend >Create Contract Detail</legend>
                    <p>
                        <c:if test='${requestScope["message"] != null}'>
                            <span class="message text-primary">${requestScope["message"]}</span>
                        </c:if>
                    </p>
                    <table>
                        <tr>
                            <td>Số Lượng</td>
                            <td><input type="text" name="soluong"></td>
                        </tr>
                        <tr>
                            <td>ID dịch vụ đi kèm</td>
                            <td><input type="text" name="iddichvudikem_hdct"></td>
                        </tr>
                        <tr>
                            <td>ID hợp đồng</td>
                            <td><input type="text" name="idhopdong_hdct"></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td><input type="submit" value="Save" class="btn btn-outline-success"></td>
                        </tr>
                    </table>
                </fieldset>
            </form>
        </div>
    </div>
</div>
</body>
</html>
