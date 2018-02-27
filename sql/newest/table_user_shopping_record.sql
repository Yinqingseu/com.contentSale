use content_sales_system;
create table user_shopping_record(
id int auto_increment primary key comment "主键",  
contentId int  comment "内容ID",
userId int comment "购买用户ID",
buyPrice double comment "购买时价格",
buyNum varchar(100)comment "购买数量",
buyTime bigint comment "购买时间")
ENGINE=InnoDB  DEFAULT CHARSET=utf8;