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
    donvi varchar(45),
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

INSERT INTO `vitri` VALUES (1,'quản lí'),(2,'nhân viên'),(3,'nhân viên'),(4,'nhân viên'),(5,'nhân viên');

INSERT INTO `trinhdo` VALUES (1,'giỏi'),(2,'khá'),(3,'trung bình'),(4,'yếu'),(5,'kém');

INSERT INTO `bophan` VALUES (1,'nhân sự'),(2,'bán hàng'),(3,'nhân sự'),(4,'bán hàng'),(5,'bán hàng');

INSERT INTO `nhanvien` VALUES (1,'Trần Văn A','2021-09-01','12345678','5000000','0123456789','a@abc.abc','Nghệ An',1,1,1),(2,'Nguyễn  H','2021-08-01','743924','6000000','43234324','b@abc.abc','Đà Nẵng',2,2,2),
(3,'Nguyễn Văn C','2021-07-01','342234','4000000','234234432','c@abc.abc','Huế',3,3,3),(4,'Lê Văn T','2021-06-01','41245345','32000000','324432234',
'd@abc.abc','Quảng trị',4,4,4),(5,'Hồ  K','2021-05-01','8437347','5000000','234432234','e@abc.abc','Hà Tĩnh',5,5,5);

INSERT INTO `loaikhach` VALUES (1,'diamond'),(2,'platium'),(3,'vip');

INSERT INTO `khachhang` VALUES (1,'Trung','1999-04-07','132123','432423','trung@trung.abc','Vinh',1),(2,'Khánh','1999-04-08','12312321','243423','khanh@khanh.abc','Đà Nẵng',2),
(3,'Đạt','1999-04-09','43234','13212','dat@dat.abc','Quảng Ngãi',3),(4,'Thành','1999-04-10','341234','13123','thanh@thanh.abc','Đà Nẵng',1),(5,'Tuấn','1999-04-11','123123','123312','tuan@tuan.abc','Quảng Trị',3),(6,'Tài','1999-04-12',
'131241','123123','tai@tai.abc','Quảng Nam',3),(7,'Trung','1999-02-13','435434','23243','trung@bc.abc','Nghệ An',2);

INSERT INTO `dichvudikem` VALUES (1,'Thức ăn',435,'usd','ok'),(2,'Đồ uống',324,'usd','ok'),(3,'Hồ Bơi',54345,'usd','ok'),
(4,'Thức ăn',23443,'usd','ok'),(5,'Xe ôm',645,'usd','ok');

INSERT INTO `loaidichvu` VALUES (1,'Room'),(2,'House'),(3,'Vip'),(4,'Vip'),(5,'House');

INSERT INTO `kieuthue` VALUES (1,'Ngắn hạn',1213434),(2,'Trung hạn',32324),(3,'Ngắn Hạn',4556),(4,'Ngắn Hạn',34363),(5,'Trung Hạn',3434);

INSERT INTO `dichvu` VALUES (1,'Lê A',243,4,'20','43423',1,1,'1'),(2,'Hồ B',43,5,'10','324',2,2,'2'),
(3,'Khánh Trần',32,7,'11','324',3,3,'3'),(4,'Nguyễn D',65,6,'23','324',4,4,'4'),(5,'Trần E',54,8,'12','653',5,5,'5');

INSERT INTO `hopdong` VALUES (1,'2020-01-01','2021-01-05',100000,500000,1,1,1),(2,'2020-01-12','2020-01-15',3000000,4000000,2,2,2),(3,'2019-10-11','2019-10-15',1500000,2500000,3,3,3),
(4,'2018-03-04','2018-03-10',2000000,3500000,4,4,4),(5,'2016-05-01','2016-05-07',5000000,6000000,5,5,5);

INSERT INTO `hopdongchitiet` VALUES (1,10,1,1),(2,12,2,2),(3,20,3,3),(4,30,4,4),(5,5,5,5);














