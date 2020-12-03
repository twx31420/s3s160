-- 班级表
create table class_info(
    c_id int primary key auto_increment,
    c_name varchar(10)
);
insert into class_info(c_name) values('S3SJ160'),('S3SJ161');
select * from class_info;

-- 修改学生，加上一个外键字段与班级表关联
create table student_info(
    stu_id int primary key auto_increment,
    stu_name varchar(20),
    stu_age int,
    c_id int  -- 外键,关联班级
);
insert into student_info(stu_name, stu_age, c_id) values
('stu1', 19, 1),('stu2', 20, 1),('stu3', 21, 2),('stu4', 21, 2);

select * from student_info;

-- 身份证表
create table card_info(
    card_id int primary key auto_increment,
    card_num varchar(50),
    stu_id int -- 外键，关联学生
);
insert into card_info(card_num, stu_id) values
('440908987675599980', 1),
('440905763988909845', 2),
('440905432432442355', 3),
('440907654566546664', 4);
select * from card_info;

-- 科目表
create table subject_info(
    sub_id int primary key auto_increment,
    sub_name varchar(50)
);
insert into subject_info(sub_name) values
('java'),('python'),('php');
select * from subject_info;

-- 中间表，关联学生和科目
create table stu_sub(
    stu_id int,
    sub_id int
);
insert into stu_sub(stu_id, sub_id) values
(1, 1),(1, 2),(2, 2),(2, 3),(3, 1),(3, 3),(4, 1),(4, 2);
select * from stu_sub;




# 关联查询