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

DELIMITER $$

CREATE PROCEDURE get_user_by_id(IN user_id INT)

BEGIN

    SELECT users.`name`, users.email, users.country

    FROM users

    where users.id = user_id;

    END$$

DELIMITER ;
call get_user_by_id(1);

DELIMITER $$
CREATE PROCEDURE delete_user_by_id(IN user_id INT)

BEGIN

    delete 
    FROM users
    where users.id = user_id;
    END$$
DELIMITER ;

call delete_user_by_id(3);
DELIMITER $$
CREATE PROCEDURE update_user_by_id(IN user_name varchar(50),

IN user_email varchar(50),

IN user_country varchar(50),
IN user_id INT)

BEGIN

    update users
    set `name` = user_name , email= user_email,country =user_country
    where users.id = user_id;
    END$$
DELIMITER ;

call update_user_by_id('trung','abc@abc.abc','nghe an',3);

DELIMITER $$
CREATE PROCEDURE list_user()

BEGIN
    select * 
	from users;
    END$$
DELIMITER ;
call list_user;

