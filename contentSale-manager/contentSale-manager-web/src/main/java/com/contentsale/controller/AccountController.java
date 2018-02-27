package com.contentsale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.contentsale.service.ContentService;
import com.contentsale.service.UserService;
import com.contentsale.service.UserShoppingRecordService;

@Controller
public class AccountController {
	@Autowired
	private UserService userService;
	@Autowired
	private ContentService contentService;
	@Autowired
//	private UserShoppingRecordService userShoppingRecordService;
	
	/**
	 * 用户账务展示
	 * @return
	 */
	@RequestMapping("/account")
	public String accountShow() {
		
		return "account";
	}
	

	/**
	 * 用户购物车
	 * @return
	 */
	@RequestMapping("/settleAccount")
	public String settleAccount() {
		
		return "settleAccount";
	}
	
	

}
