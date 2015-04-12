create database if not exists jdbc;
use jdbc;

create table if not exists users(
  id int primary key auto_increment,
  name varchar(15),
  password varchar(10),
  nickname varchar(17),
  phone varchar(11),
  email varchar(30)
);
delete from users;
insert into users(id, name, password, nickname, phone, email) values(1, 'admin', '123456', 'admin', '13750033560', 'letorn@163.com');

create table if not exists emps(
  id int ,
  name varchar(20)
);
delete from emps;
insert into emps(id, name) values(1, 'admin');