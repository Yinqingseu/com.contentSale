package com.contentsale.service.impl;

import org.springframework.stereotype.Service;

import com.contentsale.pojo.Contents;
import com.contentsale.pojo.Product;
import com.contentsale.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService {

	@Override
	/**
	 * Content对象中的属性值复制到Product对象中,并赋值剩余属性
	 * @param content
	 * @return
	 */
	public Product AssignProductAttr(Contents content,boolean isBuy,boolean isSell
			,int buyNum,Double buyPrice,String buyTime) {
		Product product = new Product();
		product.setId(content.getId());
		product.setPrice(content.getPrice());
		product.setTitle(content.getTitle());
		product.setPic(content.getPic());
		product.setSummary(content.getSummary());
		product.setDetail(content.getDetail());
		product.setIsBuy(isBuy);
		product.setIsSell(isSell);
		product.setBuyNum(buyNum);
		product.setBuyPrice(buyPrice);
		product.setBuyTime(buyTime);
		return product;
	}
	
	/**
	 * index页面使用
	 */
	@Override
	public Product AssignProductAttr(Contents content, boolean isBuy, boolean isSell,int sellNum) {
		Product product = new Product();
		product.setSellNum(sellNum);
		product.setId(content.getId());
		product.setPrice(content.getPrice());
		product.setTitle(content.getTitle());
		product.setPic(content.getPic());
		product.setSummary(content.getSummary());
		product.setDetail(content.getDetail());
		product.setIsBuy(isBuy);
		product.setIsSell(isSell);
		return product;
	}
	

}
