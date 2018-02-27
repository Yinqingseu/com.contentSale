package com.contentsale.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.contentsale.pojo.Contents;
import com.contentsale.pojo.User;
import com.contentsale.service.ContentService;
import com.contentsale.service.UserService;

/**
 * 默认内容展示页面
 * @author YQ
 *
 */
@Controller
public class IndexController {
	@Autowired
	private ContentService contentService;
	@Autowired
	private UserService userService;
	
	/**
	 * 根据用户类型展示页面内容
	 * @param map
	 * @param request
	 * @param type
	 * @return
	 */
	@RequestMapping(value= {"/","/index",""})
	public String indexShow(Model map,HttpServletRequest request, HttpSession session,
			@RequestParam(value = "type", required = false) Integer type) {
		System.out.println("进入index");
		//内容获取
		List<Contents> productList = contentService.getAllContents();
		System.out.println("内容列表长度："+productList.size());
		map.addAttribute("productList", productList);
		//用户类型获取
		User user = (User) session.getAttribute("user");
		if(user == null) {
			type = 0;
			map.addAttribute("type", 0);
			map.addAttribute("user",null);
		}else {
			type = user.getUsertype() & 0xFF; //获取用户类型,Byte转int	
			map.addAttribute("type", type);
			map.addAttribute("user", user);
		}
		System.out.println("用户类型type："+type);
		return "index";
	}
	

}
