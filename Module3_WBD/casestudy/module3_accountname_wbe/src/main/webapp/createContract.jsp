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
                    <legend >Create Contract</legend>
                    <p>
                        <c:if test='${requestScope["message"] != null}'>
                            <span class="message text-primary">${requestScope["message"]}</span>
                        </c:if>
                    </p>
                    <table>
                        <tr>
                            <td>Ngày Làm Hợp Đồng</td>
                            <td><input type="date" name="ngaylamhopdong"></td>
                        </tr>
                        <tr>
                            <td>Ngày kết thúc</td>
                            <td><input type="date" name="ngayketthuc"></td>
                        </tr>
                        <tr>
                            <td>Tiền đặt cọc</td>
                            <td><input type="text" name="tiendatcoc"></td>
                        </tr>
                        <tr>
                            <td>Tổng tiền</td>
                            <td><input type="text" name="tongtien"></td>
                        </tr>
                        <tr>
                            <td>ID Nhân Viên</td>
                            <td><input type="text" name="idnhanvien_hd"></td>
                        </tr>
                        <tr>
                            <td>ID Khách Hàng</td>
                            <td><input type="text" name="idkhachhang_hd"></td>
                        </tr>
                        <tr>
                            <td>ID Dịch Vụ</td>
                            <td><input type="text" name="iddichvu_hd"></td>
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
