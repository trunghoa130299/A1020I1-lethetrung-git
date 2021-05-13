drop database if exists user_management;

create database user_management;

use user_management;

create table users (
	id  int(3) NOT NULL AUTO_INCREMENT,
 `name` varchar(120) NOT NULL,
 email varchar(220) NOT NULL,
 country varchar(120),
 PRIMARY KEY (id)
);

insert into `users` values(1,'Nguyễn Văn A','nguyenvana@codegym.vn','Việt Nam'),
(2,'Nguyễn Văn B','nguyenvanb@codegym.vn','Việt Nam'),
(3,'Nguyễn Văn C','nguyenvanc@codegym.vn','Việt Nam');