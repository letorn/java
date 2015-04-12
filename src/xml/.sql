create database if not exists xml;
use xml;
create table if not exists books(
	name varchar(15),
	author varchar(17),
	price double(5, 2)
);