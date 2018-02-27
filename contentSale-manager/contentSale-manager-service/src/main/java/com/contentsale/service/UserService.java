package com.contentsale.service;

import com.contentsale.pojo.User;

public interface UserService {
	//判断登录
	boolean login(String userName, String password);
	User getUser(String userName);
}
