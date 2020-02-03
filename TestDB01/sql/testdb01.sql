drop database if exists sampledb;
create database sampledb;
use sampledb;

create table sample_table(
No int,name varchar(50),age int,Password varchar(50));

insert into sample_table values("taro",123);
insert into sample_table values("jiro",456);
insert into sample_table values("hanako",789);