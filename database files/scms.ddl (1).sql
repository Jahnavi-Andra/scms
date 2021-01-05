-- creating Database
drop database if exists scms;
create database scms;

-- using the Database
use scms;

drop table if exists sports;
create table sports(
sport_id int(10) not null  ,
sport_name varchar(50) not null,
trainer_id int(10) not null ,
fee double not null ,
primary key (sport_id,trainer_id)
);

drop table if exists trainer;
create table trainer(
trainer_id int(10) not null auto_increment ,
trainer_name varchar(50) not null,
trainer_phone numeric(10) not null,
age int(5) not null,
experience int(5) not null,
trainer_uname varchar(50) not null,
trainer_passwd varchar(50) not null,
sport_id int(10) not null references sports(sport_id),
primary key (trainer_id)
);

drop table if exists student;
create table student(
stud_id int(10) not null auto_increment,
stud_name varchar(50) not null,
stud_phone numeric (10),
stud_uname varchar(50) not null,
stud_passwd varchar(50) not null,
wallet varchar(50) not null,
points int(10) not null,
primary key (stud_id)
);

drop table if exists trainercamp;
create table trainercamp(
tcamp_id int(10) not null auto_increment,
sport_id int(10) not null references sports(sport_id),
trainer_id int(10) not null references trainer(trainer_id),
stud_id int(10) not null references student(stud_id),
doj date not null,
t_status varchar(20) not null,
primary key(tcamp_id,stud_id)
);

