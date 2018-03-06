package com.contentsale.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.contentsale.pojo.Contents;

public interface ContentService {
	Contents getContentById(Integer id); //根据ID号查询内容
	List<Contents> getAllContents(); //获取数据表全部内容
	void insertContent(Contents content);//插入内容
	void updateContentById(Integer id,String title ,String summary ,
			 String image ,String detail, Double price);//更新对应id内容
	void deleteContentById(int contentId);//删除指定ID内容
}
