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
insert into vitri
values (1,'quản lí');

insert into vitri (`tenvitri`)
values ('nhân viên'),
('nhân viên'),
('nhân viên'),
('nhân viên');

insert into trinhdo 
values (1,'giỏi');

insert into trinhdo (`trinhdo`)
values ('khá'),
('trung bình'),
('yếu'),
('kém');

insert into bophan
values (1,'nhân sự');

insert into bophan (`tenbophan`)
values ('bán hàng'),
('nhân sự'),
('bán hàng'),
('bán hàng');

INSERT INTO `furama_resort_management`.`nhanvien` (`idnhanvien`, `hoten`, `ngaysinh`, `socmtnd`, `luong`, `sdt`, `email`, `diachi`, `idvitri_nv`, `idtrinhdo_nv`, `idbophan_nv`) VALUES ('1', 'Nguyễn Văn A', '2021-09-01', '12345678', '5000000', '0123456789', 'a@abc.abc', 'Nghệ An', '1', '1', '1');
INSERT INTO `furama_resort_management`.`nhanvien` (`idnhanvien`, `hoten`, `ngaysinh`, `socmtnd`, `luong`, `sdt`, `email`, `diachi`, `idvitri_nv`, `idtrinhdo_nv`, `idbophan_nv`) VALUES ('2', 'Nguyễn Văn B', '2021-08-01', '743924', '6000000', '43234324', 'b@abc.abc', 'Đà Nẵng', '2', '2', '2');
INSERT INTO `furama_resort_management`.`nhanvien` (`idnhanvien`, `hoten`, `ngaysinh`, `socmtnd`, `luong`, `sdt`, `email`, `diachi`, `idvitri_nv`, `idtrinhdo_nv`, `idbophan_nv`) VALUES ('3', 'Nguyễn Văn C', '2021-07-01', '342234', '4000000', '234234432', 'c@abc.abc', 'Huế', '3', '3', '3');
INSERT INTO `furama_resort_management`.`nhanvien` (`idnhanvien`, `hoten`, `ngaysinh`, `socmtnd`, `luong`, `sdt`, `email`, `diachi`, `idvitri_nv`, `idtrinhdo_nv`, `idbophan_nv`) VALUES ('4', 'Nguyễn Văn D', '2021-06-01', '41245345', '32000000', '324432234', 'd@abc.abc', 'Quảng trị', '4', '4', '4');
INSERT INTO `furama_resort_management`.`nhanvien` (`idnhanvien`, `hoten`, `ngaysinh`, `socmtnd`, `luong`, `sdt`, `email`, `diachi`, `idvitri_nv`, `idtrinhdo_nv`, `idbophan_nv`) VALUES ('5', 'Nguyễn Văn E', '2021-05-01', '8437347', '5000000', '234432234', 'e@abc.abc', 'Hà Tĩnh', '5', '5', '5');

INSERT INTO `furama_resort_management`.`loaikhach` (`idloaikhach`, `tenloaikhach`) VALUES ('1', 'vip');
INSERT INTO `furama_resort_management`.`loaikhach` (`idloaikhach`, `tenloaikhach`) VALUES ('2', 'vip');
INSERT INTO `furama_resort_management`.`loaikhach` (`idloaikhach`, `tenloaikhach`) VALUES ('3', 'vip');
INSERT INTO `furama_resort_management`.`loaikhach` (`idloaikhach`, `tenloaikhach`) VALUES ('4', 'thường');
INSERT INTO `furama_resort_management`.`loaikhach` (`idloaikhach`, `tenloaikhach`) VALUES ('5', 'thường');
INSERT INTO `furama_resort_management`.`loaikhach` (`tenloaikhach`) VALUES ('vip');

INSERT INTO `furama_resort_management`.`loaidichvu` (`idloaidichvu`, `tenloaidichvu`) VALUES ('1', 'Room');
INSERT INTO `furama_resort_management`.`loaidichvu` (`idloaidichvu`, `tenloaidichvu`) VALUES ('2', 'House');
INSERT INTO `furama_resort_management`.`loaidichvu` (`idloaidichvu`, `tenloaidichvu`) VALUES ('3', 'Vip');
INSERT INTO `furama_resort_management`.`loaidichvu` (`idloaidichvu`, `tenloaidichvu`) VALUES ('4', 'Vip');
INSERT INTO `furama_resort_management`.`loaidichvu` (`idloaidichvu`, `tenloaidichvu`) VALUES ('5', 'House');

INSERT INTO `furama_resort_management`.`kieuthue` (`idkieuthue`, `tenkieuthue`, `gia`) VALUES ('1', 'Ngắn hạn', '1213434');
INSERT INTO `furama_resort_management`.`kieuthue` (`idkieuthue`, `tenkieuthue`, `gia`) VALUES ('2', 'Trung hạn', '32324');
INSERT INTO `furama_resort_management`.`kieuthue` (`idkieuthue`, `tenkieuthue`, `gia`) VALUES ('3', 'Ngắn Hạn', '4556');
INSERT INTO `furama_resort_management`.`kieuthue` (`idkieuthue`, `tenkieuthue`, `gia`) VALUES ('4', 'Ngắn Hạn', '34363');
INSERT INTO `furama_resort_management`.`kieuthue` (`idkieuthue`, `tenkieuthue`, `gia`) VALUES ('5', 'Trung Hạn', '3434');

INSERT INTO `furama_resort_management`.`khachhang` (`idkhachhang`, `hoten`, `ngaysinh`, `socmtnd`, `sdt`, `email`, `diachi`, `idloaikhach_kh`) VALUES ('1', 'Trung', '1999-04-07', '132123', '432423', 'trung@trung.abc', 'Nghệ An', '1');
INSERT INTO `furama_resort_management`.`khachhang` (`idkhachhang`, `hoten`, `ngaysinh`, `socmtnd`, `sdt`, `email`, `diachi`, `idloaikhach_kh`) VALUES ('2', 'Khánh', '1999-04-08', '12312321', '243423', 'khanh@khanh.abc', 'Đà Nẵng', '2');
INSERT INTO `furama_resort_management`.`khachhang` (`idkhachhang`, `hoten`, `ngaysinh`, `socmtnd`, `sdt`, `email`, `diachi`, `idloaikhach_kh`) VALUES ('3', 'Đạt', '1999-04-09', '43234', '13212', 'dat@dat.abc', 'Quảng Nam', '3');
INSERT INTO `furama_resort_management`.`khachhang` (`idkhachhang`, `hoten`, `ngaysinh`, `socmtnd`, `sdt`, `email`, `diachi`, `idloaikhach_kh`) VALUES ('4', 'Thành', '1999-04-10', '341234', '13123', 'thanh@thanh.abc', 'Đà Nẵng', '4');
INSERT INTO `furama_resort_management`.`khachhang` (`idkhachhang`, `hoten`, `ngaysinh`, `socmtnd`, `sdt`, `email`, `diachi`, `idloaikhach_kh`) VALUES ('5', 'Tuấn', '1999-04-11', '123123', '123312', 'tuan@tuan.abc', 'Quảng Trị', '5');
INSERT INTO `furama_resort_management`.`khachhang` (`idkhachhang`, `hoten`, `ngaysinh`, `socmtnd`, `sdt`, `email`, `diachi`, `idloaikhach_kh`) VALUES ('6', 'Tài', '1999-04-12', '131241', '123123', 'tai@tai.abc', 'Quảng Nam', '6');

INSERT INTO `furama_resort_management`.`dichvudikem` (`iddichvudikem`, `tendichvudikem`, `gia`, `donvi`, `trangthaikhadung`) VALUES ('1', 'aa', '435', '3433', 'ok');
INSERT INTO `furama_resort_management`.`dichvudikem` (`iddichvudikem`, `tendichvudikem`, `gia`, `donvi`, `trangthaikhadung`) VALUES ('2', 'bb', '324', '4545', 'ok');
INSERT INTO `furama_resort_management`.`dichvudikem` (`iddichvudikem`, `tendichvudikem`, `gia`, `donvi`, `trangthaikhadung`) VALUES ('3', 'cc', '54345', '34', 'ok');
INSERT INTO `furama_resort_management`.`dichvudikem` (`iddichvudikem`, `tendichvudikem`, `gia`, `donvi`, `trangthaikhadung`) VALUES ('4', 'dd', '23443', '344', 'ok');
INSERT INTO `furama_resort_management`.`dichvudikem` (`iddichvudikem`, `tendichvudikem`, `gia`, `donvi`, `trangthaikhadung`) VALUES ('5', 'ee', '645', '3443', 'ok');


