drop database if exists furama_resort_management;

create database furama_resort_management;

use furama_resort_management;

create table vitri (
	idvitri  int not null primary key auto_increment,
	`tenvitri` varchar(45)
);

create table trinhdo(
	idtrinhdo int not null primary key auto_increment,
	`trinhdo` varchar(45)
);

create table bophan(
	idbophan  int not null primary key auto_increment,
	`tenbophan` varchar(45)
);

create table nhanvien(
	idnhanvien int,
	hoten varchar(50),
	ngaysinh date,
    socmtnd varchar(45),
    luong varchar(45),
    sdt varchar(45),
    email varchar(45),
    diachi varchar(45),
	idvitri_nv int,
	idtrinhdo_nv int,
	idbophan_nv int,
	primary key (idnhanvien),
	foreign key (idvitri_nv) references vitri(idvitri),
	foreign key (idtrinhdo_nv) references trinhdo(idtrinhdo),
	foreign key (idbophan_nv) references bophan(idbophan)
);

create table loaikhach(
	idloaikhach int not null primary key auto_increment,
    `tenloaikhach` varchar(45)
);

create table khachhang(
	idkhachhang int not null primary key auto_increment,
    `hoten` varchar(45),
    ngaysinh date,
    socmtnd varchar(45),
    sdt varchar(45),
    email varchar(45),
    diachi varchar(45),
     idloaikhach_kh int ,
    foreign key (idloaikhach_kh) references loaikhach(idloaikhach)
);

create table dichvudikem(
	iddichvudikem int not null primary key auto_increment,
    `tendichvudikem` varchar(45),
    gia int,
    donvi int,
    trangthaikhadung varchar(45)
);

create table loaidichvu(
	idloaidichvu int not null primary key auto_increment,
    `tenloaidichvu` varchar(45)
);

create table kieuthue(
	idkieuthue int not null primary key auto_increment,
    `tenkieuthue` varchar(45),
    gia int
);

create table dichvu(
	iddichvu int not null primary key auto_increment,
    `tendichvu` varchar(45),
    dientich int ,
    sotang int ,
    songuoitoida varchar(45),
    chiphithue varchar(45),
    idkieuthue_dv int,
    idloaidichvu_dv int,
    trangthai varchar(45),
    foreign key (idkieuthue_dv) references kieuthue(idkieuthue),
    foreign key (idloaidichvu_dv)  references loaidichvu(idloaidichvu)
);

create table hopdong(
	idhopdong int not null primary key auto_increment,
    `ngaylamhopdong` date,
    ngayketthuc date,
    tiendatcoc int,
    tongtien int,
    idnhanvien_hd int,
    idkhachhang_hd int,
    iddichvu_hd int,
    foreign key (idnhanvien_hd) references nhanvien(idnhanvien),
    foreign key (idkhachhang_hd) references khachhang(idkhachhang),
    foreign key (iddichvu_hd) references dichvu(iddichvu)
);

create table hopdongchitiet(
	idhopdongchitiet int not null primary key auto_increment,
    `soluong` int ,
    iddichvudikem_hdct int,
    idhopdong_hdct int,
    foreign key(idhopdong_hdct) references hopdong(idhopdong),
    foreign key(iddichvudikem_hdct) references dichvudikem(iddichvudikem)
);

