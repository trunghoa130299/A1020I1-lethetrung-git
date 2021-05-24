<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div class="container">
    <div class="row">
        <div class="col-lg-3"><ul class="nav flex-column">
            <li class="nav-item"><a class="nav-link" href="?action=showEmployee">Back To List Employee</a></li>
        </ul></div>
        <div class="col-lg-9">
            <h1 class="text-center">Create New Employee</h1>
            <p>
                <c:if test='${requestScope["message"] != null}'>
                    <span class="message text-primary" >${requestScope["message"]}</span>
                </c:if>
            </p>
            <form method="post">
                <fieldset>
                    <legend>Employee Information</legend>
                    <table>
                        <tr>
                            <td>Họ Tên :</td>
                            <td><input type="text" name="hoten" id="name"></td>
                        </tr>
                        <tr>
                            <td>Ngày Sinh :</td>
                            <td><input type="date" name="ngaysinh" id="ngaySinh"></td>
                        </tr>
                        <tr>
                            <td>CMND :</td>
                            <td><input type="text" name="cmtnd" id="cmtnd"></td>
                        </tr>
                        <tr>
                            <td>Lương :</td>
                            <td><input type="text" name="luong" id="luong"></td>
                        </tr>
                        <tr>
                            <td>Số Điện Thoại   :</td>
                            <td><input type="text" name="sdt" id="sdt"></td>
                        </tr>
                        <tr>
                            <td>Email :</td>
                            <td><input type="text" name="email" id="email"></td>
                        </tr>

                        <tr>
                            <td>Vị Trí :</td>
                            <td><select name="idVitri_nv">
                                <option value="1">Lễ Tân</option>
                                <option value="2">Phục Vụ</option>
                                <option value="3">Chuyên Viên</option>
                                <option value="4">Giám Sát</option>
                                <option value="5">Quản Lý</option>
                                <option value="6">Giám Đốc</option>
                            </select></td>
                        </tr>
                        <tr>
                            <td>Trình Độ :</td>
                            <td><select name="idTrinhDo_nv">
                                <option value="1">Trung Cấp</option>
                                <option value="2">Cao Đẳng</option>
                                <option value="3">Đại Học</option>
                                <option value="4">Sau Đại Học</option>
                            </select></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td><input type="submit" value="Create employee"  class="btn btn-outline-success"></td>
                        </tr>
                    </table>
                </fieldset>
            </form>
        </div>
    </div>
</div>
</body>
</html>
