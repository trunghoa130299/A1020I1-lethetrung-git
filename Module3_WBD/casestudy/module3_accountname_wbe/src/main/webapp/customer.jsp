<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="bootstrap413/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="datatables/css/dataTables.bootstrap4.min.css"/>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container">
    <div class="row">
        <div class="col-lg-2 bg-light">
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                Create Customer
            </button>
        </div>
        <div class="col-lg-10"></div>
    </div>
    <div class="row">
        <div class="col-lg-12">
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
                <c:forEach items="${listCustomer}" var="customers">
                    <tr>
                        <td><c:out value="${customers.getIdKhachHang()}"/></td>
                        <td><c:out value="${customers.getHoten()}"/></td>
                        <td><c:out value="${customers.getNgaySinh()}"/></td>
                        <td><c:out value="${customers.getCmnd()}"/></td>
                        <td><c:out value="${customers.getSdt()}"/></td>
                        <td><c:out value="${customers.getEmail()}"/></td>
                        <td><c:out value="${customers.getDiaChi()}"/></td>
<%--                        <td><c:out value="${customers.getIdLoaiKhach_kh()}"/></td>--%>
                        <td><c:choose>
                            <c:when test="${customers.getIdLoaiKhach_kh() ==1}">Diamond</c:when>
                            <c:when test="${customers.getIdLoaiKhach_kh() ==2}">Platinium</c:when>
                            <c:when test="${customers.getIdLoaiKhach_kh() ==3}">Gold</c:when>
                            <c:when test="${customers.getIdLoaiKhach_kh() ==4}">Silver</c:when>
                            <c:otherwise>Member</c:otherwise>
                        </c:choose></td>
                        <td>
                            <a class="nav-link rounded btn-secondary" href="/a?action=editCustomer&id=${customers.getIdKhachHang()}">
                                Edit
                            </a>
                        </td>
                        <td><a class="btn btn-danger" href="#" onclick="customerSetId('${customers.idKhachHang}','${customers.hoten}')"
                               data-toggle="modal" data-target="#deleteModal">Delete</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <form method="post" action="?action=createCustomer">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Customer Information</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <fieldset>
                        <table>
                            <tr>
                                <td>Họ Tên :</td>
                                <td><input type="text" name="hoten" id="name" required></td>
                            </tr>
                            <tr>
                                <td>Ngày Sinh :</td>
                                <td><input type="date" name="ngaysinh" id="ngaySinh" required></td>
                            </tr>
                            <tr>
                                <td>CMND :</td>
                                <td><input type="text" name="cmtnd" id="cmtnd" required></td>
                            </tr>
                            <tr>
                                <td>Số Điện Thoại :</td>
                                <td><input type="text" name="sdt" id="sdt" required></td>
                                <p>
                                    <c:if test='${requestScope["msg"] != null}'>
                                        <span class="message text-primary">${requestScope["msg"]}</span>
                                    </c:if>
                                </p>
                            </tr>
                            <tr>
                                <td>Email :</td>
                                <td><input type="text" name="email" id="email" required></td>
                            </tr>
                            <tr>
                                <td>Địa Chỉ :</td>
                                <td><input type="text" name="diachi" id="diachi" required></td>
                            </tr>
                            <tr>
                                <td>ID loại khách :</td>
                                <td><select name="idloaikhach_kh" required>
                                    <option value="">--Please choose--</option>
                                    <option value="1">Diamond</option>
                                    <option value="2">Platinium</option>
                                    <option value="3">Gold</option>
                                    <option value="4">Silver</option>
                                    <option value="5">Member</option>
                                </select></td>
                            </tr>
                        </table>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            <input type="submit" value="Save" class="btn btn-primary">
                        </div>
                    </fieldset>
                </div>
            </form>
        </div>
    </div>
</div>
<div class="modal fade" id="deleteModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel2"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel2">Delete Customer</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <input type="text" id="modelId" size="50" disabled style="border: none;background: white; color: red">
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-danger" onclick="submitDelete()">Delete</button>
            </div>
        </div>
    </div>
</div>
<form action="/a" method="post" id="deleteCustomer">
    <input type="hidden" name="action" value="deleteCustomer">
    <input type="hidden" name="idCustomer" id="idCustomer">
</form>
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableCustomer').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });
    function customerSetId(id, name) {
        document.getElementById("idCustomer").value = id;
        document.getElementById("modelId").value = "Do you want delete customer name: " + name;
    }

    function submitDelete() {
        <!-- để submit form delete  -->
        document.getElementById("deleteCustomer").submit();
    }
</script>
</body>
</html>