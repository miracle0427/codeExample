create table users(
	id int (10) primary key auto_increment,
	username varchar(20),
	password varchar(20),
	photo varchar(50)
);
create table files(
	id int(10) primary key auto_increment,
	name varchar(20),
	count int(10)
);
insert into files values(default,'a.png',0);
insert into files values(default,'b.png',0);