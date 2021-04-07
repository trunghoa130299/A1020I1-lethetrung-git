drop database if exists banhang;

create database banhang;

use banhang;

create table productlines(
	productline int primary key auto_increment,
    `textdescription` varchar(45),
    htmldescription varchar(45),
    image varchar(45)
);

create table products(
	productcode int primary key auto_increment,
    `productname` varchar(45),
    productline_s int,
    productscale varchar(45),
    productvendor varchar(45),
    productdescription varchar(45),
    quantitylnstock varchar(45),
    buyprice int,
    msrp varchar (45),
    foreign key (productline_s) references productlines(productline)
);

insert into productlines
values (1,'abc','abc','abc'),
(2,'abc','abc','abc'),
(3,'abc','abc','abc'),
(4,'abc','abc','abc'),
(5,'abc','abc','abc');

INSERT INTO `banhang`.`products` (`productcode`, `productname`, `productline_s`, `productscale`, `productvendor`, `productdescription`, `quantitylnstock`, `buyprice`, `msrp`) VALUES ('1', 'ádnasd', '1', 'sfsdf', 'ádasd', 'adasd', 'ads', '32', 'ádsa');
INSERT INTO `banhang`.`products` (`productcode`, `productname`, `productline_s`, `productscale`, `productvendor`, `productdescription`, `quantitylnstock`, `buyprice`, `msrp`) VALUES ('2', 'ads', '2', 'xa', 'ads', 'ad', 'ád', '43', 'ads');


select productcode, productname, buyprice, quantityinStock from products
where buyprice > 56.76 and quantityinStock > 10;

select productcode,productname, buyprice, textdescription
FROM products
INNER JOIN productlines
ON products.productline = productlines.productline
WHERE buyprice > 56.76 AND buyprice < 95.59