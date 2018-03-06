package com.contentsale.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.contentsale.pojo.Contents;
import com.contentsale.pojo.Product;
import com.contentsale.pojo.User;
import com.contentsale.pojo.UserShoppingRecord;
import com.contentsale.service.ContentService;
import com.contentsale.service.ProductService;
import com.contentsale.service.UserService;
import com.contentsale.service.UserShoppingRecordService;

@Controller
public class AccountController {
	@Autowired
	private UserService userService;
	@Autowired
	private ContentService contentService;
	@Autowired
	private UserShoppingRecordService shoppingRecordService;
	
	@Autowired
	private ProductService productService;
	
	/**
	 * 用户账务展示
	 * @return
	 */
	@RequestMapping("/account")
	public Model accountShow(HttpSession session,Model map) {
		List<Product> buyList = new ArrayList<Product>();
		//用户信息获取
		User user = (User) session.getAttribute("user");
		if(user != null) {
			int userId = user.getId();
			//获取当前用户全部购买信息
			List<UserShoppingRecord> records = shoppingRecordService.getShoppingRecordsByUserId(userId);
			System.out.println("交易记录数："+records.size());
			for(UserShoppingRecord record:records) {
				System.out.println("内容ID："+record.getContentid()+"购买数量："+ record.getBuynum());
				int contentId = record.getContentid();
				//查询内容信息
				Contents content = contentService.getContentById(contentId);
				Product product = productService.AssignProductAttr(content, true, true,
						record.getBuynum(), record.getBuyprice(), record.getBuytime());
				buyList.add(product);
			}	
		}
		map.addAttribute("buyList", buyList);
		return map;
	}
	

	/**
	 * 用户购物车
	 * @return
	 */
	@RequestMapping("/settleAccount")
	public String settleAccount(HttpSession session,Model map) {
		//用户类型获取
		User user = (User) session.getAttribute("user");
		 Integer type;
		if(user == null) {
			return "redirect:login";
		}else {
			map.addAttribute("user", user);
		}
		
		return "settleAccount";
	}
	
	

}
