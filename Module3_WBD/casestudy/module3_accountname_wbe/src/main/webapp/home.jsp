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
            clear: both;
        }
    </style>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img class="d-block w-100"
                             src="https://furamavietnam.com/wp-content/uploads/2019/07/Vietnam_Danang_Furama_Resort_Exterior_Ocean-Pool-6.jpg"
                             alt="First slide">
                        <div class="carousel-caption d-none d-md-block">
                            <p></p>
                            <h2 style="color: #fff ; line-height: 34px;">
                                <strong>KHU NGHỈ DƯỠNG ẨM THỰC</strong>
                                <br>
                                <strong>TỌA LẠC TẠI BÃI BIỂN ĐÀ NẴNG</strong>
                                <br>
                                <strong>"MỘT TRONG 6 BÃI BIỂN ĐẸP NHẤT THẾ GIỚI"</strong>
                                <br>
                            </h2>
                            <p></p>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100"
                             src="https://furamavietnam.com/wp-content/uploads/2018/07/Vietnam_Danang_Furama_Resort_Exterior-Furama-girl-with-pink-hat.jpg"
                             alt="Second slide">
                        <div class="carousel-caption d-none d-md-block">
                            <p></p>
                            <h2 style="color: #fff ; line-height: 34px;">
                                <strong>KHU NGHỈ DƯỠNG ẨM THỰC</strong>
                                <br>
                                <strong>TỌA LẠC TẠI BÃI BIỂN ĐÀ NẴNG</strong>
                                <br>
                                <strong>"MỘT TRONG 6 BÃI BIỂN ĐẸP NHẤT THẾ GIỚI"</strong>
                                <br>
                            </h2>
                            <p></p>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100"
                             src="https://furamavietnam.com/wp-content/uploads/2018/07/Vietnam_Danang_Furama_Resort_Exterior_Courtyard.jpg"
                             alt="Third slide">
                        <div class="carousel-caption d-none d-md-block">
                            <p></p>
                            <h2 style="color: #fff ; line-height: 34px;">
                                <strong>KHU NGHỈ DƯỠNG ẨM THỰC</strong>
                                <br>
                                <strong>TỌA LẠC TẠI BÃI BIỂN ĐÀ NẴNG</strong>
                                <br>
                                <strong>"MỘT TRONG 6 BÃI BIỂN ĐẸP NHẤT THẾ GIỚI"</strong>
                                <br>
                            </h2>
                            <p></p>
                        </div>
                    </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>
    </div>
    <div class="row mt-5">
        <div class="col-lg-3"></div>
        <div class="col-lg-6">
            <h2 style="font-size: 24px;color: #cbbe73;line-height: 36px;text-align: center;font-family:Playfair Display;font-weight:700;font-style:normal" class="vc_custom_heading">
                CÁC LOẠI PHÒNG
            </h2>
            <p class="text-center">Khu nghỉ dưỡng có 196 phòng được thiết kế theo phong cách truyền thống Việt Nam
                kết hợp với phong cách Pháp, 2 tòa nhà 4 tầng có hướng nhìn ra biển, nhìn ra hồ
                bơi trong xanh và những khu vườn nhiệt đới xanh tươi mát. Ngoài ra, khu nghỉ dưỡng
                Furama còn cung cấp các liệu pháp spa, phòng xông hơi ướt, phòng xông hơi khô, dịch vụ mát-xa cạnh hồ bơi,
                các dịch vụ thể thao dưới nước và các lớp tập yoga và Thái Cực Quyền trên bãi biển.</p>
            <h5 class="text-center">VIEW ALL ROOMS</h5>
        </div>
        <div class="col-lg-3"></div>
    </div>
    <div class="row mt-5">
        <div class="col-lg-4">
            <div class="card">
                <div class="card-header">
                    <h6 class="text-center text-secondary">ROOM</h6>
                </div>
                <div class="card-body">
                    <img src="img/room1.jpg" class="img-thumbnail img-fluid">
                </div>
                <div class="card-footer">
                    <p class="text-center"> <button class="btn-primary">Booking</button></p>
                </div>
            </div>
        </div>
        <div class="col-lg-4">
            <div class="card">
                <div class="card-header">
                    <h6 class="text-center text-secondary">VIP</h6>
                </div>
                <div class="card-body">
                    <img src="img/vip1.jpg" class="img-thumbnail img-fluid">
                </div>
                <div class="card-footer">
                    <p class="text-center"> <button class="btn-primary">Booking</button></p>
                </div>
            </div>
        </div>
        <div class="col-lg-4">
            <div class="card">
                <div class="card-header">
                    <h6 class="text-center text-secondary">MEMBER</h6>
                </div>
                <div class="card-body">
                    <img src="img/thuong.jpg" class="img-thumbnail img-fluid">
                </div>
                <div class="card-footer">
                    <p class="text-center"> <button class="btn-primary">Booking</button></p>
                </div>
            </div>
        </div>
    </div>
    <div class="row mt-5">
        <div class="col-lg-4">
            <h2 style="font-size: 24px;color: #cbbe73;line-height: 36px;text-align: left;font-family:Playfair Display;font-weight:700;font-style:normal" class="vc_custom_heading">
                KHU NGHỈ DƯỠNG ĐẲNG CẤP THẾ GIỚI, FURAMA ĐÀ NẴNG, NỔI TIẾNG LÀ KHU NGHỈ DƯỠNG ẨM THỰC TẠI VIỆT NAM.</h2>
        </div>
        <div class="col-lg-4">
            <a href="https://www.youtube.com/watch?v=IjlT_4mvd-c" class="video-btn js-video-btn">
                <img width="1000" height="754" src="https://furamavietnam.com/wp-content/uploads/2018/07/Vietnam_Danang_Furama_Resort_Exterior_Beach.jpg"
                     class="img-fluid" alt="" srcset="https://furamavietnam.com/wp-content/uploads/2018/07/Vietnam_Danang_Furama_Resort_Exterior_Beach.jpg 1000w,
                 https://furamavietnam.com/wp-content/uploads/2018/07/Vietnam_Danang_Furama_Resort_Exterior_Beach-300x226.jpg 300w,
                  https://furamavietnam.com/wp-content/uploads/2018/07/Vietnam_Danang_Furama_Resort_Exterior_Beach-768x579.jpg 768w,
                   https://furamavietnam.com/wp-content/uploads/2018/07/Vietnam_Danang_Furama_Resort_Exterior_Beach-747x563.jpg 747w,
                    https://furamavietnam.com/wp-content/uploads/2018/07/Vietnam_Danang_Furama_Resort_Exterior_Beach-370x279.jpg 370w,
                     https://furamavietnam.com/wp-content/uploads/2018/07/Vietnam_Danang_Furama_Resort_Exterior_Beach-317x239.jpg 317w,
                      https://furamavietnam.com/wp-content/uploads/2018/07/Vietnam_Danang_Furama_Resort_Exterior_Beach-139x105.jpg 139w"
                     sizes="(max-width: 1000px) 100vw, 1000px"></a>
        </div>
        <div class="col-lg-4">
            <p style="text-align: justify;">Hướng ra bãi biển Đà Nẵng trải dài cát trắng,
                Furama Resort Đà Nẵng là cửa ngõ đến với 3 di sản văn hoá thế giới: Hội An
                (20 phút), Mỹ Sơn (90 phút) và Huế (2 tiếng. 196 phòng hạng sang cùng với 70
                căn biệt thự từ hai đến bốn phòng ngủ có hồ bơi riêng đều được trang trí trang nhã,
                theo phong cách thiết kế truyền thống của Việt Nam và kiến trúc thuộc địa của Pháp,
                biến Furama thành khu nghỉ dưỡng danh giá nhất tại Việt Nam – vinh dự được đón tiếp
                nhiều người nổi tiếng, giới hoàng gia,
                chính khách, ngôi sao điện ảnh và các nhà lãnh đạo kinh doanh quốc tế.</p>
        </div>
    </div>
</div>
<div id="footer">
    <div class="row">
        <div class="col-lg-12">
            <p class="text-center text-light"> @Copyright 2021 by Lê Thế Trung. All Rights Reserved.</p>
        </div>
    </div>
</div>
<script src="js/jquery-3.6.0.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>
