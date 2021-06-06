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
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                Create UserService
            </button>
        </div>
        <div class="col-lg-10"></div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <h2 class="text-center"> List</h2>
            <table id="tableCustomer" class="table table-striped table-bordered" style="width: 100%">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Họ Tên</th>
                    <th>ID Hợp Đồng</th>
                    <th>ID Hợp Đồng Chi Tiết</th>
                    <th>Tên Dịch Vụ Đi Kèm</th>
                    <th></th>
                    <th></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${listUserService}" var="userservice">
                    <tr>
                        <td><c:out value="${userservice.getIdkhachhang()}"/></td>
                        <td><c:out value="${userservice.getHoten()}"/></td>
                        <td><c:out value="${userservice.getIdhopdong()}"/></td>
                        <td><c:out value="${userservice.getIdhopdongchitiet()}"/></td>
                        <td><c:out value="${userservice.getTendichvudikem()}"/></td>
                        <td>
                            <a class="nav-link rounded btn-danger" href="/?action=editCustomer&id=${userservice.getIdKhachHang()}">
                                Edit
                            </a>
                        </td>
                        <td><a class="btn btn-danger" href="#" onclick="customerSetId('${userservice.idkhachhang}','${userservice.hoten}')"
                               data-toggle="modal" data-target="#deleteModal">Delete</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
