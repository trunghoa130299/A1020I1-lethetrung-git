drop database if exists oto_management;

create database oto_management;

use oto_management;

create table offices(
	idvanphong int primary key auto_increment,
    `thanhpho` varchar(45),
    diachi1 varchar(45),
    diachi2 varchar(45),
    sdt varchar(45),
    vung varchar(45),
    idvung varchar(15),
    quocgia varchar(45)
);

create table employees(
	idnhanvien int primary key auto_increment,
    `tennhanvien` varchar(45),
    email varchar(45),
    tencongviec varchar(45),
    reportto int,
    idvanphong int,
    foreign key(idvanphong) references offices(idvanphong),
    foreign key(reportto) references employees(idnhanvien)
);

create table customer(
	idkhachhang int primary key auto_increment,
    `tencongtykh` varchar(45),
    hokhachhang varchar(45),
    tenkhachhang varchar(45),
    sdt varchar(45),
    diachi1 varchar(45),
    diachi2 varchar(45),
    thanhpho varchar(45),
    vung varchar(45),
    idvung varchar(45),
    quocgia varchar(45),
    hanmuctindung varchar(45),
    idnhanvien_empl int,
    foreign key (idnhanvien_empl) references employees(idnhanvien)
);
create table productsline(
	idsanpham int primary key auto_increment,
    `mota` varchar(45),
    anh varchar (45)
);

create table products(
	idsanphams int primary key auto_increment,
	`tensp` varchar(45),
	tile varchar(10),
	nhacungcap varchar(45),
	motasp varchar(45),
	soluong int,
	gianhap int,
	giaban int,
	idsanpham_prl int,
	foreign key (idsanpham_prl) references productsline(idsanpham)
);
create table oders(
	idoder int primary key auto_increment,
    `ngaymua` date,
    ngayyeucaugiaohang date,
    ngayyeucaugiaothucte date,
    trangthai varchar (45),
    ghichu varchar(45),
    soluong int,
    dongia int,
    idkhachhang_cs int,
    
    foreign key (idkhachhang_cs) references customer(idkhachhang)
);
create table payments(
	idthanhtoan int primary key auto_increment,
    `idkiemtra` varchar(45),
    ngaythanhtoan date,
    sotien int,
    idkhachhang_cs int,
    foreign key (idkhachhang_cs) references customer(idkhachhang)
);


create table products_odersdetails_oders(
	id_idsanphams int,
    id_idoder int,
    primary key(id_idsanphams,id_idoder),
    foreign key (id_idsanphams) references products(idsanphams),
    foreign key (id_idoder) references oders(idoder)
);


