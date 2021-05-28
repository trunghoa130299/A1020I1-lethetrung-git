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
        <div class="col-lg-2 bg-light">
            <ul class="nav flex-column">
                <li class="nav-item"><a class="nav-link" href="?action">Back Home</a></li>
            </ul>
        </div>
        <div class="col-lg-10">
            <form class="form-group" action="?action=createService" method="post">
                <fieldset>
                    <legend>Create New Service</legend>
                    <p>
                        <c:if test='${requestScope["message"] != null}'>
                            <span class="message text-primary">${requestScope["message"]}</span>
                        </c:if>
                    </p>
                    <table>
                        <tr>
                            <td>Tên Dịch Vụ :</td>
                            <td><input type="text" name="tendichvu" ></td>
                        </tr>
                        <tr>
                            <td>Diện Tích :</td>
                            <td><input type="text" name="dientich" ></td>
                        </tr>
                        <tr>
                            <td>Chi Phí Thuê:</td>
                            <td><input type="text" name="chiphithue"></td>
                        </tr>
                        <tr>
                            <td>Số Người Tối Đa :</td>
                            <td><input type="text" name="songuoitoida"></td>
                        </tr>
                        <tr>
                            <td>ID Kiểu Thuê :</td>
                            <td><input type="text" name="idkieuthue_dv"></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td> <input type="submit" value="Save" class="btn btn-primary"></td>
                    </table>
                </fieldset>
            </form>
        </div>
    </div>
</div>
</body>
</html>
