use content_sales_system;
create table contents(
id int auto_increment primary key comment "主键",  
price double  comment "当前价格",
title varchar(100) comment "标题",
pic VARCHAR(100) comment "图片",
summary varchar(200) comment "摘要",
detail LONGTEXT comment "正文" )
ENGINE=InnoDB  DEFAULT CHARSET=utf8;