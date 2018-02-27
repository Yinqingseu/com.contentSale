use content_sales_system;
Create table contents(
	content_id int  auto_increment primary key comment '内容ID号',  #,自增
	content_price int not null comment '内容价格',  #内容价格
	content_title varchar(80) not null comment '内容标题',   #内容标题
	content_abstract varchar(140) not null comment '内容摘要',  #内容摘要
	content_all varchar(1000) not null comment '内容全文',   #内容全文
	content_picture varchar(255) not null comment '图片地址', #图片地址，url
	sale_count int not null default 0 comment '出售数量' #出售数量,默认为0
	)ENGINE=InnoDB DEFAULT CHARSET=utf8;