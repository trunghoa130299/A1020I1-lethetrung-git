drop database if exists table_management;

create database table_management;

use table_management;

create table table_name(
	id int not null primary key auto_increment,
    `name` varchar(50),
    address  varchar(50)
);

insert into table_name 
values 
(1,'trung','nghean');

CREATE TABLE contacts
( contact_id INT(11) NOT NULL AUTO_INCREMENT,
  last_name VARCHAR(30) NOT NULL,
  first_name VARCHAR(25),
  birthday DATE,
  CONSTRAINT contacts_pk PRIMARY KEY (contact_id)
);
CREATE TABLE suppliers
( supplier_id INT(11) NOT NULL AUTO_INCREMENT,
  supplier_name VARCHAR(50) NOT NULL,
  account_rep VARCHAR(30) NOT NULL DEFAULT 'TBD',
  CONSTRAINT suppliers_pk PRIMARY KEY (supplier_id),
  contact_id_sp int,
  foreign key (contact_id_sp) references contacts(contact_id)
);
