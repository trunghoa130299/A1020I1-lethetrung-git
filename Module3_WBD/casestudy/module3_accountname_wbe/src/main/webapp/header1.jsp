<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <style>
        .header-1{
            padding-top: 5%;
            float: right;
        }
        .ul-1{
            margin-left: 10%;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-lg-3">
            <img src="https://phamkhoi.com/Editor/blog/nhat%20ky/logo%20hoa/nghe-thua-thiet-ke-logo-theo-dang-canh-hoa%205.jpg" class="img-fluid img-thumbnail">
        </div>
        <div class="col-lg-9">
            <div class="text-danger header-1">
                <h3>Lê Thế Trung</h3>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <ul class="navbar-nav ul-1">
                    <li class="nav-item active">
                        <a class="nav-link" href="?action">Home</a>
                    </li>
                    <li class="nav-item active pl-3">
                        <a class="nav-link" href="?action=showEmployee">Employee</a>
                    </li>
                    <li class="nav-item active pl-3">
                        <a class="nav-link" href="?action=showCustomer">Customer</a>
                    </li>
                    <li class="nav-item active pl-3">
                        <a class="nav-link" href="?action=showService">Service</a>
                    </li>
                    <li class="nav-item active pl-3">
                        <a class="nav-link" href="?action=showContract">Contract</a>
                    </li>
                    <li class="nav-item active pl-3">
                        <a class="nav-link" href="?action=showUserService">UserService</a>
                    </li>
                </ul>
                <form action="" class="form-inline my-2 my-lg-0 form-1 pl-5">
                    <input type="hidden" name="action" value="search1">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search"
                           aria-label="Search" name="value">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>
            </nav>
        </div>
    </div>
</div>
<script src="js/jquery-3.6.0.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>
