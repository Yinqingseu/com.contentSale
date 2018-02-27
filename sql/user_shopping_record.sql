use content_sales_system;
Create table user_shopping_record(#用户购买记录表
	record_id int unsigned auto_increment primary key comment '购买记录id',  #购买记录id
	content_id int not null comment '购买内容ID',  #购买内容ID
    shopping_time varchar(20) not null comment '购买时间', #购买时间
    shopping_count int not null comment '购买数量', #购买数量
    shopping_price int not null comment '购买时价格', #购买时价格
	content_title varchar(80) not null comment '购买时内容标题',   #购买时内容标题
	content_picture varchar(255) not null comment '购买时内容图片地址，url',#内容图片地址，url
    personId int(11) not null comment '购买用户ID'
	)ENGINE=InnoDB DEFAULT CHARSET=utf8;