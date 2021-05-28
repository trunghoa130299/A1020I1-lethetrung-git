<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="bootstrap413/css/bootstrap.min.css" />
    <link rel="stylesheet" href="datatables/css/dataTables.bootstrap4.min.css" />
</head>
<body>
<jsp:include page="header1.jsp" />
<div class="container">
    <div class="row">
        <div class="col-lg-2 bg-light">
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#employeeModal">
                Create Employee
            </button>
        </div>
        <div class="col-lg-10"></div>
    </div>
    <div class="row">
        <div class="col-lg-12">
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
                        <td><a  class="nav-link rounded btn-danger" href="/?action=editEmployee&id=${employees.getIdNhanVien()}">
                            Edit</a></td>
                        <td>
                            <a class="btn btn-danger" href="#" onclick="customerSetId('${employees.idNhanVien}','${employees.hoTen}')"
                               data-toggle="modal" data-target="#deleteModal">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
<!-- Modal -->
<div class="modal fade" id="employeeModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <form method="post" action="?action=createEmployee">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Employee Information</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <fieldset>
                        <legend></legend>
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
                <h5 class="modal-title" id="exampleModalLabel2">Delete Employee</h5>
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
<form action="/" method="post" id="deleteEmployee">
    <input type="hidden" name="action" value="deleteEmployee">
    <input type="hidden" name="idEmployee" id="idEmployee">
</form>
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
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
    function customerSetId(id, name) {
        document.getElementById("idEmployee").value = id;
        document.getElementById("modelId").value = "Do you want delete employee name: " + name;
    }

    function submitDelete() {
        <!-- để submit form delete  -->
        document.getElementById("deleteEmployee").submit();
    }
</script>
</body>
</html>
