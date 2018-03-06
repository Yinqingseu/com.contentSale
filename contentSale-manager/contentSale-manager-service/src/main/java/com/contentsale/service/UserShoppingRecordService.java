package com.contentsale.service;

import java.util.List;

import com.contentsale.pojo.UserShoppingRecord;

public interface UserShoppingRecordService {
	UserShoppingRecord getShoppingRecordByContentId(int contentId,int userId); //获取用户对应内容购买记录
	void saveShoppingRecord(int contentId,int userId,Double buyprice,
			int buynum,String buytime);//保存购买记录
	void updateShoppingRecord(int contentId,int userId,Double buyprice,
			int buynum,String buytime);//更新对应内容ID交易记录
	List<UserShoppingRecord> getShoppingRecordsByUserId(int userId);//获取用户ID对应全部购买记录
	boolean isContentBuyed(int contentId,int userId);//判断当前用户是否购买该内容
	int contentSellNum(Integer contentId);//获取内容售出数量
}
