##创建用户表
create table t_user(
	uid int(10) not null auto_increment,
	uname varchar(100) not null,
	pwd varchar(100) not null,
	sex char(2)  not null,
	age int(3),
	birth date,
	primary key(uid)
)
##添加测试数据
insert into t_user values(default,'张三','123',1,18,'2000-10-10');
insert into t_user values(default,'李四','456',1,18,'2000-10-10');
select * from t_user