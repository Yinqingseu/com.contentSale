package com.contentsale.service;

import com.contentsale.pojo.Contents;
import com.contentsale.pojo.Product;

public interface ProductService {
	public Product AssignProductAttr(Contents content,boolean isBuy,boolean isSell
			,int buyNum,Double buyPrice,String buyTime); // Content对象中的属性值复制到Product对象中,并赋值剩余属性

	public Product AssignProductAttr(Contents content, boolean isBuy, boolean isSell,int sellNum);
}
