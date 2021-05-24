<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="bootstrap413/css/bootstrap.min.css" />
    <link rel="stylesheet" href="datatables/css/dataTables.bootstrap4.min.css" />
</head>
<body>
<jsp:include page="header.jsp" />
<div class="container">
    <div class="row">
        <div class="col-lg-3 bg-light">
            <ul class="nav flex-column">
                <li class="nav-item"><a class="nav-link" href="?action=createCustomer">Create New Customer</a></li>
            </ul>
        </div>
        <div class="col-lg-9">
            <h2 class="text-center">Customer List</h2>
            <table id="tableCustomer" class="table table-striped table-bordered" style="width: 100%">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Họ Tên</th>
                        <th>Ngày Sinh</th>
                        <th>CMND</th>
                        <th>Số Điện Thoại</th>
                        <th>Email</th>
                        <th>Địa Chỉ</th>
                        <th>ID Loại Khách</th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach  items="${listCustomer}" var="customers">
                        <tr>
                            <td><c:out value="${customers.getIdKhachHang()}"/></td>
                            <td><c:out value="${customers.getHoten()}"/></td>
                            <td><c:out value="${customers.getNgaySinh()}"/></td>
                            <td><c:out value="${customers.getCmnd()}"/></td>
                            <td><c:out value="${customers.getSdt()}"/></td>
                            <td><c:out value="${customers.getEmail()}"/></td>
                            <td><c:out value="${customers.getDiaChi()}"/></td>
                            <td><c:out value="${customers.getIdLoaiKhach_kh()}"/></td>
                            <td><a  class="nav-link" href="/?action=editCustomer&id=${customers.getIdKhachHang()}" >edit</a></td>
                            <td><a  class="nav-link" href="/?action=deleteCustomer&id=${customers.getIdKhachHang()}">delete</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap4.min.js"></script>
<script >
    $(document).ready(function () {
        $('#tableCustomer').dataTable({
            "dom" : 'lrtip',
            "lengthChange" : false,
            "pageLength" : 5
        });
    });
</script>
</body>
</html>