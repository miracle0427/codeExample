##�����û���
create table t_user(
	uid int(10) not null auto_increment,
	uname varchar(100) not null,
	pwd varchar(100) not null,
	sex char(2)  not null,
	age int(3),
	birth date,
	primary key(uid)
)
##��Ӳ�������
insert into t_user values(default,'����','123',1,18,'2000-10-10');
insert into t_user values(default,'����','456',1,18,'2000-10-10');
select * from t_user