drop  database if exists nganhang_managemnt;

create database nganhang_management;

use  nganhang_management;

create table customers(
	customer_number int not null primary key auto_increment,
    `fullname` varchar(45),
    address varchar(45),
    email varchar(45),
    phone varchar(45)
);
create table accounts(
	account_number int not null primary key auto_increment,
    `account_type` varchar(45),
    customer_number_accounts int,
    account_day date,
    blance varchar(45),
    foreign key (customer_number_accounts) references customers(customer_number)
);
create table transactions(
	tran_number int not null primary key auto_increment,
   ` account_number` varchar(45),
   transactions_day date,
   amounts varchar(45),
   descriptions varchar(45),
   account_number_tran int,
   foreign key (account_number_tran) references accounts(account_number)
);

