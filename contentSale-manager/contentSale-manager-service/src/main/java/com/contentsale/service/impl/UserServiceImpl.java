package com.contentsale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.contentsale.mapper.UserMapper;
import com.contentsale.pojo.User;
import com.contentsale.pojo.UserExample;
import com.contentsale.pojo.UserExample.Criteria;
import com.contentsale.service.UserService;

/**
 * 用户登录Service
 * @author YQ
 *
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	/**
	 * 用户登录
	 */
	@Override
	public boolean login(String userName, String password) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(userName);
		List<User> list = userMapper.selectByExample(example);
		//如果没有此用户名
		if(null == list || list.size() == 0) {
			return false;
		}
		User user = list.get(0);
		//比对密码
		if(!password.equals(user.getPassword())) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public User getUser(String userName) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(userName);
		List<User> list = userMapper.selectByExample(example);
		//如果没有此用户名
		if(null == list || list.size() == 0) {
			return null;
		}else {
			return list.get(0);
		}
	}
	

}
