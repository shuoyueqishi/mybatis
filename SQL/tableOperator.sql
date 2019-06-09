drop table if exists employee_t;
create table employee_t
(
   emp_id bigint(20) not null AUTO_INCREMENT comment 'ID主键',
   emp_number varchar(10) not null comment '工号',
   emp_name varchar(60) not null comment '姓名',
   emp_position varchar(50) not null comment '岗位',
   emp_address varchar(100) not null comment '办公地址',
   emp_telephone varchar(100) not null comment '电话号码',
   PRIMARY KEY (emp_id)
)ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

insert into employee_t (emp_number,emp_name,emp_position,emp_address,emp_telephone)
values ('10000','小张','SE','深圳','18272069218');
insert into employee_t (emp_number,emp_name,emp_position,emp_address,emp_telephone)
values ('10001','小王','SE','深圳','18272069219');
insert into employee_t (emp_number,emp_name,emp_position,emp_address,emp_telephone)
values ('10002','小李','TE','深圳','18272069318');
insert into employee_t (emp_number,emp_name,emp_position,emp_address,emp_telephone)
values ('10003','小蒙','PE','深圳','17272068218');
insert into employee_t (emp_number,emp_name,emp_position,emp_address,emp_telephone)
values ('10004','小方','PM','南京','18275089218');
insert into employee_t (emp_number,emp_name,emp_position,emp_address,emp_telephone)
values ('10005','小黄','SL','上海','18272069288');
insert into employee_t (emp_number,emp_name,emp_position,emp_address,emp_telephone)
values ('10006','小任','SA','上海','16272069218');
insert into employee_t (emp_number,emp_name,emp_position,emp_address,emp_telephone)
values ('10007','小许','SE','广州','15272069218');