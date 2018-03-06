package com.contentsale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contentsale.mapper.UserShoppingRecordMapper;
import com.contentsale.pojo.Contents;
import com.contentsale.pojo.UserShoppingRecord;
import com.contentsale.pojo.UserShoppingRecordExample;
import com.contentsale.pojo.UserShoppingRecordExample.Criteria;
import com.contentsale.service.UserShoppingRecordService;

/**
 * 用户内容购买记录Service
 * @author YQ
 *
 */
@Service
public class UserShoppingRecordServiceImpl implements UserShoppingRecordService {
	
	@Autowired
	private UserShoppingRecordMapper shoppingRecordMapper;//注入接口代理对象
	
	/**
	 * 获取用户对应内容购买记录
	 */
	@Override
	public UserShoppingRecord getShoppingRecordByContentId(int contentId,int userId) {
		UserShoppingRecordExample example = new UserShoppingRecordExample();
		//添加查询条件,用户自定义查询条件
		Criteria criteria = example.createCriteria();
		criteria.andContentidEqualTo(contentId);
		criteria.andUseridEqualTo(userId);
		List<UserShoppingRecord> list = shoppingRecordMapper.selectByExample(example);
		if(list != null && list.size()>0) {
			UserShoppingRecord shoppingRecord= list.get(list.size()-1); //只取最近一次购买记录
			return shoppingRecord;
		}
		return null;
	}
	
	/**
	 * 保存内容购买记录信息
	 */
	@Override
	public void saveShoppingRecord(int contentId,int userId,Double buyprice,
			int buynum,String buytime) {
		UserShoppingRecord record = new UserShoppingRecord();
		record.setContentid(contentId);
		record.setUserid(userId);
		record.setBuyprice(buyprice);
		record.setBuynum(buynum);
		record.setBuytime(buytime);
		shoppingRecordMapper.insert(record);
		
	}
	
	
	/**
	 * 更新对应内容ID交易记录
	 */
	@Override
	public void updateShoppingRecord(int contentId, int userId, Double buyprice, int buynum, String buytime) {
		UserShoppingRecordExample example = new UserShoppingRecordExample();
		//添加查询条件,用户自定义查询条件
		Criteria criteria = example.createCriteria();
		criteria.andContentidEqualTo(contentId);
		UserShoppingRecord record = new UserShoppingRecord();
		record.setContentid(contentId);
		record.setUserid(userId);
		record.setBuyprice(buyprice);
		record.setBuynum(buynum);
		record.setBuytime(buytime);
		//执行更新操作
		shoppingRecordMapper.updateByExample(record, example);
	}

	@Override
	public List<UserShoppingRecord> getShoppingRecordsByUserId(int userId) {
		UserShoppingRecordExample example = new UserShoppingRecordExample();
		//添加查询条件,用户自定义查询条件
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(userId);
		List<UserShoppingRecord> list = shoppingRecordMapper.selectByExample(example);
		return list;
	}

	/**
	 * 判断当前用户是否购买对应ID内容
	 */
	@Override
	public boolean isContentBuyed(int contentId, int userId) {
		UserShoppingRecordExample example = new UserShoppingRecordExample();
		//添加查询条件,用户自定义查询条件
		Criteria criteria = example.createCriteria();
		criteria.andContentidEqualTo(contentId);
		criteria.andUseridEqualTo(userId);
		List<UserShoppingRecord> list = shoppingRecordMapper.selectByExample(example);
//		System.out.println("当前用户购买content id:"+contentId+"交易记录数："+list.size());
		if(list.size() != 0) {
			return true;
		}
		return false;
	}
	
	/**
	 * 判断内容是否售出：是否存在该内容的交易记录
	 */
	@Override
	public int contentSellNum(Integer contentId) {
		UserShoppingRecordExample example = new UserShoppingRecordExample();
		Criteria criteria = example.createCriteria();
		criteria.andContentidEqualTo(contentId);
		List<UserShoppingRecord> list = shoppingRecordMapper.selectByExample(example);
		if(list != null) {
			int num = 0;
			for(UserShoppingRecord record:list) {
				num = num + record.getBuynum();
			}
			return num;
		}
		return 0;
	}}
