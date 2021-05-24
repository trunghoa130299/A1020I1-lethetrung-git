<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <style>
        #footer {
            background-color: #003366;
            height: auto;
            padding: 20px;
            position: relative;
            width: 100%;
            border-bottom: 1px solid #CCCCCC;
            border-top: 1px solid #DDDDDD;
            margin-top: 17.8%;
        }
    </style>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="text-secondary text-center" style="padding-top: 15%">WellCome To Website</h1>
        </div>
    </div>
    <div id="footer">
        <div class="row">
            <div class="col-lg-12">
                <p class="text-center text-light"> @Copyright 2021 by Lê Thế Trung. All Rights Reserved.</p>
            </div>
        </div>
    </div>
</div>

<script src="js/jquery-3.6.0.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>
