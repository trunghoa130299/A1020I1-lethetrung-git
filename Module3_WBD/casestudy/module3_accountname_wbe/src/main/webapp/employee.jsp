<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
        <div class="col-lg-2 bg-light">
            <ul class="nav flex-column">
                <li class="nav-item"><a class="nav-link" href="?action=createEmployee">Create New Employee</a></li>
            </ul>
        </div>
        <div class="col-lg-10">
            <h2 class="text-center">Employee List</h2>
            <table id="tableEmployee" class="table table-striped table-bordered" style="width: 100%">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Họ Tên</th>
                    <th>Ngày Sinh</th>
                    <th>CMND</th>
                    <th>Lương</th>
                    <th>Số Điện Thoại</th>
                    <th>Email</th>
                    <th>Vị Trí</th>
                    <th>Trình Độ</th>
                    <th></th>
                    <th></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach  items="${listEmployee}" var="employees">
                    <tr>
                        <td><c:out value="${employees.getIdNhanVien()}"/></td>
                        <td><c:out value="${employees.getHoTen()}"/></td>
                        <td><c:out value="${employees.getNgaySinh()}"/></td>
                        <td><c:out value="${employees.getCmnd()}"/></td>
                        <td><c:out value="${employees.getLuong()}"/></td>
                        <td><c:out value="${employees.getSdt()}"/></td>
                        <td><c:out value="${employees.getEmail()}"/></td>
                        <td><c:out value="${employees.getIdVitri_nv()}"/></td>
                        <td><c:out value="${employees.getIdTrinhDo_nv()}"/></td>
                        <td><a  class="nav-link" href="/?action=editEmployee&id=${employees.getIdNhanVien()}" >edit</a></td>
                        <td><a  class="nav-link" href="/?action=deleteEmployee&id=${employees.getIdNhanVien()}">delete</a></td>
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
        $('#tableEmployee').dataTable({
            "dom" : 'lrtip',
            "lengthChange" : false,
            "pageLength" : 5
        });
    });
</script>
</body>
</html>
