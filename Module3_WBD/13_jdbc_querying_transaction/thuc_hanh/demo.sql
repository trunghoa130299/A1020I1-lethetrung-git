drop database if exists demo;
CREATE DATABASE demo;
USE demo;

create table users (
 id  int NOT NULL AUTO_INCREMENT,
 `name` varchar(120) NOT NULL,
 email varchar(220) NOT NULL,
 country varchar(120),
 PRIMARY KEY (id)
);

insert into users(`name`, email, country) values('Minh','minh@codegym.vn','Viet Nam');
insert into users(`name`, email, country) values('Kante','kante@che.uk','Kenia');


select *
from users
order by `name`;

insert into users (`name`, email,country) value ('Khánh','nhkhanh@gmail.com','Laos');
update users
set `name`= "khánh", email = "khanh@123", country = "laos"
where id = 1;
select *
from users
where id = 1;

delete
from users
where id = 1;

select *
from users
where name like '%h%';
DELIMITER $$
CREATE PROCEDURE get_user_by_id(IN user_id INT)
BEGIN
    SELECT users.name, users.email, users.country
    FROM users
    where users.id = user_id;
    END$$
DELIMITER ;
​
  
​
DELIMITER $$
CREATE PROCEDURE insert_user(
IN user_name varchar(50),
IN user_email varchar(50),
IN user_country varchar(50)
)

BEGIN

    INSERT INTO users(name, email, country) VALUES(user_name, user_email, user_country);
    END$$
​
DELIMITER ;
create table Permision(
id int(11) primary key  AUTO_INCREMENT,
`name` varchar(50)
);

create table User_Permision(
permision_id int(11),
user_id int(11)
);
insert into Permision(`name`) values('add');
insert into Permision(`name`) values('edit');
insert into Permision(`name`) values('delete');
insert into Permision(`name`) values('view');