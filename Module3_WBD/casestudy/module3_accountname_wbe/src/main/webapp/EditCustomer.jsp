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
        <div class="col-lg-3">
            <ul class="nav flex-column">
                <li class="nav-item"><a class="nav-link" href="?action=showCustomer">Back To List Customer</a></li>
            </ul>
        </div>
        <div class="col-lg-9">
            <h1 class="text-center">Edit Customer</h1>
            <p>
                <c:if test='${requestScope["message"] != null}'>
                    <span class="message text-primary">${requestScope["message"]}</span>
                </c:if>
            </p>
            <form method="post">
                <fieldset>
                    <legend>Customer Information</legend>
                    <table>
                        <tr>
                            <td>Họ Tên :</td>
                            <td><input type="text" name="hoten" id="name"
                                       value="${requestScope["customer"].getHoten()}"></td>
                        </tr>
                        <tr>
                            <td>Ngày Sinh :</td>
                            <td><input type="date" name="ngaysinh" id="ngaySinh"
                                       value="${requestScope["customer"].getNgaySinh()}"></td>
                        </tr>
                        <tr>
                            <td>CMND :</td>
                            <td><input type="text" name="cmtnd" id="cmtnd"
                                       value="${requestScope["customer"].getCmnd()}"></td>
                        </tr>
                        <tr>
                            <td>Số Điện Thoại :</td>
                            <td><input type="text" name="sdt" id="sdt" value="${requestScope["customer"].getSdt()}">
                            </td>
                        </tr>
                        <tr>
                            <td>Email :</td>
                            <td><input type="text" name="email" id="email"
                                       value="${requestScope["customer"].getEmail()}"></td>
                        </tr>
                        <tr>
                            <td>Địa Chỉ :</td>
                            <td><input type="text" name="diachi" id="diachi"
                                       value="${requestScope["customer"].getDiaChi()}"></td>
                        </tr>
                        <tr>
                            <td>ID loại khách :</td>
                            <td>
                                <select name="idloaikhach_kh" id="idloaikhach_kh" required>
                                    <option value="1" id="Diamond">Diamond</option>
                                    <option value="2" id="Platinium">Platinium</option>
                                    <option value="3" id="Gold">Gold</option>
                                    <option value="4" id="Silver">Silver</option>
                                    <option value="5" id="Member">Member</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td></td>
                            <td><input type="submit" value="Update customer" class="btn btn-outline-success"></td>
                        </tr>
                    </table>
                </fieldset>
            </form>
        </div>
    </div>
</div>
<script>
    function editSelect() {
        let id = ${requestScope["customer"].getIdLoaiKhach_kh()};
        let type = "";
        switch (id) {
            case 1:
                type = "Diamond";
                break;
            case 2:
                type = "Platinium";
                break;
            case 3:
                type = "Gold";
                break;
            case 4:
                type = "Silver";
                break;
            case 5:
                type = "Member";
                break;
        }
        document.getElementById(type).selected = true;
    }

    $(window).on('load', function () {
        editSelect();
    });
</script>
</body>
</html>
