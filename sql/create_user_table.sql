use content_sales_system;
create table User(
id int auto_increment primary key comment "主键", 
userName varchar(100) comment "用户名", 
password varchar(100) comment "密码md5加密",
nickName varchar(50) comment "用户昵称",
userType tinyint(3) comment "类型，买家0，卖家1") 
ENGINE=InnoDB  DEFAULT CHARSET=utf8;