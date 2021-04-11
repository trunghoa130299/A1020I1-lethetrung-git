drop database if exists demo;

create database demo ;
use demo;

create table Products(
	id int primary key auto_increment,
    `productcode` varchar(45),
    productname varchar(45),
    productprice int,
    productamount int,
    productdescription varchar(45),
    productstatus varchar(45)
);

insert into Products values
(1,'a','a',1,1,'a','a'),
(2,'b','b',2,1,'a','a'),
(3,'c','c',3,1,'a','a'),
(4,'d','d',4,1,'a','a');

-- 1.Index
select *
from Products
where `productcode` = 'a';

create index productcodes 
on Products (`productname`);

-- 2.View

create view view_products
as 
select `productcode`,productname,productprice,productstatus
from Products;

select *
from view_products;

update view_products
set `productcode`= 'abc'
where `productcode`='a';

delete
from view_products
where `productcode` = 'd';
